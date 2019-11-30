package com.java.seleniumFeature;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebElementInterfaceSelenium {

	@Test
	public void webElementInterfaceSelenium() {
		WebDriver driver = new ChromeDriver();
		WebElement webElement = driver.findElement(By.id("id"));
		webElement.clear();
		webElement.click();
		String attribute = webElement.getAttribute("attribute");
		String cssValue = webElement.getCssValue("cssValue");
		Point point = webElement.getLocation();
		Dimension dimension = webElement.getSize();
		String tagname = webElement.getTagName();
		String text = webElement.getText();
		boolean isdisplayed = webElement.isDisplayed();
		if (isdisplayed) {
			webElement.clear();
			webElement.sendKeys("ram");
		}
		boolean isenaled = webElement.isEnabled();
		if (!isenaled) {
			webElement.click();
		}
		boolean isselected = webElement.isSelected();
		if (!isselected) {
			Select select = new Select(webElement);
			select.selectByIndex(0);
			select.selectByValue("Male");
			select.selectByVisibleText("gender");
		}

		List<WebElement> list = driver.findElements(By.tagName("//a"));
		List<WebElement> list2 = new ArrayList<WebElement>();
		for (WebElement element : list) {
			list2.add(element);
		}

		Select select = new Select(list2.get(0));
		select.selectByValue("Mr");
		WebElement element2 = list2.get(1);
		element2.sendKeys("Ram");
		boolean element3 = list2.get(2).isDisplayed();
		if (element3) {
			list2.get(2).click();
		}
	}
}
