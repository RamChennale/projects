package com.qa.seleniumFunctionality;

import org.openqa.selenium.Cookie;

import com.qa.base.TestBase;

public class DriverManageFunction extends TestBase {
	
	public void driverManageFunction() {
		Cookie cookie = null;
		
		driver.manage().addCookie(cookie);
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookie(cookie);
		driver.manage().deleteCookieNamed("name");
		driver.manage().equals(driver);
		driver.manage().getCookieNamed("name");
		driver.manage().timeouts()	;
		driver.manage().window();
		driver.manage().logs();
	}
}
