package com.rupeelog.processPages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class BrokerFetchBroLedTxnPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "Process")
	@CacheLookup
	private WebElement Process;

	@FindBy(linkText = "Broker")
	@CacheLookup
	private WebElement Broker;

	@FindBy(linkText = "Fetch Broker Ledger Txns")
	@CacheLookup
	private WebElement FetchBrokerLedgerTxns;
	
	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement LedTxnstartDate;

	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement LedTxnendDate;

	@FindBy(id = "upload")
	@CacheLookup
	private WebElement pullLegerBtn;
	
	public BrokerFetchBroLedTxnPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void brokerFetchBrokerLedgerTxn() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(Process);
		action.moveToElement(Process).perform();

		ElementWait.isElementVisible(Broker);
		action.moveToElement(Broker).perform();

		ElementWait.isElementVisible(FetchBrokerLedgerTxns);
		action.moveToElement(FetchBrokerLedgerTxns).click().build().perform();
		
		ElementWait.isElementVisible(LedTxnstartDate);
		LedTxnstartDate.sendKeys(file.getProcessTestData("LedTxnstartDate"));
		
		ElementWait.isElementVisible(LedTxnendDate);
		LedTxnendDate.sendKeys(file.getProcessTestData("LedTxnendDate"));
		
		ElementWait.isElementVisible(pullLegerBtn);
		pullLegerBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println(" Broker Fetch Broker Ledger Txns : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
