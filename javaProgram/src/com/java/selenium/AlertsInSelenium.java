package com.java.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.security.Credentials;
import org.testng.annotations.Test;

/*1. Simple alert: warning/information click OK
2.confirmation alert: Do you want continue/delete ?
3. Prompt alert : Asking information/input data*/

public class AlertsInSelenium {

	@Test
	public void alerts() {
		WebDriver driver = new ChromeDriver();
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
			public void setCredentials(Credentials arg0) {

			}

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
			public void authenticateUsing(Credentials arg0) {
			}

			@Override
			public void accept() {
			}
		};

	}
}
