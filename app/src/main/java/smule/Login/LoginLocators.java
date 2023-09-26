package smule.Login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class LoginLocators extends BasePage {
    public LoginLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='English' and @index='0']")
    public WebElement selectLanguage;

    @AndroidFindBy(id = "com.smule.singandroid:id/yesButton")
    public WebElement okButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sign in with Google' and @index='1']")
    public WebElement signInWithGoogle;

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement enterEmailOrPhoneNo;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Next']")
    public WebElement nextButton;

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement enterPassword;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='I agree']")
    public WebElement iAgree;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='ACCEPT']")
    public WebElement AcceptConditions;
}
