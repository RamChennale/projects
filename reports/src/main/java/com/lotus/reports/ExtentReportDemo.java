package com.lotus.reports;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {

	@Test
	public void loginTest() throws IOException {
		// Create Object of ExtentHtmlReporter and provide the path where you want to
		// generate the report
		ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter("./eports/report/report.html");
		// Create object of ExtentReports class- This is main class which will create
		// report
		ExtentReports extentReports = new ExtentReports();
		// attach the reporter which we created in Step 1
		extentReports.attachReporter(extentHtmlReporter);
		// call createTest method and pass the name of TestCase- Based on your
		// requirement
		ExtentTest logger = extentReports.createTest("LoginTest");
		// log method will add logs in report and provide the log steps which will come
		// in report
		logger.log(Status.INFO, "Login to amazon");
		logger.log(Status.PASS, "Title verified");
		// Flush method will write the test in report- This is mandatory step
		extentReports.flush();
	}

}
