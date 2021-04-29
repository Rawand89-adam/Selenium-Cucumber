package renastech;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    WebDriver driver ;

    @Given("As user I want to go to RenasTech")
    public void as_user_i_want_to_go_to_renas_tech() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }
    @When("I click you can apply here")
    public void i_click_you_can_apply_here() {

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
         driver.findElement(By.id("txtUsername")).sendKeys("admin");
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
         driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }

        driver.findElement(By.id("btnLogin")).click();
    }
    @Then("Verify application form")
    public void verify_application_form() {
        System.out.println("I am a step Definition  3");
    }

    @Then("submit application")
    public void submit_application() {


    }





}
