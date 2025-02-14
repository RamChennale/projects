package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class InstrumentInstrumentDebtBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Instrument")
	@CacheLookup
	private WebElement Instrument;

	@FindBy(linkText = "Instrument Debt")
	@CacheLookup
	private WebElement InstrumentDebt;

	@FindBy(xpath = "//ul//ul//ul//a[contains(text(),'Instrument')]")
	@CacheLookup
	private WebElement insDebtInstrument;
	
	@FindBy(xpath = "//a[contains(text(),'Market Values')]")
	@CacheLookup
	private WebElement MarketValues;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	public InstrumentInstrumentDebtBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void insDebtInstrument() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentDebt);
		actions.moveToElement(InstrumentDebt).perform();

		WebDriverWaitFunctions.waitToLoadElement(insDebtInstrument);
		actions.moveToElement(insDebtInstrument).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String insDebtInstrument = breadcrumb.getText();
		Assert.assertTrue(insDebtInstrument.contains(file.getBreadcrumb("insDebtInstrument")), "insDebtInstrument name not exits in breadcrumb");
		System.out.println(insDebtInstrument);
	}

	public void marketValues() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentDebt);
		actions.moveToElement(InstrumentDebt).perform();

		WebDriverWaitFunctions.waitToLoadElement(MarketValues);
		actions.moveToElement(MarketValues).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MarketValues = breadcrumb.getText();
		Assert.assertTrue(MarketValues.contains(file.getBreadcrumb("MarketValues")), "MarketValues name not exits in breadcrumb");
		System.out.println(MarketValues);
	}

}
