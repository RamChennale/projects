package com.rupeelog.utilty;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollPageToFindElement {

	public static void findElementByPageScrolling(WebDriver driver, WebElement element) {
		JavascriptExecutor javascriptExecutor= ((JavascriptExecutor)driver);
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void findElementsByPageScrolling(WebDriver driver, List<WebElement> elementList) {
		JavascriptExecutor javascriptExecutor= ((JavascriptExecutor)driver);
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", elementList);
	}
	
	public static void scrollingPageDown(WebDriver driver) {
		JavascriptExecutor javascriptExecutor=((JavascriptExecutor)driver);
		javascriptExecutor.executeScript("window.scrollBy(0,400)");
	}
	
	public static void scrollingPageUp(WebDriver driver) {
		JavascriptExecutor javascriptExecutor=((JavascriptExecutor)driver);
		javascriptExecutor.executeScript("window.scrollBy(0,-250)");
	}
}
