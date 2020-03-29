package com.qa.singletonePattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBaseSingletonePattern{

	static WebDriver driver;
	
	public static void init() {
		//Single tone design Pattern object of WebDriver  driver will be created only once. 
		if(driver==null) {
			if(ConstantSingletonePattern.BROWSER.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", ".//Driver//chromeDriver.exe");
				driver= new ChromeDriver();
			}else if(ConstantSingletonePattern.BROWSER.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", ".//Driver//geckodriver.exe");
				driver= new FirefoxDriver();
			}else if (ConstantSingletonePattern.BROWSER.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", ".//Driver//internetExplorerdriver.exe");
				driver= new InternetExplorerDriver();
			}
		}
		driver.get("http://uitestpractice.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(ConstantSingletonePattern.TIMEINSECONDS, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(ConstantSingletonePattern.TIMEINSECONDS, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	public static void quite() {
		if(driver!=null) {
			driver.quit();
			driver=null;
		}
	}
	
public static void close() {
		if(driver!=null) {
			driver.close();
			driver=null;
		}
	}
}
