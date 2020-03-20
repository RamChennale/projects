package com.qa.seleniumExceptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NullPointerExceptionVarNotInitialized {

	String browser = "";
	WebDriver driver;

	@Test
	public void variableNotInitialised() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		if (browser.equals("chrome")) {//control won't passes
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("fireforx")) { //control won't passes
			driver = new FirefoxDriver();
		}
		// throws java.lang.NullPointerException browser variable not been initialized

		driver.get("https://www.google.com");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.quit();
	}
}
