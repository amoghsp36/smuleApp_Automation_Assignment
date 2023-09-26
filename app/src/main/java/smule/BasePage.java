package smule;

import common_utils.ConfigLoader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BasePage {
    public static AppiumDriver androidDriver;

    public AppiumDriver getDriver(){
        ConfigLoader configLoader = new ConfigLoader();
        DesiredCapabilities capabilities = new DesiredCapabilities(configLoader.getCapabilities());

        try{
            androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub/"),capabilities);
            androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return androidDriver;
    }
}
