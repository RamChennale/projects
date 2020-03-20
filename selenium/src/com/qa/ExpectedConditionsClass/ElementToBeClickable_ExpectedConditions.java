package com.qa.ExpectedConditionsClass;
/*ExpectedConditions.elementToBeClickable: 
 
An expectation for checking an element is visible and enabled such that you can click it.
Parameters:
locator used to find the element
Returns:
the WebElement once it is located and clickable (visible and enabled)
 * */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class ElementToBeClickable_ExpectedConditions extends DynamicBaseClass{

	@Test
	public void elementToBeClickableUsingByLocator() {
		wait = new WebDriverWait(driver, 10, 800);
		WebElement home=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Home']")));
		home.click();
	}
	
	@Test
	public void elementToBeClickableUsingByWebElement() {
		wait = new WebDriverWait(driver, 10, 800);
		WebElement home=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()='Home']"))));
		home.click();
	}
}
