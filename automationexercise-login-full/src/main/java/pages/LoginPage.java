package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By signupLoginBtn = By.linkText("Signup / Login");
    private By emailInput = By.name("email");
    private By passwordInput = By.name("password");
    private By loginBtn = By.cssSelector("button[data-qa='login-button']");
    private By loggedUser = By.cssSelector("li a i.fa-user");

    public void openLoginPage() {
        click(signupLoginBtn);
    }

    public void login(String email, String password) {
        type(emailInput, email);
        type(passwordInput, password);
        click(loginBtn);
    }

    public String getLoggedInUserText() {
        return getText(loggedUser);
    }
}