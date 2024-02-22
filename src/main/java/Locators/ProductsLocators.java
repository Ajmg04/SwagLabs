package Locators;

import Utilities.SeleniumPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsLocators extends SeleniumPageFactory {

    @FindBy(xpath = "//div[@class='app_logo']")
    public WebElement swagLogo;

    public ProductsLocators(){

    }
}
