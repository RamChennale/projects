package com.qa.seleniumFunctionality;

import org.openqa.selenium.JavascriptExecutor;

import com.qa.base.TestBase;

public class JavaScriptFunction extends TestBase {

	public void javaScriptFunction() {

		JavascriptExecutor javaScriptFunction = (JavascriptExecutor) driver;
		javaScriptFunction.executeScript("argument[0].click", webElement);// click web element
		javaScriptFunction.executeScript("window.scrollBy(0,250)", ""); //scrolls down
		javaScriptFunction.executeScript("window.srcollBy(0,-250)", "");// scrolls up
	}
}
