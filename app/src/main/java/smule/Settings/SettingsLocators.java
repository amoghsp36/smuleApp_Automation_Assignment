package smule.Settings;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class SettingsLocators extends BasePage {
    public SettingsLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }
    @AndroidFindBy(id = "com.smule.singandroid:id/firstname_field")
    public WebElement firstNameField;

    @AndroidFindBy(id = "com.smule.singandroid:id/username_field")
    public WebElement changeUserName;

    @AndroidFindBy(id = "com.smule.singandroid:id/profile_save_button")
    public WebElement profileSaveButton;

    @AndroidFindBy(id = "com.smule.singandroid:id/noButton")
    public WebElement notNowButton;

    @AndroidFindBy(id = "com.smule.singandroid:id/upload_on_wifi_switch")
    public WebElement wifiToggleButton;

    @AndroidFindBy(id = "com.smule.singandroid:id/profile_receive_email_updates_switch")
    public WebElement emailToggleButton;

    @AndroidFindBy(id = "com.smule.singandroid:id/txt_username")
    public WebElement checkChangedUserName;
}
