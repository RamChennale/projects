package com.rupeelog.processPages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CurrencyValidateCurrencyTxnPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "Process")
	@CacheLookup
	private WebElement Process;

	@FindBy(linkText = "Currency")
	@CacheLookup
	private WebElement Currency;

	@FindBy(linkText = "Currency Txn - Not Validated")
	@CacheLookup
	private WebElement CurrencyTxnNotValidated;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "validate")
	@CacheLookup
	private WebElement validateBtn;

	public CurrencyValidateCurrencyTxnPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void validateCurrencyTxn() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(Process);
		action.moveToElement(Process).perform();

		ElementWait.isElementVisible(Currency);
		action.moveToElement(Currency).perform();

		ElementWait.isElementVisible(CurrencyTxnNotValidated);
		action.moveToElement(CurrencyTxnNotValidated).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.isElementVisible(validateBtn);
		ElementWait.scrollToFindElement(driver, validateBtn);
		validateBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("currency Validate currency Txn  : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
