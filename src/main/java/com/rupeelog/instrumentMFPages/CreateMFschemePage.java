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

public class CreateMFschemePage {

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
	
	@FindBy(linkText = "Mutual Fund Scheme")
	@CacheLookup 
	private WebElement MutualFundScheme;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "AmcId")
	@CacheLookup
	private WebElement mfsAmc;
	
	@FindBy(id = "Name")
	@CacheLookup
	private WebElement mfsSchemeName;
	
	@FindBy(id = "AssetSubClassId")
	@CacheLookup
	private WebElement mfsAssetSubClass;
	
	@FindBy(id = "OpenEndedStatus")
	@CacheLookup
	private WebElement mfsMFtype;
	
	@FindBy(id = "ClassificationId")
	@CacheLookup
	private WebElement mfsClassification;
	
	@FindBy(id = "PlanType")
	@CacheLookup
	private WebElement mfsPlanType;
	
	@FindBy(id = "ArnType")
	@CacheLookup
	private WebElement mfsSchemeType;
	
	@FindBy(id = "Status")
	@CacheLookup
	private WebElement mfsStatus;
	
	@FindBy(id = "CamsCode")
	@CacheLookup
	private WebElement mfsCamsCode;
	
	@FindBy(id = "HoldToMaturity")
	@CacheLookup
	private WebElement mfsHoldToMaturity;
	
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;
	
 	public CreateMFschemePage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createMutualFundScheme() {
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Instrument);
 		actions.moveToElement(Instrument).perform();
 	
 		ElementWait.isElementVisible(InstrumentMF);
 		actions.moveToElement(InstrumentMF).perform();
 		
 		ElementWait.isElementVisible(MutualFundScheme);
 		actions.moveToElement(MutualFundScheme).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.scrollToFindElement(driver, createBtn);
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.isElementVisible(mfsAmc);
 		Select selectmfsAmc= new Select(mfsAmc);
 		selectmfsAmc.selectByVisibleText(file.getInstrumentTestData("mfsAmc"));
 		
 		ElementWait.isElementVisible(mfsSchemeName);
 		mfsSchemeName.sendKeys(file.getInstrumentTestData("mfsSchemeName"));

 		ElementWait.isElementVisible(mfsAssetSubClass);
 		Select selectmfsAssetSubClass= new Select(mfsAssetSubClass);
 		selectmfsAssetSubClass.selectByVisibleText(file.getInstrumentTestData("mfsAssetSubClass"));
 		
 		ElementWait.isElementVisible(mfsMFtype);
 		Select selectmfsMFtype= new Select(mfsMFtype);
 		selectmfsMFtype.selectByVisibleText(file.getInstrumentTestData("mfsMFtype"));
 		
 		ElementWait.isElementVisible(mfsClassification);
 		Select selectmfsClassification= new Select(mfsClassification);
 		selectmfsClassification.selectByVisibleText(file.getInstrumentTestData("mfsClassification"));
 		
 		ElementWait.isElementVisible(mfsPlanType);
 		Select selectmfsPlanType= new Select(mfsPlanType);
 		selectmfsPlanType.selectByVisibleText(file.getInstrumentTestData("mfsPlanType"));
 		
 		ElementWait.isElementVisible(mfsSchemeType);
 		Select selectmfsSchemeType= new Select(mfsSchemeType);
 		selectmfsSchemeType.selectByVisibleText(file.getInstrumentTestData("mfsSchemeType"));
 		
 		ElementWait.isElementVisible(mfsStatus);
 		Select selectmfsStatus= new Select(mfsStatus);
 		selectmfsStatus.selectByVisibleText(file.getInstrumentTestData("mfsStatus"));
 		
 		ElementWait.isElementVisible(mfsCamsCode);
 		mfsCamsCode.sendKeys(file.getInstrumentTestData("mfsCamsCode"));
 		
 		ElementWait.isElementVisible(mfsHoldToMaturity);
 		Select selectmfsHoldToMaturity= new Select(mfsHoldToMaturity);
 		selectmfsHoldToMaturity.selectByVisibleText(file.getInstrumentTestData("mfsHoldToMaturity"));
 	
 		ElementWait.isElementVisible(saveBtn);
 		saveBtn.click();
 		
 		try {
 			alert=driver.switchTo().alert();
 			System.out.println("Mutual Fund scheme creation :  "+alert.getText());
 			alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 	}
}
