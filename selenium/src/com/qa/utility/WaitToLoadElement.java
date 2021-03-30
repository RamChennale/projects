package com.qa.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rupeelog.base.TestBase;

public class WaitToLoadElement extends TestBaseWealthWeb{
	
	static WebDriverWait webDriverWait= new WebDriverWait(driver, 20);
	
	public static WebElement waitToLoadElement(WebElement webElement) {
		WebDriverWait webDriverWait= new WebDriverWait(driver, 20);
		return webDriverWait.until(ExpectedConditions.visibilityOf(webElement) );
	}
	
	public static List<WebElement>  waitToLoadAllElements(List<WebElement> webElementList) {
		WebDriverWait webDriverWait= new WebDriverWait(driver, 20);
		return webDriverWait.until(ExpectedConditions.visibilityOfAllElements((webElementList)));

	}
	public static void waitToSelectDropDownValue(WebElement webElement) {
		WebDriverWait webDriverWait= new WebDriverWait(driver, 20);
		webDriverWait.until(ExpectedConditions.elementToBeSelected(webElement));
	}
	
	public static void waitToPopUpAlert() {
		webDriverWait.until(ExpectedConditions.alertIsPresent());
	}
}
