package smule.UserProfile;

import io.qameta.allure.Step;

public class UserProfileScreen extends UserProfileLocators{

    public boolean isUserProfileDisplayed(){
        return userEmail.isDisplayed();
    }
    public String userProfileEmailText(){
        return userEmail.getText();
    }
}
