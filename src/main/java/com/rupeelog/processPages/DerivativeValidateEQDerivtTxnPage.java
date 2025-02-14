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

public class DerivativeValidateEQDerivtTxnPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "Process")
	@CacheLookup
	private WebElement Process;

	@FindBy(linkText = "Derivative")
	@CacheLookup
	private WebElement Derivative;

	@FindBy(linkText = "Derivative Error Txn - Exec/Exec(POA)")
	@CacheLookup
	private WebElement DerivativeErrorTxnExecExecPOA;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "validate")
	@CacheLookup
	private WebElement validateBtn;

	public DerivativeValidateEQDerivtTxnPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void DerivativeValidateEQDerivtTxn() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(Process);
		action.moveToElement(Process).perform();

		ElementWait.isElementVisible(Derivative);
		action.moveToElement(Derivative).perform();

		ElementWait.isElementVisible(DerivativeErrorTxnExecExecPOA);
		action.moveToElement(DerivativeErrorTxnExecExecPOA).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.isElementVisible(validateBtn);
		ElementWait.scrollToFindElement(driver, validateBtn);
		validateBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Validate Derivative Error Txn Exec/Exec(POA)  : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
