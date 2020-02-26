package com.qa.alert;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class AcceptAlert extends DynamicBaseClass {
	
	@Test
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept(); // clicking OK

	}
}
