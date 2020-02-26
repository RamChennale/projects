package com.qa.alert;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class GetTextAlert extends DynamicBaseClass {
	@Test
	public void alert() {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
	}
}