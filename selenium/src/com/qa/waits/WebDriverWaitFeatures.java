package com.qa.waits;

/*An explicit waits is code you define to wait for a certain condition to occur before 
 * proceeding further in the code. 
WebDriverWait by default calls the ExpectedCondition every 500 milliseconds until it returns 
successfully.

When to use: If element takes a long time to load. Also, used to check property of an element
 (presence, clickability. etc).
*/
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class WebDriverWaitFeatures extends DynamicBaseClass {

	@Test
	public void testWait() {
		DynamicBaseClass.NavigateToUrl("http://only-testing-blog.blogspot.com/2014/01/new-testing.html");
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		webDriverWait.until(ExpectedConditions.alertIsPresent());
	}
}

/*
 * If alert not found Output: org.openqa.selenium.TimeoutException: Expected
 * condition failed: waiting for alert to be present (tried for 10 second(s)
 * with 500 milliseconds interval)
 */