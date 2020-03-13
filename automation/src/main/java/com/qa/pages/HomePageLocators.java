package com.qa.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.interfaces.HomePageI;

public class HomePageLocators extends TestBase implements HomePageI {

	private Logger logger = Logger.getLogger(HomePageLocators.class);
	private Actions actions;

	@FindBy(linkText = "Home")
	private WebElement home;

	@FindBy(xpath = "//a[contains(text(),'Create New')]")
	private WebElement createNewRecord;
	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='LastName']")
	private WebElement lastName;
	@FindBy(css = "#EnrollmentDate")
	private WebElement enrollmentDate;
	@FindBy(xpath = "//input[@class='btn btn-default']")
	private WebElement createSubmitButton;

	@FindBy(xpath = "//input[@id='Search_Data']")
	private WebElement recordToSearch;
	@FindBy(xpath = "//input[contains(@class,'btn')]")
	private WebElement seachRecord;

	@FindBy(xpath = "//.[text()='EDIT']")
	private WebElement editRecord;
	@FindBy(xpath = "")
	private WebElement detailRecord;
	@FindBy(xpath = "")
	private WebElement deleteRecord;

	public HomePageLocators(WebDriver driver) {
		TestBase.driver = driver;
		logger.info("locators loaded successfully.");
	}

	public void createRecord() {
		home.click();
		createNewRecord.sendKeys(Keys.ENTER);
		firstName.sendKeys(properties.getProperty("firstname"));
		lastName.sendKeys(properties.getProperty("lastname"));
		enrollmentDate.sendKeys("01/01/2020");
		createSubmitButton.submit();
		logger.info("created a new student record.");
	}

	public void searchRecord() {
		recordToSearch.sendKeys(properties.getProperty("username"));
		seachRecord.sendKeys(Keys.RETURN);
	}

	public void editRecord() {
		editRecord.sendKeys(Keys.ENTER);
	}

	public void detailRecord() {
		actions = new Actions(driver);
		actions.click(detailRecord).build().perform();
	}

	public void deleteRecord() {
		actions.release().click(deleteRecord).build().perform();
	}

}
