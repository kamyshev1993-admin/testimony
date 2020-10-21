package controls;

import org.openqa.selenium.By;

public class Head extends Control {

    public Head() {
        super(By.xpath("/html/body/h1"));
    }

    public Head(By by) {
        super(by);
    }
}
