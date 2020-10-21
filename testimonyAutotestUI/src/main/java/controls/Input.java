package controls;

import org.openqa.selenium.By;

public class Input extends Control {

    public Input(By by) {
        super(by);
    }

    public Input(String id) {
        super(By.xpath("//input[@id='" + id + "']"));
    }

    public void fill(String value) {
        webElement.sendKeys(value);
    }

    public void fill(Number number) {
        webElement.sendKeys(String.valueOf(number));
    }
}
