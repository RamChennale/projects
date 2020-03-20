package com.qa.navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationInSelenium {

	public void navigationInSelenium() {
		WebDriver driver = new ChromeDriver();
		Navigation navigation=	driver.navigate();
		navigation.back();
		navigation.forward();
		navigation.to("url");
		driver.navigate().to("www.google.com");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
	}
}
