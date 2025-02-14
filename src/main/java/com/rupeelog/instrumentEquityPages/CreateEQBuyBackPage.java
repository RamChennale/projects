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

public class CreateEQBuyBackPage {

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
	
	@FindBy(linkText = "Buyback")
	@CacheLookup 
	private WebElement Buyback;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "name")
	@CacheLookup
	private WebElement bbEQnameAutoSugg;
	
	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement bbStartDate;
	
	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement bbEndDate;

	@FindBy(id = "comments")
	@CacheLookup
	private WebElement bbComments;
	
	@FindBy(id = "researchReco")
	@CacheLookup
	private WebElement bbResearchRecoDD;
	
	@FindBy(id = "resComments")
	@CacheLookup
	private WebElement bbResComments;
	
	@FindBy(id = "head_btnSave")
	@CacheLookup
	private WebElement saveBtn;
	
 	public CreateEQBuyBackPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createEQBuyBack() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Instrument);
 		actions.moveToElement(Instrument).perform();
 	
 		ElementWait.isElementVisible(InstrumentEquity);
 		actions.moveToElement(InstrumentEquity).perform();
 		
 		ElementWait.isElementVisible(Buyback);
 		actions.moveToElement(Buyback).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.isElementVisible(bbEQnameAutoSugg);
 		bbEQnameAutoSugg.sendKeys(file.getInstrumentTestData("bbEQnameAutoSugg"));
 		
 		List<WebElement> eqList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//*[@id='ui-id-1']//li")));
 		
 		for(int i=0; i<eqList.size(); i++) {
 			if(eqList.get(i).getText().equalsIgnoreCase(file.getAdminTestData("selectbbEQnameAutoSugg")));
 			System.out.println(eqList.get(i).getText());
 			eqList.get(i).click();
 			break;
 		}
 		
 		ElementWait.isElementVisible(bbStartDate);
 		bbStartDate.sendKeys(file.getInstrumentTestData("bbStartDate"));
 		
 		ElementWait.isElementVisible(bbEndDate);
 		bbEndDate.sendKeys(file.getInstrumentTestData("bbEndDate"));
 		
 		ElementWait.isElementVisible(bbComments);
 		bbComments.sendKeys(file.getInstrumentTestData("bbComments"));
 		
		ElementWait.isElementVisible(bbResearchRecoDD);
 		Select selectbbResearchRecoDD= new Select(bbResearchRecoDD);
 		selectbbResearchRecoDD.selectByVisibleText(file.getInstrumentTestData("bbResearchRecoDD"));
 		
 		ElementWait.isElementVisible(bbResComments);
 		bbResComments.sendKeys(file.getInstrumentTestData("bbResComments"));
 		
 		ElementWait.isElementVisible(saveBtn);
 		saveBtn.click();

 	}
}
