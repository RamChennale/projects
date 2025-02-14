package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessManagedAccounttxnBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;
	
	@FindBy(xpath = "//a[contains(text(),'Managed Account txn')]")
	@CacheLookup
	private WebElement ManagedAccounttxn;
	
	@FindBy(xpath = "//a[contains(text(),'MA Folio Change')]")
	@CacheLookup
	private WebElement MAFolioChange;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Managed Account Market Value')]")
	@CacheLookup
	private WebElement ManagedAccountMarketValue;
	
	@FindBy(linkText = "Order Matching")
	@CacheLookup
	private WebElement OrderMatching;
	
	@FindBy(linkText = "Committed Investment Upload")
	@CacheLookup
	private WebElement committedInvestmentUpload;
	
	public ProcessManagedAccounttxnBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void maFolioChange() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccounttxn);
		actions.moveToElement(ManagedAccounttxn).perform();

		WebDriverWaitFunctions.waitToLoadElement(MAFolioChange);
		actions.moveToElement(MAFolioChange).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MAFolioChange = breadcrumb.getText();
		Assert.assertTrue(MAFolioChange.contains(file.getBreadcrumb("MAFolioChange")), "MAFolioChange  not exits in breadcrumb");
		System.out.println(MAFolioChange);
	}	
	
	public void managedAccountMarketValue() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccounttxn);
		actions.moveToElement(ManagedAccounttxn).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccountMarketValue);
		actions.moveToElement(ManagedAccountMarketValue).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ManagedAccountMarketValue = breadcrumb.getText();
		Assert.assertTrue(ManagedAccountMarketValue.contains(file.getBreadcrumb("ManagedAccountMarketValue")), "ManagedAccountMarketValue  not exits in breadcrumb");
		System.out.println(ManagedAccountMarketValue);
	}
	
	public void orderMatching() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccounttxn);
		actions.moveToElement(ManagedAccounttxn).perform();

		WebDriverWaitFunctions.waitToLoadElement(OrderMatching);
		actions.moveToElement(OrderMatching).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String OrderMatching = breadcrumb.getText();
		Assert.assertTrue(OrderMatching.contains(file.getBreadcrumb("OrderMatching")), " OrderMatching not exits in breadcrumb");
		System.out.println(OrderMatching);
	}
	
	public void committedInvestmentUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccounttxn);
		actions.moveToElement(ManagedAccounttxn).perform();

		WebDriverWaitFunctions.waitToLoadElement(committedInvestmentUpload);
		actions.moveToElement(committedInvestmentUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String VCFCommittedInvestmentUpload = breadcrumb.getText();
		Assert.assertTrue(VCFCommittedInvestmentUpload.contains(file.getBreadcrumb("VCFCommittedInvestmentUpload")), "VCFCommittedInvestmentUpload  not exits in breadcrumb");
		System.out.println(VCFCommittedInvestmentUpload);
	}
}
