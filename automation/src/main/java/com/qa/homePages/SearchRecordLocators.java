package com.qa.homePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.TestBase;

public class SearchRecordLocators extends TestBase {

	@FindBy(linkText = "Home")
	private WebElement home;
	@FindBy(xpath = "//input[@id='Search_Data']")
	private WebElement recordToSearch;
	@FindBy(xpath = "//input[contains(@class,'btn')]")
	private WebElement seachRecord;

	public SearchRecordLocators(WebDriver driver) {
		TestBase.driver = driver;
	}

	public void searchRecord() {
		home.click();
		recordToSearch.clear();
		recordToSearch.sendKeys(properties.getProperty("firstname"));
		seachRecord.click();
	}
}
