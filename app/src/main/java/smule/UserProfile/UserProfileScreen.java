package smule.UserProfile;

import io.qameta.allure.Step;
import smule.Playlist.PlaylistScreen;
import smule.Profile.ProfileScreen;
import smule.Settings.SettingsScreen;

public class UserProfileScreen extends UserProfileLocators{

    public boolean isUserProfileDisplayed(){
        return userEmail.isDisplayed();
    }
    public String userProfileEmailText(){
        return userEmail.getText();
    }
    public String userProfileNameText(){
        return userProfileName.getText();
    }
    public ProfileScreen profilePlaylist(){
        profilePlaylistTextView.click();
        return new ProfileScreen();
    }
    public SettingsScreen selectMenuOptions(){
        menuButton.click();
        settingsTextView.click();
        return new SettingsScreen();
    }
}
