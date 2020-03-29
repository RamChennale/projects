package com.qa.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromWebDriverManager {

	@Test(enabled = false)
	public void chromWebDriverManager() {
		//setup the chrome driver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}

	//Selenium webdrivermanager capabilities
	@Test
	public void chromWithCapabilities() {
		WebDriverManager.firefoxdriver()
			.arch64()
			.proxy("myhost:9090")
			.proxyUser("ram")
			.proxyPass("123")
			.setup();

		ChromeDriver driver= new ChromeDriver();
	}

}
