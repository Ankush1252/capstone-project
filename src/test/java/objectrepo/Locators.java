package objectrepo;

import org.openqa.selenium.By;

public class Locators {
	
		// for Signup/Login button
		public static By signupButton = By.xpath("//a[normalize-space()='Signup / Login']");

		//  for user Login 
		public static By userEmail = By.xpath("//input[@data-qa='login-email']");
		public static By password = By.xpath("//input[@data-qa='login-password']");
		public static By loginBtn = By.xpath("//button[normalize-space()='Login']");
		
		// validate successful login 
		public static By loggedIn = By.xpath("//li/a[text()=' Logged in as ']");
		
		public static By failedLogin = By.xpath("//p[text()='Your email or password is incorrect!']");
}
