package com.rupeelog.utilty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReaderUtility {

	Properties properties = null;
	FileInputStream fileInputStream= null;
	
	public String getDiscPMSTestData(String data) {
		properties = new Properties();
		try {
			fileInputStream = new FileInputStream(FilePath.DISCPMS_TESTDATA);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		try {
			properties.load(fileInputStream);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties.getProperty(data);
	}
	
	public String getProcessTestData(String data) {
		properties = new Properties();
		try {
			fileInputStream = new FileInputStream(FilePath.PROCESS_TESTDATA);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		try {
			properties.load(fileInputStream);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties.getProperty(data);
	}
	
	public String getRIMSTestDat(String data) {
		properties= new Properties();
		try {
			fileInputStream= new FileInputStream(FilePath.RIMS_TESTDATA);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		try {
			properties.load(fileInputStream);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties.getProperty(data);
	}
	
	public String getReportsTestData(String data) {
		
		properties= new Properties();
		try {
			fileInputStream= new FileInputStream(FilePath.REPORTS_TESTDATA);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		try {
			properties.load(fileInputStream);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties.getProperty(data);
	}
	
	public String getInstrumentTestData(String data) {
		try {
			properties= new Properties();
			fileInputStream= new FileInputStream(FilePath.INSTRUMENT_TESTDATA);
			properties.load(fileInputStream);
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties.getProperty(data);
	}
	
	public String getAdminTestData(String data) {
		try {
			properties= new Properties();
			fileInputStream= new FileInputStream(FilePath.ADMIN_TESTDATA);
			properties.load(fileInputStream);
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties.getProperty(data);
	}

	public String getAdminCOBTestData(String data) {
		try {
			properties = new Properties();
			FileInputStream kyphdataFile = new FileInputStream(FilePath.ADMIN_COB_DATA_FILE);
			properties.load(kyphdataFile);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties.getProperty(data);
	}
	
	
	public String getAccountingTestData(String data) {
		try {
		properties= new Properties();
		FileInputStream portfolioFile= new FileInputStream(FilePath.ACCOUNTING_DATA_FILE);
		properties.load(portfolioFile);
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties.getProperty(data);
	}
	
	public String getAdminManualTxAdjustmentData(String data) {
		try {
			properties= new Properties();
			FileInputStream fileInputStream= new FileInputStream(FilePath.ADMIN_MANUAL_TX_ADJUSTMENT);
			properties.load(fileInputStream);
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties.getProperty(data);
	}
	
	public String getBreadcrumb(String data) {
		try {
			properties = new Properties();
			FileInputStream breadcrumbFile = new FileInputStream(FilePath.BREADCRUMB);
			properties.load(breadcrumbFile);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties.getProperty(data);
	}
	
	public String getMasterData(String data) {
		try {
		properties= new Properties();
		FileInputStream masterFile= new FileInputStream(FilePath.MASTER_ASSETMASTER);
		properties.load(masterFile);
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties.getProperty(data);
	}
	
	public String getBankDPBrokerData(String data) {
		try {
		properties= new Properties();
		FileInputStream file= new FileInputStream(FilePath.BANK_DP_BROKER);
		properties.load(file);
		}catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties.getProperty(data);
	}
	
	public String getClientOnBoardMasterData(String data) {
		try {
			properties= new Properties();
			FileInputStream file= new FileInputStream(FilePath.CLIENT_ONBOARD_MASTER);
			properties.load(file);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return properties.getProperty(data);
	}
	
	public String getMasterTestData(String data) {
		properties= new Properties();
		try {
			FileInputStream fis= new FileInputStream(FilePath.MASTER);
			properties.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(data);	
				}
}
