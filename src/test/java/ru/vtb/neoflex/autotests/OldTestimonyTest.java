package ru.vtb.neoflex.autotests;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import ru.neoflex.controllers.RequestTestController;
import ru.neoflex.dao.MySqlConnector;
import ru.neoflex.model.ResponseHistory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OldTestimonyTest {

    @Test
    public void checkCodeSuccessTest() throws SQLException {
        String requestUrl = "http://localhost:8080/services/testimony/get/old/testimony";
        String dateValue = "03-2020";
        Response response = RequestTestController.getResponse(requestUrl, dateValue);
        Assert.assertEquals(200, response.getStatusCode());

        ResponseHistory responseHistory = response.as(ResponseHistory.class);

        ResultSet resultSet = MySqlConnector.selectAllFromHistory(dateValue);

        Assert.assertEquals(responseHistory.getPreviousDate(), dateValue);
        Assert.assertEquals(responseHistory.getPreviousTestimony().getColdWater(), resultSet.getInt("coldWater"));
        Assert.assertEquals(responseHistory.getPreviousTestimony().getElectricity(), resultSet.getInt("electricity"));
        Assert.assertEquals(responseHistory.getPreviousTestimony().getGas(), resultSet.getInt("gas"));
        Assert.assertEquals(responseHistory.getPreviousTestimony().getHotWater(), resultSet.getInt("hotWater"));
    }
}

