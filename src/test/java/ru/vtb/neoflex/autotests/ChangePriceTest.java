package ru.vtb.neoflex.autotests;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.neoflex.controllers.RequestTestController;
import ru.neoflex.dao.MySqlConnector;
import ru.neoflex.model.cost.RequestSaveCost;
import ru.neoflex.model.cost.ResponseSavePrice;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;

public class ChangePriceTest extends TestBase{

    private String url = "http://localhost:8080/services/testimony/changePrice";

    public static Iterator<Object[]> dataRead() throws IOException {
        String requestFile = "src/test/resources/ChangePrice.json";
        return validRequest(requestFile, RequestSaveCost[].class);
    }

    @MethodSource("dataRead")
    @ParameterizedTest
    public void checkCodeSuccessTest(RequestSaveCost requestSaveCost) {
        int actualStatusCode = RequestTestController.getResponse(url, requestSaveCost).getStatusCode();
        Assert.assertEquals(200, actualStatusCode);
    }

    @MethodSource("dataRead")
    @ParameterizedTest
    public void checkBodySuccessTest(RequestSaveCost requestSaveCost) throws SQLException {
        int prevCount = MySqlConnector.getCountFromGuide(requestSaveCost.getPrice());

        ResponseSavePrice responseSavePrice = RequestTestController.getResponse(url, requestSaveCost).as(ResponseSavePrice.class);
        Assert.assertEquals(responseSavePrice.getResultCode(), "0");
        Assert.assertEquals(responseSavePrice.getResultText(), "success");
        int count = MySqlConnector.getCountFromGuide(requestSaveCost.getPrice());
        Assert.assertEquals(prevCount == 0 ? 1 : prevCount, count);
    }
}
