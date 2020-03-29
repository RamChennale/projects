package com.qa.specialLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class ByChainedSpecialLocator extends DynamicBaseClass{

	@Test
	public  void specialLocatorByChained() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(new ByChained(
				By.xpath("//div[@class='navbar-collapse collapse']"),
				By.xpath("//a[contains(text(),'Home')]"))).click();
	}
}
