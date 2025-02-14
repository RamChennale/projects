package com.rupeelog.manualTxnAdjPages;


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

public class RunMfFifoFoliowisePage {

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
	
	@FindBy(linkText = "Run MF fifo folio wise")
	@CacheLookup 
	private WebElement RunMFfifofoliowise;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement RunMFfifofoliowiseSDate;
	
	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement RunMFfifofoliowiseEDate;
	
	@FindBy(id = "runMf")
	@CacheLookup
	private WebElement runMfFifoBtn;
	
 	public RunMfFifoFoliowisePage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void manualTxnAdjRunMFfifofoliowise() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ManualTxnAdjustments);
 		actions.moveToElement(ManualTxnAdjustments).perform();
 		
 		ElementWait.isElementVisible(RunMFfifofoliowise);
 		actions.moveToElement(RunMFfifofoliowise).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(RunMFfifofoliowiseSDate);
 		RunMFfifofoliowiseSDate.sendKeys(file.getAdminTestData("RunMFfifofoliowiseSDate"));
 		
		ElementWait.isElementVisible(RunMFfifofoliowiseEDate);
		RunMFfifofoliowiseEDate.sendKeys(file.getAdminTestData("RunMFfifofoliowiseEDate"));
 		
		ElementWait.isElementVisible(runMfFifoBtn);
		runMfFifoBtn.click();
 		
		try {
			alert=driver.switchTo().alert();
			System.out.println("Run MF fifo foliowise : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
 		}
}
