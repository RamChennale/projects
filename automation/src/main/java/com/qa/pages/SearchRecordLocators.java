package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.TestBase;

public class SearchRecordLocators extends TestBase {

	@FindBy(xpath = "//*[@id=\"nav-logo-sprites\"]")
	private WebElement logo;

	public SearchRecordLocators(WebDriver driver) {
		TestBase.driver = driver;
	}

	public void searchRecord() {
		logo.click();
	}
}
