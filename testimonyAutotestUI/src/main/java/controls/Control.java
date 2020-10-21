package controls;

import manager.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Control {

    private WebDriver driver;
    private By by;
    protected WebElement webElement;

    protected Control(By by) {
        this.driver = WebDriverFactory.getInstance();
        webElement = driver.findElement(by);
    }

    public boolean isVisible() {
        return webElement.isDisplayed();
    }

    public String getText() {
        return webElement.getText();
    }
}
