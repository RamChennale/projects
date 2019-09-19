package com.java.selenium;

/**
 * Q:- What does mean by implicitlyWait 
 * Q:- What does mean by expliciteWait
 * Q:- What is polling interval 
 * Q:- What is FluentWait 
 * Q:- What is java script wait 
 * Q:- What is thread.sleep 
 * Q:- What is pageLoadTimeout 
 * Q:- What is Java script Ready state
 * @throws InterruptedException 
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class WaitsInSelenium {

	static WebDriver driver = new ChromeDriver();

	@Test
	public void typesOfWaitInSelenium() throws InterruptedException {
		//1.Implicit wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		//2.Explicit wait
		WebDriverWait webDriverWait= new WebDriverWait(driver, 10);
		webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(""))));
		webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		//3.polling interval 
		WebDriverWait webDriverWait1= new WebDriverWait(driver, 10);
		webDriverWait1.pollingEvery(2, TimeUnit.SECONDS);
		webDriverWait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(""))));
				
		//4.FluentWait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).
				withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS).
				ignoring(NoSuchElementException.class);
		WebElement username = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id(""));
			}
		});
		// 5.pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// Q:- What is thread.sleep
		Thread.sleep(5000);
		
		
		
		
		//1. Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//2. Explicit wait
		WebDriverWait webDriverWait11 = new WebDriverWait(driver, 30);
		webDriverWait11.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("id")))).click();
		//polling wait
		WebDriverWait wait22= new WebDriverWait(driver, 10);
		wait22.pollingEvery(2, TimeUnit.SECONDS);
		wait22.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(""))));
		//3. Fluent wait
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).
				withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS).
				ignoring(NoSuchElementException.class);
		WebElement userName = wait2.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("id"));
			}
		});
		
		//4. page load time out
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//5. Thread sleep wait
		Thread.sleep(10000);
		
		
		
	}
}