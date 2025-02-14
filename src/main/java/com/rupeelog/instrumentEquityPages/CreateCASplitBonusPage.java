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

public class CreateCASplitBonusPage {

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
	
	@FindBy(linkText = "CA - Bonus/Split")
	@CacheLookup 
	private WebElement CABonusSplit ;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "assetSubClass")
	@CacheLookup
	private WebElement sbAssetSubClassDD;
	
	@FindBy(id = "assetIdStr1")
	@CacheLookup
	private WebElement sbInstAutoSugg;
	
	@FindBy(id = "type")
	@CacheLookup
	private WebElement sbTypeDD;

	@FindBy(id = "newsDate")
	@CacheLookup
	private WebElement sbExDate;
	
	@FindBy(id = "newShare")
	@CacheLookup
	private WebElement sbNumNewBonusShare;
	
	/*
	 * @FindBy(id = "newSplitShare")
	 * 
	 * @CacheLookup private WebElement sbNewFaceVal;
	 */
	
	@FindBy(id = "oldShare")
	@CacheLookup
	private WebElement sbOldFaceVal;
	
	@FindBy(id = "oldShare2")
	@CacheLookup
	private WebElement sbSplitOldFaceVal;
	
	@FindBy(id = "priority")
	@CacheLookup
	private WebElement sbCorptActSeqDD;
	
	@FindBy(id = "savebtn")
	@CacheLookup
	private WebElement saveBtn;
	
 	public CreateCASplitBonusPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void addSplitBonus() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Instrument);
 		actions.moveToElement(Instrument).perform();
 	
 		ElementWait.isElementVisible(InstrumentEquity);
 		actions.moveToElement(InstrumentEquity).perform();
 		
 		ElementWait.isElementVisible(CABonusSplit);
 		actions.moveToElement(CABonusSplit).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.isElementVisible(sbAssetSubClassDD);
 		Select selectsbAssetSubClassDD= new Select(sbAssetSubClassDD);
 		selectsbAssetSubClassDD.selectByVisibleText(file.getInstrumentTestData("sbAssetSubClassDD"));
 		
 		ElementWait.isElementVisible(sbInstAutoSugg);
 		sbInstAutoSugg.sendKeys(file.getInstrumentTestData("sbInstAutoSugg"));
 		
 		List<WebElement> eqList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//*[@id='ui-id-2']//li")));
 		
 		for(int i=0; i<eqList.size(); i++) {
 			if(eqList.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectsbInstAutoSugg")));
 			System.out.println(eqList.get(i).getText());
 			eqList.get(i).click();
 			break;
 		}
 		
		ElementWait.isElementVisible(sbTypeDD);
 		Select selectsbTypeDD= new Select(sbTypeDD);
 		selectsbTypeDD.selectByVisibleText(file.getInstrumentTestData("sbTypeDD"));
 		
 		ElementWait.isElementVisible(sbExDate);
 		sbExDate.sendKeys(file.getInstrumentTestData("sbExDate"));
 		
 		ElementWait.isElementVisible(sbNumNewBonusShare);
 		sbNumNewBonusShare.sendKeys(file.getInstrumentTestData("sbNumNewBonusShare"));
 		//=================
		/*
		 * ElementWait.isElementVisible(sbNewFaceVal);
		 * sbNewFaceVal.sendKeys(file.getInstrumentTestData("sbNewFaceVal"));
		 */
 		
 		ElementWait.isElementVisible(sbOldFaceVal);
 		sbOldFaceVal.sendKeys(file.getInstrumentTestData("sbOldFaceVal"));
 		
 		ElementWait.isElementVisible(sbSplitOldFaceVal);
 		sbSplitOldFaceVal.sendKeys(file.getInstrumentTestData("sbSplitOldFaceVal"));
 		
		ElementWait.isElementVisible(sbCorptActSeqDD);
 		Select selectsbCorptActSeqDD= new Select(sbCorptActSeqDD);
 		selectsbCorptActSeqDD.selectByVisibleText(file.getInstrumentTestData("sbCorptActSeqDD"));
 		
 		ElementWait.isElementVisible(saveBtn);
 		saveBtn.click();

 	}
}
