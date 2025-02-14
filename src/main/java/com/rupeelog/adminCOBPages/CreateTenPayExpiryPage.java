package com.rupeelog.adminCOBPages;

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

public class CreateTenPayExpiryPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement Admin;
	
	@FindBy(linkText = "Tenant Payment Expiry")
	@CacheLookup
	private WebElement TenantPaymentExpiry;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "Tenant")
	@CacheLookup
	private WebElement tnTenantDD;
	
	@FindBy(id = "EmployeeExpiryDate")
	@CacheLookup
	private WebElement tnEmpExpDate;
	
	@FindBy(id = "EmployeeExpiryMessage")
	@CacheLookup
	private WebElement tnEmpExpMsg;
	
	@FindBy(id = "EmployeeWarningDays")
	@CacheLookup
	private WebElement tnEmpWarnDaysDD;
	
	@FindBy(id = "EmployeeWarningMessage")
	@CacheLookup
	private WebElement tnEmpWarnMsg;
	
	@FindBy(id = "KYPHExpiryDate")
	@CacheLookup
	private WebElement tnKYPHExpDate;
	
	@FindBy(id = "KYPHExpiryMessage")
	@CacheLookup
	private WebElement tnKYPHExpMessage;
	
	@FindBy(id = "KYPHWarningDays")
	@CacheLookup
	private WebElement tnKYPHWarnDaysDD;
	
	@FindBy(id = "KYPHWarningMessage")
	@CacheLookup
	private WebElement tnKYPHWarnMsg;
	
	@FindBy(id = "Status")
	@CacheLookup
	private WebElement tnStatusDD;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;
	
 	public CreateTenPayExpiryPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void createTenPaymentExpiry() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(TenantPaymentExpiry);
 		actions.moveToElement(TenantPaymentExpiry).click().build().perform();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		ElementWait.scrollToFindElement(driver, createBtn);
 		
 		ElementWait.scrollToFindElement(driver, createBtn);
 		ElementWait.isElementVisible(createBtn);
 		createBtn.click();
 		
 		ElementWait.isElementVisible(tnTenantDD);
 		Select selecttnTenantDD= new Select(tnTenantDD);
 		selecttnTenantDD.selectByVisibleText(file.getAdminTestData("tnTenantDD"));
 		
 		ElementWait.isElementVisible(tnEmpExpDate);
 		tnEmpExpDate.sendKeys(file.getAdminTestData("tnEmpExpDate"));
 		
 		ElementWait.isElementVisible(tnEmpExpMsg);
 		tnEmpExpMsg.sendKeys(file.getAdminTestData("tnEmpExpMsg"));
 		
 		ElementWait.isElementVisible(tnEmpWarnDaysDD);
 		Select selecttnEmpWarnDaysDD= new Select(tnEmpWarnDaysDD);
 		selecttnEmpWarnDaysDD.selectByVisibleText(file.getAdminTestData("tnEmpWarnDaysDD"));
 		
 		ElementWait.isElementVisible(tnEmpWarnMsg);
 		tnEmpWarnMsg.sendKeys(file.getAdminTestData("tnEmpWarnMsg"));
 		
 		ElementWait.isElementVisible(tnKYPHExpDate);
 		tnKYPHExpDate.sendKeys(file.getAdminTestData("tnKYPHExpDate"));
 		
 		ElementWait.isElementVisible(tnKYPHExpMessage);
 		tnKYPHExpMessage.sendKeys(file.getAdminTestData("tnKYPHExpMessage"));
 		
 		ElementWait.isElementVisible(tnKYPHWarnDaysDD);
 		Select selecttnKYPHWarnDaysDD= new Select(tnKYPHWarnDaysDD);
 		selecttnKYPHWarnDaysDD.selectByVisibleText(file.getAdminTestData("tnKYPHWarnDaysDD"));
 		
 		ElementWait.isElementVisible(tnKYPHWarnMsg);
 		tnKYPHWarnMsg.sendKeys(file.getAdminTestData("tnKYPHWarnMsg"));
 		
 		ElementWait.isElementVisible(tnStatusDD);
 		Select selecttnStatusDD= new Select(tnStatusDD);
 		selecttnStatusDD.selectByVisibleText(file.getAdminTestData("tnStatusDD"));
 		
 		ElementWait.isElementVisible(saveBtn);
 		saveBtn.click();
 		
 		try{
 			alert=driver.switchTo().alert();
 			System.out.println("SRM Tenant exp creation: "+alert.getText());
 			alert.accept();
 		}catch (NoAlertPresentException nape) {
 			nape.printStackTrace();
 		}
 	}
}
