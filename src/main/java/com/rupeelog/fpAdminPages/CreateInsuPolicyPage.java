package com.rupeelog.fpAdminPages;

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

public class CreateInsuPolicyPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "FP Admin")
	@CacheLookup
	private WebElement FPAdmin;

	@FindBy(linkText = "Insurance Policy")
	@CacheLookup
	private WebElement InsurancePolicy;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "ProviderName")
	@CacheLookup
	private WebElement ipProviderNameDD;

	@FindBy(id = "PolicyName")
	@CacheLookup
	private WebElement ipPolicyName;

	@FindBy(id = "Active")
	@CacheLookup
	private WebElement ipActiveDD;

	@FindBy(id = "Type")
	@CacheLookup
	private WebElement ipTypeDD;

	@FindBy(id = "UIN")
	@CacheLookup
	private WebElement ipUIN;

	@FindBy(id = "StartDate")
	@CacheLookup
	private WebElement ipStartDate;

	@FindBy(id = "EndDate")
	@CacheLookup
	private WebElement ipEndDate;

	@FindBy(id = "ULIP")
	@CacheLookup
	private WebElement ipULIPDD;

	@FindBy(id = "Description")
	@CacheLookup
	private WebElement ipDescription;

	@FindBy(id = "Tenure")
	@CacheLookup
	private WebElement ipTenure;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn; 
	
	@FindBy(id = "view")
	@CacheLookup
	private WebElement viewBtn;
	
	@FindBy(xpath = "//td[contains(text(),'8')]")
	@CacheLookup
	private WebElement selectPolicy;
	
	@FindBy(xpath = "//input[@value='Back']")
	@CacheLookup
	private WebElement BackBtn;
	
	@FindBy(id = "edit")
	@CacheLookup
	private WebElement editBtn;
	
	@FindBy(id = "delete")
	@CacheLookup
	private WebElement DeleteBtn;

	public CreateInsuPolicyPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createInsuPolicy() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		ElementWait.isElementVisible(InsurancePolicy);
		actions.moveToElement(InsurancePolicy).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver,createBtn );
		createBtn.click();

		ElementWait.isElementVisible(ipProviderNameDD);
		Select selectipProviderNameDD= new Select(ipProviderNameDD);
		selectipProviderNameDD.selectByVisibleText(file.getDiscPMSTestData("ipProviderNameDD"));

		ElementWait.isElementVisible(ipPolicyName);
		ipPolicyName.sendKeys(file.getDiscPMSTestData("ipPolicyName"));
		
		ElementWait.isElementVisible(ipActiveDD);
		Select selectipActiveDD= new Select(ipActiveDD);
		selectipActiveDD.selectByVisibleText(file.getDiscPMSTestData("ipActiveDD"));
		
		ElementWait.isElementVisible(ipTypeDD);
		Select selectipTypeDD= new Select(ipTypeDD);
		selectipTypeDD.selectByVisibleText(file.getDiscPMSTestData("ipTypeDD"));
		
		ElementWait.isElementVisible(ipUIN);
		ipUIN.sendKeys(file.getDiscPMSTestData("ipUIN"));
		
		ElementWait.isElementVisible(ipStartDate);
		ipStartDate.sendKeys(file.getDiscPMSTestData("ipStartDate"));
		
		ElementWait.isElementVisible(ipEndDate);
		ipEndDate.sendKeys(file.getDiscPMSTestData("ipEndDate"));
		
		ElementWait.isElementVisible(ipULIPDD);
		Select selectipULIPDD= new Select(ipULIPDD);
		selectipULIPDD.selectByVisibleText(file.getDiscPMSTestData("ipULIPDD"));

		ElementWait.isElementVisible(ipDescription);
		ipDescription.sendKeys(file.getDiscPMSTestData("ipDescription"));
		
		ElementWait.isElementVisible(ipTenure);
		ipTenure.sendKeys(file.getDiscPMSTestData("ipTenure"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Insurance policy creation : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
	
	public void viewInsuPolicy() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		ElementWait.isElementVisible(InsurancePolicy);
		actions.moveToElement(InsurancePolicy).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.isElementVisible(selectPolicy);
		selectPolicy.click();
		
		ElementWait.scrollToFindElement(driver,viewBtn);
		viewBtn.click();

		ElementWait.scrollToFindElement(driver,BackBtn );
		BackBtn.click();
	}
	
	
	public void editInsuPolicy() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		ElementWait.isElementVisible(InsurancePolicy);
		actions.moveToElement(InsurancePolicy).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(selectPolicy);
		selectPolicy.click();
		
		ElementWait.scrollToFindElement(driver,editBtn);
		editBtn.click();

		ElementWait.isElementVisible(ipProviderNameDD);
		Select selectipProviderNameDD= new Select(ipProviderNameDD);
		selectipProviderNameDD.selectByVisibleText(file.getDiscPMSTestData("ipProviderNameDD"));

		ElementWait.isElementVisible(ipPolicyName);
		ipPolicyName.sendKeys(file.getDiscPMSTestData("ipPolicyName"));
		
		ElementWait.isElementVisible(ipActiveDD);
		Select selectipActiveDD= new Select(ipActiveDD);
		selectipActiveDD.selectByVisibleText(file.getDiscPMSTestData("ipActiveDD"));
		
		ElementWait.isElementVisible(ipTypeDD);
		Select selectipTypeDD= new Select(ipTypeDD);
		selectipTypeDD.selectByVisibleText(file.getDiscPMSTestData("ipTypeDD"));
		
		ElementWait.isElementVisible(ipUIN);
		ipUIN.sendKeys(file.getDiscPMSTestData("ipUIN"));
		
		ElementWait.isElementVisible(ipStartDate);
		ipStartDate.sendKeys(file.getDiscPMSTestData("ipStartDate"));
		
		ElementWait.isElementVisible(ipEndDate);
		ipEndDate.sendKeys(file.getDiscPMSTestData("ipEndDate"));
		
		ElementWait.isElementVisible(ipULIPDD);
		Select selectipULIPDD= new Select(ipULIPDD);
		selectipULIPDD.selectByVisibleText(file.getDiscPMSTestData("ipULIPDD"));

		ElementWait.isElementVisible(ipDescription);
		ipDescription.sendKeys(file.getDiscPMSTestData("ipDescription"));
		
		ElementWait.isElementVisible(ipTenure);
		ipTenure.sendKeys(file.getDiscPMSTestData("ipTenure"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Edit Insurance policy : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
		
		public void deleteInsuPolicy() {

			actions = new Actions(driver);
			file = new FileReaderUtility();

			ElementWait.isElementVisible(FPAdmin);
			actions.moveToElement(FPAdmin).perform();

			ElementWait.isElementVisible(InsurancePolicy);
			actions.moveToElement(InsurancePolicy).click().build().perform();

			ElementWait.waitForOverlayDisappearExplicitly(overlay);
			
			ElementWait.isElementVisible(selectPolicy);
			selectPolicy.click();
			
			ElementWait.scrollToFindElement(driver,DeleteBtn);
			DeleteBtn.click();

			try {
				ElementWait.waitToPopUpAlert();
				alert=driver.switchTo().alert();
				System.out.println("Delete Insurance policy : "+alert.getText());
				alert.accept();
			}catch (NoAlertPresentException nape) {
				nape.printStackTrace();
			}
			
		}
}
