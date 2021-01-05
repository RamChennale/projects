package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.qa.interfaces.TestBaseI;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase implements TestBaseI{

	public static WebDriver driver;
	public static WebElement webElement;
	public static Properties properties;
	private static Logger logger = Logger.getLogger(TestBase.class);

	@BeforeClass
	public void initiate() throws IOException {
		String URL;
		properties = new Properties();
		//Download the web driver executable
		WebDriverManager.chromedriver().setup();
		//Create a instance of your web driver - chrome
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "/src/com/qa/config/config.properties");
		properties.load(fis);
		URL = properties.getProperty("url");
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("Browser launched successfully.");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		logger.info("All browsers closed successfully.");
	}
}
