package com.qa.seleniumFunctionality;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class FluentWaitDemo extends TestBase {
	
	@Test
	public void fluentWaitExamle() {
		//1111
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//2222
		WebDriverWait webDriverWait= new WebDriverWait(driver, 10);
		webElement=webDriverWait.until(ExpectedConditions.visibilityOf(webElement));
		webElement.sendKeys("username");
		webDriverWait.until(ExpectedConditions.visibilityOf(webElement)).click();
		//333
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).
				withTimeout(10, TimeUnit.SECONDS).
				pollingEvery(1, TimeUnit.SECONDS).
				ignoring(NoSuchElementException.class);
		
		WebElement webElement= wait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("id"));
			}
		});
		webElement.sendKeys("username");
		
		//
	}
}