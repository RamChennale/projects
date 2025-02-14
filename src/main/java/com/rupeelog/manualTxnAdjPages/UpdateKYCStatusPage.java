package com.rupeelog.manualTxnAdjPages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.JavascriptExecutorUtility;

public class UpdateKYCStatusPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement Admin;
	
	@FindBy(linkText = "Manual Txn Adjustments")
	@CacheLookup
	private WebElement ManualTxnAdjustments;
	
	@FindBy(linkText = "Update KYC Status")
	@CacheLookup 
	private WebElement UpdateKYCStatus;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "updateKra")
	@CacheLookup
	private WebElement verifyKYCdd;
	
	@FindBy(id = "panNumbers")
	@CacheLookup
	private WebElement panNumber;
	
	@FindBy(id = "button")
	@CacheLookup
	private WebElement verifyKYCBtn;
	
 	public UpdateKYCStatusPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void manualTxnAdjUpdateKYCStatus() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(UpdateKYCStatus);
 		actions.moveToElement(UpdateKYCStatus).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(verifyKYCdd);
 		Select select= new Select(verifyKYCdd);
 		select.selectByVisibleText(file.getAdminTestData("verifyKYCdd"));
 		
 		ElementWait.isElementVisible(panNumber);
 		panNumber.sendKeys(file.getAdminTestData("panNumber"));
 		
 		ElementWait.isElementVisible(verifyKYCBtn);
 		JavascriptExecutorUtility.clickByJavascriptExecutor(driver,verifyKYCBtn);
		
 		try {
 		alert=driver.switchTo().alert();
 		System.out.println("Update KYC status : "+alert.getText());
 		alert.accept();
 		System.out.println("Update KYC status : "+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		}
 	
}