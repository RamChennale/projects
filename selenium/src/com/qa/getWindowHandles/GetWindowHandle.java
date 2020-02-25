package com.qa.getWindowHandles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class GetWindowHandle extends DynamicBaseClass{

	@Test
	public void getAllWindowsInArrayList() {
		WebElement popUpLocator=driver.findElement(By.xpath("//b/a[contains(text(),'Multi-PopUp Test #2')]"));
		popUpLocator.click();
		String currentWindId=driver.getWindowHandle();
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		System.out.println("Title: "+title);
		System.out.println("CurrentUrl: "+url);
		System.out.println("Wind Id: "+currentWindId);
	}
}
