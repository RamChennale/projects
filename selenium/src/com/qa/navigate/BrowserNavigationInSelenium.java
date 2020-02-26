package com.qa.navigate;

import org.openqa.selenium.WebDriver.Navigation;

import com.java.seleniumFeature.BaseClass;

public class BrowserNavigationInSelenium extends BaseClass{

	public void navigationInSelenium() {
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
