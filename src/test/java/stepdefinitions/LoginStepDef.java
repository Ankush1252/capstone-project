package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDef {
	WebDriver driver = Hooks.driver;
	ExtentTest test = Hooks.test;
	LoginPage loginPage;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		loginPage = new LoginPage(driver, test);
		boolean actResult = loginPage.validUrl();
		Assert.assertTrue(actResult);
	}

	@When("the user enters email {string} and password {string} and clicks the login button")
	public void the_user_enters_email_and_password_and_clicks_the_login_button(String string, String string2) {
		boolean actResult = loginPage.userLogin(string, string2); 
		Assert.assertTrue(actResult);
	}

	@Then("the user validates the message user is Logged in as {string}")
	public void the_user_validates_the_message(String name) {
		boolean actResult = loginPage.isLoggedIn(name);
		System.out.println("Logged in as "+ name);
		Assert.assertTrue(actResult);
	}
	@When("user enters email {string} and password {string} and clicks the login button")
	public void user_enters_email_and_password_and_clicks_the_login_button(String string, String string2) {
		boolean actResult = loginPage.invalidUser(string, string2); 
		Assert.assertTrue(actResult);
	}

	@Then("the user validates the error message")
	public void the_user_validates_the_error_message() {
		boolean actResult = loginPage.isFailed(); 
		Assert.assertTrue(actResult);
	}


}