package controls;

import org.openqa.selenium.By;

public class Button extends Control {
    public Button(By by) {
        super(by);
    }

    public void click() {
        webElement.click();
    }
}
