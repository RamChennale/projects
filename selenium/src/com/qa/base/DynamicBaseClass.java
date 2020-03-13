package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DynamicBaseClass {

	public static WebDriver driver;
	
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".//browser//chromeDriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.comm100.com/platform/livechat/personalization/live-chat-window/");
		//driver.get("http://uitestpractice.com/");
		//http://popuptest.com/
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	
	
	public static void NavigateToUrl(String navigationUrl) {
		driver.navigate().to(navigationUrl);
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	@AfterClass
	public void closeAllBrowser() {
		driver.quit();
	}
}
