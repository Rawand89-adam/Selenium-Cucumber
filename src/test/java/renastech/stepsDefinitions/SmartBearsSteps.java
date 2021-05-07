package renastech.stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import renastech.pages.SmartBearPage;

public class SmartBearsSteps {

    @Given("The user wants to login Smartbear")
    public void the_user_wants_to_login_smartbear() {
        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.setLogin();

    }
    @Then("The user wants to go order page")
    public void the_user_wants_to_go_order_page() {

        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.setOrderSection();
    }
    @Then("The user wants to enter product info as {string} and {string}")
    public void the_user_wants_to_enter_product_info_as_and(String product, String quantity) {

        SmartBearPage smartBearPage = new SmartBearPage();
        smartBearPage.setProductInfo(product,quantity);
    }
    @Then("The user wants to enter address info as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_address_info_as_and_and_and_and(String CName, String street, String city, String state, String zip) {

    }
    @Then("The user wants to enter payment information as {string} and {string} and {string}")
    public void the_user_wants_to_enter_payment_information_as_and_and(String CType, String CName, String Expire) {

    }
}
