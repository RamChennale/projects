package com.qa.seleniumFunctionality;

import org.openqa.selenium.Alert;

import com.qa.base.TestBase;

public class AlertInterface extends TestBase {

	public void aletFunctions() {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("Ram");
		
	}
}
