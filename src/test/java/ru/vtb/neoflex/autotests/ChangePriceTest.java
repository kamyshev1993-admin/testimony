package ru.vtb.neoflex.autotests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.neoflex.controllers.RequestTestController;
import ru.neoflex.model.cost.Price;
import ru.neoflex.model.cost.RequestSaveCost;
import ru.neoflex.model.cost.ResponseSavePrice;

public class ChangePriceTest {
    private String url = "http://localhost:8080/services/testimony/changePrice";
    private RequestSaveCost requestSaveCost = new RequestSaveCost();
    private Price price = new Price();

    @Before
    public void prepareData() {
        price.setPriceColdWater(30);
        price.setPriceElectricity(40);
        price.setPriceGas(50);
        price.setPriceHotWater(60);
        requestSaveCost.setPrice(price);
    }

    @Test
    public void checkCodeSuccessTest() {
        int actualStatusCode = RequestTestController.getResponse(url, requestSaveCost).getStatusCode();
        Assert.assertEquals(200, actualStatusCode);
    }

    @Test
    public void checkBodySuccessTest() {
        ResponseSavePrice responseSavePrice = RequestTestController.getResponse(url, requestSaveCost).as(ResponseSavePrice.class);
        Assert.assertEquals(responseSavePrice.getResultCode(), "0");
        Assert.assertEquals(responseSavePrice.getResultText(), "success");
    }
}
