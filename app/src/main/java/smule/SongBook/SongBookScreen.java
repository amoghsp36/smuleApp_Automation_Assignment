package smule.SongBook;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import smule.Messages.MessageScreen;

public class SongBookScreen extends SongBookLocators{

    @Step("clicking on message icon")
    public MessageScreen navToMessageScreen(){
        //noThanksButton.click();
        //new TouchAction<>((PerformsTouchActions) androidDriver).tap(PointOption.point(595,389)).perform();
        messageIcon.click();
        return new MessageScreen();
    }
}
