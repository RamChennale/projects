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
import com.rupeelog.utilty.JavascriptExecutorUtility;

public class CreateIntegFeesCalculatePage {

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

	@FindBy(linkText = "7b. Integ.Fees-Calculate")
	@CacheLookup
	private WebElement IntegFeesCalculate;
	
	@FindBy(id = "selectFeesType")
	@CacheLookup
	private WebElement feesCalselectFeesTypeDD;

	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement feesCalstartDate;

	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement feesCalendDate;

	@FindBy(xpath = "//input[@type='radio' and @value='P']")
	@CacheLookup
	private WebElement rdoBtnSeparatePortfolio;

	@FindBy(id = "pfString")
	@CacheLookup
	private WebElement feesCalEtrPortfolioCode;

	@FindBy(id = "run")
	@CacheLookup
	private WebElement calculateFeesBtn;

	public CreateIntegFeesCalculatePage(WebDriver driver) {
		this.driver = driver;
	}

	public void createIntegFeesCalculate() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(ClientFees);
		action.moveToElement(ClientFees).perform();

		ElementWait.isElementVisible(IntegFeesCalculate);
		action.moveToElement(IntegFeesCalculate).click().build().perform();
		
		ElementWait.isElementVisible(feesCalselectFeesTypeDD);
		Select selectfeesCalselectFeesTypeDD= new Select(feesCalselectFeesTypeDD);
		selectfeesCalselectFeesTypeDD.selectByVisibleText(file.getRIMSTestDat("feesCalselectFeesTypeDD"));
		
		ElementWait.isElementVisible(feesCalstartDate);
		feesCalstartDate.sendKeys(file.getRIMSTestDat("feesCalstartDate"));

		ElementWait.isElementVisible(feesCalendDate);
		feesCalendDate.clear();
		feesCalendDate.sendKeys(file.getRIMSTestDat("feesCalendDate"));

		ElementWait.isElementVisible(rdoBtnSeparatePortfolio);
		JavascriptExecutorUtility.clickByJavascriptExecutor(driver, rdoBtnSeparatePortfolio);
		
		ElementWait.isElementVisible(feesCalEtrPortfolioCode);
		feesCalEtrPortfolioCode.clear();
		feesCalEtrPortfolioCode.sendKeys(file.getRIMSTestDat("feesCalEtrPortfolioCode"));
		
		ElementWait.isElementVisible(calculateFeesBtn);
		calculateFeesBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Fee calculation : "+alert.getText());
			alert.accept();
			
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Fee calculation : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
