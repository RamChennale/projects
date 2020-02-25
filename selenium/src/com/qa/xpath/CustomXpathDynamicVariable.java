package com.qa.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.base.DynamicBaseClass;

public class CustomXpathDynamicVariable extends DynamicBaseClass{

	public static String createXpath(String xpath, Object ...args) {
		for(int i=0;i<args.length; i++) {
			xpath=xpath.replace("{"+i+"}", (CharSequence) args[i]);
		}
		return xpath; 
	}

	public static void main(String[] args) {
		String xpathHome=createXpath("//input[@id='{0}']","Home");
		System.out.println(xpathHome);
		WebElement elementHome=	driver.findElement(By.xpath("xpathHome"));
		System.out.println(elementHome);
	}
}
