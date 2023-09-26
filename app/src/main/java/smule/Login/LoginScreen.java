package smule.Login;

import common_utils.ScreenActions;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import smule.Profile.ProfileScreen;

public class LoginScreen extends LoginLocators{
    private ScreenActions actions;

    public LoginScreen(){
        this.actions = new ScreenActions();
    }
    @Step("selecting language and clicking ok")
    public LoginScreen selectLangAndClickOK(){
        actions.tap(selectLanguage);
        actions.tap(okButton);
        return new LoginScreen();
    }
    @Step("signing in with google")
    public LoginScreen signIn(){
        actions.tap(signInWithGoogle);
        return new LoginScreen();
    }
    @Step("Entering Email or Phone no.")
    public LoginScreen enterEmail(String email){
        actions.type(enterEmailOrPhoneNo,email);
        return new LoginScreen();
    }
    @Step("Clicking on next button and entering password")
    public LoginScreen enterPassword(String password){
        actions.tap(nextButton);
        actions.type(enterPassword,password);
        return new LoginScreen();
    }
    @Step("accepting terms and conditions")
    public ProfileScreen termsNConditions(){
        actions.tap(iAgree);
        actions.tap(AcceptConditions);
        return new ProfileScreen();
    }
}
