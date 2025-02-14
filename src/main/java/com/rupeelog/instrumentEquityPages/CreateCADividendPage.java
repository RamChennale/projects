package com.rupeelog.instrumentEquityPages;

import java.util.List;

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

public class CreateCADividendPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Instrument")
	@CacheLookup
	private WebElement Instrument;
	
	@FindBy(linkText = "Instrument Equity")
	@CacheLookup
	private WebElement InstrumentEquity;
	
	@FindBy(linkText = "CA - Dividend")
	@CacheLookup 
	private WebElement CADividend;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "assetSubClass")
	@CacheLookup
	private WebElement cadAssetSubClass;
	
	@FindBy(id = "assetIdStr1")
	@CacheLookup
	private WebElement cadScrip;
	
	@FindBy(id = "exDate")
	@CacheLookup
	private WebElement cadExDate;

	@FindBy(id = "dividendValue")
	@CacheLookup
	private WebElement cadDividendRsPerShare;
	
	@FindBy(id = "corpusActionSeq")
	@CacheLookup
	private WebElement cadCorpusActionSeqDD;
	
	@FindBy(id = "savebtn")
	@CacheLookup
	private WebElement saveBtn;
	
 	public CreateCADividendPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createCADividend() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Instrument);
 		actions.moveToElement(Instrument).perform();
 	
 		ElementWait.isElementVisible(InstrumentEquity);
 		actions.moveToElement(InstrumentEquity).perform();
 		
 		ElementWait.isElementVisible(CADividend);
 		actions.moveToElement(CADividend).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.isElementVisible(cadAssetSubClass);
 		Select selectcadAssetSubClass= new Select(cadAssetSubClass);
 		selectcadAssetSubClass.selectByVisibleText(file.getInstrumentTestData("cadAssetSubClass"));
 		
 		ElementWait.isElementVisible(cadScrip);
 		cadScrip.sendKeys(file.getInstrumentTestData("cadScrip"));
 		
 		List<WebElement> eqList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//*[@id='ui-id-2']//li")));
 		
 		for(int i=0; i<eqList.size(); i++) {
 			if(eqList.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectcadScrip")));
 			System.out.println(eqList.get(i).getText());
 			eqList.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(cadExDate);
 		cadExDate.sendKeys(file.getInstrumentTestData("cadExDate"));
 		
 		ElementWait.isElementVisible(cadDividendRsPerShare);
 		cadDividendRsPerShare.sendKeys(file.getInstrumentTestData("cadDividendRsPerShare"));
 		
		ElementWait.isElementVisible(cadCorpusActionSeqDD);
 		Select selectcadCorpusActionSeqDD= new Select(cadCorpusActionSeqDD);
 		selectcadCorpusActionSeqDD.selectByVisibleText(file.getInstrumentTestData("cadCorpusActionSeqDD"));
 		
 		ElementWait.isElementVisible(saveBtn);
 		saveBtn.click();

 	}
}
