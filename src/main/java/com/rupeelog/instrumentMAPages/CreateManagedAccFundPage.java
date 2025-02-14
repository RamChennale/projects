package com.rupeelog.instrumentMAPages;


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

public class CreateManagedAccFundPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Instrument")
	@CacheLookup
	private WebElement Instrument;
	
	@FindBy(linkText = "Instrument Managed Account")
	@CacheLookup
	private WebElement InstrumentManagedAccount;
	
	@FindBy(linkText = "Managed Account Fund")
	@CacheLookup 
	private WebElement ManagedAccountFund;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "name")
	@CacheLookup
	private WebElement mafName;
	
	@FindBy(id = "code")
	@CacheLookup
	private WebElement mafCode;
	
	@FindBy(id = "orgnId")
	@CacheLookup
	private WebElement mafOrg;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;
	
 	public CreateManagedAccFundPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createManagedAccFund() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Instrument);
 		actions.moveToElement(Instrument).perform();
 	
 		ElementWait.isElementVisible(InstrumentManagedAccount);
 		actions.moveToElement(InstrumentManagedAccount).perform();
 		
 		ElementWait.isElementVisible(ManagedAccountFund);
 		actions.moveToElement(ManagedAccountFund).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.scrollToFindElement(driver, createBtn);
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.isElementVisible(mafName);
 		mafName.sendKeys(file.getInstrumentTestData("mafName"));
 		
 		ElementWait.isElementVisible(mafCode);
 		mafCode.sendKeys(file.getInstrumentTestData("mafCode"));
 		
		ElementWait.isElementVisible(mafOrg);
 		Select selectmafOrg= new Select(mafOrg);
 		selectmafOrg.selectByVisibleText(file.getInstrumentTestData("mafOrg"));
 		
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
