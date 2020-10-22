import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PageNavigationTest extends TestBase {

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    @Test
    public void FromMainToSendAndBack() {
        logger.info("Start FromMainToSendAndBack");
        applicationManager.getPageManager().getMainPage().clickSend();
        Assertions.assertEquals(applicationManager.getPageManager().getSendPage().getHeaderText(), "Передача показаний");
        applicationManager.getPageManager().getSendPage().clickBackButton();
        Assertions.assertEquals(applicationManager.getPageManager().getMainPage().getHeaderText(), "Neo ЖКХ");
        logger.info("End FromMainToSendAndBack");
    }

    @Test
    public void FromMainToHistoryAndBack()  {
        applicationManager.getPageManager().getMainPage().clickHistory();
        Assertions.assertEquals(applicationManager.getPageManager().getHistoryPage().getHeaderText(), "История показаний");
        applicationManager.getPageManager().getHistoryPage().clickBackButton();
        Assertions.assertEquals(applicationManager.getPageManager().getMainPage().getHeaderText(), "Neo ЖКХ");
    }

    @Test
    public void FromMainToPriceAndBack() {
        applicationManager.getPageManager().getMainPage().clickPrice();
        Assertions.assertEquals(applicationManager.getPageManager().getPricePage().getHeaderText(), "Справочник стоимости услуг");
        applicationManager.getPageManager().getPricePage().clickBackButton();
        Assertions.assertEquals(applicationManager.getPageManager().getMainPage().getHeaderText(), "Neo ЖКХ");
    }
}

