package ru.vtb.neoflex.autotests;

import org.junit.Assert;
import org.junit.Test;
import ru.neoflex.controllers.RequestTestController;

public class OldTestimonyTest {

    @Test
    public void checkCodeSuccessTest() {
        String requestUrl = "http://localhost:8080/services/testimony/get/old/testimony";
        String dateValue = "03-2020";
        int actualStatusCode = RequestTestController.getRequestCode(requestUrl, dateValue);
        Assert.assertEquals(200, actualStatusCode);
    }
}
