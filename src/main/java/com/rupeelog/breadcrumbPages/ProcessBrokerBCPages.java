package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessBrokerBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;

	
	@FindBy(linkText = "Broker")
	@CacheLookup
	private WebElement Broker;
	
	@FindBy(xpath = "//a[contains(text(),'Broker Ledger Txn-Not Validated')]")
	@CacheLookup
	private WebElement BrokerLedgerTxnNotValidated;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Fetch Broker Ledger Balance')]")
	@CacheLookup
	private WebElement FetchBrokerLedgerBalance;
	
	@FindBy(xpath = "//a[contains(text(),'Fetch Broker Ledger Txns')]")
	@CacheLookup
	private WebElement FetchBrokerLedgerTxns;
	
	@FindBy(xpath = "//a[contains(text(),'Fetch Broker Stock Balance')]")
	@CacheLookup
	private WebElement FetchBrokerStockBalance;
	
	
	public ProcessBrokerBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void brokerLedgerTxnNotValidated() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Broker);
		actions.moveToElement(Broker).perform();

		WebDriverWaitFunctions.waitToLoadElement(BrokerLedgerTxnNotValidated);
		actions.moveToElement(BrokerLedgerTxnNotValidated).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BrokerLedgerTxnNotValidated = breadcrumb.getText();
		Assert.assertTrue(BrokerLedgerTxnNotValidated.contains(file.getBreadcrumb("BrokerLedgerTxnNotValidated")), " BrokerLedgerTxnNotValidated not exits in breadcrumb");
		System.out.println(BrokerLedgerTxnNotValidated);
	}	
	
	public void fetchBrokerLedgerBalance() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Broker);
		actions.moveToElement(Broker).perform();

		WebDriverWaitFunctions.waitToLoadElement(FetchBrokerLedgerBalance);
		actions.moveToElement(FetchBrokerLedgerBalance).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FetchBrokerLedgerBalance = breadcrumb.getText();
		Assert.assertTrue(FetchBrokerLedgerBalance.contains(file.getBreadcrumb("FetchBrokerLedgerBalance")), "FetchBrokerLedgerBalance  not exits in breadcrumb");
		System.out.println(FetchBrokerLedgerBalance);
	}	
	
	
	public void fetchBrokerLedgerTxns() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Broker);
		actions.moveToElement(Broker).perform();

		WebDriverWaitFunctions.waitToLoadElement(FetchBrokerLedgerTxns);
		actions.moveToElement(FetchBrokerLedgerTxns).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FetchBrokerLedgerTxns = breadcrumb.getText();
		Assert.assertTrue(FetchBrokerLedgerTxns.contains(file.getBreadcrumb("FetchBrokerLedgerTxns")), "FetchBrokerLedgerTxns  not exits in breadcrumb");
		System.out.println(FetchBrokerLedgerTxns);
	}	
	
	
	public void fetchBrokerStockBalance() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Broker);
		actions.moveToElement(Broker).perform();

		WebDriverWaitFunctions.waitToLoadElement(FetchBrokerStockBalance);
		actions.moveToElement(FetchBrokerStockBalance).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FetchBrokerStockBalance = breadcrumb.getText();
		Assert.assertTrue(FetchBrokerStockBalance.contains(file.getBreadcrumb("FetchBrokerStockBalance")), " FetchBrokerStockBalance not exits in breadcrumb");
		System.out.println(FetchBrokerStockBalance);
	}	
	
}
