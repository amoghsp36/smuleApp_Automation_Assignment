package smule.Playlist;

import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PlaylistScreen extends PlaylistLocators{
    static String playListName;
    WebDriverWait wait = new WebDriverWait(androidDriver, Duration.ofSeconds(5));

    @Step("creating new playlist")
    public PlaylistScreen createNewPlaylist() throws InterruptedException {
        newPlaylistButton.click();
        playlistName.clear();
        playlistName.sendKeys("Playlist_Test5");
        playListName = givenPlayListName();
        createPlaylistButton.click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(profileButton)).click();
        return new PlaylistScreen();
    }
    public String givenPlayListName(){
        return playlistName.getText();
    }
}
