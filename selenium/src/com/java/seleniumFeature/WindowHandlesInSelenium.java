package com.java.seleniumFeature;

import java.util.Iterator;
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
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			driver.switchTo().window(string);
		}
	}
}
