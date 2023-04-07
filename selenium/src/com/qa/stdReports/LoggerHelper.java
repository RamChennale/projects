package com.qa.stdReports;

import java.io.File;
import org.apache.log4j.Logger;

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
		
		String logLevel = System.getProperty("logLevel", Global)
		
	}
}
