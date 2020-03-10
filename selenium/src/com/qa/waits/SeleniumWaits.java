package com.qa.waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.DynamicBaseClass;

public class SeleniumWaits extends DynamicBaseClass {

	public void selleniumWaits() {
		// implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// Explicit
		WebElement element;
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		element = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("1")));
		element = webDriverWait.until(ExpectedConditions.visibilityOf(element));
		element=  webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("1")));
		
		//Fluent 
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).
								withTimeout(10, TimeUnit.SECONDS).
								pollingEvery(1, TimeUnit.SECONDS).
								ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		WebElement element2= wait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("xpathExpression"));
				 
			}
		});
		element2.click();
		
		WebElement element3=new FluentWait<WebDriver>(driver).
							withTimeout(10, TimeUnit.SECONDS).
							pollingEvery(1, TimeUnit.SECONDS).
							ignoring(NoSuchElementException.class).
							until(ExpectedConditions.presenceOfElementLocated(By.id("id")));
		element3.click();
	}
}
