package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;

	// Login Data
	String userName = "demo@codefios.com";
	String password = "abc123";
	String dashboradValidationText = "Dasboard";
	String alertValidationText = "Please enter your user name";
	String alertValidationText2 = "Please enter your password";

	@Test
	public void validUserShouldBeAbleToLogin() {

		driver = BrowserFactory.init();
		// LoginPage loginpage1 = new LoginPage(driver);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(userName);
		loginpage.insertPassword(password);
		loginpage.loginSubmit();
		DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		//dashboardpage.valitateDashboardPage(dashboradValidationText);
		//BrowserFactory.tearDown();
	}
	
	

}
