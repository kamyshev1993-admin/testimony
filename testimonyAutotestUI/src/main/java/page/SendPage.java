package page;

import controls.Input;
import model.Testimony;
import org.openqa.selenium.By;

public class SendPage extends BasePage {

    private By sendButton = By.xpath("//input[@id='button']");

    public SendPage fillInfo(Testimony testimony) {
        new Input("date").fill(testimony.getLocalDate().toString());
        new Input("coldData").fill(testimony.getColdData());
        new Input("hotData").fill(testimony.getHotData());
        new Input("gasData").fill(testimony.getGasData());
        new Input("elecData").fill(testimony.getElecData());
        return this;
    }

    public void clickSendButton() {
        clickButton(sendButton);
    }
}
