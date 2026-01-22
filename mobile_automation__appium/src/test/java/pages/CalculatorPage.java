package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorPage {

    AppiumDriver driver;

    public CalculatorPage(AppiumDriver driver) {
        this.driver = driver;
    }

    By twoBtn = By.id("com.android.calculator2:id/digit_2");
    By plusBtn = By.id("com.android.calculator2:id/op_add");
    By threeBtn = By.id("com.android.calculator2:id/digit_3");
    By equalsBtn = By.id("com.android.calculator2:id/eq");
    By resultField = By.id("com.android.calculator2:id/result");

    public void calculateTwoPlusThree() {
        driver.findElement(twoBtn).click();
        driver.findElement(plusBtn).click();
        driver.findElement(threeBtn).click();
        driver.findElement(equalsBtn).click();
    }

    public String getResult() {
        return driver.findElement(resultField).getText();
    }
}
