package common_utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;

import static smule.BasePage.androidDriver;

public class ScrollUtils {
    public void scrollToView(String text){
        WebElement element = (WebElement) androidDriver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textContains(\"" + text + "\"))"));
    }
}
