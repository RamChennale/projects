package com.java.selenium;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumElementDriver {

	/**
	 How to enter data in text box
	 How to click on link
	 How to check element is displayed or not
	 How to check checkbox is selected or not
	 What is method to find element on UI
	 What is method to find all elements on UI
	 How to get URL of current window
	 How to get title of page
	 */
	static WebDriver driver;
	public boolean isAvliable() {
		boolean a=true;
		return a;
	}
	
	public static void main(String [] args) {
		
		//How to enter data in text box
		driver.findElement(By.id("id")).sendKeys("TestAdmin");
		
		//How to click on link
		driver.findElement(By.className("className")).click();
		
		//How to check element is displayed or not
		try {
			driver.findElement(By.name("Ram")).isDisplayed();
			//return true;
		} catch (Exception e) {
			e.printStackTrace();
			//return false;
		}
		
		//How to check checkbox is selected or not
		driver.findElement(By.tagName("Tagname")).getAttribute("class").contains("checked");
		//OR
		try {
			driver.findElement(By.cssSelector("selector")).isSelected();
		//	return true;
		} catch (Exception e) {
			e.printStackTrace();
			//return false;
		}
		
		// What is method to find element on UI
		driver.findElement(By.id("")).sendKeys("firstsingle");
		List list = (List) driver.findElements(By.tagName("//a"));
		
		//What is method to find all elements on UI
		int numEle = driver.findElements(By.tagName("//a")).size();
		
		//How to get URL of current window
		String current_window_URL = driver.getCurrentUrl();
		
		//How to get title of page
		String tile= driver.getTitle();
	}
}
