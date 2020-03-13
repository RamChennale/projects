package com.qa.base;

import java.io.FileInputStream;
import java.util.Properties;

import com.qa.utilities.TestUtilities;

public class TestBase_HRMS {
	
	Properties p = null;
	
	/**
	 * This method will help in getting the web component locators of the HRMS module.
	 * @param locator (The locator key)
	 * @return Returns the value with respect to the locator
	 */
	public String getHrmsLocators(String locator){
		try {
			p = new Properties();
			FileInputStream hrmsLocatorFile = new FileInputStream(TestUtilities.HRMS_RECRUITMENT_LOCATORS);
			p.load(hrmsLocatorFile);
			return p.getProperty(locator);
		} catch (Exception e) {
			return null;
		}
	}
	
	public String getHRMSData(String data){
		try {
			p = new Properties();
			FileInputStream hrmsDataFile = new FileInputStream(TestUtilities.HRMS_DATA_FILE);
			p.load(hrmsDataFile);
			return p.getProperty(data);
		} catch (Exception e) {
			return null;
		}
	}

}
