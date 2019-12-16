package com.qa.testNGListerner;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*1. this is class level  implementation is good for 1 or 2 classes.
* 2. for multiple class need to implement suit level in 'testNG.xml file after the suit tag'*/

@Listeners(com.qa.testNGListerner.TestNGListener.class)   
public class TestNGListenerUsage {

	public static WebDriver driver;
	private static Logger logger = Logger.getLogger(TestNGListenerUsage.class);

	@BeforeClass
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\browser\\ChromeDriver.exe");
		driver = new ChromeDriver();
		System.out.println("==========Browser started ===============");
	}

	@Test
	public void startApp() {
		driver.get("http://epsserver.test.com/hes.admin/login.htm");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		logger.info("User enterd in startApp() app started");
		System.out.println("=====App started =======");
	}

	@Test(dependsOnMethods = "startApp")
	public void login() throws Exception {
		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys("TestAdmin");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("testadmin");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("login-submit")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		logger.info("User logged in app successfully");
		boolean status = driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul/li[1]/a"))
				.isDisplayed();
		Assert.assertTrue(status);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("======User logged in=======");
		Thread.sleep(5);
	}

	@Test(dependsOnMethods = "login")
	public void logout() throws Exception {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='dropdownMenu1']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul/li[3]/ul/li/a")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		logger.info("User logged out");
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='username']")).isDisplayed());
		System.out.println("=====User logged out======");
		Thread.sleep(5);
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
		System.out.println("==========Browser Closed ===============");
	}
}
