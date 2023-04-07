package com.qa.stdBrowser;

public class WebDriverManager {
	
	public static boolean launchNewBrowserPerScenario;
	private static String browser = null ;
	private static String remote = "false";
	private static String huburl = null;
	
	
	
	public static synchronized String  getBrowserName() {
		return browser;
	}
	
	public static synchronized void setBrowser(String browser) {
		WebDriverManager.browser = browser;
	}

}
