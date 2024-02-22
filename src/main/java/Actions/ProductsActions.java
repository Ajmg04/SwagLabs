package Actions;

import Locators.ProductsLocators;
import org.testng.Assert;

public class ProductsActions {

    ProductsLocators productsLocators = new ProductsLocators();

    //Validamos que se muestre el logo de swag
    public void assertSwagLogo(){
        Assert.assertTrue(productsLocators.swagLogo.isDisplayed());
        System.out.println("Se valida que se muestre el logo de swag en la pantalla de productos");
    }
}
