package manager;

import org.openqa.selenium.WebDriver;
import page.*;

public class PageManager {
    private WebDriver driver;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public MainPage getMainPage() {
        return new MainPage(this);
    }

    public HistoryPage getHistoryPage() {
        return new HistoryPage(this);
    }

    public PricePage getPricePage() {
        return new PricePage(this);
    }

    public SendPage getSendPage() {
        return new SendPage(this);
    }
}
