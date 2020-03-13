package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.utilities.*;

public class TestBase {
	Properties p = null;
//	Logger logger = null;

	/**
	 * This method will help to get the required data related to user login,
	 * from the login data file.
	 * @param data (The required data to be fetched from the data file)
	 * @throws IOException
	 */
	public String getLoginData(String data) {
		try {
			p = new Properties();
			FileInputStream loginDataFile = new FileInputStream(TestUtilities.LOGIN_DATA_FILE);
			p.load(loginDataFile);
		} catch (IOException e) {
//			writeFileError(e.getLocalizedMessage());
			e.printStackTrace();
		}
		return p.getProperty(data);
	}
	
	
	/**
	 * This method will help in getting the locators from the locator file of the Sales Request.
	 * @param locator (Type of locator)
	 * @return Returns the path / value of the locator
	 */
	public String getSalesRequestLocators(String locator){
		try {
			p = new Properties();
			FileInputStream locatorFile = new FileInputStream(TestUtilities.SALES_REQUEST_LOCATORS);
			p.load(locatorFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p.getProperty(locator);
	}
	
	
	/**
	 * This method will help to retrieve the test data for the Sales Request module in CRM.
	 * @param data (The data to be retrieved)
	 * @return Returns the value with respect to the data provided in the parameter.
	 */
	public String getCrmSrData(String data){
		try {
			p = new Properties();
			FileInputStream crm_sr_dataFile = new FileInputStream(TestUtilities.CRM_SR_DATA_FILE);
			p.load(crm_sr_dataFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p.getProperty(data);
		
	}
	
	
	public void captureScreenshot(WebDriver d, String fileName){
		File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(TestUtilities.SCREENSHOT_DIRECTORY+fileName+".png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	
//	public void writeFileError(String errorNote){
//		logger = LogManager.getLogger(0);
//		logger.error(errorNote);
//	}

}
