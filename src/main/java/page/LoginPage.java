package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"user_name\"]")
	WebElement userNameElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement passwordElement;
	@FindBy(how = How.XPATH, using = "//*[@id=\"login_submit\"]")
	WebElement loginElement;

	
	public LoginPage(WebDriver driver2) {
		this.driver = driver;
	}

	// Intractable Methods
	public void insertUserName(String userName) {

		userNameElement.sendKeys(userName);
	}

	public void insertPassword(String password) {

		passwordElement.sendKeys(password);
	}

	public void loginSubmit() {
		loginElement.click();
	}
	
	public void performLogin(String userName, String password) {
		userNameElement.sendKeys(userName);
		passwordElement.sendKeys(password);
		loginElement.click();
	}
}
