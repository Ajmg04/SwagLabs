import Utilities.Base;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Hooks {

    @BeforeSuite
    public void beforeSuite(){
        Base.setUp();
    }

    @AfterSuite
    public void afterSuite(){
        Base.closeDriver();
    }
}
