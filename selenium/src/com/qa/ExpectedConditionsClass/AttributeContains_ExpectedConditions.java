package com.qa.ExpectedConditionsClass;

/*An expectation for checking WebElement with given locator has attribute which contains specific value
Parameters:
locator used to define WebElement to check its parameters
attribute used to define css or html attribute
value used as expected attribute value
Returns:
Boolean true when element has css or html attribute which contains the value*/

/*OUTPUT:if value not found
 * org.openqa.selenium.TimeoutException: Expected condition failed: waiting for value 
 * to contain "/Students/Index1". Current value: "null" (tried for 10 second(s) with 800 milliseconds interval) 
 * 
 * */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class AttributeContains_ExpectedConditions extends DynamicBaseClass {

	@Test
	public void verifyAttributeContainsUsingByLocator() {
		wait = new WebDriverWait(driver, 10, 800);
		String attribute = "href";
		String value = "/Students/Index";
		boolean isAttributeContain = wait.until(ExpectedConditions.attributeContains(By.xpath("//*[text()='Homeaa']"), attribute, value));
		System.out.println("Attribute available: ? " + isAttributeContain);
		Assert.assertTrue(isAttributeContain);

	}
	
	@Test(enabled=false)
	public void verifyAttributeContainsUsingWebElement() {
		wait = new WebDriverWait(driver, 10, 800);
		String attribute = "href";
		String value = "/Students/Index";
		boolean isAttributeContain = wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("//*[text()='Home']")), attribute, value));
		System.out.println("Attribute available: ? " + isAttributeContain);
		Assert.assertTrue(isAttributeContain);

	}
}

/******************If Element not found: 
org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: 
{"method":"xpath","selector":"//button[contains(text(),'Show Me Confirmation')]"}
  (Session info: chrome=80.0.3987.132)
  
******************If wrong attribute/value condition not satisfied in given time: 
org.openqa.selenium.TimeoutException: Expected condition failed: waiting for value to contain "/Students/Index". Current value: "null" (tried for 10 second(s) with 800 milliseconds interval)

*/