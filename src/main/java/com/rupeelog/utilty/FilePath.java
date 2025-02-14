package com.rupeelog.utilty;

public class FilePath {

	// ====== PROJECT DIRECTORIES ======
	public static final String PROJECT_DIRECTORY = System.getProperty("user.dir") + "/";
	public static final String DATA_FILE_DIRECTORY = PROJECT_DIRECTORY + "DataFiles/";
	public static final String CHROMEDRIVER_PATH = System.getProperty("user.dir") + "/browser/chromedriver.exe";
	public static final String URL = "";

	// ==== DATA FILES ====
	public static final String ADMIN_COB_DATA_FILE = DATA_FILE_DIRECTORY + "adminCOBdata.properties";
	public static final String ACCOUNTING_DATA_FILE = DATA_FILE_DIRECTORY + "accountingData.properties";
	public static final String ADMIN_MANUAL_TX_ADJUSTMENT = DATA_FILE_DIRECTORY+ "adminManualTxnAdjustmentsdata.properties";
	public static final String BREADCRUMB = DATA_FILE_DIRECTORY+ "breadcrumb.properties";
	public static final String MASTER_ASSETMASTER = DATA_FILE_DIRECTORY+ "masterAssetMasterdata.properties";
	public static final String BANK_DP_BROKER = DATA_FILE_DIRECTORY+ "masterBankDPBroker.properties";
	public static final String CLIENT_ONBOARD_MASTER = DATA_FILE_DIRECTORY+ "masterClientOnBoardMaster.properties";
	public static final String MASTER = DATA_FILE_DIRECTORY+ "master.properties";
	public static final String ADMIN_TESTDATA=DATA_FILE_DIRECTORY+"adminTestData.properties";
	public static final String INSTRUMENT_TESTDATA=DATA_FILE_DIRECTORY+"instrumentTestData.properties";
	public static final String REPORTS_TESTDATA=DATA_FILE_DIRECTORY+"reportsTestData.properties";
	public static final String RIMS_TESTDATA=DATA_FILE_DIRECTORY+"rimsTestData.properties";
	public static final String PROCESS_TESTDATA=DATA_FILE_DIRECTORY+"processTestData.properties";
	public static final String DISCPMS_TESTDATA=DATA_FILE_DIRECTORY+"discPMStestData.properties";
}