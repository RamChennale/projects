package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class InstrumentInstrumentEquityBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Instrument")
	@CacheLookup
	private WebElement Instrument;

	@FindBy(linkText = "Instrument Equity")
	@CacheLookup
	private WebElement InstrumentEquity;

	@FindBy(xpath = "//a[contains(text(),'Buyback')]")
	@CacheLookup
	private WebElement Buyback;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'CA - Bonus')]")
	@CacheLookup
	private WebElement CABonusSplit;

	@FindBy(xpath = "//a[contains(text(),'CA - Dividend')]")
	@CacheLookup
	private WebElement CADividend;
	
	@FindBy(xpath = "//a[contains(text(),'CA - Merger, DeMerger')]")
	@CacheLookup
	private WebElement CAMergerDeMerger;
	
	@FindBy(xpath = "//a[contains(text(),'Closing Prices')]")
	@CacheLookup
	private WebElement ClosingPrices;
	
	@FindBy(xpath = "//a[contains(text(),'Delisting')]")
	@CacheLookup
	private WebElement Delisting;
	
	@FindBy(xpath = "//a[contains(text(),'IPO/FPO')]")
	@CacheLookup
	private WebElement IPOFPO;
	
	@FindBy(xpath = "//a[contains(text(),'Open Offer')]")
	@CacheLookup
	private WebElement OpenOffer;
	
	@FindBy(xpath = "//a[contains(text(),'Rights Issue')]")
	@CacheLookup
	private WebElement RightsIssue;
	
	@FindBy(linkText =  "Scrip")
	@CacheLookup
	private WebElement Scrip;
	
	public InstrumentInstrumentEquityBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void buyback() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentEquity);
		actions.moveToElement(InstrumentEquity).perform();

		WebDriverWaitFunctions.waitToLoadElement(Buyback);
		actions.moveToElement(Buyback).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Buyback = breadcrumb.getText();
		Assert.assertTrue(Buyback.contains(file.getBreadcrumb("Buyback")), "Buyback name not exits in breadcrumb");
		System.out.println(Buyback);
	}

	public void caBonusSplit() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentEquity);
		actions.moveToElement(InstrumentEquity).perform();

		WebDriverWaitFunctions.waitToLoadElement(CABonusSplit);
		actions.moveToElement(CABonusSplit).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CABonusSplit = breadcrumb.getText();
		Assert.assertTrue(CABonusSplit.contains(file.getBreadcrumb("CABonusSplit")), "CABonusSplit name not exits in breadcrumb");
		System.out.println(CABonusSplit);
	}

	public void caDividend() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentEquity);
		actions.moveToElement(InstrumentEquity).perform();

		WebDriverWaitFunctions.waitToLoadElement(CADividend);
		actions.moveToElement(CADividend).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CADividend = breadcrumb.getText();
		Assert.assertTrue(CADividend.contains(file.getBreadcrumb("CADividend")), "CADividend name not exits in breadcrumb");
		System.out.println(CADividend);
	}

	public void caMergerDeMerger() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentEquity);
		actions.moveToElement(InstrumentEquity).perform();

		WebDriverWaitFunctions.waitToLoadElement(CAMergerDeMerger);
		actions.moveToElement(CAMergerDeMerger).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String  CAMergerDeMerger= breadcrumb.getText();
		Assert.assertTrue(CAMergerDeMerger.contains(file.getBreadcrumb("CAMergerDeMerger")), " CAMergerDeMerger name not exits in breadcrumb");
		System.out.println(CAMergerDeMerger);
	}

	public void closingPrices() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentEquity);
		actions.moveToElement(InstrumentEquity).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClosingPrices);
		actions.moveToElement(ClosingPrices).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ClosingPrices = breadcrumb.getText();
		Assert.assertTrue(ClosingPrices.contains(file.getBreadcrumb("ClosingPrices")), "ClosingPrices name not exits in breadcrumb");
		System.out.println(ClosingPrices);
	}

	public void delisting() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentEquity);
		actions.moveToElement(InstrumentEquity).perform();

		WebDriverWaitFunctions.waitToLoadElement(Delisting);
		actions.moveToElement(Delisting).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Delisting = breadcrumb.getText();
		Assert.assertTrue(Delisting.contains(file.getBreadcrumb("Delisting")), "Delisting name not exits in breadcrumb");
		System.out.println(Delisting);
	}

	public void IPOFPO() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentEquity);
		actions.moveToElement(InstrumentEquity).perform();

		WebDriverWaitFunctions.waitToLoadElement(IPOFPO);
		actions.moveToElement(IPOFPO).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String IPOFPO = breadcrumb.getText();
		Assert.assertTrue(IPOFPO.contains(file.getBreadcrumb("IPOFPO")), "IPOFPO name not exits in breadcrumb");
		System.out.println(IPOFPO);
	}

	public void openOffer() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentEquity);
		actions.moveToElement(InstrumentEquity).perform();

		WebDriverWaitFunctions.waitToLoadElement(OpenOffer);
		actions.moveToElement(OpenOffer).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String OpenOffer = breadcrumb.getText();
		Assert.assertTrue(OpenOffer.contains(file.getBreadcrumb("OpenOffer")), "OpenOffer name not exits in breadcrumb");
		System.out.println(OpenOffer);
	}

	public void rightsIssue() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentEquity);
		actions.moveToElement(InstrumentEquity).perform();

		WebDriverWaitFunctions.waitToLoadElement(RightsIssue);
		actions.moveToElement(RightsIssue).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RightsIssue = breadcrumb.getText();
		Assert.assertTrue(RightsIssue.contains(file.getBreadcrumb("RightsIssue")), "RightsIssue name not exits in breadcrumb");
		System.out.println(RightsIssue);
	}

	public void scrip() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentEquity);
		actions.moveToElement(InstrumentEquity).perform();

		WebDriverWaitFunctions.waitToLoadElement(Scrip);
		actions.moveToElement(Scrip).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String  Scrip= breadcrumb.getText();
		Assert.assertTrue(Scrip.contains(file.getBreadcrumb("Scrip")), "Scrip name not exits in breadcrumb");
		System.out.println(Scrip);
	}

}
