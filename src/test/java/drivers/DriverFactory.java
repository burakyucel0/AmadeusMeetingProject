package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static <Webdriver> Webdriver getDriver() {
            if(driver.get() != null){
                try{
                    if(driver.get() == null){
                        driver.set(new ChromeDriver());
                        Thread.sleep(2000);
                    }
                }
                catch(Exception e){
                    throw new RuntimeException(e);
                }
            }

            driver.get().manage().window().maximize();
            return (Webdriver) driver.get();

    }

    public static void closeDriver(){
        driver.get().close();
    }

    public static void navigateToUrl(String url){
        driver.get().get(url);
    }

}
