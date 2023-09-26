package smule.Login;

import common_utils.ScreenActions;

public class LoginScreen extends LoginLocators{
    private ScreenActions actions;

    public LoginScreen(){
        this.actions = new ScreenActions();
    }
    //@Step("selecting language")
    public LoginScreen selectLangAndClickOK(){
        actions.tap(selectLanguage);
        actions.tap(okButton);
        return new LoginScreen();
    }

    public LoginScreen signIn(){
        actions.tap(signInWithGoogle);
        return new LoginScreen();
    }
}
