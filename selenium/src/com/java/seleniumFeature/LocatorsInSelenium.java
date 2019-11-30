package com.java.seleniumFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsInSelenium {

	@Test
	public void locators() {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("id"));
		driver.findElement(By.name("name")).click();
		driver.findElement(By.className("className")).click();
		driver.findElement(By.tagName("")).click();
		driver.findElement(By.cssSelector("")).click();
		driver.findElement(By.linkText("uitestpractice.com")).click();
		driver.findElement(By.partialLinkText("")).click();
		driver.findElement(By.xpath("//*[text()='uitestpractice.com']")).click();

	}
}
