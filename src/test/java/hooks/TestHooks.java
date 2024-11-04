package hooks;

import drivers.DriverFactory;
import io.cucumber.java.bs.A;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestHooks {

    @Before
    public void setup() {
        WebDriver driver = DriverFactory.getDriver();
    }

    @After
    public void tearDown() {
        DriverFactory.closeDriver();
    }

}
