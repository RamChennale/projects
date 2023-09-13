package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchRecordLocators {

	WebDriver ldriver;
	
	@FindBy(xpath = "//*[@id=\"nav-logo-sprites\"]")
	private WebElement logo;

	public SearchRecordLocators(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void searchRecord() {
		logo.click();
	}
}
