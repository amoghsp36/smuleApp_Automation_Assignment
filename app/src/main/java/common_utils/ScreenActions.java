package common_utils;

import org.openqa.selenium.WebElement;
import smule.BasePage;

public class ScreenActions{
    private ScreenWaits screenWaits;
    public ScreenActions(){
        this.screenWaits = new ScreenWaits();
    }
    public void tap(WebElement webElement){
//        screenWaits.waitForElementToBeVisible(webElement).click();
        webElement.click();
    }
    public void type(WebElement webElement,String text){
        webElement.clear();
        screenWaits.waitForElementToBeVisible(webElement).sendKeys(text);
    }
}
