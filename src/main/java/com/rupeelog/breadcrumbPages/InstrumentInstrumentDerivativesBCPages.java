package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class InstrumentInstrumentDerivativesBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Instrument")
	@CacheLookup
	private WebElement Instrument;

	@FindBy(linkText = "Instrument Derivatives")
	@CacheLookup
	private WebElement InstrumentDerivatives;

	@FindBy(xpath = "//a[contains(text(),'.Span Margin')]")
	@CacheLookup
	private WebElement SpanMargin;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'.Span Margin View')]")
	@CacheLookup
	private WebElement SpanMarginView;
	
	@FindBy(xpath = "//a[contains(text(),'Future Price')]")
	@CacheLookup
	private WebElement FuturePrice;
	
	@FindBy(xpath = "//a[contains(text(),'Options Price')]")
	@CacheLookup
	private WebElement OptionsPrice;

	@FindBy(xpath = "//a[contains(text(),'Options Scrip')]")
	@CacheLookup
	private WebElement OptionsScrip;

	public InstrumentInstrumentDerivativesBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void spanMargin() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentDerivatives);
		actions.moveToElement(InstrumentDerivatives).perform();

		WebDriverWaitFunctions.waitToLoadElement(SpanMargin);
		actions.moveToElement(SpanMargin).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String  SpanMargin= breadcrumb.getText();
		Assert.assertTrue(SpanMargin.contains(file.getBreadcrumb("SpanMargin")), "SpanMargin name not exits in breadcrumb");
		System.out.println(SpanMargin);
	}


	public void spanMarginView() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentDerivatives);
		actions.moveToElement(InstrumentDerivatives).perform();

		WebDriverWaitFunctions.waitToLoadElement(SpanMarginView);
		actions.moveToElement(SpanMarginView).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String SpanMarginView = breadcrumb.getText();
		Assert.assertTrue(SpanMarginView.contains(file.getBreadcrumb("SpanMarginView")), "SpanMarginView name not exits in breadcrumb");
		System.out.println(SpanMarginView);
	}
	
	public void futurePrice() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentDerivatives);
		actions.moveToElement(InstrumentDerivatives).perform();

		WebDriverWaitFunctions.waitToLoadElement(FuturePrice);
		actions.moveToElement(FuturePrice).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FuturePrice = breadcrumb.getText();
		Assert.assertTrue(FuturePrice.contains(file.getBreadcrumb("FuturePrice")), "FuturePrice name not exits in breadcrumb");
		System.out.println(FuturePrice);
	}
	
	public void OptionsPrice() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentDerivatives);
		actions.moveToElement(InstrumentDerivatives).perform();

		WebDriverWaitFunctions.waitToLoadElement(OptionsPrice);
		actions.moveToElement(OptionsPrice).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String OptionsPrice = breadcrumb.getText();
		Assert.assertTrue(OptionsPrice.contains(file.getBreadcrumb("OptionsPrice")), "OptionsPrice name not exits in breadcrumb");
		System.out.println(OptionsPrice);
	}
	
	public void optionsScript() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();

		WebDriverWaitFunctions.waitToLoadElement(InstrumentDerivatives);
		actions.moveToElement(InstrumentDerivatives).perform();

		WebDriverWaitFunctions.waitToLoadElement(OptionsScrip);
		actions.moveToElement(OptionsScrip).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String OptionsScrip = breadcrumb.getText();
		Assert.assertTrue(OptionsScrip.contains(file.getBreadcrumb("OptionsScrip")), "Options Scrip name not exits in breadcrumb");
		System.out.println(OptionsScrip);
	}
}
