package renastech.stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import renastech.pages.PassionTea;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PassionTeaSteps extends BrowserUtils{




    @Given("The user wants to navigate to passion tea company")
    public void the_user_wants_to_navigate_to_passion_tea_company() {
        Driver.getDriver();
        driver.manage().window().maximize();
        driver.get(ConfigurationsReader.getProperties("url2"));

    }
    @When("The user wants to buy green tea")
    public void the_user_wants_to_buy_green_tea() {
        PassionTea passionTea = new PassionTea();
        passionTea.clickCheckout();
    }
    @Then("The user should provide customer information")
    public void the_user_should_provide_customer_information(Map<String,String> dataTable) {

        PassionTea passionTea = new PassionTea();
        passionTea.setEmail(dataTable.get("Email"));
        passionTea.setName(dataTable.get("Name"));
        passionTea.setAddress(dataTable.get("Address"));


    }
    @Then("The user should provide payment information")
    public void the_user_should_provide_payment_information(List<List<String>> dataTable) {
        PassionTea passionTea = new PassionTea();
        passionTea.setCardType(dataTable.get(1).get(0));
        passionTea.setCardNumber(dataTable.get(1).get(1));
        passionTea.setHolderName(dataTable.get(1).get(2));
        passionTea.setVerifycode(dataTable.get(1).get(3));



    }
    @Then("The user wants to place order")
    public void the_user_wants_to_place_order() {

        PassionTea passionTea = new PassionTea();
        passionTea.setPlaceOrder();

    }



}
