package renastech.stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import renastech.pages.Addresses;
import renastech.utils.BrowserUtils;
import renastech.utils.Driver;

import java.util.List;
import java.util.Map;

public class AddressSteps extends BrowserUtils {

    @Given("The user wants to login")
    public void the_user_wants_to_login() {
        Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("session_email")).sendKeys("erk@gmail.com");
        staticWait(1);
        driver.findElement(By.id("session_password")).sendKeys("erk@gmail.com");
        staticWait(1);
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        staticWait(1);
    }





    @Then("The user wants to see addresses")
    public void the_user_wants_to_see_addresses() {

        staticWait(1);
        driver.findElement(By.xpath("//a[@href='/addresses']")).click();

    }
    @Then("The user wants to enter new address")
    public void the_user_wants_to_enter_new_address() {
        staticWait(1);
        driver.findElement(By.xpath("//a[@href='/addresses/new']")).click();

    }

    @Then("The user wants to enter address details")
    public void the_user_wants_to_enter_address_details(Map<String,String> addressInfo) {

        Addresses addresses = new Addresses();
        addresses.setFirstName(addressInfo.get("FirstName"));
        addresses.setLastname(addressInfo.get("LastName"));
        addresses.setAddress1(addressInfo.get("Address1"));
        addresses.setAddress2(addressInfo.get("Address2"));
        addresses.setCity(addressInfo.get("City"));
        addresses.setState(addressInfo.get("State"));
        addresses.setZipcode(addressInfo.get("ZipCode"));
        addresses.setCountry(addressInfo.get("Country"));
        addresses.setBirthday(addressInfo.get("Birthday"));
        addresses.setAge(addressInfo.get("Age"));



    }
    @Then("The user wants to create an address")
    public void the_user_wants_to_create_an_address() {
        Addresses addresses = new Addresses();
        addresses.clickSubmitButton();

    }

    @Then("The user wants to enter address details as list")
    public void the_user_wants_to_enter_address_details_as_list(List<List<String>> listOfAddress) {

        Addresses addresses = new Addresses();
        addresses.setFirstName(listOfAddress.get(1).get(0));
        addresses.setLastname(listOfAddress.get(1).get(1));
        addresses.setAddress1( listOfAddress.get(1).get(2));
        addresses.setAddress2( listOfAddress.get(1).get(3));
        addresses.setCity(listOfAddress.get(1).get(4) );
        addresses.setState( listOfAddress.get(1).get(5));
        addresses.setZipcode(listOfAddress.get(1).get(6) );
        addresses.setCountry( listOfAddress.get(1).get(7));






    }


}
