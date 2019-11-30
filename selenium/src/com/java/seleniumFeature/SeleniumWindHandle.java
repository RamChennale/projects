package com.java.seleniumFeature;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumWindHandle {

	/**
	1. How to get window id on run time
	2. How to handle multiple window
	3. How to maximize window
	4. How to get co-ordinate of window 
	 */
	
	@Test
	public void windowHandle() {
		WebDriver driver = new FirefoxDriver();

	//	1. How to get window id on run time
	//	2. How to handle multiple window
		String str=	driver.getWindowHandle();
		driver.switchTo().window(str);
		
				
		Set<String> windList = driver.getWindowHandles();
		Iterator<String> wl = windList.iterator();
		ArrayList<String> arrayList = new ArrayList<String>();

		while (wl.hasNext()) {
			arrayList.add(wl.next());
		}
		
		driver.switchTo().window(arrayList.get(3));
		driver.close();
		
		driver.switchTo().window(arrayList.get(2));
		driver.close();
		
		driver.switchTo().window(arrayList.get(1)).close();
		
		//3. How to maximize window
		driver.manage().window().maximize();
		
		//4. How to get co-ordinate of window 
		Point point= driver.manage().window().getPosition();
		int x= point.getX();
		int y= point.getY();
		
		Point location= driver.findElement(By.id("id")).getLocation();
	 	int lx= location.getX();
		int ly= location.getY();
		
	}
	

}
