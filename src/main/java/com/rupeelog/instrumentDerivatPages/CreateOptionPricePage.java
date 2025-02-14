package com.rupeelog.instrumentDerivatPages;

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

public class CreateOptionPricePage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Instrument")
	@CacheLookup
	private WebElement Instrument;
	
	@FindBy(linkText = "Instrument Derivatives")
	@CacheLookup
	private WebElement InstrumentDerivatives;
	
	@FindBy(linkText = "Options Price")
	@CacheLookup 
	private WebElement OptionsPrice;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "optionType1")
	@CacheLookup
	private WebElement opOptionTypeDD;
	
	@FindBy(id = "underlyingScrip")
	@CacheLookup
	private WebElement opUnderlyingScripSearch;
	
	@FindBy(xpath = "//*[@id='optionModelCreate']/div[2]/div[2]/div[2]/input[2]")
	@CacheLookup
	private WebElement GoBtn;

	@FindBy(id = "optionAssetId1")
	@CacheLookup
	private WebElement opOptionListDD;
	
	@FindBy(id = "expiryId1")
	@CacheLookup
	private WebElement opStrikePriceDD;
	
	@FindBy(id = "expiryDate1")
	@CacheLookup
	private WebElement opPriceDate;
	
	@FindBy(id = "openPrice1")
	@CacheLookup
	private WebElement opOpenPrice;
	
	@FindBy(id = "closePrice1")
	@CacheLookup
	private WebElement opClosePrice;
	
	@FindBy(id = "highAmt1")
	@CacheLookup
	private WebElement opHighAmt;
	
	@FindBy(id = "lowAmt1")
	@CacheLookup
	private WebElement opLowAmt;
	
	@FindBy(id = "savebtn1")
	@CacheLookup
	private WebElement saveBtn;
	
 	public CreateOptionPricePage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createOptionPrice() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Instrument);
 		actions.moveToElement(Instrument).perform();
 	
 		ElementWait.isElementVisible(InstrumentDerivatives);
 		actions.moveToElement(InstrumentDerivatives).perform();
 		
 		ElementWait.isElementVisible(OptionsPrice);
 		actions.moveToElement(OptionsPrice).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
		ElementWait.isElementVisible(opOptionTypeDD);
 		Select selectopOptionTypeDD= new Select(opOptionTypeDD);
 		selectopOptionTypeDD.selectByVisibleText(file.getInstrumentTestData("opOptionTypeDD"));
 		
 		ElementWait.isElementVisible(opUnderlyingScripSearch);
 		opUnderlyingScripSearch.sendKeys(file.getInstrumentTestData("opUnderlyingScripSearch"));
 		
 		ElementWait.isElementVisible(GoBtn);
 		GoBtn.click();
 		
 		ElementWait.isElementVisible(opOptionListDD);
 		Select selectopOptionListDD= new Select(opOptionListDD);
 		selectopOptionListDD.selectByVisibleText(file.getInstrumentTestData("opOptionListDD"));
 		
 		ElementWait.isElementVisible(opStrikePriceDD);
 		Select selectopStrikePriceDD= new Select(opStrikePriceDD);
 		selectopStrikePriceDD.selectByVisibleText(file.getInstrumentTestData("opStrikePriceDD"));
 		
 		ElementWait.isElementVisible(opPriceDate);
 		opPriceDate.sendKeys(file.getInstrumentTestData("opPriceDate"));
 		
 		ElementWait.isElementVisible(opOpenPrice);
 		opOpenPrice.sendKeys(file.getInstrumentTestData("opOpenPrice"));
 		
 		ElementWait.isElementVisible(opClosePrice);
 		opClosePrice.sendKeys(file.getInstrumentTestData("opClosePrice"));
 		
 		ElementWait.isElementVisible(opHighAmt);
 		opHighAmt.sendKeys(file.getInstrumentTestData("opHighAmt"));
 		
 		ElementWait.isElementVisible(opLowAmt);
 		opLowAmt.sendKeys(file.getInstrumentTestData("opLowAmt"));
 		
 		ElementWait.isElementVisible(saveBtn);
 		saveBtn.click();

 		try {
 			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Option price creation : "+alert.getText());
			alert.dismiss();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
 	}
}
