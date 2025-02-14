package com.rupeelog.reportsPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateDailySalesReportPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;
	
	@FindBy(linkText = "Reports")
	@CacheLookup
	private WebElement Reports;
	
	@FindBy(linkText = "Daily Sales Reports(DSR)")
	@CacheLookup
	private WebElement DailySalesReports;
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "clientName")
	@CacheLookup
	private WebElement dsrClientName;

	@FindBy(id = "contactDetails")
	@CacheLookup
	private WebElement dsrContactDetails;

	@FindBy(id = "typeOfContact")
	@CacheLookup
	private WebElement dsrTypeOfContactDD;

	@FindBy(id = "dateOfContact")
	@CacheLookup
	private WebElement dsrDateOfContact;

	@FindBy(id = "hourOfContact")
	@CacheLookup
	private WebElement dsrHourOfContactDD;

	@FindBy(id = "minuteOfContact")
	@CacheLookup
	private WebElement dsrMinuteOfContactDD;

	@FindBy(id = "contactPerson")
	@CacheLookup
	private WebElement dsrPersonContacted;

	@FindBy(id = "callSummary")
	@CacheLookup
	private WebElement dsrCallSummary;

	@FindBy(id = "head_btnSave")
	@CacheLookup
	private WebElement saveBtn;

	public CreateDailySalesReportPage(WebDriver driver) {
			this.driver=driver;
	}
	
	public void dailySalesReport() {
		file= new FileReaderUtility();
		action= new Actions(driver);
		
		ElementWait.isElementVisible(Reports);
		action.moveToElement(Reports).perform();
		
		ElementWait.isElementVisible(DailySalesReports);
		action.moveToElement(DailySalesReports).click().build().perform();
		
		ElementWait.isElementVisible(createBtn);
		createBtn.click();
		
		ElementWait.isElementVisible(dsrClientName);
		dsrClientName.sendKeys(file.getReportsTestData("dsrClientName"));
		
		ElementWait.isElementVisible(dsrContactDetails);
		dsrContactDetails.sendKeys(file.getReportsTestData("dsrContactDetails"));
		
		ElementWait.isElementVisible(dsrTypeOfContactDD);
		Select selectdsrTypeOfContactDD= new Select(dsrTypeOfContactDD);
		selectdsrTypeOfContactDD.selectByVisibleText(file.getReportsTestData("dsrTypeOfContactDD"));
		
		ElementWait.isElementVisible(dsrDateOfContact);
		dsrDateOfContact.sendKeys(file.getReportsTestData("dsrDateOfContact"));
		
		ElementWait.isElementVisible(dsrHourOfContactDD);
		Select selectdsrHourOfContactDD= new Select(dsrHourOfContactDD);
		selectdsrHourOfContactDD.selectByVisibleText(file.getReportsTestData("dsrHourOfContactDD"));
		
		ElementWait.isElementVisible(dsrMinuteOfContactDD);
		Select selectdsrMinuteOfContactDD= new Select(dsrMinuteOfContactDD);
		selectdsrMinuteOfContactDD.selectByVisibleText(file.getReportsTestData("dsrMinuteOfContactDD"));
		
		ElementWait.isElementVisible(dsrPersonContacted);
		dsrPersonContacted.sendKeys(file.getReportsTestData("dsrPersonContacted"));
		
		ElementWait.isElementVisible(dsrCallSummary);
		dsrCallSummary.sendKeys(file.getReportsTestData("dsrCallSummary"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
	}
	
}
