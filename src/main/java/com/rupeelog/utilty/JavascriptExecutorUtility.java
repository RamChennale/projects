package com.rupeelog.utilty;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorUtility {

	static JavascriptExecutor javascriptExecutor;
	
	public static void clickByJavascriptExecutor(WebDriver driver,WebElement element) {
		javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("arguments[0].click()", element);
	}
	
	public static void datePickerJavascriptExecutor(WebDriver driver, WebElement element, String dateValue) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", element);

		/*
		 * dateValue + "')":: 
		 * org.openqa.selenium.WebDriverException: unknown error: Runtime.evaluate threw
		 * exception: SyntaxError: missing ) after argument list
		 */
	}
}
