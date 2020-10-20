package ru.vtb.neoflex.autotests;

import org.junit.Assert;
import org.junit.Test;
import ru.neoflex.controllers.RequestTestController;
import ru.neoflex.model.cost.Price;
import ru.neoflex.model.cost.RequestSaveCost;

public class ChangePriceTest {

    @Test
    public void checkCodeSuccessTest() {

        String requestUrl = "http://localhost:8080/services/testimony/changePrice";
        RequestSaveCost requestSaveCost = new RequestSaveCost();
        Price price = new Price();

        price.setPriceColdWater(30);
        price.setPriceElectricity(40);
        price.setPriceGas(50);
        price.setPriceHotWater(60);
        requestSaveCost.setPrice(price);


        int actualStatusCode = RequestTestController.getRequestCode(requestUrl, requestSaveCost);
        Assert.assertEquals(200, actualStatusCode);
    }
}
