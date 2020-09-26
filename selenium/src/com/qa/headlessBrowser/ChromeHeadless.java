package com.qa.headlessBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.qa.base.TestBase;

public class ChromeHeadless extends TestBase{

	public void headlesBrowserTest() {
		ChromeOptions chromeOptions= new ChromeOptions();
		//first way
		chromeOptions.setHeadless(true);// working fine
		
		//second way
		chromeOptions.addArguments("--headless"); //working fine
		chromeOptions.addArguments("window-size=1920,1080");
		
		driver= new ChromeDriver(chromeOptions);
		
		
		 //just saved Valid code
			/*
			 * System.setProperty("webdriver.chrome.driver", "./browser/chromedriver");
			 * ChromeOptions options = new ChromeOptions();
			 * options.addArguments("--no-sandbox"); //Bypass OS security model
			 * options.addArguments("--start-maximized");
			 * options.addArguments("--disable-dev-shm-usage");
			 * options.addArguments("--disable-gpu"); options.addArguments("--headless");
			 * //options.setHeadless(true);
			 * options.setBinary("/usr/local/bin/google-chrome-stable/chromedriver");
			 * //chrome binary location specified here
			 * options.addArguments("start-maximized");
			 * options.setExperimentalOption("excludeSwitches",
			 * Collections.singletonList("enable-automation"));
			 * options.setExperimentalOption("useAutomationExtension", false); driver = new
			 * ChromeDriver(options);
			 */
		  
		
		// --------1 not working: giving Warning: Deprecated chrome option is ignored: useAutomationExtension and 
		  //unknown error: Chrome failed to start: exited abnormally.
		
		/*
		 * System.setProperty("webdriver.chrome.driver", "./browser/chromedriver");
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * chromeOptions.setHeadless(true); chromeOptions.addArguments("--no-sandbox");
		 * chromeOptions.addArguments("--disable-dev-shm-usage");
		 * chromeOptions.setExperimentalOption("useAutomationExtension", false); driver
		 * = new ChromeDriver(chromeOptions);
		 */
		  
			// --------3 this need to check and verify Just run your with following 04 options:
			  
			/*
			 * ChromeOptions options = new ChromeOptions();
			 * options.addArguments("--no-sandbox"); //Bypass OS security model
			 * options.addArguments("--start-maximized");
			 * options.addArguments("--disable-dev-shm-usage");
			 * options.addArguments("--headless");
			 * chromeOptions.setExperimentalOption("useAutomationExtension", false); driver
			 * = new ChromeDriver(options);
			 */
		  
			 //--------4 this need to check and verify
			  //chromeOptions.addArguments("--headless");
		  
			//  --------5 this need to check and verify
			/*
			 * DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			 * HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			 * chromePrefs.put("Profile.default_content_settings.popups", 0);
			 * chromePrefs.put("download.prompt_for_download", false);
			 * chromePrefs.put("download.directory_upgrade", true);
			 * chromePrefs.put("plugins.plugins_disabled", new String[] {
			 * "Chrome PDF Viewer" }); chromePrefs.put("credentials_enable_service",
			 * "false"); chromePrefs.put("Profile_password_manager_enabled", "false");
			 * chromePrefs.put("plugins.always_open_pdf_externally", true);
			 * 
			 * ChromeOptions options = new ChromeOptions(); options.setBinary("");
			 * options.setExperimentalOption("prefs", chromePrefs);
			 * options.addArguments("--headless"); options.addArguments("--no-sandbox");
			 * //Bypass OS security model options.addArguments("--disable-setuid-sandbox");
			 * options.addArguments("--start-maximized");
			 * options.addArguments("--disable-dev-shm-usage");
			 * options.addArguments("--disable-gpu"); driver = new ChromeDriver(options);
			 */
			 
		
	}
}
