package cucumber.automation.StepDef;

import cucumber.api.java.en.*;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {

        System.out.println("Navigated to login page");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {

        System.out.println("Logged in success");

    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {

        System.out.println("Home page is populated");

    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {

        System.out.println("Displayed all the cards");

    }

}
