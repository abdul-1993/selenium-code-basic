package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition_Login {

    @Given("^User is on LandingPage$")
    public void user_is_on_landingpage() throws Throwable {
       System.out.println("Inside Given");
    }

    @When("^User Enter the UserId and Password$")
    public void user_enter_the_userid_and_password() throws Throwable {
    	System.out.println("Inside @When");
    }

    @Then("^User lands onto homePage$")
    public void user_lands_onto_homepage() throws Throwable {
    	System.out.println("Inside @Then");
    }

    @And("^Eligible Cards are displayed$")
    public void eligible_cards_are_displayed() throws Throwable {
    	System.out.println("Inside @And");
    }
    
    @When("^User Enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_Enter_the_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
     
    }

    @Then("^Eligible Cards are not displayed$")
    public void eligible_Cards_are_not_displayed() throws Throwable {
       
      
    }


}