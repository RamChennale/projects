package com.java.selenium;

public class BrowserNavigationInSelenium extends BaseClass{

	public void navigationInSelenium() {
		driver.navigate().to("www.google.com");
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.navigate().back();
	}
}
