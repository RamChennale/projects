package com.java.selenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	
	public static WebDriver driver = null;
	public static WebDriverWait webDriverWait = null;
	
	public static Logger logger= Logger.getLogger(TestBase.class);

	@BeforeClass
	public void launchApp() {
		System.out.println("======TO set the third party driver as =======");
		System.setProperty("webdriver.chrome.driver", ".//browser//ChromeDriver.exe");

		System.out.println("=====Creating Driver instance ======");
		driver = new ChromeDriver();

		System.out.println("=========TO maximise the window size=========");
		driver.manage().window().maximize();

		System.out.println("======Waiting implicitly========");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("=======Waiting explicitly===========");
		webDriverWait = new WebDriverWait(driver, 5);

		System.out.println("==================");
		driver.navigate().to("http://epsserver.test.com/hes.admin/login.htm");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

	}
	
	
	@AfterClass
	public void closeDriver() {
		driver.quit();
	}
}
