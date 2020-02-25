package com.qa.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class HighLightElement extends DynamicBaseClass{

	@Test(enabled=true)
	public void highLightElement() {
		WebElement element= driver.findElement(By.xpath("//a[text()='Home']"));
		flashElement(element, driver);
	}
	
	public static void flashElement(WebElement element, WebDriver driver) {
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		String bgColor=element.getCssValue("backgroungColor");
		for(int i=0; i<10; i++) {
			changeColor("rgb(0,200,0)", element, driver);//new color
			changeColor(bgColor, element, driver);//old color
		}
	}
	
public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor jse=((JavascriptExecutor)driver);
		jse.executeScript("arguments[0].style.backgroundColor= '"+color+"'", element);
	}
}
