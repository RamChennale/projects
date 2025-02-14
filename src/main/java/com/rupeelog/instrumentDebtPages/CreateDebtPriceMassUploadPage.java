package com.rupeelog.instrumentDebtPages;

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

public class CreateDebtPriceMassUploadPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Instrument")
	@CacheLookup
	private WebElement Instrument;
	
	@FindBy(linkText = "Instrument Debt")
	@CacheLookup
	private WebElement InstrumentDebt;
	
	@FindBy(linkText = "Market Values")
	@CacheLookup 
	private WebElement MarketValues;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "massUpload")
	@CacheLookup
	private WebElement massUploadRdBtn;
	
	@FindBy(id = "uploadFile")
	@CacheLookup
	private WebElement muUploadFileBrowse;
	
	@FindBy(id = "upload")
	@CacheLookup
	private WebElement uploadBtn;
	
	@FindBy(id = "proceed")
	@CacheLookup
	private WebElement processBtn;
	
 	public CreateDebtPriceMassUploadPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createDebtPriceMassUpload() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Instrument);
 		actions.moveToElement(Instrument).perform();
 	
 		ElementWait.isElementVisible(InstrumentDebt);
 		actions.moveToElement(InstrumentDebt).perform();
 		
 		ElementWait.isElementVisible(MarketValues);
 		actions.moveToElement(MarketValues).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.scrollToFindElement(driver, createBtn);
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.isElementVisible(massUploadRdBtn);
 		if(massUploadRdBtn.isSelected()) {
 			System.out.println("Mass upload radio button already selected");
 		}else {
 			massUploadRdBtn.click();
		}
 		
 		ElementWait.isElementVisible(muUploadFileBrowse);
 		muUploadFileBrowse.sendKeys(file.getInstrumentTestData("muUploadFileBrowse"));
 		
 		ElementWait.isElementVisible(uploadBtn);
 		uploadBtn.click();
 		
 		
 		try {
 		ElementWait.waitToPopUpAlert();
 		alert=driver.switchTo().alert();
 		System.out.println("Clicked on upload btn"+alert.getText());
 		alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		
 		ElementWait.isElementVisible(processBtn);
 		processBtn.click();
 		
		try {
			ElementWait.waitToPopUpAlert();
	 		alert=driver.switchTo().alert();
	 		System.out.println("Clicked on process btn"+alert.getText());
	 		alert.accept();
	 		}catch (NoAlertPresentException nape) {
	 			nape.printStackTrace();
	 		}
 	}
}
