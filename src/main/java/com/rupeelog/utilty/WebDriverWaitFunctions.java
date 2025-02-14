package com.rupeelog.utilty;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rupeelog.base.TestBase;

public class WebDriverWaitFunctions extends TestBase {

	static WebDriverWait webDriverWait = new WebDriverWait(driver, 10);

	public static WebElement waitToLoadElement(WebElement webElement) {
		return webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
	}

	public static List<WebElement> waitToLoadAllElements(List<WebElement> webElementList) {
		return webDriverWait.until(ExpectedConditions.visibilityOfAllElements((webElementList)));

	}

	public static void waitToSelectDropDownValue(WebElement webElement) {
		webDriverWait.until(ExpectedConditions.elementToBeSelected(webElement));
	}

	public static void waitToPopUpAlert() {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		webDriverWait.until(ExpectedConditions.alertIsPresent());
	}

}
