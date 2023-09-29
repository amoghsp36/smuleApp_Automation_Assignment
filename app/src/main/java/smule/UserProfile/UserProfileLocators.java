package smule.UserProfile;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class UserProfileLocators extends BasePage {
    public UserProfileLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@index='11']")
    public WebElement userEmail;

    @AndroidFindBy(xpath = "//android.widget.TextView[@index='10']")
    public WebElement userProfileName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Playlists']")
    public WebElement profilePlaylistTextView;

    @AndroidFindBy(id = "com.smule.singandroid:id/btn_menu")
    public WebElement menuButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
    public WebElement settingsTextView;

}
