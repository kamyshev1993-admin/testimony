package controls;

import manager.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public abstract class Control {

    protected final static int WAITING_TIME_IN_SECONDS = 30;

    private WebDriver driver;
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

    protected boolean isElementPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    protected WebElement waitForElementClickable() {
        return (new WebDriverWait(driver, WAITING_TIME_IN_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public WebElement waitForElementVisible() {
        return (new WebDriverWait(driver, WAITING_TIME_IN_SECONDS))
                .until(ExpectedConditions.visibilityOf(webElement));
    }
}
