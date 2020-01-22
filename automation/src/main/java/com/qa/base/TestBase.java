package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.interfaces.TestBaseI;

public class TestBase implements TestBaseI{

	public static WebDriver driver;
	public static Properties properties;
	private static Logger logger = Logger.getLogger(TestBase.class);
	public static ExtentHtmlReporter extentHtmlReporter;
	public static ExtentReports extentReports;
	public static ExtentTest testInfo;
	
	@BeforeClass
	public void initiate() throws IOException {
		String URL;
		properties = new Properties();
		System.setProperty("webdriver.chrome.driver", ".\\browser\\ChromeDriver.exe");
		logger.info("Browser loaded successfully");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/com/qa/config/config.properties");
		properties.load(fis);
		URL = properties.getProperty("url");
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("Browser launched successfully.");
	}

	@BeforeTest
	public void reportSetup() {
		extentHtmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"./reports/report.html");
		extentHtmlReporter.config().setReportName("Automation Test Report");
		extentHtmlReporter.config().setTheme(Theme.STANDARD);
		extentHtmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
		extentReports.setSystemInfo("OS", "Windows");
		extentReports.setSystemInfo("Environment", "QA Automation");
		extentReports.setSystemInfo("Test methodology", "Regression Testing");
	}
	
	@BeforeMethod
	public void getMethodName(Method method) {
		String methodName=method.getName();
		testInfo=extentReports.createTest(methodName);
	}
	
	@AfterMethod
	public void testCaseStatus(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			testInfo.log(Status.PASS,"Test case name is : "+result.getName()+" passed.");
		}else if(result.getStatus()==ITestResult.FAILURE) {
			testInfo.log(Status.FAIL, "Test case name is : "+result.getName()+"failed");
			testInfo.log(Status.FAIL, "Test case name is : "+result.getThrowable()+"failed");
		}else if (result.getStatus()==ITestResult.SKIP) {
			testInfo.log(Status.SKIP, "Test case name is : "+result.getName()+"skipped");
		}
	}
	
	@AfterTest
	public void flushReport() {
		extentReports.flush();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		logger.info("All browsers closed successfully.");
	}
}
