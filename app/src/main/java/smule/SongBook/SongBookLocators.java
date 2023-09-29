package smule.SongBook;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class SongBookLocators extends BasePage {
    public SongBookLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @AndroidFindBy(id = "com.smule.singandroid:id/messageIcon")
    public WebElement messageIcon;

    @AndroidFindBy(id = "com.smule.singandroid:id/noButton")
    public WebElement noThanksButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Search for songs, singers, invites…']")
    public WebElement searchSongs;

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement searchSongsTwo;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='arijit singh']")
    public WebElement searchText;


}
