package page;

import manager.PageManager;
import org.openqa.selenium.By;

public class MainPage extends BasePage {
    private By dataSend = By.xpath("//*[@id='send_button']");
    private By dataHistory = By.xpath("//*[@id=\"history_button\"]");
    private By catalog = By.xpath("//*[@id=\"catalog_button\"]");

    public MainPage(PageManager pageManager) {
        super(pageManager);
    }

    public SendPage clickSend() {
        clickButton(dataSend);
        return pageManager.getSendPage();
    }

    public HistoryPage clickHistory() {
        clickButton(dataHistory);
        return pageManager.getHistoryPage();
    }

    public PricePage clickPrice() {
        clickButton(catalog);
        return pageManager.getPricePage();
    }
}
