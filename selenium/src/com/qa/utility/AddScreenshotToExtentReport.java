package com.qa.utility;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import com.qa.utility.GetFailedTestCaseScreenshot;

public class AddScreenshotToExtentReport {

	WebDriver driver;
	ExtentHtmlReporter extentHtmlReporter;
	ExtentReports extentReports;
	ExtentTest extentTestTCresult;
	String reportFile = System.getProperty("user.dir") + "/test-output/TestReportByExtentHtmlReporter.html";

	@BeforeClass
	public void initBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browser\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	@BeforeTest
	public void setUpReport() {
		extentHtmlReporter = new ExtentHtmlReporter(reportFile);
		extentHtmlReporter.config().setReportName("Test Case execution Report");
		extentHtmlReporter.config().setTheme(Theme.STANDARD);
		extentHtmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);

		extentReports = new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
		extentReports.setSystemInfo("Env", "QA test env");
		extentReports.setSystemInfo("OS", "Windows family");
		extentReports.setSystemInfo("Browser", "Chrome");

	}

	@BeforeMethod
	public void getMethodTCName(Method method) {
		String nameofTC = method.getName();
		extentTestTCresult = extentReports.createTest(nameofTC);
	}

	@Test
	public void testDemo() {
		WebElement home = driver.findElement(By.xpath("//a[@href='/Students/Index'][text()=\"Home\"]"));
		home.click();
		String expectedTitle = "Testing Control";
		String title = driver.getTitle();
		Assert.assertEquals(title, expectedTitle, "Assertion failed");
	}

	@AfterMethod
	public void getMethodTCStatus(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			extentTestTCresult.log(Status.PASS, "Test case: " + result.getName() + " passed");
		} else if (result.getStatus() == ITestResult.FAILURE) {
			extentTestTCresult.log(Status.FAIL, "Test case: " + result.getName() + "failed");
			extentTestTCresult.log(Status.FAIL, "Test case: " + result.getThrowable() + "falied");
			String imagePath = GetFailedTestCaseScreenshot.getScreenshot(driver, result.getName());
			try {
				extentTestTCresult.addScreenCaptureFromPath(imagePath, result.getName());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (result.getStatus() == ITestResult.SKIP) {
			extentTestTCresult.log(Status.SKIP, "Test case: " + result.getName() + "skipped");
		}
	}

	@AfterTest
	public void writeReport() {
		extentReports.flush();
	}

	@AfterClass
	public void tearDownBrowser() {
		driver.close();
	}
}
