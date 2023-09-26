package common_utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScreenWaits {
    private WebDriverWait wait;
    private AppiumDriver androidDriver;

    public ScreenWaits(){
        this.wait = new WebDriverWait(androidDriver, Duration.ofSeconds(5));
    }
    public WebElement waitForElementToBeVisible(WebElement webElement){
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
