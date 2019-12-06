package com.qa.seleniumFunctionality;

import com.qa.base.TestBase;

public class DriverSwitchTofunction extends TestBase {

	public void switchTofunction() {
		driver.switchTo().activeElement().click();
		driver.switchTo().alert().accept();
		driver.switchTo().frame(1);
		driver.switchTo().frame("nameOrId");
		driver.switchTo().frame(webElement);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.switchTo().equals(driver);
		driver.switchTo().getClass();
		String str = driver.switchTo().toString();
		driver.switchTo().window("nameOrHandle");
	}
}
