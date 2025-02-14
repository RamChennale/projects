package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class InstrumentInstrumentMFBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Instrument")
	@CacheLookup
	private WebElement Instrument;

	@FindBy(xpath  = "//a[contains(text(),'Instrument MF')]")
	@CacheLookup
	private WebElement InstrumentMF;

	@FindBy(linkText = "CA - Merger")
	@CacheLookup
	private WebElement CAMerger;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Mutual Fund NAVs')]")
	@CacheLookup
	private WebElement MutualFundNAVs;
	
	@FindBy(xpath = "//a[contains(text(),'Mutual Fund NFO')]")
	@CacheLookup
	private WebElement MutualFundNFO;

	@FindBy(xpath = "//a[contains(text(),'Mutual Fund Scheme')]")
	@CacheLookup
	private WebElement MutualFundScheme;
	
	public InstrumentInstrumentMFBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void caMerger() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentMF);
		actions.moveToElement(InstrumentMF).perform();

		WebDriverWaitFunctions.waitToLoadElement(CAMerger);
		actions.moveToElement(CAMerger).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CAMerger = breadcrumb.getText();
		Assert.assertTrue(CAMerger.contains(file.getBreadcrumb("CAMerger")), "CAMerger name not exits in breadcrumb");
		System.out.println(CAMerger);
	}

		
	public void mutualFundNAVs() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentMF);
		actions.moveToElement(InstrumentMF).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFundNAVs);
		actions.moveToElement(MutualFundNAVs).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MutualFundNAVs = breadcrumb.getText();
		Assert.assertTrue(MutualFundNAVs.contains(file.getBreadcrumb("MutualFundNAVs")), "MutualFundNAVs name not exits in breadcrumb");
		System.out.println(MutualFundNAVs);
	}
	
	public void mutualFundNFO() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentMF);
		actions.moveToElement(InstrumentMF).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFundNFO);
		actions.moveToElement(MutualFundNFO).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MutualFundNFO = breadcrumb.getText();
		Assert.assertTrue(MutualFundNFO.contains(file.getBreadcrumb("MutualFundNFO")), "MutualFundNFO name not exits in breadcrumb");
		System.out.println(MutualFundNFO);
	}
	
	public void mutualFundScheme() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentMF);
		actions.moveToElement(InstrumentMF).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFundScheme);
		actions.moveToElement(MutualFundScheme).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MutualFundScheme = breadcrumb.getText();
		Assert.assertTrue(MutualFundScheme.contains(file.getBreadcrumb("MutualFundScheme")), "MutualFundScheme name not exits in breadcrumb");
		System.out.println(MutualFundScheme);
	}

}
