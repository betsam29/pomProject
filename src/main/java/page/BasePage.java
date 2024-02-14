package page;

import org.openqa.selenium.WebElement;
import org.testng.asserts.Assertion;

public class BasePage {
	
	public void validateElement(WebElement element, String excpected, String errorMsg ) {
		Assertion assertion = new Assertion();
		assertion.assertEquals(element.getText(), excpected, errorMsg);
	}
		
	}

