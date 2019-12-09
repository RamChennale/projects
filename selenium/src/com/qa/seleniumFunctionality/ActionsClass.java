package com.qa.seleniumFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class ActionsClass extends TestBase{

	
	@Test
	public void actionTest() {
		Actions actions= new Actions(driver);
		WebElement webElement= driver.findElement(By.id("123"));
		WebElement source= driver.findElement(By.id(""));
		WebElement target= driver.findElement(By.id(""));
		
		//click using actions
		webElement.click();
		actions.click(webElement).build().perform();
		actions.moveToElement(webElement).build().perform();
		actions.clickAndHold(webElement).release().build().perform();
		actions.sendKeys(webElement, Keys.RETURN);
		actions.sendKeys(webElement, Keys.ENTER);
		//actions.click();//clicks at current mouse pointing location 
		
		//Double click
		actions.doubleClick(webElement).build().perform();
		
		//Drag and Drop
		actions.dragAndDrop(source, target).build().perform();
		
		//Right click using Actions class
		actions.contextClick(webElement).build().perform();
		
	}
}
