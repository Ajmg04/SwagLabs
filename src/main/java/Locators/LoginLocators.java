package Locators;

import Utilities.SeleniumPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators extends SeleniumPageFactory {

    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement btnLogin;

    public LoginLocators(){

    }
}
