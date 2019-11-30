package com.java.seleniumFeature;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectInSelenium {

	@Test
	public void selectInSelenium() {
		WebDriver driver = new ChromeDriver();
		Select select = new Select(driver.findElement(By.id("id")));
		select.selectByIndex(0);
		select.selectByValue("ram");
		select.selectByVisibleText("name");

		System.out.println();
		select.deselectAll();
		select.deselectByIndex(0);
		select.deselectByValue("value");
		select.deselectByVisibleText("text");

		WebElement locator = select.getFirstSelectedOption();
		List<WebElement> list = select.getOptions();
		for(WebElement element:list) {
			element.click();
		}
		Iterator<WebElement> elements= list.iterator();
		
		
	}
}
