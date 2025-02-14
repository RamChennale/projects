package com.rupeelog.utilty;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rupeelog.base.TestBase;

public class WaitToLoadElement extends TestBase{
	
	static WebDriverWait webDriverWait= new WebDriverWait(driver, 10);
	
	public static WebElement waitToLoadElement(WebElement webElement) {
		WebDriverWait webDriverWait= new WebDriverWait(driver, 10);
		return webDriverWait.until(ExpectedConditions.visibilityOf(webElement) );
	}
	
	public static List<WebElement>  waitToLoadAllElements(List<WebElement> webElementList) {
		WebDriverWait webDriverWait= new WebDriverWait(driver, 10);
		return webDriverWait.until(ExpectedConditions.visibilityOfAllElements((webElementList)));

	}
	public static void waitToSelectDropDownValue(WebElement webElement) {
		WebDriverWait webDriverWait= new WebDriverWait(driver, 10);
		webDriverWait.until(ExpectedConditions.elementToBeSelected(webElement));
	}
	
	public static void waitToPopUpAlert() {
		webDriverWait.until(ExpectedConditions.alertIsPresent());
	}
}
