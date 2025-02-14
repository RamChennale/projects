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

public class BrokerFetchBroLedBalPage {

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

	@FindBy(linkText = "Fetch Broker Ledger Balance")
	@CacheLookup
	private WebElement FetchBrokerLedgerBalance;
	
	@FindBy(id = "upload")
	@CacheLookup
	private WebElement uploadBrokerBalBtn;
	
	public BrokerFetchBroLedBalPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void brokerFetchBrokerLedgerBal() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(Process);
		action.moveToElement(Process).perform();

		ElementWait.isElementVisible(Broker);
		action.moveToElement(Broker).perform();

		ElementWait.isElementVisible(FetchBrokerLedgerBalance);
		action.moveToElement(FetchBrokerLedgerBalance).click().build().perform();
		
		ElementWait.isElementVisible(uploadBrokerBalBtn);
		uploadBrokerBalBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println(" Broker Fetch Broker Ledger Bal : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
