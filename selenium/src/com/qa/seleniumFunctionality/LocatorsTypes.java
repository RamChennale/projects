package com.qa.seleniumFunctionality;

import org.openqa.selenium.By;

import com.qa.base.TestBase;

public class LocatorsTypes extends TestBase{

	public void locatorsTypes() {
		driver.findElement(By.id("id"));
		driver.findElement(By.name("name"));
		driver.findElement(By.tagName("tagName"));
		driver.findElement(By.className("className"));
		driver.findElement(By.xpath("xpathExpression"));
		driver.findElement(By.linkText("linkText"));
		driver.findElement(By.partialLinkText("partialLinkText"));
		driver.findElement(By.cssSelector("cssSelector"));
	}
}
