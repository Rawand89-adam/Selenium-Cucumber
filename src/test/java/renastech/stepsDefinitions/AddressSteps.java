package renastech.stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import renastech.utils.BrowserUtils;
import renastech.utils.Driver;

public class AddressSteps extends BrowserUtils {

    @Given("The user wants to login")
    public void the_user_wants_to_login() {
        Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("session_email")).sendKeys("erk@gmail.com");
        wait(1);
        driver.findElement(By.id("session_password")).sendKeys("erk@gmail.com");
        wait(1);
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        wait(1);
    }
    @Then("The user wants to see addresses")
    public void the_user_wants_to_see_addresses() {

        wait(1);
        driver.findElement(By.xpath("//a[@href='/addresses']")).click();

    }
    @Then("The user wants to enter new address")
    public void the_user_wants_to_enter_new_address() {
        wait(1);
        driver.findElement(By.xpath("//a[@href='/addresses/new']")).click();

    }
}
