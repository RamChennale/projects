package com.rupeelog.instrumentDebtPages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateDebtPriceManualEntryPage {

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
	
	@FindBy(id = "manualEntry")
	@CacheLookup
	private WebElement manualEntryRdBtn;
	
	@FindBy(id = "issur")
	@CacheLookup
	private WebElement dpissurNameDD;
	
	@FindBy(id = "isin")
	@CacheLookup
	private WebElement dpInstNameDD;
	
	@FindBy(id = "priceType")
	@CacheLookup
	private WebElement dppriceTypeDD;
	
	@FindBy(id = "price")
	@CacheLookup
	private WebElement dpPrice;
	
	@FindBy(id = "updatedDate")
	@CacheLookup
	private WebElement dpPriceDate;
	
	@FindBy(id = "saveMain")
	@CacheLookup
	private WebElement saveBtn;
	

 	public CreateDebtPriceManualEntryPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createDebtPriceManualEntry() {
		
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
 		
 		ElementWait.isElementVisible(manualEntryRdBtn);
 		if(manualEntryRdBtn.isSelected()) {
 			System.out.println("Manual Entry radio button already selected");
 		}else {
 			manualEntryRdBtn.click();
		}
 		
 		ElementWait.isElementVisible(dpissurNameDD);
 		Select selectdpissurNameDD= new Select(dpissurNameDD);
 		selectdpissurNameDD.selectByVisibleText(file.getInstrumentTestData("dpissurNameDD"));
 		
 		ElementWait.isElementVisible(dpInstNameDD);
 		Select selectdpInstNameDD= new Select(dpInstNameDD);
 		selectdpInstNameDD.selectByVisibleText(file.getInstrumentTestData("dpInstNameDD"));
 		
 		ElementWait.isElementVisible(dppriceTypeDD);
 		Select selectdppriceTypeDD= new Select(dppriceTypeDD);
 		selectdppriceTypeDD.selectByVisibleText(file.getInstrumentTestData("dppriceTypeDD"));
 		
 		ElementWait.isElementVisible(dpPrice);
 		dpPrice.sendKeys(file.getInstrumentTestData("dpPrice"));
 		
 		ElementWait.isElementVisible(dpPriceDate);
 		dpPriceDate.sendKeys(file.getInstrumentTestData("dpPriceDate"));
 		
 		ElementWait.scrollToFindElement(driver, saveBtn);
 		ElementWait.isElementVisible(saveBtn);
 		saveBtn.click();
 	}
}
