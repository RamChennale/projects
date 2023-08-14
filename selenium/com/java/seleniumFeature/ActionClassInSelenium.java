package com.java.seleniumFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClassInSelenium {

	WebDriver driver;
	@Test
	public void test() {
		System.setProperty("webdriver.chrom.driver", "\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		//actions.click();  Clicks at the current mouse location.
		actions.moveToElement(driver.findElement(By.id("id"))).build().perform();
		int xOffset = 0;
		int yOffset = 0;
		WebElement toElement = null;
		
		actions.doubleClick();
		actions.doubleClick(driver.findElement(By.id("id"))).build().perform();;

		WebElement source = driver.findElement(By.id("id"));
		WebElement target = driver.findElement(By.id("id"));
		actions.dragAndDrop(source, target);
		actions.dragAndDropBy(source, xOffset, yOffset);
		actions.clickAndHold().release().build().perform();

		//Action by Actions Class
		actions.click();
		actions.click(target);
		actions.clickAndHold().moveToElement(source).dragAndDrop(source, target).release().build().perform();
		actions.contextClick();
		actions.doubleClick();
		actions.dragAndDrop(source, target);
		actions.moveToElement(target).build().perform();

	}
}
