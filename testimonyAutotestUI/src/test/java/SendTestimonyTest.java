import model.Testimony;
import model.TestimonyFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SendTestimonyTest extends TestBase {

    private Testimony testimony;

    @Before
    public void prepareData() {
        testimony = TestimonyFactory.getRandomTestimony();
    }

    @Test
    public void sendTestimony() {
        applicationManager.getMainPage().clickSend();
        Assertions.assertEquals(applicationManager.getSendPage().insurePageLoaded().getHeaderText(), "Передача показаний");
        applicationManager.getSendPage().fillInfo(testimony).clickSendButton();
    }

}
