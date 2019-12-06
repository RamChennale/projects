package com.qa.seleniumFunctionality;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.qa.base.TestBase;

public class WaitTypes extends TestBase {

	public void waitTypes() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 5);

		// 1.Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// 2.Explicit wait
		webElement = wait.until(ExpectedConditions.visibilityOf(webElement));

		// 3.polling interval
		wait.pollingEvery(2, TimeUnit.SECONDS);

		// 4.FluentWait
		WebElement wait2 = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.visibilityOf(webElement));
		wait2.click();

		// OR
		Duration timeout = null;
		Duration interval = null;
		Wait<WebDriver> wait3 = new FluentWait<WebDriver>(driver).withTimeout(timeout).pollingEvery(interval)
				.ignoring(NoSuchElementException.class);

		WebElement userName = wait3.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("id"));
			}
		});

		// 5.pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// 6 static Thread wait
		Thread.sleep(10);
	}
}
