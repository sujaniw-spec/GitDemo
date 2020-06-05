package stepdefinition;


import org.junit.runner.RunWith;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	System.out.println("Navigate to login url");
    	
    }

    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String username, String password) throws Throwable {
    	System.out.println("Navigate to login url with variables"+username +" "+password);
        
    }


    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("validated the home page");
    }

    @And("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable {
    	System.out.println("cards displayed "+strArg1);
    }

    
    @And("^Cards are not displayed \"([^\"]*)\"$")
    public void cards_are_not_displayed_something(String strArg1) throws Throwable {
    	System.out.println("cards displayed "+strArg1);
    }


}
