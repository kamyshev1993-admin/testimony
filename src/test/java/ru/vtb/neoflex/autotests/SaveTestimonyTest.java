package ru.vtb.neoflex.autotests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.neoflex.controllers.RequestTestController;
import ru.neoflex.dao.MySqlConnector;
import ru.neoflex.model.testimony.RequestSaveTestimony;
import ru.neoflex.model.testimony.ResponseSaveTestimony;
import ru.neoflex.model.testimony.Testimony;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SaveTestimonyTest {

    private String url = "http://localhost:8080/services/testimony/save";
    private RequestSaveTestimony requestSaveTestimony = new RequestSaveTestimony();
    private Testimony currentTestimony = new Testimony();

    @Before
    public void prepareData() {
        requestSaveTestimony.setDate("02-2020");
        currentTestimony.setColdWater(30);
        currentTestimony.setHotWater(40);
        currentTestimony.setGas(50);
        currentTestimony.setElectricity(60);
        requestSaveTestimony.setCurrentTestimony(currentTestimony);
    }

    @Test
    public void checkCodeSuccessTest() {
        int actualStatusCode = RequestTestController.getResponse(url, requestSaveTestimony).getStatusCode();
        Assert.assertEquals(200, actualStatusCode);
    }

    @Test
    public void checkBodySuccessTest() throws SQLException {
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
