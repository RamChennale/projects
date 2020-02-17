package com.qa.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {

	WebDriver driver;
	Actions actions;
	WebElement element;
	WebElement source;
	WebElement target;
	
	@Test
	public void test() {
		driver = new ChromeDriver();
		actions = new Actions(driver);
		element=driver.findElement(By.id("id"));
		CharSequence key = null;
		
		actions.build();
		actions.click();
		actions.click(element);
		actions.clickAndHold();
		actions.clickAndHold(element);
		actions.contextClick();
		actions.contextClick(element);
		actions.doubleClick();
		actions.doubleClick(element);
		actions.dragAndDrop(source, target);
		actions.dragAndDropBy(element, 1, 2);
		actions.keyDown(key);
		actions.keyUp(key);
		actions.moveByOffset(1, 2);
		actions.moveToElement(target);
		actions.moveToElement(target, 1, 2);
		//actions.pause(duration);
		actions.perform();
		actions=actions.release();
		actions.release(target);
		actions.sendKeys("keys");
		
		actions.click();  //Clicks at the current mouse location.
		actions.moveToElement(element).build().perform();
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
