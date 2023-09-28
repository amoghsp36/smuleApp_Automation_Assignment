package smule.Messages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MessageScreen extends MessageLocators{
    WebDriverWait wait = new WebDriverWait(androidDriver, Duration.ofSeconds(10));

    @Step("clicking on new chat")
    public MessageScreen chatButton() throws InterruptedException {
//        new MessageLocators();
        Thread.sleep(10000);
//        wait.until(ExpectedConditions.elementToBeClickable(newChatIcon)).click();

        newChatIcon.click();
        return new MessageScreen();
    }
    @Step("searching user")
    public MessageScreen searchUserToAdd(){
        searchBar.sendKeys("kbaganna");
        chatTitle.click();
        return new MessageScreen();
    }
    @Step("click on add")
    public MessageScreen addUser(){
        forwardChatButton.click();
        followButton.click();
        return new MessageScreen();
    }
    @Step("sending message")
    public MessageScreen sendMsg() throws InterruptedException {
        sendTextBar.sendKeys("Hello");
        sendMsgButton.click();
        androidDriver.navigate().back();
        androidDriver.navigate().back();
        androidDriver.navigate().back();
        Thread.sleep(3000);
        profileButton.click();
        Thread.sleep(4000);
        return new MessageScreen();
    }
    public String getFollowingText(){
        return followingText.getText();
    }

}
