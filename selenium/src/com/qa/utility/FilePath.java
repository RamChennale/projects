package com.qa.utility;

public class FilePath {

	// ====== PROJECT DIRECTORIES ======
	public static final String PROJECT_DIRECTORY = System.getProperty("user.dir") + "/";
	public static final String DATA_FILE_DIRECTORY = PROJECT_DIRECTORY + "Data Files/";
	public static final String CHROMEDRIVER_PATH = System.getProperty("user.dir") + "/browser/chromedriver.exe";
	public static final String URL = "";

	// ==== DATA FILES ====
	public static final String ADMIN_COB_DATA_FILE = DATA_FILE_DIRECTORY + "adminCOBdata.properties";
	public static final String ACCOUNTING_DATA_FILE = DATA_FILE_DIRECTORY + "accountingData.properties";
}