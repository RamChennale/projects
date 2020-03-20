package com.qa.screenshot.byListerner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(GetScreenshotByITestListener.class)
public class GetScreenshot extends TestBaseScreenshot{

	@BeforeMethod
	public void setUp() {
		intit();
	}
	
	@Test
	public void failedTC1() {
		Assert.assertTrue(false);
	}
	@Test
	public void failedTC2() {
		Assert.assertTrue(false);
	}
	@Test
	public void failedTC3() {
		Assert.assertTrue(false);
	}
	@Test
	public void failedTC4() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void failedTC5() {
		Assert.assertTrue(false);
	}
	@AfterMethod
	public void tearDownBrowser() {
		tearDown();
	}
}
