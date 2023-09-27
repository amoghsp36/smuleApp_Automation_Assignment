package smule.Login;

import common_utils.ScrollUtils;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;
import smule.Profile.ProfileScreen;

public class LoginScreen extends LoginLocators{
//    private ScreenActions actions;
//
//    public LoginScreen(){
//        this.actions = new ScreenActions();
//    }
    ScrollUtils scrollUtils = new ScrollUtils();
    @Step("selecting language and clicking ok")
    public LoginScreen selectLangAndClickOK() {
        androidDriver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"English\"))"));
        //scrollUtils.scrollToView("English");
        //actions.tap(selectLanguage);
        selectLanguage.click();
        //actions.tap(okButton);
        okButton.click();
        return new LoginScreen();
    }
    @Step("signing in with google")
    public LoginScreen signIn(){
        //actions.tap(signInWithGoogle);
        signInWithEmail.click();
        return new LoginScreen();
    }
    @Step("Entering Email or Phone no.")
    public LoginScreen enterEmail(String email){
        //actions.type(enterEmailOrPhoneNo,email);
        enterEmail.sendKeys(email);
        nextButton.click();
        return new LoginScreen();
    }
    @Step("Clicking on next button and entering password")
    public ProfileScreen enterPassword(String password){
        //actions.tap(nextButton);
        //actions.type(enterPassword,password);
        enterPassword.sendKeys(password);
        nextButton.click();
        return new ProfileScreen();
    }
}
