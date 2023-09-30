package smule.Tests;

import common_utils.ConfigLoader;
import common_utils.FakerUtils;
import common_utils.FilePaths;
import org.testng.Assert;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.Feed.FeedScreen;
import smule.Home.HomeScreen;
import smule.Login.LoginScreen;
import smule.Login.LoginScreenTypeTwo;
import smule.Messages.MessageScreen;
import smule.Playlist.PlaylistScreen;
import smule.Profile.ProfileScreen;
import smule.Settings.SettingsScreen;
import smule.SongBook.SongBookScreen;
import smule.SongSearch.SongSearchScreen;
import smule.UserProfile.UserProfileScreen;

import java.util.Map;

import static smule.Settings.SettingsScreen.finalPName;

public class LoginTest extends BaseTest {
    LoginScreen loginScreen;
    ProfileScreen profileScreen;
    HomeScreen homeScreen;
    UserProfileScreen userProfileScreen;
    MessageScreen messageScreen;
    SongBookScreen songBookScreen;
    SongSearchScreen songSearchScreen;
    FeedScreen feedScreen;
    PlaylistScreen playlistScreen;
    SettingsScreen settingsScreen;
    LoginScreenTypeTwo loginScreenTypeTwo;
    Map credentials = new ConfigLoader().getJsonPath(FilePaths.CREDENTIALS);
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
        Assert.assertEquals(userProfileScreen.userProfileEmailText(),expect);
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

    @Test(description = "testing searched artist matches result artist")
    public void shouldTestSearching(){
        loginScreenTypeTwo = new LoginScreenTypeTwo();
        profileScreen = loginScreenTypeTwo.selectLangAndClickOK().signIn();
        songBookScreen = new SongBookScreen();
        songSearchScreen = songBookScreen.searchBarAction();

        Assert.assertTrue(songSearchScreen.isSongListDisplayed());
        Assert.assertTrue(songSearchScreen.isSearchedArtistNameDisplayed());
    }

    @Test(description = "creating playlists in feed and testing playlists in profile")
    public void shouldCreateAndTestPlaylists() throws InterruptedException {
        loginScreenTypeTwo = new LoginScreenTypeTwo();
        profileScreen = loginScreenTypeTwo.selectLangAndClickOK().signIn();
        homeScreen = new HomeScreen();
        homeScreen = homeScreen.returnHomeScreen();
        feedScreen = homeScreen.navToFeedSection();
        playlistScreen = feedScreen.feedMenu().createNewPlaylist();
        userProfileScreen = new UserProfileScreen();
        profileScreen = userProfileScreen.profilePlaylist();

        Assert.assertEquals(playlistScreen.givenPlayListName(),"PlayList_Test5");
    }

    @Test(description = "nav to settings menu and change some settings")
    public void shouldChangeSettings() throws InterruptedException {
        loginScreenTypeTwo = new LoginScreenTypeTwo();
        profileScreen = loginScreenTypeTwo.selectLangAndClickOK().signIn();
        homeScreen = new HomeScreen();
        homeScreen = homeScreen.returnHomeScreen();
        userProfileScreen = homeScreen.navToProfileSection();
        settingsScreen = userProfileScreen.selectMenuOptions().savingsChanges().scrollToSwitchButtons();

        Assert.assertEquals(settingsScreen.getChangedUserName(),SettingsScreen.finalPName);
    }
}