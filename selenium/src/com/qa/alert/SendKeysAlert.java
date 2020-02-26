package com.qa.alert;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class SendKeysAlert extends DynamicBaseClass {
	@Test
	public void alert() {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("username"); // Data can be sent to alert.

	}
}
