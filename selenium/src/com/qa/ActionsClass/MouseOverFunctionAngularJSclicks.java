package com.qa.ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverFunctionAngularJSclicks {

	//Admin > Client > Family - click
	@Test(priority = 2)
	public void addFamily() throws InterruptedException {
	
		WebDriver driver= new ChromeDriver();
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		WebElement admin = driver.findElement(By.xpath("//*[text()='Admin']"));
		action.moveToElement(admin).perform();
		Thread.sleep(2000);
		WebElement client = driver.findElement(By.xpath("//*[text()='Client-On-Boarding']"));
		action.moveToElement(client).perform();
		Thread.sleep(2000);
		WebElement family = driver.findElement(By.xpath("//*[text()='Family']"));
		Thread.sleep(2000);
		action.moveToElement(family).click().build().perform();
	}


	
	@Test
	public void secondWay() {
		WebDriver driver= new ChromeDriver();
		 Actions actions = new Actions(driver);
	        //Retrieve WebElement 'Music' to perform mouse hover 
	    	WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Music')]"));
	    	//Mouse hover menuOption 'Music'
	    	actions.moveToElement(menuOption).perform();
	    	System.out.println("Done Mouse hover on 'Music' from Menu");
	    	
	    	//Now Select 'Rock' from sub menu which has got displayed on mouse hover of 'Music'
	    	WebElement subMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Rock')]")); 
	    	//Mouse hover menuOption 'Rock'
	    	actions.moveToElement(subMenuOption).perform();
	    	System.out.println("Done Mouse hover on 'Rock' from Menu");
	    	
	    	//Now , finally, it displays the desired menu list from which required option needs to be selected
	    	//Now Select 'Alternative' from sub menu which has got displayed on mouse hover of 'Rock'
	    	WebElement selectMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
	    	selectMenuOption.click();
	    	System.out.println("Selected 'Alternative' from Menu");
	}
	
	@Test
	public void thirdWay() {
		WebDriver driver= new ChromeDriver();
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("html/body/div[13]/ul/li[4]/a"));
		action.moveToElement(we).moveToElement(driver.findElement(By.xpath("/expression-here"))).click().build().perform();

	}
}
