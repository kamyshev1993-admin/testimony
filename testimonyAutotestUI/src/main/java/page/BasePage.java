package page;

import controls.Button;
import controls.Head;
import manager.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver driver;

    protected BasePage() {
        this.driver = WebDriverFactory.getInstance();
    }

    protected void clickButton(By by) {
        driver.findElement(by).click();
    }

    public String getHeaderText() {
        return new Head().getText();
    }

    public void clickBackButton() {
        new Button(By.xpath("//*[@id = 'back_button']")).click();
    }
}
