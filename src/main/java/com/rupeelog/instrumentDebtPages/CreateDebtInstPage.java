package com.rupeelog.instrumentDebtPages;


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

public class CreateDebtInstPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Instrument")
	@CacheLookup
	private WebElement Instrument;
	
	@FindBy(linkText = "Instrument Debt")
	@CacheLookup
	private WebElement InstrumentDebt;
	
	//*[text()='Instrument Debt']//following-sibling::li
	@FindBy(xpath = "//body/div[@id='Maincontent']/div[@id='fluid']/div[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[4]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	@CacheLookup 
	private WebElement DebtInstrumentMenu;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "IssuerId")
	@CacheLookup
	private WebElement diIssuerDD;
	
	@FindBy(id = "Name")
	@CacheLookup
	private WebElement diName;
	
	@FindBy(id = "ShortName")
	@CacheLookup
	private WebElement diShortName;
	
	@FindBy(id = "AssetSubClassId")
	@CacheLookup
	private WebElement diAssetSubClassDD;
	
	@FindBy(id = "ISIN_ind")
	@CacheLookup
	private WebElement ISIN_issuedCheckBox;
	
	@FindBy(id = "RegistrarId")
	@CacheLookup
	private WebElement diRegistrarDD;
	
	@FindBy(id = "PayingAgentId")
	@CacheLookup
	private WebElement diPayingAgentDD;

	@FindBy(id = "FaceValue")
	@CacheLookup
	private WebElement diFaceValue;
	
	@FindBy(id = "MaturityDate")
	@CacheLookup
	private WebElement diMaturityDate;
	
	@FindBy(id = "IsVerified")
	@CacheLookup
	private WebElement IsVerifiedDD;
	
	@FindBy(id = "IsManualInt")
	@CacheLookup
	private WebElement IsManualIntDD;
	
	//Interest
	
	@FindBy(xpath = "//span[contains(text(),'Interest')]")
	@CacheLookup
	private WebElement Interest;
	
	@FindBy(id = "InterestRateType")
	@CacheLookup
	private WebElement iInterestRateDD;
	
	@FindBy(id = "InterestRate")
	@CacheLookup
	private WebElement iInterestPercent;
	
	@FindBy(id = "Frequency")
	@CacheLookup
	private WebElement iPaymentIntervalDD;
	
	@FindBy(id = "InterestType")
	@CacheLookup
	private WebElement iInterestTypeDD;
	
	@FindBy(id = "CalculationMethod")
	@CacheLookup
	private WebElement iCalculationMethodDD;
	
	@FindBy(id = "DeemedDateOfAllotment")
	@CacheLookup
	private WebElement iDeemedDateOfAllotment;
	
	@FindBy(id = "IncludeIPDate")
	@CacheLookup
	private WebElement iIncludeIPDateDD;
	
	@FindBy(id = "IsTaxable")
	@CacheLookup
	private WebElement iIsTaxableDD;
	
	@FindBy(id = "FirstIPDate")
	@CacheLookup
	private WebElement iFirstIPDate;
	
	@FindBy(id = "NoDeliveryPeriod")
	@CacheLookup
	private WebElement iNoDeliveryPeriodDays;
	
	//Misc Details
	
	@FindBy(xpath = "//span[text()='Misc Details']")
	@CacheLookup
	private WebElement MiscDetails ;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;
	

 	public CreateDebtInstPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createDebtInstrument() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Instrument);
 		actions.moveToElement(Instrument).perform();
 	
 		ElementWait.isElementVisible(InstrumentDebt);
 		actions.moveToElement(InstrumentDebt).perform();
 		
 		ElementWait.isElementVisible(DebtInstrumentMenu);
 		actions.moveToElement(DebtInstrumentMenu).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 		ElementWait.scrollToFindElement(driver, createBtn);
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.isElementVisible(diIssuerDD);
 		Select selectdiIssuerDD= new Select(diIssuerDD);
 		selectdiIssuerDD.selectByVisibleText(file.getInstrumentTestData("diIssuerDD"));
 		
 		ElementWait.isElementVisible(diName);
 		diName.sendKeys(file.getInstrumentTestData("diName"));
 		
 		ElementWait.isElementVisible(diShortName);
 		diShortName.sendKeys(file.getInstrumentTestData("diShortName"));
 		
 		ElementWait.isElementVisible(diAssetSubClassDD);
 		Select selectdiAssetSubClassDD= new Select(diAssetSubClassDD);
 		selectdiAssetSubClassDD.selectByVisibleText(file.getInstrumentTestData("diAssetSubClassDD"));
 		
 		ElementWait.isElementVisible(ISIN_issuedCheckBox);
 		if(ISIN_issuedCheckBox.isSelected()) {
 			System.out.println("ISIN CheckBox is already selected");
 		}else {
 			ISIN_issuedCheckBox.click();
		}
 		
 		ElementWait.isElementVisible(diRegistrarDD);
 		Select selectdiRegistrarDD= new Select(diRegistrarDD);
 		selectdiRegistrarDD.selectByVisibleText(file.getInstrumentTestData("diRegistrarDD"));
 		
		ElementWait.isElementVisible(diPayingAgentDD);
 		Select selectdiPayingAgentDD= new Select(diPayingAgentDD);
 		selectdiPayingAgentDD.selectByVisibleText(file.getInstrumentTestData("diPayingAgentDD"));
 		
 		ElementWait.isElementVisible(diFaceValue);
 		diFaceValue.sendKeys(file.getInstrumentTestData("diFaceValue"));
 		
 		ElementWait.isElementVisible(diMaturityDate);
 		diMaturityDate.sendKeys(file.getInstrumentTestData("diMaturityDate"));
 		
 		ElementWait.scrollToFindElement(driver, IsManualIntDD);
 		
 		ElementWait.isElementVisible(IsVerifiedDD);
 		Select selectIsVerifiedDD= new Select(IsVerifiedDD);
 		selectIsVerifiedDD.selectByVisibleText(file.getInstrumentTestData("IsVerifiedDD"));
 		
 		ElementWait.isElementVisible(IsManualIntDD);
 		Select selectIsManualIntDD= new Select(IsManualIntDD);
 		selectIsManualIntDD.selectByVisibleText(file.getInstrumentTestData("IsManualIntDD"));
 		
 		//Interest
 		
 		ElementWait.scrollToFindElement(driver, Interest);
 		ElementWait.isElementVisible(Interest);
 		Interest.click();
 		
 		ElementWait.isElementVisible(iInterestRateDD);
 		Select selectiInterestRateDD= new Select(iInterestRateDD);
 		selectiInterestRateDD.selectByVisibleText(file.getInstrumentTestData("iInterestRateDD"));
 		
 		ElementWait.isElementVisible(iInterestPercent);
 		iInterestPercent.sendKeys(file.getInstrumentTestData("iInterestPercent"));
 		
 		ElementWait.isElementVisible(iPaymentIntervalDD);
 		Select selectiPaymentIntervalDD= new Select(iPaymentIntervalDD);
 		selectiPaymentIntervalDD.selectByVisibleText(file.getInstrumentTestData("iPaymentIntervalDD"));
 		
 		ElementWait.isElementVisible(iInterestTypeDD);
 		Select selectiInterestTypeDD= new Select(iInterestTypeDD);
 		selectiInterestTypeDD.selectByVisibleText(file.getInstrumentTestData("iInterestTypeDD"));
 		
 		ElementWait.isElementVisible(iCalculationMethodDD);
 		Select selectiCalculationMethodDD= new Select(iCalculationMethodDD);
 		selectiCalculationMethodDD.selectByVisibleText(file.getInstrumentTestData("iCalculationMethodDD"));
 		
		ElementWait.isElementVisible(iDeemedDateOfAllotment);
		iDeemedDateOfAllotment.sendKeys(file.getInstrumentTestData("iDeemedDateOfAllotment"));
 		
 		ElementWait.isElementVisible(iIncludeIPDateDD);
 		Select selectiIncludeIPDateDD= new Select(iIncludeIPDateDD);
 		selectiIncludeIPDateDD.selectByVisibleText(file.getInstrumentTestData("iIncludeIPDateDD"));
 		
 		ElementWait.isElementVisible(iIsTaxableDD);
 		Select selectiIsTaxableDD= new Select(iIsTaxableDD);
 		selectiIsTaxableDD.selectByVisibleText(file.getInstrumentTestData("iIsTaxableDD"));
 		
 		ElementWait.isElementVisible(iFirstIPDate);
 		iFirstIPDate.sendKeys(file.getInstrumentTestData("iFirstIPDate"));
 		
 		ElementWait.scrollToFindElement(driver, iNoDeliveryPeriodDays);
 		
 		ElementWait.isElementVisible(iNoDeliveryPeriodDays);
 		iNoDeliveryPeriodDays.sendKeys(file.getInstrumentTestData("iNoDeliveryPeriodDays"));
 		
 		
 		//Misc Details
 		ElementWait.scrollToFindElement(driver, MiscDetails);
 		ElementWait.isElementVisible(MiscDetails);
 		MiscDetails.click();
 		
 		ElementWait.scrollToFindElement(driver, saveBtn);
 		ElementWait.isElementVisible(saveBtn);
 		saveBtn.click();
 		
 		try {
 			alert=driver.switchTo().alert();
 			System.out.println("Debt Instrument Creation : "+alert.getText());
 			alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
/* 		
 		ElementWait.isElementVisible();
 		.sendKeys(file.getAdminTestData(""));
 		
 		ElementWait.isElementVisible();
 		Select select= new Select();
 		select.selectByVisibleText(file.getInstrumentTestData(""));
 		
 */
 		
 	}
}
