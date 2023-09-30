package smule.Home;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import smule.Feed.FeedScreen;
import smule.UserProfile.UserProfileScreen;

public class HomeScreen extends HomeLocators{

    @Step("")
    public HomeScreen homeOp(){
        skipButton.click();
        popUpYes.click();
        popUpNoThanks.click();
        return new HomeScreen();
    }

    @Step("navigate to user profile page")
    public UserProfileScreen getUserEmail(){
        profileButton.click();
        return new UserProfileScreen();
    }

    @Step("navigating to feed section")
    public FeedScreen navToFeedSection(){
        feedIcon.click();
        return new FeedScreen();
    }
    public HomeScreen returnHomeScreen() throws InterruptedException {
        noThanksButton.click();
        new TouchAction<>((PerformsTouchActions) androidDriver).tap(PointOption.point(595,389)).perform();
        Thread.sleep(1000);
        return new HomeScreen();
    }
    @Step("navigating to Profile section")
    public UserProfileScreen navToProfileSection(){
        profileButton.click();
        return new UserProfileScreen();
    }
    public UserProfileScreen navToProfileSectionTwo(){
        profileButtonWithoutNotification.click();
        return new UserProfileScreen();
    }

}
