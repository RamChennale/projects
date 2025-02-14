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

public class CommodityValidateCmdtyTxnPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "Process")
	@CacheLookup
	private WebElement Process;

	@FindBy(linkText = "Commodity")
	@CacheLookup
	private WebElement Commodity;

	@FindBy(linkText = "Commodity Txn - Not Validated")
	@CacheLookup
	private WebElement CommodityTxnNotValidated;
	
	@FindBy(id = "validate")
	@CacheLookup
	private WebElement validateBtn;

	public CommodityValidateCmdtyTxnPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void commodityValidateCmdtyTxn() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(Process);
		action.moveToElement(Process).perform();

		ElementWait.isElementVisible(Commodity);
		action.moveToElement(Commodity).perform();

		ElementWait.isElementVisible(CommodityTxnNotValidated);
		action.moveToElement(CommodityTxnNotValidated).click().build().perform();
		
		ElementWait.isElementVisible(validateBtn);
		ElementWait.scrollToFindElement(driver, validateBtn);
		validateBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Commodity Validate Commodity Txn  : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
