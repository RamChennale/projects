package com.java.seleniumFeature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class WindowHandlesInSelenium extends DynamicBaseClass {

	@Test
	public void wndowHandlesInSelenium() {
		WebElement popUp = driver.findElement(By.xpath("//a[contains(text(),'Multi-PopUp Test #2')]"));
		popUp.click();
		
		//To get single parent window
		String parentWind=driver.getWindowHandle();
		driver.switchTo().window(parentWind);
		
		//To get all windows
		Set<String> setOfWinds = driver.getWindowHandles();
		System.out.println("Num of windows : " + setOfWinds.size());
		Iterator<String> iterator = setOfWinds.iterator();
		String parWind = iterator.next();
		System.out.println("parentWind: " + parentWind);
		String childWind = iterator.next();
		System.out.println("childWind: " + childWind);
		
		//Get the list of all windows in ArrayList
		ArrayList<String> arrWind = new ArrayList<>();
		while (iterator.hasNext()) {
			arrWind.add(iterator.next());
		}
		System.out.println("All window Id's");
		System.out.println(arrWind);
	}
}
