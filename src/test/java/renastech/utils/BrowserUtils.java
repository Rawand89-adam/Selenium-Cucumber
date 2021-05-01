package renastech.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserUtils extends Driver {

    public static void staticWait(int second){
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setWaitTime(){

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


    public static WebDriverWait wait = new WebDriverWait(driver,30);

    public static void clickAndWait(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void waitEnterText(WebElement element,String text){

        System.out.println("Entering Text as "+ text);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
        wait.until(ExpectedConditions.attributeToBe(element,"value", text));
        System.out.println("Entered Text as "+ text);


    }

         //Sync issue

      //  implicit    way to do Wait
      //  explicit    way to do Wait



}
