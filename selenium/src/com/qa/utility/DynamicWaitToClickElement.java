package com.qa.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class DynamicWaitToClickElement extends DynamicBaseClass {

	
	
	@Test(enabled=false)
	public void dynamicWaitToClickElement() {
		WebElement homeLink=driver.findElement(By.xpath("//a[@href='/Students/Contact']/preceding::li"));
		clickOn(homeLink, 10);
	}
	
	public static void clickOn(WebElement element, int timeOutInSeconds) {
		new WebDriverWait(driver, timeOutInSeconds).
		until(ExpectedConditions.elementToBeClickable(element)).
		click();
		/*
		 * elementToBeClickable: An expectation for checking an element is visible and
		 * enabled such that you can click it.
		 */

	}
}
