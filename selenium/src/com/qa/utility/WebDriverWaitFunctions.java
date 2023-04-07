package com.qa.utility;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBaseWealthWeb;

public class WebDriverWaitFunctions extends TestBaseWealthWeb{
	
	static WebDriverWait webDriverWait= new WebDriverWait(driver, 20);
	
	public static void waitToPopUpAlert() {
		webDriverWait.until(ExpectedConditions.alertIsPresent());
	}

}
