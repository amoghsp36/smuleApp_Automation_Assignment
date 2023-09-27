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

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Profile']")
    public WebElement profileButton;
}
