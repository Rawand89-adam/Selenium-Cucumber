package renastech.stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {


    @Given("The user wants to login with username as Tester and password as test")
    public void the_user_wants_to_login_with_username_as_tester_and_password_as_test() {
        System.out.println("All is good");
    }
    @When("The user wants to check all orders")
    public void the_user_wants_to_check_all_orders() {
        System.out.println("All is good");
    }
    @Then("The user wants to delete all selected orders")
    public void the_user_wants_to_delete_all_selected_orders() {

    }
    @Then("The user wants to logout")
    public void the_user_wants_to_logout() {

    }


}
