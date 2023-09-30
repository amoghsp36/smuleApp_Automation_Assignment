package smule.Settings;

import common_utils.FakerUtils;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import org.junit.Assert;
import smule.Home.HomeScreen;

public class SettingsScreen extends SettingsLocators{
    public static String finalPName;
    HomeScreen homeScreen;

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
        androidDriver.navigate().back();
        homeScreen = new HomeScreen();
        homeScreen.navToProfileSectionTwo();
        Thread.sleep(4000);
        return new SettingsScreen();
    }
    public String getChangedUserName(){
        return checkChangedUserName.getText();
    }
}
