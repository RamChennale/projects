package com.qa.javascriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class JavaScriptEnabledFeatures extends DynamicBaseClass {

	@Test(enabled = false)
	public void highlightElement() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='Home']"));
		flashElement(element, driver);
	}

	public static void flashElement(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgColor = element.getCssValue("backgroungColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element, driver);// new color
			changeColor(bgColor, element, driver);// old color
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].style.backgroundColor= '" + color + "'", element);
	}

	@Test(enabled = false)
	public void drawBordertoElement() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='Home']"));
		drawBorder(driver, element);
	}

	public static void drawBorder(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static void generateAlert(String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	@Test(enabled = false)
	public void generateInfoAlert() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		generateAlert("User locator not found.");
	}

	@Test(enabled = false)
	public void clickByJavascript(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	@Test(enabled = false)
	public void refreshBy() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	@Test(enabled = false)
	public void getPageTitle() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title").toString();
		System.out.println("Page title: " + title);
	}

	@Test(enabled = false)
	public void getCompletePageText() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String wholePageText = js.executeScript("return document.documentElement.innerText").toString();
	}

	@Test(enabled = false)
	public void pageScrollupToBottom() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void findElementByPageScrolling(WebDriver driver, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	@Test(enabled = false)
	public void pageScrollToFindElement() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement element = driver.findElement(By.xpath("//a[text()='Home']"));
		findElementByPageScrolling(driver, element);
	}

}
