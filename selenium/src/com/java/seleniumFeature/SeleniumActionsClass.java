package com.java.seleniumFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumActionsClass {
	
	private WebElement ttarget;

	/**
	 1. How to do mouse over
	 2. How to do drag drop
	 3. How to do double click
	 4. How Keys class works
	 * @throws InterruptedException 
	 */

	@Test
	public void actions() throws InterruptedException {
		
		WebDriver driver = new InternetExplorerDriver();

		// 1. How to do mouse over
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.partialLinkText("//a"))).build().perform();
		actions.moveToElement(driver.findElement(By.id("id"))).build().perform();
		
		
		// 2. How to do drag drop
		Actions actions1 = new Actions(driver);
		WebElement source = driver.findElement(By.id(""));
		WebElement target = driver.findElement(By.id(""));
		actions1.dragAndDrop(source, target);

		// How  to click using Actions class
		actions1.click();
		actions1.click(driver.findElement(By.id(""))).click();
		actions1.clickAndHold().click(driver.findElement(By.id(""))).build().perform();
		
		// 2. How to do drag drop
		Actions actions2 = new Actions(driver);
		actions2.clickAndHold(driver.findElement(By.partialLinkText("")))
				.moveToElement(driver.findElement(By.partialLinkText(""))).release(driver.findElement(By.partialLinkText(""))).build().perform();
		
		//3. How to do double click
		actions2.moveToElement(driver.findElement(By.id("id"))).doubleClick();
		actions.doubleClick();
		
		//4. How Keys class works
		Actions actions3= new Actions(driver); 
		actions3.moveToElement(driver.findElement(By.xpath(".//*[id='dragable']")));
		actions3.keyDown(Keys.CONTROL);
		actions3.moveToElement(driver.findElement(By.xpath(".//*[id='dragable']")));
		actions3.keyUp(Keys.CONTROL);
		actions3.build().perform();
		
		
		
		
		
		
		
	}
	
}

