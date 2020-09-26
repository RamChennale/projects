package com.qa.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class HiddenWebElementFinder extends TestBase {

	public void clickOnHiddenWebElement(WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
}
