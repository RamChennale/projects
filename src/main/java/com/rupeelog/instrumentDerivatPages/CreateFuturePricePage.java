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

public class CreateFuturePricePage {

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
	
	@FindBy(linkText = "Future Price")
	@CacheLookup 
	private WebElement FuturePrice;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "underlyingScrip")
	@CacheLookup
	private WebElement fpUnderlyingScrip;
	
	@FindBy(xpath = "//*[@value='Search']")
	@CacheLookup
	private WebElement searchBtn;
	
	@FindBy(id = "futureAssetId1")
	@CacheLookup
	private WebElement fpfutureListDD;
	
	@FindBy(id = "expiryId1")
	@CacheLookup
	private WebElement fpExpiry;
	
	@FindBy(id = "dateStamp1")
	@CacheLookup
	private WebElement fpDate;
	
	@FindBy(id = "openPrice1")
	@CacheLookup
	private WebElement fpOpenPrice;
	
	@FindBy(id = "closePrice1")
	@CacheLookup
	private WebElement fpClosePrice;
	
	@FindBy(id = "preciousPrice")
	@CacheLookup
	private WebElement fpPreviousDayClosePrice;
	
	@FindBy(id = "highAmt1")
	@CacheLookup
	private WebElement fpHighAmt;
	
	@FindBy(id = "lowAmt1")
	@CacheLookup
	private WebElement fpLowAmt;
	
	@FindBy(id = "savebtn1")
	@CacheLookup
	private WebElement saveBtn;
	
 	public CreateFuturePricePage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createFuturePrice() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Instrument);
 		actions.moveToElement(Instrument).perform();
 	
 		ElementWait.isElementVisible(InstrumentDerivatives);
 		actions.moveToElement(InstrumentDerivatives).perform();
 		
 		ElementWait.isElementVisible(FuturePrice);
 		actions.moveToElement(FuturePrice).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.isElementVisible(fpUnderlyingScrip);
 		fpUnderlyingScrip.sendKeys(file.getInstrumentTestData("fpUnderlyingScrip"));
 		
 		ElementWait.isElementVisible(searchBtn);
 		searchBtn.click();
 		
 		ElementWait.isElementVisible(fpfutureListDD);
 		Select selectfpfutureListDD= new Select(fpfutureListDD);
 		selectfpfutureListDD.selectByVisibleText(file.getInstrumentTestData("fpfutureListDD"));
 		
 		ElementWait.isElementVisible(fpExpiry);
 		Select selectfpExpiry= new Select(fpExpiry);
 		selectfpExpiry.selectByVisibleText(file.getInstrumentTestData("fpExpiry"));
 		
 		ElementWait.isElementVisible(fpOpenPrice);
 		fpOpenPrice.sendKeys(file.getInstrumentTestData("fpOpenPrice"));
 		
 		ElementWait.isElementVisible(fpClosePrice);
 		fpClosePrice.sendKeys(file.getInstrumentTestData("fpClosePrice"));
 		
 		ElementWait.isElementVisible(fpPreviousDayClosePrice);
 		fpPreviousDayClosePrice.sendKeys(file.getInstrumentTestData("fpPreviousDayClosePrice"));
 		
 		ElementWait.isElementVisible(fpHighAmt);
 		fpHighAmt.sendKeys(file.getInstrumentTestData("fpHighAmt"));
 		
 		ElementWait.isElementVisible(fpLowAmt);
 		fpLowAmt.sendKeys(file.getInstrumentTestData("fpLowAmt"));
 		
 		ElementWait.isElementVisible(saveBtn);
 		saveBtn.click();
 		
 		try {
 			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Future price creation : "+alert.getText());
			alert.dismiss();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
 	}
}
