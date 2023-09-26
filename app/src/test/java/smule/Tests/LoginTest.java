package smule.Tests;

import smule.BaseTest;
import smule.Login.LoginScreen;

public class LoginTest extends BaseTest {
    LoginScreen loginScreen;

    public void testLoginApp(){
        loginScreen = new LoginScreen();

        loginScreen = loginScreen.selectLangAndClickOK().signIn();
    }
}
