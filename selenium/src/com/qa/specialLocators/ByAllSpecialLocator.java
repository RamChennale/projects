package com.qa.specialLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class ByAllSpecialLocator extends DynamicBaseClass{

	@Test
	public  void specialLocatorByAll() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement( new ByAll(By.name("dblClick1"), By.xpath("//button[@name='dblClick']"))).click();
	}
	
}
