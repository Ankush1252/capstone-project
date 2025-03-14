package pages;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import objectrepo.Locators;
import utils.Base;
import utils.Reports;

public class LoginPage {
	private WebDriver driver;

	private WebDriverWait wait;
	ExtentTest test;

	public LoginPage(WebDriver driver, ExtentTest test) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.test = test;
	}

	public boolean validUrl() {
		String currUrl = driver.getCurrentUrl();

		boolean actResult;
		if (currUrl.equals("https://www.automationexercise.com/")) {
			actResult = true;
			Reports.generateReport(driver, test, Status.PASS, "Website launched Successful");
		} else {
			actResult = false;
			Reports.generateReport(driver, test, Status.FAIL, "Website launched failure");
		}

		return actResult;

	}
	
	public boolean userLogin(String email, String pwd) {
		driver.findElement(Locators.signupButton).click();
		
		driver.findElement(Locators.userEmail).sendKeys(email);
		Base.sleep(1000);
		driver.findElement(Locators.password).sendKeys(pwd);
		Base.sleep(1000);
		driver.findElement(Locators.loginBtn).click();
         
		boolean actResult = true;
		
		try {
			// explicit wait for Products text
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.loggedIn));
			Reports.generateReport(driver, test, Status.PASS, "Login is Successful");
		} catch (TimeoutException te) {
			actResult = false;
			Reports.generateReport(driver, test, Status.FAIL, "Login is failure");

		}
		
	    return actResult;

	}
	
	public boolean isLoggedIn(String name) {
		boolean actResult = true;
		try {
			// explicit wait for Products text
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.loggedIn));
			Reports.generateReport(driver, test, Status.PASS, "User logged in");
		} catch (TimeoutException te) {
			actResult = false;
			Reports.generateReport(driver, test, Status.FAIL, "User Not loged in");

		}
		return actResult;
		
	}
	
	public boolean invalidUser(String email, String pwd) {
		driver.findElement(Locators.signupButton).click();
		
		driver.findElement(Locators.userEmail).sendKeys(email);
		Base.sleep(1000);
		driver.findElement(Locators.password).sendKeys(pwd);
		Base.sleep(1000);
		driver.findElement(Locators.loginBtn).click();
		boolean actResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.failedLogin));
			Reports.generateReport(driver, test, Status.PASS, "Invalid Credentials");
		}catch(TimeoutException te) {
			
		}
		
		
		 return actResult;
	}
	
	
	
	public boolean isFailed() {
		boolean actResult = true;
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.failedLogin));
			Reports.generateReport(driver, test, Status.FAIL, "ErrorMessage");
		}catch(TimeoutException te) {
			
		}
		return actResult;

	}
}
