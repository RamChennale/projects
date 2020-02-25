package com.qa.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class CustomXpathVariable extends DynamicBaseClass {

	@Test(enabled = false)
	public void customVarXpath() {
		String VarXpath = "Home";
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'" + VarXpath + "')]"));
		element.click();
	}

	public static WebElement dynamicXpathPassVar(String xpath) {
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'" + xpath + "')]"));
		return element;
	}

	@Test(enabled = false)
	public void callingDynamicXpathPassVar() {
		WebElement element = CustomXpathVariable.dynamicXpathPassVar("Home");
		element.click();
	}

	/* Format string for the # xpath lookup. */ // a[contains(text(),'Home')]
	private static final String USER_XPATH = "//a[contains(text(),'%s')]";

	@Test(enabled = true)
	public void customXpathStringFormat() {
		String xpath = "Home";
		String fullXpath = String.format(USER_XPATH, xpath);
		driver.findElement(By.xpath(fullXpath)).click();
	}
	
	
}
