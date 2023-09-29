package smule.Feed;

import io.qameta.allure.Step;
import smule.Playlist.PlaylistScreen;

public class FeedScreen extends FeedLocators{

    @Step("clicking on feed options menu and add to playlist")
    public PlaylistScreen feedMenu(){
        optionsButton.click();
        addToPlaylistTextView.click();
        return new PlaylistScreen();
    }

}
