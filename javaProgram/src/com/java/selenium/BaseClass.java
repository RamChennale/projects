package com.java.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;
	public static Properties properties;
	public static FileInputStream fileInputStream;
	String hes_url = "http://59.144.177.220:8092/gems-web/login.htm";
	String guru99 = "http://demo.guru99.com/test/simple_context_menu.html";
	String testingurl = "http://uitestpractice.com/";

	@BeforeClass
	public void base() throws IOException, InterruptedException, FileNotFoundException {
		System.setProperty("webdriver.chrome.driver", ".\\browser\\chromeDriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(5000);
		try {
			properties = new Properties();
			fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/resource/config.properties");
			properties.load(fileInputStream);
			String testingurl = properties.getProperty("testingurl");
			System.out.println(testingurl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// driver.navigate().to(guru99url);
			driver.get(testingurl);
			Thread.sleep(2000);
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("Faile to find file :" + fileNotFoundException);
		} catch (IOException ioException) {
			System.out.println("faile to open a file :" + ioException);
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
