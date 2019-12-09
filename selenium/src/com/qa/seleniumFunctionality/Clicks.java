package com.qa.seleniumFunctionality;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.qa.base.TestBase;

public class Clicks extends TestBase{

	public void clicks() {
		Actions actions= new Actions(driver);
		
		webElement.click();
		webElement.sendKeys(Keys.RETURN);
		webElement.sendKeys(Keys.ENTER);
		JavascriptExecutor javascriptExecutor= (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("arguments[0].click",webElement );
		actions.click(webElement).build().perform();
		actions.moveToElement(webElement).build().perform();
		actions.clickAndHold(webElement).release().build().perform();
		actions.sendKeys(webElement, Keys.RETURN);
		actions.sendKeys(webElement, Keys.ENTER);
	}
	
}
