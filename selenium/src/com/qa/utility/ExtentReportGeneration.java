package com.qa.utility;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGeneration {

	public ExtentHtmlReporter extentHtmlReporter;
	public ExtentReports extentReports;
	public ExtentTest extentTest;
	
	@BeforeTest
	public void reportSetUp() {
		extentHtmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"./reports/report.html");
		extentHtmlReporter.config().setReportName("MT UAT Test Status");
		extentHtmlReporter.config().setTheme(Theme.STANDARD);
		extentHtmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		
		extentReports= new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
		extentReports.setSystemInfo("OS", "Windows");
		extentReports.setSystemInfo("Test Type", "Regression Test");
	}
	
	@BeforeMethod
	public void getTestCaseName(Method method) {
		String testName=method.getName();
		extentTest=extentReports.createTest(testName);
	}
	
	@AfterMethod
	public void testCaseResult(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			extentTest.log(Status.PASS,"Test case name is : "+result.getName()+" passed.");
		}else if(result.getStatus()==ITestResult.FAILURE) {
			extentTest.log(Status.FAIL, "Test case name is : "+result.getName()+"failed");
			extentTest.log(Status.FAIL, "Test case name is : "+result.getThrowable()+"failed");
		}else if (result.getStatus()==ITestResult.SKIP) {
			extentTest.log(Status.SKIP, "Test case name is : "+result.getName()+"skipped");
		}
	}
	
	@AfterTest
	public void generateReport() {
		extentReports.flush();
	}
	
}


//ExtentReports extent = new ExtentReports("Specify the file path here where your extent reports should reside",false);
//Parameter False - Is used to append the reports of previous run testcase along with newly run testcase.

//Parameter True- Deletes the history of reports of previous run testcases and shows only the reports of newly run testcases.