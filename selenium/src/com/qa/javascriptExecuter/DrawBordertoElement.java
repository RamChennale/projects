package com.qa.javascriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class DrawBordertoElement extends DynamicBaseClass{

	public static void drawBorder( WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	@Test(enabled = true)
	public void drawBordertoElement() throws InterruptedException{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='Home']"));
		drawBorder(element);
		Thread.sleep(2000);
	}
}
