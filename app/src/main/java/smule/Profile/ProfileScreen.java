package smule.Profile;

import common_utils.ScreenActions;
import io.qameta.allure.Step;
import smule.Home.HomeScreen;

public class ProfileScreen extends ProfileLocators{

    public static String pName;

    public String getProfileText(){
        return profileName.getText();
    }
    @Step("selecting genres and clicking next")
    public HomeScreen genres(){
        pName = getProfileText();
        nextButton.click();
        skipButton.click();
        selectGenres.click();
        nextButton.click();
        noThanksButton.click();
        return new HomeScreen();
    }

}
