package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class WebDriverFactory {

    public static WebDriver getInstance(String type) {
        WebDriver webDriver = null;
        if (type.equals(BrowserType.GOOGLECHROME)) {
            webDriver = new ChromeDriver();
        } else if (type.equals(BrowserType.FIREFOX)) {
            webDriver =  new FirefoxDriver();
        }
        WebDriverRunner.webDriver = webDriver;
        WebDriverRunner.browserType = type;
        return webDriver;
    }
}
