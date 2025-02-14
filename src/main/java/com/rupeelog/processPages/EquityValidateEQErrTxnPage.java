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

public class EquityValidateEQErrTxnPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "Process")
	@CacheLookup
	private WebElement Process;

	@FindBy(linkText = "Equity")
	@CacheLookup
	private WebElement Equity;

	@FindBy(linkText = "Equity Error Txn - Exec/Exec(POA)")
	@CacheLookup
	private WebElement EquityErrorTxnExecExecPOA;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "validate")
	@CacheLookup
	private WebElement validateBtn;

	public EquityValidateEQErrTxnPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void equityValidateEQErrTxn() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(Process);
		action.moveToElement(Process).perform();

		ElementWait.isElementVisible(Equity);
		action.moveToElement(Equity).perform();

		ElementWait.isElementVisible(EquityErrorTxnExecExecPOA);
		action.moveToElement(EquityErrorTxnExecExecPOA).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.isElementVisible(validateBtn);
		ElementWait.scrollToFindElement(driver, validateBtn);
		validateBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Validate Equity Error Txn Exec/Exec(POA)  : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
