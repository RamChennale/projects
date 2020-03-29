package com.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBaseFireFox {

	public static WebDriver driver;
	public static WebElement webElement;

	@BeforeClass
	  public void initByFirefox(){
		  System.setProperty("webdriver.gecko.driver",".//Driver//geckodriver.exe");
	  driver= new FirefoxDriver(); driver.get("http://uitestpractice.com/");
	  driver.manage().window().maximize(); driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); }
	 
	
	public static void NavigateToUrl(String navigationUrl) {
		driver.navigate().to(navigationUrl);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	@AfterClass
	public void closeAllBrowser() {
		if(driver!=null) {
			driver.quit();
		}
	}
}
