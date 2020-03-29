package com.qa.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;
import com.qa.base.TestBaseFireFox;

public class WebTableWriteToExcel extends TestBaseFireFox{

	@Test
	public void writeWebTableValuesToExcel() {
		WebElement home= driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		home.click();
		List<WebElement> rows= driver.findElements(By.xpath(""));

	}
}
