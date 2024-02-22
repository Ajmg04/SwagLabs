package Actions;

import Locators.LoginLocators;
import Utilities.FileProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Utilities.Base.driver;

public class LoginActions {

    LoginLocators loginLocators = new LoginLocators();

    //Ingresar nombre de usuario
    public void sendUserName(){
        //Espero a que se pueda hacer clic en el elemento del nombre de usuario
        WebDriverWait waitUser = new WebDriverWait(driver,30);
        waitUser.until(ExpectedConditions.elementToBeClickable(loginLocators.userNameInput));
        loginLocators.userNameInput.sendKeys(FileProperties.getProperty().getProperty("user"));
        System.out.println("El usuario ingresa nombre");
    }

    //Ingresa password
    public void sendPassword(){
        loginLocators.passwordInput.sendKeys(FileProperties.getProperty().getProperty("password"));
        System.out.println("El usuario ingresa password");
    }

    //Clic Login
    public void btnLogin() throws InterruptedException {
        Thread.sleep(3000);
        loginLocators.btnLogin.click();
        System.out.println("El usuario da clic en botón Login");
    }
}
