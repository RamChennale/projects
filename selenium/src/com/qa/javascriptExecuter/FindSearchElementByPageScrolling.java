package com.qa.javascriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class FindSearchElementByPageScrolling extends DynamicBaseClass {

	public static void findElementByPageScrolling(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	@Test(enabled = true)
	public static void pageScrollToFindElement() throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Toggle icons')]"));
		findElementByPageScrolling(element);
		Thread.sleep(3000);
	}
}
