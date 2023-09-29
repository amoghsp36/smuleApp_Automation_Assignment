package smule.SongSearch;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class SongSearchLocators extends BasePage {
    public SongSearchLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }



    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Songs']")
    public WebElement songsList;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Arijit Singh']")
    public WebElement artistName;
}
