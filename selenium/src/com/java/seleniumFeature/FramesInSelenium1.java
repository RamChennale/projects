package com.java.seleniumFeature;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FramesInSelenium1 extends BaseClass {
	
	@Test(enabled=false)
	public void frameExec() throws InterruptedException {
		driver.switchTo().frame(0);
		driver.switchTo().frame("");
		driver.switchTo().frame(driver.findElement(By.id("name")));
		driver.switchTo().parentFrame();//control switch back to immediate parent frame
		driver.switchTo().defaultContent();//control switch back to initial first parent frame
	}

	@Test
	public void frames() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollBy(0,500)","");
		int fsize=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Num of frames : "+fsize);
		//driver.switchTo().frame("iframe_a");
		driver.switchTo().frame(0);
		WebElement name = driver.findElement(By.id("name"));
		Thread.sleep(2000);
		name.sendKeys("Ram chennale");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("uitestpractice.com")).click();
		//driver.findElement(By.xpath("//*[text()='uitestpractice.com']")).click();
		Thread.sleep(5000);

	}
}
