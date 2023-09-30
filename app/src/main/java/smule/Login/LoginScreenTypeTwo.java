package smule.Login;

import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import smule.Profile.ProfileScreen;

public class LoginScreenTypeTwo extends LoginLocators{
    @Step("selecting language and clicking ok")
    public LoginScreenTypeTwo selectLangAndClickOK() {
        androidDriver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"English\"))"));
        //scrollUtils.scrollToView("English");
        selectLanguage.click();
        okButton.click();
        return new LoginScreenTypeTwo();
    }
    @Step("signing in with google")
    public ProfileScreen signIn(){
        signInWithGoogle.click();
        selectEmailAccount.click();
        return new ProfileScreen();
    }

}
