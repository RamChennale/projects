package com.rupeelog.reportsPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class RepExeUpdateLedPeriodBalPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;
	
	@FindBy(linkText = "Reports")
	@CacheLookup
	private WebElement Reports;
	
	@FindBy(linkText = "Large Report Execute")
	@CacheLookup
	private WebElement LargeReportExecute;

	@FindBy(id = "ldgerPortfolio")
	@CacheLookup
	private WebElement ledgerPortfolioRdoBtn;

	@FindBy(id = "ldgerclientIdStr")
	@CacheLookup
	private WebElement ledgerPortfolio;

	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement ledgerStartDate;

	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement ledgerEndDate;
	
	@FindBy(id = "updateLedgerPeriod")
	@CacheLookup
	private WebElement updateLedgerPeriodBtn;
	
	public RepExeUpdateLedPeriodBalPage(WebDriver driver) {
			this.driver=driver;
	}
	
	public void updateLedPeriodBal() {
		file= new FileReaderUtility();
		action= new Actions(driver);
		
		ElementWait.isElementVisible(Reports);
		action.moveToElement(Reports).perform();
		
		ElementWait.isElementVisible(LargeReportExecute);
		action.moveToElement(LargeReportExecute).click().build().perform();
		
		ElementWait.isElementVisible(ledgerPortfolioRdoBtn);
		if(ledgerPortfolioRdoBtn.isSelected())
			System.out.println("ledger Portfolio radio btn already selected");
		else {
			ledgerPortfolioRdoBtn.click();
		}
		
		ElementWait.isElementVisible(ledgerPortfolio);
		ledgerPortfolio.sendKeys(file.getReportsTestData("ledgerPortfolio"));
		
		List<WebElement> clientList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@id='ui-id-2']//li")));
		
		for(int i=0; i<clientList.size();i++) {
			if(clientList.get(i).getText().equalsIgnoreCase(file.getReportsTestData("portfolio")))
				clientList.get(i).click();
			System.out.println("Holding portfolio :  "+clientList.get(i).getText());
			break;
		}
		
		ElementWait.isElementVisible(ledgerStartDate);
		ledgerStartDate.sendKeys(file.getReportsTestData("ledgerStartDate"));
		
		ElementWait.isElementVisible(ledgerEndDate);
		ledgerEndDate.sendKeys(file.getReportsTestData("ledgerEndDate"));
		
		ElementWait.isElementVisible(updateLedgerPeriodBtn);
		updateLedgerPeriodBtn.click();
		
		ElementWait.waitToPopUpAlert();
		try {
		alert= driver.switchTo().alert();
		System.out.println("Update Ledger Period Balance : "+alert.getText());
		alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
	
}
