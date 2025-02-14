package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessCurrencyBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;
	
	@FindBy(linkText = "Currency")
	@CacheLookup
	private WebElement Currency;
	
	@FindBy(xpath = "//a[contains(text(),'Currency Txn - Not Validated')]")
	@CacheLookup
	private WebElement CurrencyTxnNotValidated;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	
	
	public ProcessCurrencyBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void  currencyTxnNotValidated() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Currency);
		actions.moveToElement(Currency).perform();

		WebDriverWaitFunctions.waitToLoadElement(CurrencyTxnNotValidated);
		actions.moveToElement(CurrencyTxnNotValidated).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CurrencyTxnNotValidated = breadcrumb.getText();
		Assert.assertTrue(CurrencyTxnNotValidated.contains(file.getBreadcrumb("CurrencyTxnNotValidated")), "CurrencyTxnNotValidated  not exits in breadcrumb");
		System.out.println(CurrencyTxnNotValidated);
	}	
	
}
