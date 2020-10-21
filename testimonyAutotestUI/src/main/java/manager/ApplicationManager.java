package manager;

import org.openqa.selenium.WebDriver;
import page.HistoryPage;
import page.MainPage;
import page.PricePage;
import page.SendPage;

public class ApplicationManager {
    private WebDriver driver;
    private MainPage mainPage;
    private SendPage sendPage;
    private HistoryPage historyPage;
    private PricePage pricePage;

    public void init() throws InterruptedException {
        driver = WebDriverFactory.getInstance();
        driver.get("http://127.0.0.1:5500/index.html");
        mainPage = new MainPage();
        sendPage = new SendPage();
        historyPage = new HistoryPage();
        pricePage = new PricePage();
        Thread.sleep(1000);
    }

    public void close() {
        driver.quit();
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public SendPage getSendPage() {
        return sendPage;
    }

    public HistoryPage getHistoryPage() {
        return historyPage;
    }

    public PricePage getPricePage() {
        return pricePage;
    }
}
