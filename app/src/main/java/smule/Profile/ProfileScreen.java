package smule.Profile;

import common_utils.ScreenActions;
import io.qameta.allure.Step;
import smule.Home.HomeScreen;

public class ProfileScreen extends ProfileLocators{
//    private ScreenActions actions;
//    public ProfileScreen(){
//        this.actions = new ScreenActions();
//    }

//    @Step("Entering profile name and clicking next")
//    public ProfileScreen profileName(){
//        //profileName.sendKeys("testUser1");
//        //actions.type(profileName,"testUser1");
//        //actions.tap(nextButton);
//        nextButton.click();
//        return new ProfileScreen();
//    }

    @Step("selecting genres and clicking next")
    public HomeScreen genres(){
        //actions.tap(selectGenres);
        nextButton.click();
        skipButton.click();
        selectGenres.click();
        nextButton.click();
        noThanksButton.click();
//        actions.tap(nextButton);
//        actions.tap(noThanksButton);
        return new HomeScreen();
    }

}
