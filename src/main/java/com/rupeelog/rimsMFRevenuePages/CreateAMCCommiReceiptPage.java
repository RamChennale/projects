package com.rupeelog.rimsMFRevenuePages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateAMCCommiReceiptPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(linkText = "MF Revenue")
	@CacheLookup
	private WebElement MFRevenue;

	@FindBy(linkText = "5. AMC Commission Receipt")
	@CacheLookup
	private WebElement AMCCommissionReceipt;
	
	@FindBy(id = "amcId")
	@CacheLookup
	private WebElement amcCmRAMCnameDD;
	
	@FindBy(id = "stateId")
	@CacheLookup
	private WebElement amcCmRstateDD;
	
	@FindBy(xpath = "type")
	@CacheLookup
	private WebElement amcCmRtypeDD;

	@FindBy(linkText = "receiptDate")
	@CacheLookup
	private WebElement amcCmRReceiptDate;
	
	@FindBy(id = "amount")
	@CacheLookup
	private WebElement amcCmRAmount;
	
	@FindBy(id = "cbsDate")
	@CacheLookup
	private WebElement amcCmRcbsDate;
	
	@FindBy(xpath = "cbsRefNo")
	@CacheLookup
	private WebElement amcCmRcbsRefNo;
	
	@FindBy(xpath = "save")
	@CacheLookup
	private WebElement saveBtn;
	
	public CreateAMCCommiReceiptPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void createAMCCommiReceipt() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(MFRevenue);
		action.moveToElement(MFRevenue).perform();

		ElementWait.isElementVisible(AMCCommissionReceipt);
		action.moveToElement(AMCCommissionReceipt).click().build().perform();
		
		ElementWait.isElementVisible(amcCmRAMCnameDD);
		Select selectamcCmRAMCnameDD= new Select(amcCmRAMCnameDD);
		selectamcCmRAMCnameDD.selectByVisibleText(file.getRIMSTestDat("amcCmRAMCnameDD"));
		
		ElementWait.isElementVisible(amcCmRstateDD);
		Select selectamcCmRstateDD= new Select(amcCmRstateDD);
		selectamcCmRstateDD.selectByVisibleText(file.getRIMSTestDat("amcCmRstateDD"));
		
		ElementWait.isElementVisible(amcCmRtypeDD);
		Select selectamcCmRtypeDD= new Select(amcCmRtypeDD);
		selectamcCmRtypeDD.selectByVisibleText(file.getRIMSTestDat("amcCmRtypeDD"));
		
		ElementWait.isElementVisible(amcCmRReceiptDate);
		amcCmRReceiptDate.sendKeys(file.getRIMSTestDat("amcCmRReceiptDate")); 
		
		ElementWait.isElementVisible(amcCmRAmount);
		amcCmRAmount.sendKeys(file.getRIMSTestDat("amcCmRAmount"));
		
		ElementWait.isElementVisible(amcCmRcbsDate);
		amcCmRcbsDate.sendKeys(file.getRIMSTestDat("amcCmRcbsDate"));
		
		ElementWait.isElementVisible(amcCmRcbsRefNo);
		amcCmRcbsRefNo.sendKeys(file.getRIMSTestDat("amcCmRcbsRefNo"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("create AMC Commi Receipt : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
