package com.qa.waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Clock;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TypesOfWebDriverWait {

	public void typesOfWebDriverWait() {
		WebDriver driver = null;
		WebElement element;
		String attribute="href";
		String attributeValue="https://www.twitter.com";
		
		//Type 1
		WebDriverWait waitDefaultPollingEvery500ms= new WebDriverWait(driver, 10);
		
		//Type 2
		WebDriverWait waitPollingEvery800ms= new WebDriverWait(driver, 10, 800);
		
		Clock clock = null;
		Sleeper sleeper = null;
		long timeOutInSeconds = 0;
		long sleepTimeOut = 0;
		//Type 3
		WebDriverWait wait= new WebDriverWait(driver, clock, sleeper, timeOutInSeconds, sleepTimeOut);
		/*	Parameters:
			driver The WebDriver instance to pass to the expected conditions
			clock The clock to use when measuring the timeout
			sleeper Object used to make the current thread go to sleep.
			timeOutInSeconds The timeout in seconds when an expectation is
			sleepTimeOut The timeout used whilst sleeping. Defaults to 500ms called.*/
	}
}
