package com.qa.stdBrowser;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.qa.stdReports.LoggerHelper;
import com.qa.stdUtility.ExceptionHandler;

public class WebDriverManager {
	
	public static boolean launchNewBrowserPerScenario;
	private static String browser = null ;
	private static String remote = "false";
	private static String huburl = null;
	private static String browserVersion;
	private static String palatform = null; 
	
	public static DesiredCapabilities capabilities;
	
	private static ThreadLocal<WebDriver> tDriverLocal = new ThreadLocal<WebDriver>();
	private static Logger log = LoggerHelper.getLogger(WebDriverManager.class);
	
	
	public static synchronized String  getBrowserName() {
		return browser;
	}
	
	public static synchronized void setBrowser(String browser) {
		WebDriverManager.browser = browser;
	}
	public static String getBrowserVersion() {
		return browserVersion;
	}
	
	//get driver 
	public static synchronized WebDriver getDriver() {
		return tDriverLocal.get();
	}
	
	//close driver 
		public static synchronized void closeDriver() {
			 tDriverLocal.get().close();;
		}
		
		//quite driver 
		public static synchronized void quitDriver() {
			tDriverLocal.get().quit();;
		}

		public static void killDriverProcess() {
			try {
				switch (browser) {
				case "chrome":

					break;

				default:
					break;
				}
				
			} catch (Exception e) {
				ExceptionHandler.handleException(e);
			}
			
		}
}
