package com.rupeelog.instrumentEquityPages;

import java.util.List;

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

public class CreateMergerDemAmalgPage {

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
	
	@FindBy(linkText = "CA - Merger, DeMerger")
	@CacheLookup 
	private WebElement CAMergerDeMerger;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "type")
	@CacheLookup
	private WebElement mdaChooseCorpActDD;
	
	@FindBy(id = "transactionDate")
	@CacheLookup
	private WebElement mdaTransactionDate;
	
	@FindBy(id = "historicLots")
	@CacheLookup
	private WebElement mdaHistoricLotsDD;
	
	//Source loactors
	
	@FindBy(id = "details")
	@CacheLookup
	private WebElement mdaDetailsDD;
	
	@FindBy(id = "assetSubId")
	@CacheLookup
	private WebElement mdaAssetSubClsDD;
	
	@FindBy(id = "instrumentIdStr")
	@CacheLookup
	private WebElement mdaInstrumentAutoSugg;
	
	@FindBy(id = "dmaRatio")
	@CacheLookup
	private WebElement mdaRatio;
	
	@FindBy(id = "dmaValueWeightage")
	@CacheLookup
	private WebElement mdaValueWeightage;
	
	@FindBy(id = "addBtn")
	@CacheLookup
	private WebElement addBtn;
	
	
	//Destination locators
	@FindBy(xpath = "//tbody/tr[2]/td[1]/select[1]")
	@CacheLookup
	private WebElement mdaDetailsDDdst;
	
	@FindBy(xpath = "//tbody/tr[2]/td[2]/select[1]")
	@CacheLookup
	private WebElement mdaAssetSubClsDDdst;
	
	@FindBy(xpath = "//tbody/tr[2]/td[3]/input[1]")
	@CacheLookup
	private WebElement mdaInstrumentAutoSuggdst;
	
	@FindBy(xpath = "//tbody/tr[2]/td[4]/input[1]")
	@CacheLookup
	private WebElement mdaRatiodst;
	
	@FindBy(xpath = "//tbody/tr[2]/td[5]/input[1]")
	@CacheLookup
	private WebElement mdaValueWeightagedst;
	
	@FindBy(id = "savebtn")
	@CacheLookup
	private WebElement saveBtn;

	@FindBy(xpath = "//div[@class='alert alert-error']")
	@CacheLookup
	private WebElement Result;
	
 	public CreateMergerDemAmalgPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createMergerDemAmalg() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Instrument);
 		actions.moveToElement(Instrument).perform();
 	
 		ElementWait.isElementVisible(InstrumentEquity);
 		actions.moveToElement(InstrumentEquity).perform();
 		
 		ElementWait.isElementVisible(CAMergerDeMerger);
 		actions.moveToElement(CAMergerDeMerger).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.isElementVisible(mdaChooseCorpActDD);
 		Select selectmdaChooseCorpActDD= new Select(mdaChooseCorpActDD);
 		selectmdaChooseCorpActDD.selectByVisibleText(file.getInstrumentTestData("mdaChooseCorpActDD"));
 		
 		ElementWait.isElementVisible(mdaTransactionDate);
 		mdaTransactionDate.sendKeys(file.getInstrumentTestData("mdaTransactionDate"));
 		
 		ElementWait.isElementVisible(mdaHistoricLotsDD);
 		Select selectmdaHistoricLotsDD= new Select(mdaHistoricLotsDD);
 		selectmdaHistoricLotsDD.selectByVisibleText(file.getInstrumentTestData("mdaHistoricLotsDD"));
 		
 		//Source 
 		
		ElementWait.isElementVisible(mdaDetailsDD);
 		Select selectmdaDetailsDD= new Select(mdaDetailsDD);
 		selectmdaDetailsDD.selectByVisibleText(file.getInstrumentTestData("mdaDetailsDDsrc"));
 		
		ElementWait.isElementVisible(mdaAssetSubClsDD);
 		Select selectmdaAssetSubClsDD= new Select(mdaAssetSubClsDD);
 		selectmdaAssetSubClsDD.selectByVisibleText(file.getInstrumentTestData("mdaAssetSubClsDD"));
 		
 		ElementWait.isElementVisible(mdaInstrumentAutoSugg);
 		mdaInstrumentAutoSugg.sendKeys(file.getInstrumentTestData("mdaInstrumentAutoSugg"));
 		
 		List<WebElement> instrList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//*[@id='ui-id-2']//li")));
 		
 		for(int i=0; i<instrList.size(); i++) {
 			if(instrList.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectmdaInstrumentAutoSugg")));
 			System.out.println(instrList.get(i).getText());
 			instrList.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(mdaRatio);
 		mdaRatio.sendKeys(file.getInstrumentTestData("mdaRatio"));
 		
 		ElementWait.isElementVisible(mdaValueWeightage);
 		mdaValueWeightage.sendKeys(file.getInstrumentTestData("mdaValueWeightage"));
 		
 		//Destination 
 		ElementWait.isElementVisible(addBtn);
 		addBtn.click();
 		
 				ElementWait.isElementVisible(mdaDetailsDDdst);
 		 		Select selectmdaDetailsDDdst= new Select(mdaDetailsDDdst);
 		 		selectmdaDetailsDDdst.selectByVisibleText(file.getInstrumentTestData("mdaDetailsDDdst"));
 		 		
 				ElementWait.isElementVisible(mdaAssetSubClsDDdst);
 		 		Select selectmdaAssetSubClsDDdst= new Select(mdaAssetSubClsDDdst);
 		 		selectmdaAssetSubClsDDdst.selectByVisibleText(file.getInstrumentTestData("mdaAssetSubClsDD"));
 		 		
 		 		ElementWait.isElementVisible(mdaInstrumentAutoSuggdst);
 		 		mdaInstrumentAutoSuggdst.sendKeys(file.getInstrumentTestData("mdaInstrumentAutoSugg"));
 		 		
 		 		List<WebElement> instrListdst=driver.findElements(By.xpath("//*[@id='ui-id-6']//li"));
 		 		
 		 		for(int i=0; i<instrListdst.size(); i++) {
 		 			if(instrListdst.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectmdaInstrumentAutoSugg")));
 		 			System.out.println(instrListdst.get(i).getText());
 		 			instrListdst.get(i).click();
 		 			break;
 		 		}
 		 		
 		 		ElementWait.isElementVisible(mdaRatiodst);
 		 		mdaRatiodst.sendKeys(file.getInstrumentTestData("mdaRatio"));
 		 		
 		 		ElementWait.isElementVisible(mdaValueWeightagedst);
 		 		mdaValueWeightagedst.sendKeys(file.getInstrumentTestData("mdaValueWeightage"));
 		
 		ElementWait.isElementVisible(saveBtn);
 		saveBtn.click();

 		try {
 			alert=driver.switchTo().alert();
 			System.out.println(alert.getText());
 			alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 		
 		ElementWait.isElementVisible(Result);
 		String res=Result.getText();
 		System.out.println(res);
 	}
}
