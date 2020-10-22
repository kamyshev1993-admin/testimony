package controls;

import manager.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public abstract class Control {

    protected final static int WAITING_TIME_IN_SECONDS = 30;

    private WebDriver driver;
    private By by;

    protected Control(By by) {
        this.driver = WebDriverRunner.webDriver;
        this.by = by;
    }

    public boolean isVisible() {
        return getElement().isDisplayed();
    }

    public String getText() {
        return getElement().getText();
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
                .until(ExpectedConditions.elementToBeClickable(getElement()));
    }

    public WebElement waitForElementVisible() {
        return (new WebDriverWait(driver, WAITING_TIME_IN_SECONDS))
                .until(ExpectedConditions.visibilityOf(getElement()));
    }

    protected WebElement getElement() {
        return driver.findElement(by);
    }
}
