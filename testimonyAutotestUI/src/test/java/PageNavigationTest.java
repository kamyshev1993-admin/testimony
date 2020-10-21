import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PageNavigationTest extends TestBase {

    @Test
    public void FromMainToSendAndBack() throws InterruptedException {
        applicationManager.getMainPage().clickSend();
        Assertions.assertEquals(applicationManager.getSendPage().getHeaderText(), "Передача показаний");
        Thread.sleep(1000);
        applicationManager.getSendPage().clickBackButton();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Neo ЖКХ");
    }

    @Test
    public void FromMainToHistoryAndBack() throws InterruptedException {
        applicationManager.getMainPage().clickHistory();
        Assertions.assertEquals(applicationManager.getHistoryPage().getHeaderText(), "История показаний");
        Thread.sleep(1000);
        applicationManager.getHistoryPage().clickBackButton();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Neo ЖКХ");
    }

    @Test
    public void FromMainToPriceAndBack() throws InterruptedException {
        applicationManager.getMainPage().clickPrice();
        Assertions.assertEquals(applicationManager.getPricePage().getHeaderText(), "Справочник стоимости услуг");
        Thread.sleep(1000);
        applicationManager.getPricePage().clickBackButton();
        Assertions.assertEquals(applicationManager.getMainPage().getHeaderText(), "Neo ЖКХ");
    }
}

