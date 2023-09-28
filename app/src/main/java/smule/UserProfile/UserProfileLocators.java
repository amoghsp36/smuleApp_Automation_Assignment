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

    @AndroidFindBy(id = "com.smule.singandroid:id/txt_username_handle")
    public WebElement userEmail;

    @AndroidFindBy(id = "com.smule.singandroid:id/txt_username")
    public WebElement userProfileName;

}
