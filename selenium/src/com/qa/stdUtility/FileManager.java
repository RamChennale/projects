package com.qa.stdUtility;

import java.io.File;

import org.apache.log4j.Logger;

import com.qa.stdReports.LoggerHelper;

public class FileManager {
	
	Logger logger = LoggerHelper.getLogger(FileManager.class);
	
	private static FileManager objFileManager = null;
	
	private FileManager() {
		
	}
	
	public synchronized static FileManager getFileManagerObject() {
		return (objFileManager == null ) ? new FileManager() : objFileManager ;
	}
	
	//get downlaod folder path specified in config.prop
	public String dowloadFolderFilePath() {
		
		PropertyFileUtility properties = new PropertyFileUtility(System.getProperty("user.dir") + "/config.properties");
		File folder = new File(properties.getProperty("downlaodFolder"));
		
		if(!folder.exists()) {
			folder.mkdir();
		}
		
		return folder.getAbsolutePath();
	}

}
