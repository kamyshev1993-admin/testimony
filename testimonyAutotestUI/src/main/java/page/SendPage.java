package page;

import controls.Input;
import manager.PageManager;
import model.SendPageData;
import org.openqa.selenium.By;

public class SendPage extends BasePage {

    public SendPage(PageManager pageManager) {
        super(pageManager);
    }

    private By sendButton = By.xpath("//input[@id='button']");
    private Input dateInput = new Input("date");
    private Input coldDataInput = new Input("coldData");
    private Input hotDataInput = new Input("hotData");
    private Input gasDataInput = new Input("gasData");
    private Input elecDataInput = new Input("elecData");

    public SendPage fillInfo(SendPageData sendPageData) {
        dateInput.fill(sendPageData.getDate());
        coldDataInput.fill(sendPageData.getColdWater());
        hotDataInput.fill(sendPageData.getHotWater());
        gasDataInput.fill(sendPageData.getGas());
        elecDataInput.fill(sendPageData.getElectric());
        return this;
    }

    public void clickSendButton() {
        clickButton(sendButton);
    }
}
