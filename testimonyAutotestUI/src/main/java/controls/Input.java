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
        getElement().sendKeys(value);
    }

    public void fill(Number number) {
        getElement().sendKeys(String.valueOf(number));
    }
}
