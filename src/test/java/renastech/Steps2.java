package renastech;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps2 {
    WebDriver driver ;
    @Given("As user I want to login OrangeHRM")
    public void as_user_i_want_to_login_orange_hrm() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }
    @When("Enter username as {string}")
    public void enter_username_as(String string) {
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }

    }
    @Then("Enter password as {string}")
    public void enter_password_as(String string) {
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
    }
    @Then("Click Submit")
    public void click_submit() {
        driver.findElement(By.id("btnLogin")).click();
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
    }

    @Then("Click my info")
    public void click_my_info() {
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
    }


}
