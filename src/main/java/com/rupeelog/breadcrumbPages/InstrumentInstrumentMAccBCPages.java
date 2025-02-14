package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class InstrumentInstrumentMAccBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Instrument")
	@CacheLookup
	private WebElement Instrument;

	@FindBy(xpath  = "//a[contains(text(),'Instrument Managed Account')]")
	@CacheLookup
	private WebElement InstrumentManagedAccount;

	@FindBy(xpath = "//a[contains(text(),'Managed Account Fund')]")
	@CacheLookup
	private WebElement ManagedAccountFund;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Managed Account Market value')]")
	@CacheLookup
	private WebElement ManagedAccountMarketvalue;

	@FindBy(xpath = "//a[contains(text(),'Managed Account Scheme')]")
	@CacheLookup
	private WebElement ManagedAccountScheme;
	
	public InstrumentInstrumentMAccBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void managedAccountFund() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentManagedAccount);
		actions.moveToElement(InstrumentManagedAccount).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccountFund);
		actions.moveToElement(ManagedAccountFund).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ManagedAccountFund = breadcrumb.getText();
		Assert.assertTrue(ManagedAccountFund.contains(file.getBreadcrumb("ManagedAccountFund")), "ManagedAccountFund name not exits in breadcrumb");
		System.out.println(ManagedAccountFund);
	}
	public void managedAccountMarketvalue() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentManagedAccount);
		actions.moveToElement(InstrumentManagedAccount).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccountMarketvalue);
		actions.moveToElement(ManagedAccountMarketvalue).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ManagedAccountMarketvalue = breadcrumb.getText();
		Assert.assertTrue(ManagedAccountMarketvalue.contains(file.getBreadcrumb("ManagedAccountMarketvalue")), "ManagedAccountMarketvalue name not exits in breadcrumb");
		System.out.println(ManagedAccountMarketvalue);
	}
	public void managedAccountScheme() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentManagedAccount);
		actions.moveToElement(InstrumentManagedAccount).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccountScheme);
		actions.moveToElement(ManagedAccountScheme).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ManagedAccountScheme = breadcrumb.getText();
		Assert.assertTrue(ManagedAccountScheme.contains(file.getBreadcrumb("ManagedAccountScheme")), "ManagedAccountScheme name not exits in breadcrumb");
		System.out.println(ManagedAccountScheme);
	}
}
