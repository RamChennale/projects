package com.qa.stdBrowser;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.qa.stdUtility.FileManager;
import com.qa.stdUtility.GlobalVaribales;


public class ChromeBrowser implements BrowserInterface {
	
	private WebDriver driver;

	@Override
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		Map<String, Object> preferences = new HashMap<String, Object>();
		
		//don't show anypop up while downloading any file 
		preferences.put("profile.default_content_settings.popups", 0);
		
		//default download folder
		preferences.put("downlaod.default_directory", FileManager.getFileManagerObject().dowloadFolderFilePath());
		
		//disable discard warning message from chrome 
		preferences.put("safebrowsing.enabled", "true");
		
		//handling certificate issue
		preferences.put("CapabilityType.ACCEPT_SSL_CERTS", "true");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--ignore-certificate-error");
		options.setExperimentalOption("prefs", preferences);
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--disable-gpu");
		
		if (WebDriverManager.getBrowserName().contains("incognito")) {
			options.addArguments("--incognito");
		}
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().proxy("10.98.21.24:8080").setup();
		
		this.driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(120L, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(90L, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(GlobalVaribales.waitTime,  TimeUnit.SECONDS);
		
		return driver;
	}

}
