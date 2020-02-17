package com.java.seleniumFeature;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class WebElementInterfaceSelenium {

	WebDriver driver = new ChromeDriver();
	WebElement webElement = driver.findElement(By.id("id"));

	public void webElementFeatures() {
		webElement.clear();
		webElement.click();
		webElement.findElement(By.id("id")).click();
		String attribute = webElement.getAttribute("name");
		String propertyName = webElement.getCssValue("propertyName");
		Point point = webElement.getLocation();
		Rectangle element = webElement.getRect();
		webElement.getScreenshotAs(OutputType.FILE);
		webElement.getSize();
		webElement.getTagName();
		webElement.getText();
		webElement.isDisplayed();
		webElement.isEnabled();
		webElement.isSelected();
		webElement.sendKeys("keysToSend");
		webElement.submit();
	}

	@Test
	public void webElementInterfaceSelenium() {
		driver = new ChromeDriver();
		webElement = driver.findElement(By.id("id"));
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
			webElement.sendKeys("ram");
		}
		boolean isenaled = webElement.isEnabled();
		if (isenaled) {
			webElement.click();
		}
		boolean isselected = webElement.isSelected();
		if (!isselected) {
			Select select = new Select(webElement);
			select.selectByIndex(0);
			select.selectByValue("Male");
			select.selectByVisibleText("gender");
		}
		
		//1 get all link count on page
		//2 print all link text
		//3 search and click on contact_us link
		
		String contact="contact_us";
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("1.Total link count: "+list.size());
		for(int i=0;i<list.size();i++) {
			String linkText=list.get(i).getText();
			System.out.println("2 Link Text: "+linkText);
			if(linkText.equalsIgnoreCase(contact)) {
				list.get(i).click();
				System.out.println("3. clicked on contact_us");
			}
		}
		List<WebElement> list2 = new ArrayList<WebElement>();
		for (WebElement element : list) {
			list2.add(element);
		}
		WebElement element = list2.get(0);
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
