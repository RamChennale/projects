package com.qa.seleniumFunctionality;

import org.openqa.selenium.WebDriver.Navigation;

import com.qa.base.TestBase;

public class BrowserNavigations extends TestBase{

	public void browserNavigations() {
		Navigation navigate=driver.navigate();
		navigate.refresh();
		navigate.forward();
		navigate.back();
		navigate.to("https://www.google.com/search?q=ramchennale");
	}
}
