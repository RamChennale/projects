package com.qa.headlessBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HtmlUnitHeadlessDriver {

	@Test
	public void htmlUnitHeadlessDriver() {
		System.setProperty("webdriver.chrome.driver",".\\browser\\ChromeDriver.exe");
		WebDriver driver= new HtmlUnitDriver();
		driver.get("http://uitestpractice.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Testing Controls");
		driver.quit();
	}
}
