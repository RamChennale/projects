package com.qa.webdriver.basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class GetLinkAndClickIt extends TestBase{
	
	@Test(enabled = true)
	public void locatorBasicTest() {
		WebElement home = driver.findElement(By.linkText("Home"));
		System.out.println(" getAttribute  href: "+home.getAttribute("href"));
		home.click();
	}

}
