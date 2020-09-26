package com.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReaderUtility {

	Properties properties = null;

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
}
