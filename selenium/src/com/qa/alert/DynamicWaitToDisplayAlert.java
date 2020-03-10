package com.qa.alert;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class DynamicWaitToDisplayAlert extends DynamicBaseClass {

	@Test
	public void dynamicWaitToDisplayAlert() {
		DynamicBaseClass.NavigateToUrl("http://only-testing-blog.blogspot.com/2014/01/new-testing.html");
		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		webDriverWait.until(ExpectedConditions.alertIsPresent());
		/*
		 *If alert not found Output: org.openqa.selenium.TimeoutException: Expected condition
		 * failed: waiting for alert to be present (tried for 10 second(s) with 500
		 * milliseconds interval)
		 */

	}

}
