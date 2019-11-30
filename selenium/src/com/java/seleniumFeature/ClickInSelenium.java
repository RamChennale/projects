package com.java.seleniumFeature;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import bsh.commands.dir;

public class ClickInSelenium extends BaseClass{

	
	WebElement form;
	WebElement home;
	WebElement ajaxControl;
	WebElement widgets;
	WebElement select;
	WebElement formSubmit;
	
	@Test(enabled=true)
	private void numOfWayClickingWaySelenium() {
		WebElement locator=driver.findElement(By.xpath("//*[text()='Form']"));
		/*locator.click();
		locator.sendKeys(Keys.ENTER);
		locator.sendKeys(Keys.RETURN);
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("arguments[0].click()", locator);*/
		Actions actions= new Actions(driver);
		actions.click(locator).perform();//OR actions.click(locator).build().perform();
		actions.clickAndHold(locator).release().build().perform();//actions.clickAndHold(locator).release().perform();
		actions.sendKeys(locator, Keys.RETURN).build().perform();//actions.sendKeys(locator, Keys.RETURN).perform();
		//actions.moveToElement(locator).click(); Moves the mouse to the middle of the element. The element is scrolled into view a

	}
	@Test(enabled=false)
	public void submitAndClickAreDiff()throws InterruptedException {
			form=driver.findElement(By.partialLinkText("Form"));
			form.click();
			Thread.sleep(2000);
			JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
			javascriptExecutor.executeScript("window.scrollBy(0,400);", "");
			formSubmit=driver.findElement(By.xpath("//button[text()='Submit']"));
			Thread.sleep(1000);
			formSubmit.submit();
	}
	/*
	@Test
	public void numOfClickingWaySelenium() throws InterruptedException{
		form=driver.findElement(By.partialLinkText("Form"));
		form.submit();
		Thread.sleep(1000);
		home=driver.findElement(By.linkText("Home"));
		home.sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		ajaxControl=driver.findElement(By.xpath("//*[text()='AjaxCall']"));
		ajaxControl.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		widgets= driver.findElement(By.xpath("//*[text()='Widgets']"));
		JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;
		javascriptExecutor.executeScript("arguments[0].click();",widgets);
		Thread.sleep(1000); 

		//Click by Action class 
		Actions actions= new  Actions(driver);
		select= driver.findElement(By.xpath("//*[text()='Select']"));
		//actions.click(); Clicks at the current mouse location.
		Thread.sleep(1000);
		actions.click(home).perform(); //correct and valid
		Thread.sleep(1000);
		actions.moveToElement(home).click().perform();//correct and valid
		Thread.sleep(1000);
		actions.clickAndHold(home).release().perform();//correct and valid
		Thread.sleep(1000);
		actions.sendKeys(home, Keys.RETURN).perform();
		Thread.sleep(1000);
		}*/
}
