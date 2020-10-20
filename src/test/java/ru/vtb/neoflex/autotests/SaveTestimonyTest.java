package ru.vtb.neoflex.autotests;

import org.junit.Assert;
import org.junit.Test;
import ru.neoflex.controllers.RequestTestController;
import ru.neoflex.model.testimony.CurrentTestimony;
import ru.neoflex.model.testimony.RequestSaveTestimony;

public class SaveTestimonyTest {
    @Test
    public void checkCodeSuccessTest() {

        String requestUrl = "http://localhost:8080/services/testimony/save";
        RequestSaveTestimony requestSaveTestimony = new RequestSaveTestimony();
        CurrentTestimony currentTestimony = new CurrentTestimony();

        requestSaveTestimony.setDate("02-2020");
        currentTestimony.setColdWater(30);
        currentTestimony.setHotWater(40);
        currentTestimony.setGas(50);
        currentTestimony.setElectricity(60);
        requestSaveTestimony.setCurrentTestimony(currentTestimony);

        int actualStatusCode = RequestTestController.getRequestCode(requestUrl, requestSaveTestimony);
        Assert.assertEquals(200, actualStatusCode);
    }
}
