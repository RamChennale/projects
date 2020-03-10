package com.qa.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class DynamicTableRowCountXpath extends DynamicBaseClass{

	@Test(enabled=false)
	public void dynamicTableRowCountXpath() {
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		List<WebElement> list=	driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		int rowcount=list.size();
		String beforXpath="//*//table[1]//tbody[1]//tr[";
		String afterXpath="]//td[1]";
		for(int i=2;i<=rowcount;i++) {
			System.out.println(driver.findElement(By.xpath(beforXpath+i+afterXpath)).getText()); 
			
		}
	}
	
	
	@Test(enabled=true)
	public void dynamicTableColCountXpath() {
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		List<WebElement> list=	driver.findElements(By.xpath("//table[@class='table']//tbody//tr//th"));
		int colCount=list.size();
		System.out.println("colCount: "+colCount);
		String beforXpath="//table[@class='table']//tbody//tr//th[";
		String afterXpath="]";
		for(int i=1;i<=colCount;i++) {
			System.out.println(driver.findElement(By.xpath(beforXpath+i+afterXpath)).getText()); 
			
		}
	}
}
