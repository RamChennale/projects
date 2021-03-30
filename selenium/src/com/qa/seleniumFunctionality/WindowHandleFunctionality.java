package com.qa.seleniumFunctionality;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.TestBase;

public class WindowHandleFunctionality extends TestBase {

	public void windowHandleFunctionality() {

		String windName = driver.getWindowHandle();
		driver.switchTo().window(windName);
		
		for(String handle:driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		Set<String> set = driver.getWindowHandles();
		Iterator<String> iterator = set.iterator();
		ArrayList<String> arrayList = new ArrayList<String>();
		while (iterator.hasNext()) {
			arrayList.add(iterator.next());
		}
		driver.switchTo().window(arrayList.get(3));
		driver.close();
	}
	
	public void windowHandlesWorkingFunctionality() {
		WebElement ViewReportLink = null;
		String parentWindow=	driver.getWindowHandle();
		 
		ElementWait.isElementVisible(ViewReportLink);
		ViewReportLink.click();
		
		Set<String> windSet=driver.getWindowHandles();
		System.out.println("Before removing first window "+windSet.size());
		
		windSet.remove(windSet.iterator().next());
		System.out.println("After removing first window "+windSet.size());
		
		String lastWind=windSet.iterator().next();
		driver.switchTo().window(lastWind);
		
		WebElement verifyReportWind=driver.findElement(By.xpath("//a[contains(text(),'Portfolio Summary')]"));
		ElementWait.isElementVisible(verifyReportWind);
		System.out.println("Window title :  "+ driver.getTitle());
		System.out.println("New windo URL : "+driver.getCurrentUrl());
		
		driver.switchTo().window(parentWindow);
	}
}
