package com.qa.waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.opencensus.common.Function;

public class DiffWebDriverWaitFluentWait {

	public static void fluentWait(WebDriver driver) {
		Wait wait= new FluentWait<WebDriver>(driver)
				.withTimeout(60, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		/*
		 * WebElement foo=wait.until(new Function<WebDriver, WebElement>() { public
		 * WebElement applyy(WebDriver driver) { return
		 * driver.findElement(By.id("foo")); } });
		 */
	}
}
