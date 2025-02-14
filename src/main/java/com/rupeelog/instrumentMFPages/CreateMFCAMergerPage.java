package com.rupeelog.instrumentMFPages;

import java.util.List;

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

public class CreateMFCAMergerPage {

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
	
	@FindBy(linkText = "CA - Merger")
	@CacheLookup 
	private WebElement CAMerger;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "srcSchemeStr")
	@CacheLookup
	private WebElement mfcaSrcSchemeAutoSugg;
	
	@FindBy(id = "trgtSchemeStr")
	@CacheLookup
	private WebElement mfcaTrgtSchemeAutoSugg;
	
	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement mfcaExDate;

	@FindBy(id = "srcShare")
	@CacheLookup
	private WebElement mfcaSrcNumUnit;
	
	@FindBy(id = "trgtShare")
	@CacheLookup
	private WebElement mfcatrgtNumUnit;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;
	
 	public CreateMFCAMergerPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createMFCAMerger() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Instrument);
 		actions.moveToElement(Instrument).perform();
 	
 		ElementWait.isElementVisible(InstrumentMF);
 		actions.moveToElement(InstrumentMF).perform();
 		
 		ElementWait.isElementVisible(CAMerger);
 		actions.moveToElement(CAMerger).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.isElementVisible(mfcaSrcSchemeAutoSugg);
 		mfcaSrcSchemeAutoSugg.sendKeys(file.getInstrumentTestData("mfcaSrcSchemeAutoSugg"));
 		
 		List<WebElement> srcSchemList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//*[@id='ui-id-1']//li")));
 		
 		for(int i=0; i<srcSchemList.size(); i++) {
 			if(srcSchemList.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectmfcaSrcSchemeAutoSugg")));
 			System.out.println(srcSchemList.get(i).getText());
 			srcSchemList.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(mfcaTrgtSchemeAutoSugg);
 		mfcaTrgtSchemeAutoSugg.sendKeys(file.getInstrumentTestData("mfcaTrgtSchemeAutoSugg"));
 		
 		List<WebElement> tgtSchemList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//*[@id='ui-id-2']//li")));
 		
 		for(int i=0; i<tgtSchemList.size(); i++) {
 			if(tgtSchemList.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectmfcaTrgtSchemeAutoSugg")));
 			System.out.println(tgtSchemList.get(i).getText());
 			tgtSchemList.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(mfcaExDate);
 		mfcaExDate.sendKeys(file.getInstrumentTestData("mfcaExDate"));
 		
 		ElementWait.isElementVisible(mfcaSrcNumUnit);
 		mfcaSrcNumUnit.sendKeys(file.getInstrumentTestData("mfcaSrcNumUnit"));
 		
 		ElementWait.isElementVisible(mfcatrgtNumUnit);
 		mfcatrgtNumUnit.sendKeys(file.getInstrumentTestData("mfcatrgtNumUnit"));
 		
 		ElementWait.isElementVisible(saveBtn);
 		saveBtn.click();
 		
 		try {
 			alert=driver.switchTo().alert();
 			System.out.println(alert.getText());
 			alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}

 	}
}
