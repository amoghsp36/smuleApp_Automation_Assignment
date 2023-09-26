package smule.Profile;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class ProfileLocators extends BasePage {
    public ProfileLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement profileName;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
    public WebElement nextButton;

    @AndroidFindBy(xpath = "//android.widget.GridView[@index='3']/android.widget.FrameLayout[@index='0']/android.view.ViewGroup/android.widget.ImageView[@index='6']")
    public WebElement selectGenres;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='No thanks']")
    public WebElement noThanksButton;
}
