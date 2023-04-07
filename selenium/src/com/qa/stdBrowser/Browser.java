package com.qa.stdBrowser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.api.client.util.GenericData.Flags;
import com.qa.stdReports.LoggerHelper;

public class Browser {

	BrowserInterface browser; 
	String browserName; 
	Logger logger = LoggerHelper.getLogger(Browser.class);
	
	public Browser (String browserName , String driverName) {
		this.browserName = browserName;
		close(driverName);
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resource/drivers/" + driverName);
			browser = new ChromeBrowser();
			break;

		default:
			break;
		}
	}
	
	public void close(String processName) {
		try {
			if (isProcessRunning(processName)) {
				
			}
		} catch (Exception e) {
			logger.debug("Failed to kill the process" + processName);
		}
	}
	
	public static boolean isProcessRunning(String processName) {
	
		boolean running_value = false;
		try {
			String line; 
			Process process = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32" + "tasklist.exe");
			BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			while((line = input.readLine()) !=null) {
				if (line.contains(processName)) {
					running_value = true;
					break;
				}
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
			running_value = false;
		}
		return running_value;
	}
}

