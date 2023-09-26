package smule.Tests;

import common_utils.ConfigLoader;
import common_utils.FilePaths;
import smule.BaseTest;
import smule.Login.LoginScreen;
import smule.Profile.ProfileScreen;

import java.util.Map;

public class LoginTest extends BaseTest {
    LoginScreen loginScreen;
    ProfileScreen profileScreen;
    Map credentials = new ConfigLoader().getJsonPath(FilePaths.CREDENTIALS);

    public void testLoginApp(){
        loginScreen = new LoginScreen();

        profileScreen = loginScreen.selectLangAndClickOK().signIn().enterEmail((String) credentials.get("email")).enterPassword((String) credentials.get("password")).termsNConditions();
    }
}
