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
}
