package renastech.stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import renastech.utils.BrowserUtils;
import renastech.utils.Driver;

public class Steps extends BrowserUtils {


    @Given("The user wants to login with username as Tester and password as test")
    public void the_user_wants_to_login_with_username_as_tester_and_password_as_test() {

        Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement submitButton= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));

        wait(5);
        username.sendKeys("Tester");
        wait(5);
        password.sendKeys("test");
        wait(5);
        submitButton.click();
        wait(5);

    }
    @When("The user wants to check all orders")
    public void the_user_wants_to_check_all_orders() {

        wait(2);
        driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
        wait(3);



    }
    @Then("The user wants to delete all selected orders")
    public void the_user_wants_to_delete_all_selected_orders() {

        wait(2);
        driver.findElement(By.xpath("//input[@value='Delete Selected']")).click();
        wait(5);
    }
    @Then("The user wants to logout")
    public void the_user_wants_to_logout() {

        wait(1);
        driver.findElement(By.id("ctl00_logout")).click();
        wait(2);


    }

    @Given("The user wants to login with username as {string} and password as {string}")
    public void the_user_wants_to_login_with_username_as_and_password_as(String userName, String passWord) {

        Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement submitButton= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));

        wait(2);
        username.sendKeys(userName);
        wait(2);
        password.sendKeys(passWord);
        wait(2);
        submitButton.click();
        wait(2);


    }

    @When("The user wants edit first order")
    public void the_user_wants_edit_first_order() {

        WebElement firstOrder = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[13]/input"));
        wait(2);
        firstOrder.click();
    }
    @Then("The user wants to update Card number as {string}")
    public void the_user_wants_to_update_card_number_as(String cardNum) {
        WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        wait(2);
        cardNumber.clear();
        cardNumber.sendKeys(cardNum);
        wait(2);
    }
    @Then("The user wants to update order")
    public void the_user_wants_to_update_order() {

        WebElement updateButton = driver.findElement(By.xpath("//a[contains(text(),'Update')]"));
        wait(1);
        updateButton.click();

    }


}
