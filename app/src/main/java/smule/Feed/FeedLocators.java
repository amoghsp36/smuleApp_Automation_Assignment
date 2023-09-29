package smule.Feed;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class FeedLocators extends BasePage {
    public FeedLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='1']/android.widget.ImageView[@index='2'and@clickable='true']")
    public WebElement optionsButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add to Playlist']")
    public WebElement addToPlaylistTextView;

}
