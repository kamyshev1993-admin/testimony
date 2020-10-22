package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    private WebDriver driver;
    private PageManager pageManager;

    public void init() throws IOException {
        Properties properties = new Properties();
        String target = System.getProperty("target", "local");
        properties.load(new FileReader(new File(String.format("src/main/resources/%s.properties", target))));
        driver = WebDriverFactory.getInstance(BrowserType.GOOGLECHROME);
        pageManager = new PageManager(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(properties.getProperty("web.baseUrl"));
    }

    public void close() {
        driver.quit();
    }

    public PageManager getPageManager() {
        return pageManager;
    }
}
