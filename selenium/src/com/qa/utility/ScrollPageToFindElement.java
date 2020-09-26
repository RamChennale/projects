package com.qa.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollPageToFindElement {

	public static void findElementByPageScrolling(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	/*	public static void pageScrollToFindElement(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Toggle icons')]"));
		findElementByPageScrolling(driver, element);
		Thread.sleep(3000);
	}*/
}
