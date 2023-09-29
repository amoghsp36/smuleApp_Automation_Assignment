package smule.Playlist;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class PlaylistLocators extends BasePage {
    public PlaylistLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }
    @AndroidFindBy(xpath = "//android.widget.Button[@text='New Playlist']")
    public WebElement newPlaylistButton;

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement playlistName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Create']")
    public WebElement createPlaylistButton;

    @AndroidFindBy(accessibility = "Profile, New notification")
    public WebElement profileButton;

}
