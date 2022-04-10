package stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class StepDef {

    @Given("User is on NetBanking landing page")
    public void user_is_on_NetBanking_landing_page() {
        System.out.println("User is on landing page");
    }

    @When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String user, String password) {
        System.out.println(user);
        System.out.println(password);
    }

    @Then("Home page is populated")
    public void home_page_is_populated() {
        System.out.println("Home page is populated");
    }

    @And("Cards displayed {string}")
    public void cardsDisplayed(String arg0) {

        System.out.println(arg0);
    }

    @When("User signUp with following details")
    public void userSignUpWithFollowingDetails(DataTable data) {
       List<List<String>> obj = data.asLists(); //row deprecated with asLists()
        System.out.println(obj.get(0).get(0)); //obj.get(0).get(0) -> first get got to row and second get for column
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
    }

    @When("^User login into application with username (.+) and password (.+)$")
    public void user_login_into_application_with_username_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

    @Given("validate the browser")
    public void validateTheBrowser() {
        System.out.println("validateTheBrowser");
    }

    @When("Browser is triggered")
    public void browserIsTriggered() {
        System.out.println("browserIsTriggered");
    }

    @Then("Check if browser is started")
    public void checkIfBrowserIsStarted() {
        System.out.println("checkIfBrowserIsStarted");
    }
    
    


    /*@Then("Cards are displayed")
    public void cards_are_displayed() {
        System.out.println("Cards are displayed");
    }

    @Then("Cards are not displayed")
    public void cards_are_not_displayed() {
        System.out.println("Cards are not displayed");
    }*/





  /*  @Given("User is on landing page")
    public void userIsOnLandingPage() {

        System.out.println("User is on landing page");
    }

    @When("User login into application with username and password")
    public void userLoginIntoApplicationWithUsernameAndPassword() {

        System.out.println("User login into application with username and password");
    }

    @Then("Home page is populated")
    public void homePageIsPopulated() {

        System.out.println("Home page is populated");
        
    }

    @And("Cards are displayed")
    public void cardsAreDisplayed() {

        System.out.println("Cards are displayed");
    }*/
}
