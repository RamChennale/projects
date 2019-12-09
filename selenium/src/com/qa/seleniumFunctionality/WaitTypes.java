package com.qa.seleniumFunctionality;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class WaitTypes extends TestBase {

	public void waitTypes() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 5);

		// 1.Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// 2.Explicit wait
		wait.until(ExpectedConditions.visibilityOf(webElement)).click();
		webElement = wait.until(ExpectedConditions.visibilityOf(webElement));
		webElement.sendKeys("user");
		
		// 3.polling interval
		wait.pollingEvery(2, TimeUnit.SECONDS);

		// 4.FluentWait VALID need to verify 
		Wait<WebDriver> wait2= new FluentWait<WebDriver>(driver).
				withTimeout(30, TimeUnit.SECONDS).
				pollingEvery(2, TimeUnit.SECONDS).
				ignoring(NoSuchElementException.class);
		WebElement element= wait2.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("id"));
			}
		});
			element.sendKeys("username");
		// OR in selenium 3.3 new version need to use Duration as time unit. 
/*		Duration timeout = null;
		Duration interval = null;
		Wait<WebDriver> wait4 = new FluentWait<WebDriver>(driver).withTimeout(timeout).pollingEvery(interval)
				.ignoring(NoSuchElementException.class);

		WebElement userName = wait4.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("id"));
			}
		});*/

		// 5.pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// 6 static Thread wait
		Thread.sleep(10);
	}
}
