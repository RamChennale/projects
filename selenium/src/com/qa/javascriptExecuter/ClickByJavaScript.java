package com.qa.javascriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class ClickByJavaScript extends DynamicBaseClass{

	@Test(enabled = true)
	public void clickByJavascript() {
		WebElement element = driver.findElement(By.xpath("//a[text()='Home']"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
}
