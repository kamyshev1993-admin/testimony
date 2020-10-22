package page;

import controls.Button;
import controls.Head;
import manager.PageManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver driver;
    protected PageManager pageManager;
    protected BasePage(PageManager pageManager) {
        this.pageManager = pageManager;
        this.driver = pageManager.getWebDriver();
    }

    protected void clickButton(By by) {
        new Button(by).waitAndClick();
    }

    public String getHeaderText() {
        return new Head().getText();
    }

    public BasePage insurePageLoaded() {
        new Head().waitForElementVisible();
        return this;
    }

    public void clickBackButton() {
        new Button(By.xpath("//*[@id = 'back_button']")).waitAndClick();
    }
}
