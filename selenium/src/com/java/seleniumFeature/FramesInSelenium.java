package com.java.seleniumFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FramesInSelenium {

	@Test
	public void framesInSelenium() {
		WebDriver driver = new ChromeDriver();
		driver.switchTo().frame(0);
		driver.switchTo().frame("userReg");
		driver.switchTo().frame(driver.findElement(By.id("id")));

		driver.switchTo().defaultContent();// switch back to the main(initial) first frame of current running frame
		driver.switchTo().parentFrame();// switch back to the immediate parent frame of current running frame

	}
}
