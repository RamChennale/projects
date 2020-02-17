package com.qa.googleCromeFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChromeOptionsClass {
public static WebDriver driver;
	
	@Test
	public void ChromeOptions() {
		System.setProperty("webdriver.chrome.driver", ".//browser//chromeDriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}	
}
