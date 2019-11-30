package com.java.seleniumFeature;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {

	@Test
	public void windHandle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		Point point = driver.manage().window().getPosition();
		int x = point.getX();
		int y = point.getY();

		Dimension dimension = driver.manage().window().getSize();
		int height = dimension.getHeight();
		int width = dimension.getWidth();
		
		driver.manage().window().setPosition(point);
		driver.manage().window().setSize(dimension);
		driver.manage().deleteAllCookies();
	}
}
