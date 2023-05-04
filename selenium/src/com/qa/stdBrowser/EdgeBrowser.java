package com.qa.stdBrowser;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.qa.stdUtility.FileManager;
import com.qa.stdUtility.GlobalVaribales;

import io.github.bonigarcia.wdm.OperatingSystem;

public class EdgeBrowser implements BrowserInterface {

	private WebDriver driver;
	
	@Override
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		String browserVersion = WebDriverManager.getBrowserVersion();

		System.getProperty("webdriver.edge.driver",System.getProperty("user.dir")  + "srrc/test/resource/driver_" + browserVersion + ".exe");

				Map<String, Object> preferences = new HashMap<String, Object>();
				
				//default download folder
				preferences.put("downlaod.default_directory", FileManager.getFileManagerObject().dowloadFolderFilePath());
				
				EdgeOptions options = new EdgeOptions();
				options.setCapability("preferences", preferences);
				
				io.github.bonigarcia.wdm.WebDriverManager.edgedriver().operatingSystem(OperatingSystem.WIN).proxy("10.98.21.24:8080").setup();
				
				this.driver = new EdgeDriver(options);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(GlobalVaribales.waitTime,  TimeUnit.SECONDS);
				
				return driver;
	}

}
