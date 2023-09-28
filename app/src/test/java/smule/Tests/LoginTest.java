package smule.Tests;

import common_utils.ConfigLoader;
import common_utils.FakerUtils;
import common_utils.FilePaths;
import org.testng.Assert;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.Home.HomeScreen;
import smule.Login.LoginScreen;
import smule.Login.LoginScreenTypeTwo;
import smule.Messages.MessageScreen;
import smule.Profile.ProfileScreen;
import smule.SongBook.SongBookScreen;
import smule.UserProfile.UserProfileScreen;

import java.util.Map;

public class LoginTest extends BaseTest {
    LoginScreen loginScreen;
    ProfileScreen profileScreen;
    HomeScreen homeScreen;
    UserProfileScreen userProfileScreen;
    MessageScreen messageScreen;
    SongBookScreen songBookScreen;
    LoginScreenTypeTwo loginScreenTypeTwo;
    Map credentials = new ConfigLoader().getJsonPath(FilePaths.CREDENTIALS);
    //FakerUtils fakerUtils; //make faker static
    @Test(description = "testing App Login and navigating to profile screen")
    public void testLoginApp() throws InterruptedException {
        loginScreen = new LoginScreen();

        //profileScreen = loginScreen.selectLangAndClickOK().signIn().enterEmail((String) credentials.get("email")).enterPassword((String) credentials.get("password")).termsNConditions();
        profileScreen = loginScreen.selectLangAndClickOK().signIn().enterEmail(FakerUtils.fakeEmail()).enterPassword(FakerUtils.fakePassword());
        homeScreen = profileScreen.genres().homeOp();
        userProfileScreen = homeScreen.getUserEmail();
        Assert.assertTrue(userProfileScreen.isUserProfileDisplayed());
        String[] expected = FakerUtils.fakeEmail().split("@");
        String expect = expected[0];
        Assert.assertEquals(ProfileScreen.pName,userProfileScreen.userProfileNameText());
        Assert.assertNotEquals("@"+userProfileScreen.userProfileEmailText(),expect);
    }

    @Test(description = "testing messages and following count")
    public void shouldSendMessages() throws InterruptedException {
        loginScreen = new LoginScreen();
        //loginScreenTypeTwo = new LoginScreenTypeTwo();
        //profileScreen = loginScreenTypeTwo.selectLangAndClickOK().signIn();
        profileScreen = loginScreen.selectLangAndClickOK().signIn().enterEmail(FakerUtils.fakeEmail()).enterPassword(FakerUtils.fakePassword());
        homeScreen = profileScreen.genres().homeOp();
        songBookScreen = new SongBookScreen();
        messageScreen = songBookScreen.navToMessageScreen().chatButton().searchUserToAdd().addUser().sendMsg();

        Assert.assertEquals(messageScreen.getFollowingText(),"1");
    }
}
//^(.+)@gmail\.com$