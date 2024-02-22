package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Base {
    public static WebDriver driver;

    public static void setUp(){
        String getBrowser = FileProperties.getProperty().getProperty("browser");

        switch (getBrowser){
            case "Chrome":
                ChromeOptions optionsChrome = new ChromeOptions();
                optionsChrome.addArguments("--remote-allow-origins=*");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(optionsChrome);
                break;
            case "Edge":
                EdgeOptions optionsEdge = new EdgeOptions();
                optionsEdge.addArguments("--remote-allow-origins=*");
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver(optionsEdge);
                break;
            default:
                System.out.println("No se ha ingresado ningun navegador");
        }
        driver.navigate().to(FileProperties.getProperty().getProperty("url"));
    }
    public static void closeDriver(){
        driver.quit();
    }
}
