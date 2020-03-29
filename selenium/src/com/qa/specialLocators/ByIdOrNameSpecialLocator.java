package com.qa.specialLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class ByIdOrNameSpecialLocator extends DynamicBaseClass{

	@Test
	public  void specialLocatorByIdOrName() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(new ByIdOrName("dblClick")).click();
	}
	
	
}
