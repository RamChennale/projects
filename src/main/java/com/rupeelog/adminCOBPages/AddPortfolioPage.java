package com.rupeelog.adminCOBPages;

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
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.ScrollPageToFindElement;
import com.rupeelog.utilty.WaitToLoadElement;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AddPortfolioPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(xpath = "//*[text()='Admin']")
	@CacheLookup
	private WebElement adminMenu;
	
	@FindBy(xpath = "//*[text()='Client-On-Boarding']")
	@CacheLookup
	private WebElement clientSubMenu;
	
	@FindBy(xpath = "//*[text()='Portfolio']")
	@CacheLookup
	private WebElement Portfolio;

	@FindBy(xpath = "//input[@id='create']")
	@CacheLookup
	private WebElement createPortfolio;
	
	@FindBy(xpath = "//input[@id='clientName']")
	@CacheLookup
	private WebElement clieintNameAutoSuggSearch;
	
	@FindBy(xpath = "//select[@id='portfolioType']")
	@CacheLookup
	private WebElement portfolioTypeDD;
	
	@FindBy(xpath = "//select[@id='subType']")
	@CacheLookup
	private WebElement EngagementTypeDD ;
	
	@FindBy(xpath = "//select[@id='engaSubType']")
	@CacheLookup
	private WebElement EngagementSubTypeDD;
	
	@FindBy(xpath = "//select[@id='modelPortfolioScheme']")
	@CacheLookup
	private WebElement modelPortfolioSchemeDD;
	
	@FindBy(xpath = "//select[@id='AdvisorId']")
	@CacheLookup
	private WebElement advisorDD; //Disable
	
	@FindBy(xpath = "//input[@id='conversionDate']")
	@CacheLookup
	private WebElement conversionDate;
	
	@FindBy(xpath = "//input[@id='name']")
	@CacheLookup
	private WebElement name;
	
	@FindBy(xpath = "//select[@id='sebiReportingType']")
	@CacheLookup
	private WebElement sebiReportingTypeDD;
	
	@FindBy(xpath = "//select[@id='reportFrequency']")
	@CacheLookup
	private WebElement reportFrequencyDD;
	
	@FindBy(xpath = "//select[@id='defaultBank']")
	@CacheLookup
	private WebElement defaultBankDD;// no val
	
	@FindBy(xpath = "//select[@id='defaultDemat']")
	@CacheLookup
	private WebElement defaultDematDD;
	
	@FindBy(xpath = "//select[@id='pisId']")
	@CacheLookup
	private WebElement pisBankDD;//disabled
	
	@FindBy(xpath = "//select[@id='status']")
	@CacheLookup
	private WebElement statusDD;
	
	@FindBy(xpath = "//select[@id='AdvAgreement']")
	@CacheLookup
	private WebElement advAgreementDD;
	
	@FindBy(xpath = "//select[@id='currency']")
	@CacheLookup
	private WebElement currencyDD;
	
	@FindBy(xpath = "//select[@id='custodianCode']")
	@CacheLookup
	private WebElement custodianCodeDD;
	
	@FindBy(xpath = "//input[@id='startDate']")
	@CacheLookup
	private WebElement startDate;
	
	@FindBy(xpath = "//input[@id='EndDate']")
	@CacheLookup
	private WebElement EndDate;
	
	@FindBy(xpath = "//input[@id='AofBseMfdUpdatedAt']")
	@CacheLookup
	private WebElement BSE_MFDdate;
	
	@FindBy(xpath = "//input[@id='AofBseMfiUpdatedAt']")
	@CacheLookup
	private WebElement BSE_MFIdate;
	
	@FindBy(xpath = "//input[@id='Reason']")
	@CacheLookup
	private WebElement reason;
	
	@FindBy(xpath = "//select[@id='ipsReqd']")
	@CacheLookup
	private WebElement ipsReqdDD;
	
	@FindBy(xpath = "//input[@id='brokerEquityCode']")
	@CacheLookup
	private WebElement brokerEquityCode;
	
	@FindBy(xpath = "//input[@id='brokerMFCode']")
	@CacheLookup
	private WebElement brokerMFCode;
	
	@FindBy(xpath = "//input[@id='boBseStarCode']")
	@CacheLookup
	private WebElement BSE_MFDUCC;
	
	@FindBy(xpath = "//input[@id='boBseMfiCode']")
	@CacheLookup
	private WebElement BSE_MFIUCC;
	
	@FindBy(xpath = "//input[@id='brokerDebtCode']")
	@CacheLookup
	private WebElement brokerDebtCode;
	
	@FindBy(xpath = "//input[@id='brokerCommodityCode']")
	@CacheLookup
	private WebElement brokerCommodityCode;
	
	@FindBy(xpath = "//input[@id='brokerOtherCode']")
	@CacheLookup
	private WebElement brokerOtherCode;
	
	@FindBy(xpath = "//select[@id='isMigrated']")
	@CacheLookup
	private WebElement isMigratedDD;
	
	@FindBy(xpath = "//input[@id='save']")
	@CacheLookup
	private WebElement saveButton;
	
	@FindBy(xpath = "//input[@id='cancel']")
	@CacheLookup
	private WebElement cancelButton;
	
	//UPDATE Portfolio
	
	@FindBy(xpath = "//table[@id='viewTable']//tr[2]")
	@CacheLookup
	private WebElement select1stPortfolioToUpdate;
	
	@FindBy(xpath = "//input[@id='edit']")
	@CacheLookup
	private WebElement editButton;
	
	@FindBy(xpath = "//input[@id='save']")
	@CacheLookup
	private WebElement updateButton;
	
	public AddPortfolioPage(WebDriver ldriver){
		this.driver=ldriver;
				
	}
	
	public void createPortfolio() throws InterruptedException{
		file= new FileReaderUtility();
		actions = new Actions(driver);
		
		WaitToLoadElement.waitToLoadElement(adminMenu);
		actions.moveToElement(adminMenu).perform();
		
		WaitToLoadElement.waitToLoadElement(clientSubMenu);
		actions.moveToElement(clientSubMenu).perform();
		
		WaitToLoadElement.waitToLoadElement(Portfolio);
		actions.moveToElement(Portfolio).click().build().perform();
		
		Thread.sleep(15000);
		ScrollPageToFindElement.findElementByPageScrolling(driver, createPortfolio);
		createPortfolio.click();
		Thread.sleep(3000);
		
		WaitToLoadElement.waitToLoadElement(clieintNameAutoSuggSearch);
		clieintNameAutoSuggSearch.sendKeys(file.getAdminCOBTestData("clieintNameAutoSuggSearch"));
		clieintNameAutoSuggSearch.clear();
		clieintNameAutoSuggSearch.sendKeys(file.getAdminCOBTestData("clieintNameAutoSuggSearch"));
		List<WebElement> clientList= driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));
		
		for(int i=0; i<clientList.size();i++) {
			if(clientList.get(i).getText().equalsIgnoreCase(file.getAdminCOBTestData("selectClient"))) {
				clientList.get(i).click();                   
				break;
			}
		}

		WaitToLoadElement.waitToLoadElement(portfolioTypeDD);
		Select portfolioTypeDDSL= new Select(portfolioTypeDD);
		portfolioTypeDDSL.selectByVisibleText(file.getAdminCOBTestData("portfolioTypeDD"));
		
		WaitToLoadElement.waitToLoadElement(EngagementTypeDD);
		Select EngagementTypeDDSL= new Select(EngagementTypeDD);
		EngagementTypeDDSL.selectByVisibleText(file.getAdminCOBTestData("EngagementTypeDD"));
		
		WaitToLoadElement.waitToLoadElement(EngagementSubTypeDD);
		Select EngagementSubTypeDDSL= new Select(EngagementSubTypeDD);
		EngagementSubTypeDDSL.selectByVisibleText(file.getAdminCOBTestData("EngagementSubTypeDD"));
		
		WaitToLoadElement.waitToLoadElement(modelPortfolioSchemeDD);
		Select modelPortfolioSchemeDDSL= new Select(modelPortfolioSchemeDD);
		modelPortfolioSchemeDDSL.selectByVisibleText(file.getAdminCOBTestData("modelPortfolioSchemeDD"));
		
		WaitToLoadElement.waitToLoadElement(conversionDate);
		conversionDate.sendKeys(file.getAdminCOBTestData("conversionDate"));
		
		WaitToLoadElement.waitToLoadElement(name);
		name.sendKeys(file.getAdminCOBTestData("name"));
		
		WaitToLoadElement.waitToLoadElement(sebiReportingTypeDD);
		Select sebiReportingTypeDDSL= new Select(sebiReportingTypeDD);
		sebiReportingTypeDDSL.selectByVisibleText(file.getAdminCOBTestData("sebiReportingTypeDD"));	
		
		WaitToLoadElement.waitToLoadElement(reportFrequencyDD);
		Select reportFrequencyDDSL= new Select(reportFrequencyDD);
		reportFrequencyDDSL.selectByVisibleText(file.getAdminCOBTestData("reportFrequencyDD"));
		ScrollPageToFindElement.findElementByPageScrolling(driver, saveButton);
		
		WaitToLoadElement.waitToLoadElement(statusDD);
		Select statusDDSL= new Select(statusDD);
		statusDDSL.selectByVisibleText(file.getAdminCOBTestData("statusDD"));
		WaitToLoadElement.waitToLoadElement(advAgreementDD);
		
		Select advAgreementDDSL= new Select(advAgreementDD);
		advAgreementDDSL.selectByVisibleText(file.getAdminCOBTestData("advAgreementDD"));
		
		WaitToLoadElement.waitToLoadElement(currencyDD);
		Select currencyDDSL= new Select(currencyDD);
		currencyDDSL.selectByVisibleText(file.getAdminCOBTestData("currencyDD"));
		
		WaitToLoadElement.waitToLoadElement(custodianCodeDD);
		custodianCodeDD.click();
		Select custodianCodeDDSL= new Select(custodianCodeDD);
		custodianCodeDDSL.selectByVisibleText(file.getAdminCOBTestData("custodianCodeDD"));
		
		WaitToLoadElement.waitToLoadElement(startDate);
		startDate.sendKeys(file.getAdminCOBTestData("startDate"));
		WaitToLoadElement.waitToLoadElement(EndDate);
		EndDate.sendKeys(file.getAdminCOBTestData("EndDate"));
		
		WaitToLoadElement.waitToLoadElement(BSE_MFDdate);
		BSE_MFDdate.sendKeys(file.getAdminCOBTestData("BSE_MFDdate"));
		
		WaitToLoadElement.waitToLoadElement(BSE_MFIdate);
		BSE_MFIdate.sendKeys(file.getAdminCOBTestData("BSE_MFIdate"));
		
		WaitToLoadElement.waitToLoadElement(reason);
		reason.sendKeys(file.getAdminCOBTestData("reason"));
		
		WaitToLoadElement.waitToLoadElement(ipsReqdDD);
		Select ipsReqdDDSL= new Select(ipsReqdDD);
		ipsReqdDDSL.selectByVisibleText(file.getAdminCOBTestData("ipsReqdDD"));
		
		WaitToLoadElement.waitToLoadElement(brokerEquityCode);
		brokerEquityCode.sendKeys(file.getAdminCOBTestData("brokerEquityCode"));
		
		WaitToLoadElement.waitToLoadElement(brokerMFCode);
		brokerMFCode.sendKeys(file.getAdminCOBTestData("brokerMFCode"));
		
		WaitToLoadElement.waitToLoadElement(BSE_MFDUCC);
		BSE_MFDUCC.sendKeys(file.getAdminCOBTestData("BSE_MFDUCC"));
		
		WaitToLoadElement.waitToLoadElement(BSE_MFIUCC);
		BSE_MFIUCC.sendKeys(file.getAdminCOBTestData("BSE_MFIUCC"));
		
		WaitToLoadElement.waitToLoadElement(brokerDebtCode);
		brokerDebtCode.sendKeys(file.getAdminCOBTestData("brokerDebtCode"));
		
		WaitToLoadElement.waitToLoadElement(brokerCommodityCode);
		brokerCommodityCode.sendKeys(file.getAdminCOBTestData("brokerCommodityCode"));
		
		WaitToLoadElement.waitToLoadElement(brokerOtherCode);
		brokerOtherCode.sendKeys(file.getAdminCOBTestData("brokerOtherCode"));
		
		WaitToLoadElement.waitToLoadElement(isMigratedDD);
		Select isMigratedDDSL= new Select(isMigratedDD);
		isMigratedDDSL.selectByVisibleText(file.getAdminCOBTestData("isMigratedDD"));
		
		WaitToLoadElement.waitToLoadElement(saveButton);
		saveButton.click();
			try {
				WebDriverWaitFunctions.waitToPopUpAlert();
		  alert=driver.switchTo().alert(); String alertMessage= alert.getText();
		  System.out.println("Alert message: "+alertMessage);
		  alert.accept();
			}catch (NoAlertPresentException e) {
				e.printStackTrace();
			}
		 }
	
	public void updatePortfolio() {
		actions = new Actions(driver);
		WaitToLoadElement.waitToLoadElement(adminMenu);
		actions.moveToElement(adminMenu).perform();
		WaitToLoadElement.waitToLoadElement(clientSubMenu);
		actions.moveToElement(clientSubMenu).perform();
		WaitToLoadElement.waitToLoadElement(Portfolio);
		actions.moveToElement(Portfolio).click().build().perform();
		
		WaitToLoadElement.waitToLoadElement(select1stPortfolioToUpdate);
		select1stPortfolioToUpdate.click();
		WaitToLoadElement.waitToLoadElement(editButton);
		editButton.click();
		ScrollPageToFindElement.findElementByPageScrolling(driver, updateButton);
		WaitToLoadElement.waitToLoadElement(updateButton);
		updateButton.click();
		alert=driver.switchTo().alert();
		String alertMessage= alert.getText();
		System.out.println("Alert message: "+alertMessage);
		Assert.assertEquals(alertMessage, "success", "Failed to update portfolio.");
		alert.accept();
	}
}
