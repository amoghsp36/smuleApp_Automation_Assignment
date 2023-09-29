package smule.Settings;

import common_utils.FakerUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.junit.Assert;

public class SettingsScreen extends SettingsLocators{
    static String finalPName;

    @Step("saving some details in settings")
    public SettingsScreen savingsChanges() throws InterruptedException {
        changeUserName.clear();
        changeUserName.sendKeys(FakerUtils.fakePassword());
        finalPName = changeUserName.getText();
        firstNameField.sendKeys("abcde");
        profileSaveButton.click();
        //notNowButton.click();
        Thread.sleep(2000);
        return new SettingsScreen();
    }

    @Step("scrolling to switch options")
    public SettingsScreen scrollToSwitchButtons() throws InterruptedException {
        androidDriver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Upload with WiFi only\"))"));
        wifiToggleButton.click();
        androidDriver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"Receive Email Updates\"))"));
        emailToggleButton.click();
        androidDriver.navigate().back();
        //androidDriver.navigate().refresh();
//        androidDriver.navigate().back();
//        androidDriver.navigate().forward();
        //Thread.sleep(2000);
        Assert.assertEquals(checkChangedUserName.getText(),finalPName);
        return new SettingsScreen();
    }
}
