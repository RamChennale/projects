package com.rupeelog.instrumentMFPages;

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

public class CreateMutualFundNFOPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Instrument")
	@CacheLookup
	private WebElement Instrument;
	
	@FindBy(linkText = "Instrument MF")
	@CacheLookup
	private WebElement InstrumentMF;
	
	@FindBy(linkText = "Mutual Fund NFO")
	@CacheLookup 
	private WebElement MutualFundNFO;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "AmcId")
	@CacheLookup
	private WebElement nfoAmcDD;
	
	@FindBy(id = "NAME")
	@CacheLookup
	private WebElement nfoNAME;
	
	@FindBy(id = "AssetSubClassId")
	@CacheLookup
	private WebElement nfoAssetSubClassDD;

	@FindBy(id = "RtaCode")
	@CacheLookup
	private WebElement nfoRtaNameDD;
	
	@FindBy(id = "OpenEndedStatus")
	@CacheLookup
	private WebElement nfoMFtypeDD;
	
	@FindBy(id = "OfferPrice")
	@CacheLookup
	private WebElement nfoOfferPrice;
	
	@FindBy(id = "ClassificationId")
	@CacheLookup
	private WebElement nfoClassification;
	
	@FindBy(id = "PlanType")
	@CacheLookup
	private WebElement nfoPlanType;

	@FindBy(id = "NfoOpenDate")
	@CacheLookup
	private WebElement nfoOpenDate;
	
	@FindBy(id = "FaceValue")
	@CacheLookup
	private WebElement nfoFaceValue;
	
	@FindBy(id = "FundManagerId")
	@CacheLookup
	private WebElement nfoFundManagerNameDD;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;
	
 	public CreateMutualFundNFOPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createMutualFundNFO() {
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Instrument);
 		actions.moveToElement(Instrument).perform();
 	
 		ElementWait.isElementVisible(InstrumentMF);
 		actions.moveToElement(InstrumentMF).perform();
 		
 		ElementWait.isElementVisible(MutualFundNFO);
 		actions.moveToElement(MutualFundNFO).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.scrollToFindElement(driver, createBtn);
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.isElementVisible(nfoAmcDD);
 		Select selectnfoAmcDD= new Select(nfoAmcDD);
 		selectnfoAmcDD.selectByVisibleText(file.getInstrumentTestData("nfoAmcDD"));
 		
 		ElementWait.isElementVisible(nfoNAME);
 		nfoNAME.sendKeys(file.getInstrumentTestData("nfoNAME"));
 		
 		ElementWait.isElementVisible(nfoAssetSubClassDD);
 		Select selectnfoAssetSubClassDD= new Select(nfoAssetSubClassDD);
 		selectnfoAssetSubClassDD.selectByVisibleText(file.getInstrumentTestData("nfoAssetSubClassDD"));
 		
 		ElementWait.isElementVisible(nfoRtaNameDD);
 		Select selectnfoRtaNameDD= new Select(nfoRtaNameDD);
 		selectnfoRtaNameDD.selectByVisibleText(file.getInstrumentTestData("nfoRtaNameDD"));
 		
 		ElementWait.isElementVisible(nfoMFtypeDD);
 		Select selectnfoMFtypeDD= new Select(nfoMFtypeDD);
 		selectnfoMFtypeDD.selectByVisibleText(file.getInstrumentTestData("nfoMFtypeDD"));
 		
 		ElementWait.isElementVisible(nfoOfferPrice);
 		nfoOfferPrice.sendKeys(file.getInstrumentTestData("nfoOfferPrice"));
 		
 		ElementWait.isElementVisible(nfoClassification);
 		Select selectnfoClassification= new Select(nfoClassification);
 		selectnfoClassification.selectByVisibleText(file.getInstrumentTestData("nfoClassification"));
 		
 		ElementWait.isElementVisible(nfoPlanType);
 		Select selectnfoPlanType= new Select(nfoPlanType);
 		selectnfoPlanType.selectByVisibleText(file.getInstrumentTestData("nfoPlanType"));
 		
 		ElementWait.isElementVisible(nfoOpenDate);
 		nfoOpenDate.sendKeys(file.getInstrumentTestData("nfoOpenDate"));
 	
 		ElementWait.isElementVisible(nfoFaceValue);
 		nfoFaceValue.sendKeys(file.getInstrumentTestData("nfoFaceValue"));
 		
 		ElementWait.isElementVisible(nfoFundManagerNameDD);
 		Select selectnfoFundManagerDD= new Select(nfoFundManagerNameDD);
 		selectnfoFundManagerDD.selectByVisibleText(file.getInstrumentTestData("nfoFundManagerNameDD"));
 		
 		ElementWait.isElementVisible(saveBtn);
 		saveBtn.click();
 		
 		try {
 			alert=driver.switchTo().alert();
 			System.out.println("Addition of new NFO "+alert.getText());
 			alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 	}
}
