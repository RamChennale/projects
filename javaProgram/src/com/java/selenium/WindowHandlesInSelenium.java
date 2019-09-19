package com.java.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlesInSelenium {

	@Test
	public void wndowHandlesInSelenium() {
		WebDriver driver = new ChromeDriver();
		String wind = driver.getWindowHandle();
		driver.switchTo().window(wind);

		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<>();
		Iterator<String> iterator = set.iterator();

	}
}
