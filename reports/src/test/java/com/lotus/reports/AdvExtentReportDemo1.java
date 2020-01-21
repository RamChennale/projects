package com.lotus.reports;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class AdvExtentReportDemo1 {
	WebDriver driver;
	ExtentHtmlReporter extentHtmlReporter;
	ExtentReports extent;
	ExtentTest test;
	String fName = System.getProperty("user.dir") + "./report/report.html";
	String fileName=System.getProperty("user.dir") + "./report/AdvExtentReportDemo1Report.html";

	@BeforeTest
	public void setUp() {
		extentHtmlReporter = new ExtentHtmlReporter(fName);
		extent = new ExtentReports();
		extent.attachReporter(extentHtmlReporter);
		extentHtmlReporter.config().setReportName("Extent Dynamic Report Name");
		extentHtmlReporter.config().setTheme(Theme.STANDARD);
		extentHtmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		extent.setSystemInfo("OS", "windows");
		extent.setSystemInfo("Envirnment", "QA Automation");
		extent.setSystemInfo("Test methodology", "Regression Test");
	}

	@Test(priority=1)
	public void openBrowser() {
		test = extent.createTest("TC_1 Open browser");
		test.log(Status.INFO, "Test exec started");
		System.setProperty("webdriver.chrome.driver", ".\\browser\\chromedriver.exe");
		driver = new ChromeDriver();
		test.log(Status.INFO, "Browser launched");
	}

	@Test(priority=2)
	public void openGoogle() {
		test = extent.createTest("TC_2 openGoogle");
		driver.get("http://www.google.com");
		System.out.println("title is " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Google"));
		test.log(Status.PASS, "Google search engine opened");
	}

	@Test(priority=3)
	public void verifyTitle() {
		test = extent.createTest("TC_3 verifyTitle");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Google"));
		test.log(Status.PASS, "Title verified");
	}

	@Test(priority=4)
	public void login() {
		test = extent.createTest("TC_4 login");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("wwwww"));
	}

	@AfterMethod
	public void checkResults(ITestResult tesResult) {
		if (tesResult.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "TestCase failed");
			test.log(Status.FAIL, tesResult.getThrowable());
		} else if (tesResult.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test case passed");
		} else if (tesResult.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, tesResult.getThrowable());
		}
	}

	@AfterTest
	public void teardown() {
		extent.flush();
		driver.quit();
	}

}
