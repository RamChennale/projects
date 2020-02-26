package com.qa.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class DynamicTableXpathLoopIteration extends DynamicBaseClass{

	
	@Test
	public void dynamicTableXpathLoopIteration() {
		WebElement element=driver.findElement(By.xpath("//a[text()='Home']"));
		element.click();
		
		//*//table/tbody/tr[2]/td[1]
		//*//table/tbody/tr[3]/td[1]
		//*//table/tbody/tr[4]/td[1]
		//*//table/tbody/tr[5]/td[1]
		String beforXpath="*//table/tbody/tr[";
		String afterXpath="]/td[2]";
		for(int i=2;i<=5;i++) {
			String name=	driver.findElement(By.xpath(beforXpath+i+afterXpath)).getText();
			System.out.println(name);
			if(name.equalsIgnoreCase("friend")) {
				WebElement edit=driver.findElement(By.xpath("*//table/tbody/tr[5]/td[4]/button[1]"));
				edit.click();//
				System.out.println(edit);
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
