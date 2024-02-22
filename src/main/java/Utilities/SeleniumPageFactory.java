package Utilities;

import org.openqa.selenium.support.PageFactory;

import static Utilities.Base.driver;

public class SeleniumPageFactory {

    public SeleniumPageFactory() {
        PageFactory.initElements(driver,this);
    }
}
