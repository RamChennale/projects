package com.qa.singletonePattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSingletonePattern {

	@BeforeMethod
	public void setUp() {
		TestBaseSingletonePattern.init();
	}
	
	@Test
	public void verifyTitle() {
		String title= TestBaseSingletonePattern.driver.getTitle();
		Assert.assertEquals(title, ConstantSingletonePattern.TITLE);
	}
	
	@Test
	public void verilyLocator() {
		WebElement home=TestBaseSingletonePattern.driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		Assert.assertTrue(home.isDisplayed(), "Home page locator displaying");
	}
	
	@AfterMethod
	public void tearDown() {
		TestBaseSingletonePattern.quite();
	}
}
