package com.java.selenium;

import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FluentWaitInSelenium {
	
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).
				withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS).
				ignoring(NoSuchElementException.class);
		WebElement username = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id(""));
			}
		});
	}
	
}
	/*
	 * Above code snippet will Wait 30 seconds for an element to be present on the
	 * page and check for its presence once every 5 seconds.
	 */

