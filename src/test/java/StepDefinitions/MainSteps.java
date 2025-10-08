package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MainSteps {

    @Given("User is on Netbanking landing page")
    public void user_is_on_netbanking_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User has landed on net banking page");
    }

    /*
    @When("User login into application")
    public void user_login_into_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User login into application");
    }
     */

/*
    @When("User login into application with {string} and password {int}")
    public void user_login_into_application_with_and_password(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    }

 */
    @When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password ) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Username is "+username+"  Password is "+password);
    }

    @Then("Home page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home page is displayed");
    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are displayed");
    }
    @When("User login into application with {string} and passwords {string} combination")
    public void user_login_into_application_with_and_password_combination(String Username, String Password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Username is "+Username+" Password is "+Password);
    }

    @Given("User is on Practice landing page")
    public void user_is_on_practice_landing_page() {

        System.out.println("User is in Practice landing page");
    }

    @When("User Signup into application")
    public void user_signup_into_application(List<String> data) {
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
    }


    @Given("setup the entires in database")
    public void setupTheEntiresInDatabase() {
        System.out.println("*********************************");
        System.out.println("setup the entries in database");


    }

    @When("launch the browser from config variables")
    public void launchTheBrowserFromConfigVariables() {
        System.out.println("Launch the browser from config variables");
    }

    @When("hit the home page url of banking site")
    public void hitTheHomePageUrlOfBankingSite() {
        System.out.println("Hit the URL");
    }

    @Given("User is on Mortgage landing page")
    public void userIsOnMortgageLandingPage() {
        System.out.println("User is in Mortgage Landing Page");
    }
}
