package ru.vtb.neoflex.autotests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.neoflex.controllers.RequestTestController;
import ru.neoflex.dao.MySqlConnector;
import ru.neoflex.model.cost.Price;
import ru.neoflex.model.cost.RequestSaveCost;
import ru.neoflex.model.cost.ResponseSavePrice;

import java.sql.SQLException;

public class ChangePriceTest {

    private String url = "http://localhost:8080/services/testimony/changePrice";
    private RequestSaveCost requestSaveCost = new RequestSaveCost();
    private Price price = new Price();

    @Before
    public void prepareData() {
        price.setPriceColdWater(5);
        price.setPriceHotWater(5);
        price.setPriceGas(4);
        price.setPriceElectricity(3);
        requestSaveCost.setPrice(price);
    }

    @Test
    public void checkCodeSuccessTest() {
        int actualStatusCode = RequestTestController.getResponse(url, requestSaveCost).getStatusCode();
        Assert.assertEquals(200, actualStatusCode);
    }

    @Test
    public void checkBodySuccessTest() throws SQLException {
        int prevCount = MySqlConnector.getCountFromGuide(price);

        ResponseSavePrice responseSavePrice = RequestTestController.getResponse(url, requestSaveCost).as(ResponseSavePrice.class);
        Assert.assertEquals(responseSavePrice.getResultCode(), "0");
        Assert.assertEquals(responseSavePrice.getResultText(), "success");
        int count = MySqlConnector.getCountFromGuide(price);
        Assert.assertEquals(prevCount == 0 ? 1 : prevCount, count);
    }
}
