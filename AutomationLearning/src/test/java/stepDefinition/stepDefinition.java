package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;


public class stepDefinition {
	@Given("^User is on sign in page$")
	public void user_is_on_sign_in_page() 
	{
		System.out.println("navigated to sign in page");
		
	}
	@When("^User enters valid email and password$")
	public void user_enters_valid_email_and_password() 
	{
		System.out.println("user is signed in");
	}
	@Then("^User is taken to fundraising pages$")
	public void user_is_taken_to_fundraiser_pages() 
	{
		System.out.println("navigated to fundraiser pages");
	}
	@And("^Sign in button is now My Account$")
	public void Sign_in_button_is_now_My_Account() 
	{
		System.out.println("sign in button is now my account");
	}
}
