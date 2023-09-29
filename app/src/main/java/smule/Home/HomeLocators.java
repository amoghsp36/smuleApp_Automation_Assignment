package smule.Home;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class HomeLocators extends BasePage {
    public HomeLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Skip']")
    public WebElement skipButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Yes']")
    public WebElement popUpYes;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='No, thanks']")
    public WebElement popUpNoThanks;

    @AndroidFindBy(accessibility = "Profile, New notification")
    public WebElement profileButton;

    @AndroidFindBy(id = "com.smule.singandroid:id/menu_item_feed")
    public WebElement feedIcon;

    @AndroidFindBy(id = "com.smule.singandroid:id/noButton")
    public WebElement noThanksButton;
}
