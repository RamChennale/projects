package com.lotus.reports;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class AdvExtentReportDemo {

	@Test
	public void loginTest() throws IOException {

		ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"./report/report.html");//.//report/AdvExtentReportDemoreport.html"// Step 1 create
		ExtentReports extentReports = new ExtentReports();// Step 2 create ExtentReports
		extentReports.attachReporter(extentHtmlReporter);// attach the reporter which we created in Step 1
		ExtentTest logger = extentReports.createTest("LoginTest");// Step 3 Pass test case name
		logger.log(Status.INFO, "Login to amazon");// Step 4 log
		logger.log(Status.PASS, "Title verified");
		extentReports.flush(); // Step 5 Flush to write the test in report (mandatory)
	}
}

/*
 * 1.Create Object of ExtentHtmlReporter and provide the path where you want to
 * generate the report 2. Create object of ExtentReports class- This is main
 * class which will create report 3. call createTest method and pass the name of
 * TestCase- Based on your requirement 4. log method will add logs in report and
 * provide the log steps which will come in report 5 Flush method will write the
 * test in report- This is mandatory step
 */