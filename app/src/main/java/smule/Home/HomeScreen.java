package smule.Home;

import io.qameta.allure.Step;
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
}
