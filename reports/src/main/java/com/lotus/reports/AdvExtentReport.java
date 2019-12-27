package com.lotus.reports;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class AdvExtentReport {
	
	

	@Test
	public void advExtentReport() {
		ExtentReports reports= new ExtentReports(System.getProperty("user.dir"+".\\report\report.html"));
		ExtentTest test= reports.startTest("AdvExtentReport");
		
	}
}
