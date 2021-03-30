package com.qa.javascriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class DatePickerSetAttributeJS extends DynamicBaseClass {

	@Test
	public void datePickerSetAttributeJS() throws Exception {
		DynamicBaseClass.navigateToUrl("https://www.spicejet.com/");
		WebElement elementDatePicker = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		Thread.sleep(5000);
		elementDatePicker.click();
		datePickerJavaScript(driver, elementDatePicker, "22-03-2020");
		Thread.sleep(2000);
	}

	public static void datePickerJavaScript(WebDriver driver, WebElement element, String dateValue) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + dateValue + "');", element);

		/*
		 * dateValue + "')":: 
		 * org.openqa.selenium.WebDriverException: unknown error: Runtime.evaluate threw
		 * exception: SyntaxError: missing ) after argument list
		 */
	}
}
