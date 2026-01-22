package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.CalculatorPage;

import java.net.URL;

public class CalculatorTest {

    AppiumDriver driver;
    CalculatorPage calculatorPage;

    @BeforeTest
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps); // no <>
        calculatorPage = new CalculatorPage(driver);
    }

    @Test
    public void verifyCalculationResult() {
        calculatorPage.calculateTwoPlusThree();
        Assert.assertEquals(calculatorPage.getResult(), "5");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
