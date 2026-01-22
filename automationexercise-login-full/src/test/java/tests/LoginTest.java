package tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.DriverFactory;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    private final String EMAIL = "fatmamost222@gmail.com";
    private final String PASSWORD = "fatma";

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.createDriver();
        driver.get("https://www.automationexercise.com");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void userCanLoginSuccessfully() {
        loginPage.openLoginPage();
        loginPage.login(EMAIL, PASSWORD);
        Assert.assertFalse(loginPage.getLoggedInUserText().contains("Logged in as"),
                "User name is not displayed after login");
    }

    @AfterMethod
    public void tearDown(org.testng.ITestResult result) {
        if (!result.isSuccess()) {
            takeScreenshot(result.getName()); 
        }
        driver.quit();
    }

    private void takeScreenshot(String testName) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            Files.copy(src.toPath(), new File("screenshots/" + testName + ".png").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}