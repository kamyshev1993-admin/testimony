package page;

import org.openqa.selenium.By;

public class MainPage extends BasePage {
    private By dataSend = By.xpath("//*[@id='send_button']");
    private By dataHistory = By.xpath("//*[@id=\"history_button\"]");
    private By catalog = By.xpath("//*[@id=\"catalog_button\"]");

    public SendPage clickSend() {
        clickButton(dataSend);
        return new SendPage();
    }

    public HistoryPage clickHistory() {
        clickButton(dataHistory);
        return new HistoryPage();
    }

    public PricePage clickPrice() {
        clickButton(catalog);
        return new PricePage();
    }
}
