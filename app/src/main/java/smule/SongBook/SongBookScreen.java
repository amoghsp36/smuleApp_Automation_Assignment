package smule.SongBook;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import smule.Messages.MessageScreen;
import smule.SongSearch.SongSearchScreen;

public class SongBookScreen extends SongBookLocators{

    @Step("clicking on message icon")
    public MessageScreen navToMessageScreen(){
        messageIcon.click();
        return new MessageScreen();
    }
    @Step("navigating to message page")
    public MessageScreen navToMessageScreenWithGoogleSignIn(){
        noThanksButton.click();
        new TouchAction<>((PerformsTouchActions) androidDriver).tap(PointOption.point(595,389)).perform();
        messageIcon.click();
        return new MessageScreen();
    }

    @Step("Searching for songs in search Bar")
    public SongSearchScreen searchBarAction(){
        noThanksButton.click();
        new TouchAction<>((PerformsTouchActions) androidDriver).tap(PointOption.point(595,389)).perform();
        searchSongs.click();
        searchSongsTwo.sendKeys("arijit singh");
        searchText.click();
        return new SongSearchScreen();
    }

}
