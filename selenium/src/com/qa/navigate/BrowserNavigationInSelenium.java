package com.qa.navigate;

import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class BrowserNavigationInSelenium extends DynamicBaseClass{

	@Test
	public void browserNavigation() {
		String initialTitle=	driver.getTitle();
		System.out.println("Initial Title : "+initialTitle);
		driver.navigate().to("https://news.google.com/");
		String afterNavidating= driver.getTitle();
		System.out.println("After Navidating : "+afterNavidating);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
	}
}
