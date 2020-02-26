package com.qa.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class CustomXpathDynamicVariable extends DynamicBaseClass {

	public static String createXpath(String xpath, Object... args) {// Object[] args == Object ...args
		for (int i = 0; i < args.length; i++) {
			xpath = xpath.replace("{" + i + "}", (CharSequence) args[i]);
		}
		return xpath;
	}

	@Test(enabled = true)
	public void createXpathTest() {
		// a[text()='Home']
		String xpathHome = createXpath("//a[text()='{0}']", "Home");
		System.out.println(xpathHome);
		WebElement elementHome = driver.findElement(By.xpath(xpathHome));

		// a[text()='Home' and @href='/Students/Index']
		String doubleParamXpath = createXpath("//a[text()='{0}' and @href='{1}']", "Home", "/Students/Index");
		System.out.println(doubleParamXpath);
		WebElement elementHome1 = driver.findElement(By.xpath(doubleParamXpath));
		System.out.println(doubleParamXpath);
	}

	public static String createXpathObjArray(String xpath, Object[] args) {// Object[] args == Object ...args
		for (int i = 0; i < args.length; i++) {
			xpath = xpath.replace("{" + i + "}", (CharSequence) args[i]);
		}
		return xpath;
	}

	@Test(enabled = true)
	public void createXpathObjArrayXpath() {
		// a[text()='Home']
		Object[] array = { "Home" };
		String xpathHome = createXpathObjArray("//a[text()='{0}']", array);
		System.out.println(xpathHome);
		WebElement elementHome = driver.findElement(By.xpath(xpathHome));
		System.out.println("Using ObjectArrayXpath : " + elementHome);
	}
}
