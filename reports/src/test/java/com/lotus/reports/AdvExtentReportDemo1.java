/*package com.lotus.reports;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class AdvExtentReportDemo1 {
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		ExtentHtmlReporter extentHtmlReporter= new ExtentHtmlReporter(".\\reports\\report\\report.html");
		extent= new ExtentReports();
		extent.attachReporter(extentHtmlReporter);
		logger=extent.createTest("loginTest");
	}
	
	@Test
	public void loginTest() {
		System.setProperty("webdriver.chrome.driver", ".\\browser\\chromedriver.exe");
		WebDriver driver= (WebDriver) new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("title is "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Google"));
	}
	// This will run after test case and it will capture screenshot and add in report
		@AfterMethod
		public void tearDown(ITestResult result) throws IOException
		{
			if(result.getStatus()==ITestResult.FAILURE)
			{
				String temp=Utility.getScreenshot(driver);
				logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			}
			extent.flush();
			driver.quit();
}
}
*/