package com.qa.ExpectedConditionsClass;

/*An expectation for checking if the given element is selected.
Parameters:
element WebElement to be selected
Returns:
true once the element is selected*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class ElementToBeSelected_ExpectedConditions extends DynamicBaseClass{

	@Test(enabled=false)
	public void elementToBeSelectedUsingByLocator() {
		DynamicBaseClass.NavigateToUrl("http://the-internet.herokuapp.com/checkboxes");
		wait= new WebDriverWait(driver, 10, 600);
		boolean isSelected	=wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//div[@class='row']//input[2]")));
		if(isSelected) {
			System.out.println("check box is already selected.");
		}else {
			System.out.println("check box is NOT selected.");
		}
	}
	
	@Test(enabled=true)
	public void elementToBeSelectedUsingWebElement() {
		DynamicBaseClass.NavigateToUrl("http://the-internet.herokuapp.com/checkboxes");
		wait= new WebDriverWait(driver, 10, 600);////div[@class='row']//input[1]
		boolean isSelected	=wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//div[@class='row']//input[1]"))));
		if(isSelected) {
			System.out.println("check box is already selected.");
		}else {
			System.out.println("check box is NOT selected.");
		}
	}
}
