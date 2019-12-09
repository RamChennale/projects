package com.java.seleniumFeature;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutionInSelenium extends BaseClass{

	@Test
	public void javaScriptExec() {
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollBy(0,250)", ""); //scrolls down 
		javascriptExecutor.executeScript("window.scrollBy(0,-250)", "");//scrolls up
	}
}
