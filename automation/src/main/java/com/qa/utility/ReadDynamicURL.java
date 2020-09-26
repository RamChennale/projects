package com.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.OperatingSystem;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDynamicURL {

	public static WebDriver driver;
	public static FileInputStream fileInputStream;
	public static String URL;
	public static Properties properties;


	@Test
	public void dynamicURLReading() throws InterruptedException, IOException, FileNotFoundException {

		properties= new Properties();
		fileInputStream  = new FileInputStream(
				System.getProperty("user.dir") + "/src/main/java/com/qa/config/config.properties");
		properties.load(fileInputStream);
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter envirnment where you want generate buil Test or Development ?");
		String whichEnv=scanner.next();
		
		WebDriverManager.chromedriver().operatingSystem(OperatingSystem.WIN).setup();
		driver = new ChromeDriver();
		
		if(whichEnv.equalsIgnoreCase("Test")) {
			String test = properties.getProperty("test");
			System.out.println("Test : "+test);
			driver.get(test);
			Thread.sleep(5000);
		}else if (whichEnv.equalsIgnoreCase("Development")) {
			String development = properties.getProperty("development");
			System.out.println("Development : "+development);
		driver.get(development);
		Thread.sleep(5000);
		}
		
		driver.manage().window().maximize();
		driver.quit();
	}

}


/*
 * public static void generateAlert(String message) {
 * 
 * generateAlert("User locator not found."); Thread.sleep(2000);
 * JavascriptExecutor js = ((JavascriptExecutor) driver);
 * js.executeScript("alert('" + message + "')"); }
 */