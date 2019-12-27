package com.qa.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class TestCaptureScreenshotFailedTC extends TestBase {

	@Test
	public void captureScreenshotFailedTestCase() {
		CaptureScreenshotFailedTCPOM screenshot=PageFactory.initElements(driver, CaptureScreenshotFailedTCPOM.class);
		screenshot.captureScreenshotFailedTestCase();
	}

	@AfterMethod
	public void closeBrowser(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			System.out.println("captureScreenshotFailedTestCase STATUS : "+result.getStatus());
			try {
				TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/Screenshot/" + result.getName() + ".png"));
			} catch (Exception e) {
				System.out.println("Exception occured while capturing screenshot : " + e.getMessage());
			}
		}
	}
}
