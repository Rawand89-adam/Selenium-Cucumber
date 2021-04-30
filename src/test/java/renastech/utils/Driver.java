package renastech.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

   public static WebDriver driver ;

    public static WebDriver getDriver(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        return driver;
    }


     // We will be back at 8:05 pm





    // Driver
    // Runner
    // Steps pac
    // page






}
