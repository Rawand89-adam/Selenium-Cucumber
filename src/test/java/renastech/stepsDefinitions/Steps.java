package renastech.stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import renastech.utils.BrowserUtils;
import renastech.utils.Driver;

import java.util.Map;

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

        Driver.tearDown();

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
        wait(1);

    }


    @When("The user wants to order")
    public void the_user_wants_to_order() {

        wait(1);
        driver.findElement(By.xpath("//a[.='Order']")).click();
        wait(1);

    }
    @Then("The user wants to product as {string}")
    public void the_user_wants_to_product_as(String familyAlbum) {

        WebElement selectDropdown =driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select = new Select(selectDropdown);
        select.selectByVisibleText(familyAlbum);
     //   select.selectByIndex(2);
        wait(2);
    }
    @Then("The user wants to buy {string}")
    public void the_user_wants_to_buy(String product) {

        WebElement quantity= driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys(product);
        wait(1);


    }
    @Then("The user wants to calculate total")
    public void the_user_wants_to_calculate_total() {
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtTotal']/following-sibling::input")).click();
        wait(1);
    }
    @Then("The user wants to verify total {int} and {string}")
    public void the_user_wants_to_verify_total_and(Integer quantity, String product) {

        int discount;
        WebElement totalAmount = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtTotal"));
        String actualTotal = totalAmount.getText();
        switch (product){

            case "FamilyAlbum":
              int total = quantity*80;
              discount = total*15/100;
              total = total-discount;
              Assert.assertEquals(total,actualTotal);
              break;
            case "MyMoney":
              break;
            case "ScreenSaver":
                break;
            default:
        }

    }


    @Then("The user wants to enter")
    public void the_user_wants_to_enter(Map<String,String> productTable) {

        productTable.get("product");

        WebElement selectDropdown =driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct"));
        Select select = new Select(selectDropdown);
        select.selectByVisibleText(productTable.get("product"));
        System.out.println("It should print " + productTable.get("product"));
        //   select.selectByIndex(2);
        wait(2);

        WebElement quantity= driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys(productTable.get("quantity"));
        System.out.println("This Quant   "+quantity);
        wait(1);
    }



}
