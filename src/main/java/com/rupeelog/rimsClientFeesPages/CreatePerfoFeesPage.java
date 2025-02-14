package com.rupeelog.rimsClientFeesPages;


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

public class CreatePerfoFeesPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(linkText = "Client Fees")
	@CacheLookup
	private WebElement ClientFees;

	@FindBy(linkText = "8. Performance Fees")
	@CacheLookup
	private WebElement PerformanceFees;
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "portfolioName")
	@CacheLookup
	private WebElement pfPortfolioCode;

	@FindBy(id = "effectiveDt")
	@CacheLookup
	private WebElement pfEffectiveDate;

	@FindBy(id = "method")
	@CacheLookup
	private WebElement pfMethodDD;

	@FindBy(id = "rate")
	@CacheLookup
	private WebElement pfRate;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreatePerfoFeesPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createPerformanceFees() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(ClientFees);
		action.moveToElement(ClientFees).perform();

		ElementWait.isElementVisible(PerformanceFees);
		action.moveToElement(PerformanceFees).click().build().perform();
		
		ElementWait.isElementVisible(createBtn);
		createBtn.click();

		ElementWait.isElementVisible(pfPortfolioCode);
		pfPortfolioCode.sendKeys(file.getRIMSTestDat("pfPortfolioCode"));
		
		ElementWait.isElementVisible(pfEffectiveDate);
		pfEffectiveDate.sendKeys(file.getRIMSTestDat("pfEffectiveDate"));
		
		ElementWait.isElementVisible(pfMethodDD);
		Select selectpfMethodDD= new Select(pfMethodDD);
		selectpfMethodDD.selectByVisibleText(file.getRIMSTestDat("pfMethodDD"));
		
		ElementWait.isElementVisible(pfRate);
		pfRate.sendKeys(file.getRIMSTestDat("pfRate"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Client Fee Performance fees  : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
