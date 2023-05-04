package com.qa.stdBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.stdUtility.GlobalVaribales;

public class IEBrowser implements BrowserInterface {

	private WebDriver driver;

	@Override
	public WebDriver getDriver() {
		
		this.driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(GlobalVaribales.waitTime, TimeUnit.SECONDS);

		return driver;
	}

}
