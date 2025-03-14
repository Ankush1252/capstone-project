package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDef {
	@Given("User navigates to the Automation Exercise website")
	public void user_navigates_to_the_automation_exercise_website() {
	    
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	   
	}

	@When("User enters {string} and {string} and click Signup button")
	public void user_enters_username_and_password_and_click_signup_button(String string, String string2) {
	   
	}

	@When("User enters {string} and {string} and {string} and {string} and {string}  and {string}  and {string} and {string}")
	public void user_enters_registration_details(String string1, String string2, String string3, String string4, String string5, String string6,String string7,String string8) {
	    
	}

	@Then("User clicks on Create Account")
	public void user_clicks_on_create_account() {
	    
	}

	@Then("User validtes that Account Created message is displayed")
	public void user_validtes_that_account_created_message_is_displayed() {
	}

	@Then("User clicks on Continue button")
	public void user_clicks_on_continue_button() {
	    
	}

	@Then("User logs out")
	public void user_logs_out() {
	}

	@Then("User validates the error message Email Address already exist is displyed")
	public void user_validates_the_error_message_email_address_already_exist_is_displyed() {
	}


}
