package com.qa.waits;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_visibilityOfAllElements {

	
	public static List<WebElement> waitVisibilityOfAllElements(WebDriver driver, List<WebElement> elements, int timeOutInSecconds) {
		return new WebDriverWait(driver, timeOutInSecconds).
		 until(ExpectedConditions.visibilityOfAllElements(elements));
	}
}

/*ExpectedConditions.visibilityOfAllElements(driver.findElements(By.tagName("a")))
 * 
An expectation for checking that all elements present on the web page that match the 
locator are visible. Visibility means that the elements are not only displayed 
but also have a height and width that is greater than 0.

Parameters:
elements list of WebElements
Returns:
the list of WebElements once they are located*/
