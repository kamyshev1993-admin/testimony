package ru.vtb.neoflex.autotests;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.neoflex.controllers.RequestTestController;
import ru.neoflex.dao.MySqlConnector;
import ru.neoflex.model.testimony.RequestSaveTestimony;
import ru.neoflex.model.testimony.ResponseSaveTestimony;
import ru.neoflex.model.testimony.Testimony;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

public class SaveTestimonyTest extends TestBase {
    private String url = "http://localhost:8080/services/testimony/save";

    public static Iterator<Object[]> dataRead() throws IOException {
        String requestFile = "src/test/resources/SaveTestimonyTest.json";
        return validRequest(requestFile, RequestSaveTestimony[].class);
    }

    @MethodSource("dataRead")
    @ParameterizedTest
    public void checkCodeSuccessTest(RequestSaveTestimony requestSaveTestimony) {
        int actualStatusCode = RequestTestController.getResponse(url, requestSaveTestimony).getStatusCode();
        Assert.assertEquals(200, actualStatusCode);
    }

    @MethodSource("dataRead")
    @ParameterizedTest
    public void checkBodySuccessTest(RequestSaveTestimony requestSaveTestimony) throws SQLException {
        Testimony currentTestimony = requestSaveTestimony.getCurrentTestimony();
        ResponseSaveTestimony responseSaveTestimony = RequestTestController.getResponse(url, requestSaveTestimony).as(ResponseSaveTestimony.class);
        Assert.assertEquals(requestSaveTestimony.getDate(), responseSaveTestimony.getDate());
        Assert.assertEquals(currentTestimony, responseSaveTestimony.getCurrentTestimony());

        ResultSet resultSet = MySqlConnector.selectAllFromBilling(requestSaveTestimony.getDate());
        Assert.assertTrue(resultSet.next());
        Assert.assertEquals(requestSaveTestimony.getDate(), resultSet.getString("currentmonth"));
        Assert.assertEquals(currentTestimony.getColdWater(), resultSet.getInt("coldWater"));
        Assert.assertEquals(currentTestimony.getElectricity(), resultSet.getInt("electricity"));
        Assert.assertEquals(currentTestimony.getGas(), resultSet.getInt("gas"));
        Assert.assertEquals(currentTestimony.getHotWater(), resultSet.getInt("hotWater"));
    }
}
