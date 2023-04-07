package com.qa.stdUtility;

import com.aventstack.extentreports.ExtentReports;
import com.qa.stdBrowser.Browser;

public class GlobalVaribales {

	public static String browserName; 
	public static String driverName; 
	public static Browser browser; 
	public static String applicationName; 
	public static String applicationURL;
	public static int waitTime = 60 ;
	public static PropertyFileUtility configProp = null;
	
	
	public static ExtentReports extentReports;
}
