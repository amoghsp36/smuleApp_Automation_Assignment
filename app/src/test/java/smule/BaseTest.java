package smule;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    private AppiumDriver androidDriver;

    @BeforeClass
    public void setUp(){
        androidDriver = new BasePage().getDriver();
        androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod(){

    }

    @AfterClass
    public void tearDown(){
        androidDriver.quit();
    }
}
