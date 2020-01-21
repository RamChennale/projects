package com.lotus.reports;

/*	part 1: Innitislize all resources
part 2: write all TestCases
part 3: Register all TC with Extent report
part 4: Get all test case status in run time and capure logs
part 5: close all resouce and flush up*/
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DynamicExtentTestReports {

	WebDriver driver;
	ExtentHtmlReporter extentHtmlReporter;
	ExtentReports extent;
	ExtentTest testInfo;

	@BeforeTest
	public void setUp() {
		extentHtmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "./report/report.html");//./report/DynamicExtentTestReports.html
		extentHtmlReporter.config().setReportName("RAM CHENNALE TEST REPORT");
		extent = new ExtentReports();
		extent.attachReporter(extentHtmlReporter);
		extent.setSystemInfo("Env", "QA Env");
	}

	@Test
	public void one() {
		Assert.assertTrue(true);
		testInfo.log(Status.INFO, "Informations ");
	}

	@Test
	public void two() {
		Assert.assertTrue(false);
		testInfo.log(Status.FAIL, "faled ");
	}

	@BeforeMethod
	public void register(Method method) {
		System.out.println("Method : reflection API");
		String testName = method.getName();
		testInfo = extent.createTest(testName);
	}

	@AfterMethod
	public void captureStatus(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			testInfo.log(Status.PASS, "Test method" + result.getName() + "passed");
		} else if (result.getStatus() == ITestResult.FAILURE) {
			testInfo.log(Status.PASS, "Test method" + result.getName() + "passed");
			testInfo.log(Status.FAIL, "Test method" + result.getThrowable() + "failed");
		} else if (result.getStatus() == ITestResult.SKIP) {
			testInfo.log(Status.SKIP, "Test method" + result.getName() + "skipped");
		}
	}

	@AfterTest
	public void cleanUp() {
		extent.flush();
		driver.quit();
	}
}
