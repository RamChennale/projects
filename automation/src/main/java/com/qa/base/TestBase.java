package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

	public static WebDriver driver;
	public static Properties properties;
	private static Logger logger = Logger.getLogger(TestBase.class);

	@BeforeClass
	public void setUp() throws IOException {
		String URL;
		properties = new Properties();
		System.setProperty("webdriver.chrome.driver", ".\\browser\\ChromeDriver.exe");
		logger.info("Browser loaded successfully");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/com/qa/config/config.properties");
		properties.load(fis);
		URL = properties.getProperty("url");
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("Browser launched successfully.");
	}

	@AfterClass
	public void name() {
		driver.quit();
		logger.info("All browsers closed successfully.");
	}
}
