package com.qa.pages;

//@CacheLookup: it will create and store element in cache memeory instead hitting app all the time if more than one time element is required 
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.qa.utility.DataProviderUtility;
import  com.qa.base.TestBase;
public class CreateNewRecordLocators extends TestBase {

	private Logger logger = Logger.getLogger(HomePageLocators.class);
	private Actions actions;

	@FindBy(linkText = "Home")
	@CacheLookup
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
		PageFactory.initElements(driver, this);
		//TestBase.driver = driver;
	}

	public void createRecord() {
		logger.info("Creating a new record.");
		actions = new Actions(driver);
		actions.click(home).build().perform();
		createNewRecord.sendKeys(Keys.ENTER);
		firstName.sendKeys(properties.getProperty("firstname"));
		lastName.sendKeys(properties.getProperty("lastname"));
		enrollmentDate.sendKeys("01/01/2020");
		createSubmitButton.submit();
		logger.info("created a new student record.");
	}

	public void createRecordByTDD(String fname, String lastname, String date) {
		logger.info("Creating a new record.");
		actions = new Actions(driver);
		actions.click(home).build().perform();
		createNewRecord.sendKeys(Keys.ENTER);
		firstName.sendKeys(fname);
		lastName.sendKeys(lastname);
		enrollmentDate.sendKeys(date);
		createSubmitButton.submit();
		logger.info("created a new student record.");
	}

}