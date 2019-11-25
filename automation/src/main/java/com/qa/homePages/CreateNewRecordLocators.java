package com.qa.homePages;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.qa.base.TestBase;

public class CreateNewRecordLocators extends TestBase {

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

	public CreateNewRecordLocators(WebDriver driver) {
		TestBase.driver = driver;
	}

	public void createRecord() {
		logger.info("Creating a new record.");
		actions=new Actions(driver);
		actions.click(home).build().perform();
		createNewRecord.sendKeys(Keys.ENTER);
		firstName.sendKeys(properties.getProperty("firstname"));
		lastName.sendKeys(properties.getProperty("lastname"));
		enrollmentDate.sendKeys("01/01/2020");
		createSubmitButton.submit();
		logger.info("created a new student record.");
	}

}