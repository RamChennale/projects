package com.qa.ExpectedConditionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class frameToBeAvailableAndSwitchToIt_ExpectedConditions extends DynamicBaseClass{

	@Test
	public void frameToBeAvailableAndSwitchToItUsingByLocator() {
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		wait= new WebDriverWait(driver, 10);
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@name='frame-left']")));
	
		 
		 /*ExpectedCondition<WebDriver> org.openqa.selenium.support.ui.ExpectedConditions.frameToBeAvailableAndSwitchToIt(By locator)

		 An expectation for checking whether the given frame is available to switch to. 

		 If the frame is available it switches the given driver to the specified frame.

		 Parameters:
		 locator used to find the frame
		 Returns:
		 WebDriver instance after frame has been switched*/
	}
}
/*
****************Frame element not found in given time: 
org.openqa.selenium.TimeoutException: Expected condition failed: waiting for frame to be available: By.xpath: //frame[@name='frame-left1'] (tried for 10 second(s) with 500 milliseconds interval)

****************Frame element not found in given time: 	
Caused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.xpath: //frame[@name='frame-left1']
	*/