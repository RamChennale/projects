package com.qa.seleniumExceptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IllegalStateExceptionInSelenium {

	@Test
	public void illegalStateException() {
		try {
			WebDriver driver = new ChromeDriver();// gives
			driver.get("https://www.google.com.in");
		} catch (IllegalStateException e) {
			e.printStackTrace();
			System.out.println("=============");
			System.out.println(e);
		}

		/*
		 * java.lang.IllegalStateException: The path to the driver executable must be
		 * set by the webdriver.chrome.driver system property;
		 */
	}
}
