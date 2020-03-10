package com.qa.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class WebDriverWaitCustomSendKeyClickMethod extends DynamicBaseClass {

	
	
	@Test
	public void webDriverWaitCustomSendKeyClickMethod() {
		WebElement homeLink=driver.findElement(By.xpath("//a[@href='/Students/Contact']/preceding::li"));
		clickOn(homeLink, 10);
		
		WebElement enterSearchText=driver.findElement(By.xpath(".//*[@id='Search_Data']"));
		sendKeys(enterSearchText, 10, "Ram");
	}
	
	public static void sendKeys(WebElement element, int timeOutInSeconds, String value) {
		new WebDriverWait(driver, timeOutInSeconds).
		until(ExpectedConditions.visibilityOf(element)).
		sendKeys(value);
		/*
		 * visibilityOf(element): An expectation for checking that an element, known to
		 * be present on the DOM of a page, is visible. Visibility means that the
		 * element is not only displayed but also has a height and width that is greater
		 * than 0.
		 */

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
