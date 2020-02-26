package com.qa.alert;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class DismissAlert extends DynamicBaseClass {
	@Test
	public void alert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();// click on Cancel/No

	}

}