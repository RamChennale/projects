package com.java.seleniumFeature;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FormSubmissionByExcelData extends BaseClass{

	WebElement fname= driver.findElement(By.xpath("//input[@id='firstname']"));
	WebElement lname=driver.findElement(By.cssSelector("#lastname"));
	List<WebElement> mstatus=driver.findElements(By.xpath("//*[text()='Martial Status:']"));
	WebElement selectHobby=driver.findElement(By.xpath("//*[text()='Hobby :']"));
	WebElement selectCountry=driver.findElement(By.id("sel1"));
	WebElement dob=driver.findElement(By.id("datepicker"));
	WebElement phonNo=driver.findElement(By.id("phonenumber"));
	WebElement userName=driver.findElement(By.id("username"));
	WebElement email=driver.findElement(By.xpath("email"));
	WebElement aboutSelf=driver.findElement(By.id("comment"));
	WebElement password=driver.findElement(By.id("pwd"));
	WebElement submit=driver.findElement(By.xpath("//*[text()='Submit']"));
	
	@Test
	public void submitForm() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fname.sendKeys("Ram");
		lname.sendKeys("Chennale");
		
		Select hobby= new Select(selectHobby);
		hobby.selectByIndex(0);
		hobby.selectByValue("read");
		hobby.selectByVisibleText("Cricket");

		Select country= new Select(selectCountry);
;	}
}
