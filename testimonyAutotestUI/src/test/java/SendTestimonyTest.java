import model.SendPageData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import utils.DataProvider;

import java.io.IOException;
import java.util.Iterator;

public class SendTestimonyTest extends TestBase {

    public static Iterator<Object[]> dataRead() throws IOException {
        String requestFile = "src/main/resources/sendPageData.json";
        return DataProvider.validRequest(requestFile, SendPageData[].class);
    }

    @MethodSource("dataRead")
    @ParameterizedTest
    public void sendTestimony(SendPageData sendPageData) {
        applicationManager.getPageManager().getMainPage().clickSend();
        Assertions.assertEquals(applicationManager.getPageManager().getSendPage().insurePageLoaded().getHeaderText(), "Передача показаний");
        applicationManager.getPageManager().getSendPage().fillInfo(sendPageData).clickSendButton();
    }

}
