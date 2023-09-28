package smule.Messages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class MessageLocators extends BasePage {
    public MessageLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index = '4' and @enabled = 'true']/android.widget.LinearLayout[@index = '0']")
    public WebElement newChatIcon;

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement searchBar;

    @AndroidFindBy(id = "com.smule.singandroid:id/chat_title")
    public WebElement chatTitle;

    @AndroidFindBy(id = "com.smule.singandroid:id/new_chat_forward_chat")
    public WebElement forwardChatButton;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Type a message…']")
    public WebElement sendTextBar;

    @AndroidFindBy(xpath = "//android.widget.ScrollView[@index='17']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@index='0'and @displayed='true']")
    public WebElement followingText;

    @AndroidFindBy(id = "com.smule.singandroid:id/send_button")
    public WebElement sendMsgButton;

    @AndroidFindBy(id = "com.smule.singandroid:id/follow_add")
    public WebElement followButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Profile']")
    public WebElement profileButton;
}
