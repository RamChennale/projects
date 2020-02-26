package com.qa.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

/*1. Simple alert: warning/information click OK
2.confirmation alert: Do you want continue/delete ?
3. Prompt alert : Asking information/input data*/

public class AlertsInSelenium extends DynamicBaseClass{

	@Test
	public void alerts() {
		Alert alert = driver.switchTo().alert();
		alert.accept(); // clicking OK
		alert.dismiss();// click on Cancel
		alert.sendKeys("username"); // Data can be sent to alert.
		String alertText = alert.getText();

		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		String name = driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Ram");

		Alert alert1 = new Alert() {
			@Override
			public void sendKeys(String arg0) {
			}

			@Override
			public String getText() {
				return null;
			}

			@Override
			public void dismiss() {
			}

			@Override
			public void accept() {
			}
		};

	}
}
