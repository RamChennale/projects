package com.java.seleniumFeature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

public class HandleSSLUntrustedCertificates {

	WebDriver driver;
	ChromeOptions options;
	String url="https://www.cacert.org/";
	
	@Test(enabled=true)
	public void handlingSSLUntrustedCertificates() {
		System.setProperty("webdriver.chrome.driver", ".\\b\\ChromeDriver.exe");
		
		 options= new ChromeOptions();
		 options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		driver= new ChromeDriver(options);
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
