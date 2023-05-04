package com.qa.stdReports;

import java.io.File;

import javax.naming.ConfigurationException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.apache.commons.configuration2.PropertiesConfiguration;


import com.qa.stdUtility.GlobalVaribales;

public class LoggerHelper {

	private static boolean root = false;

	public static String logPath;

	public synchronized static void createLogFolder() {
		String userDir = System.getProperty("user.dir");
		String folderName = CalendarUtility.getCalendarUtilityObject().getTimeStamp("ddMMyyyy_HHmmss");
		logPath = userDir + "/logs/" + folderName;
		new File(LoggerHelper.logPath).mkdir();
	}
	
	public synchronized static Logger getLogger(Class cls) {
		if(root) {
			return Logger.getLogger(cls);
		}
		
		LoggerHelper.createLogFolder();
		
		String logLevel = System.getProperty("logLevel", GlobalVaribales.configProp.getProperty("logLevel"));
		
		PropertiesConfiguration config;
		try {
			config = new PropertiesConfiguration("log4j.properties");
			config.setProperty("logFolder", LoggerHelper.logPath);
			config.setProperty("logLevel", logLevel);
			config.save();
		} catch (ConfigurationException e) {
			e.printStackTrace();
			Assert.fail();
		}
		
		PropertyConfigurator.configure("log4j.properties");
		root = true;
		return (Logger) Logger.getInstance(cls);
		
	}
}
