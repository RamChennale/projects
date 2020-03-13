package com.qa.utilities;

public class TestUtilities {
	
	// ========================= PROJECT DIRECTORIES ==================================
	public static final String PROJECT_DIRECTORY = System.getProperty("user.dir")+"/";
	public static final String DATA_FILE_DIRECTORY = PROJECT_DIRECTORY + "Data Files/";
	public static final String ELEMENT_LOCATOR_DIRECTORY = PROJECT_DIRECTORY + "Locators/";
	public static final String SCREENSHOT_DIRECTORY = PROJECT_DIRECTORY + "Screenshots/";
	
	public static final String CHROMEDRIVER_PATH = System.getProperty("user.dir")+"/Driver/chromedriver.exe";
	
	public static final String EAGLEBIZ_TEST_URL = "http://111.93.27.203:90/eaglebiz_test/";
	
	
	// ========================== DATA FILES ============================================
	public static final String LOGIN_DATA_FILE = DATA_FILE_DIRECTORY + "loginData.properties";
	public static final String CRM_SR_DATA_FILE = DATA_FILE_DIRECTORY + "crm_salesRequestData.properties";
	public static final String HRMS_DATA_FILE = DATA_FILE_DIRECTORY + "hrms_dataFile.properties";
	
	
	
	// =========================== LOCATOR FILES =========================================
	public static final String SALES_REQUEST_LOCATORS = ELEMENT_LOCATOR_DIRECTORY + "crm_salesRequest.properties";
	public static final String HRMS_RECRUITMENT_LOCATORS = ELEMENT_LOCATOR_DIRECTORY + "hrms_recruitment.properties";
	
	

}
