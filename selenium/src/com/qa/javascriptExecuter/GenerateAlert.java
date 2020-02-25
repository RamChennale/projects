package com.qa.javascriptExecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class GenerateAlert extends DynamicBaseClass{

	public static void generateAlert(String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	@Test(enabled = true)
	public void generateInfoAlert() throws InterruptedException{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		generateAlert("User locator not found.");
		Thread.sleep(2000);
	}
}
