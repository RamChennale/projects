package com.rupeelog.masterBankDPBrokerPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateBrokerBankPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert	alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Bank, DP, Broker")
	@CacheLookup
	private WebElement BankDPBroker;
	
	@FindBy(xpath  = "//a[contains(text(),'Broker Bank')]")
	@CacheLookup
	private WebElement BrokerBank;
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#custodianAccount")
	@CacheLookup
	private WebElement custodianAccountDD;
	
	@FindBy(css = "#isDefaultBrokerBank")
	@CacheLookup
	private WebElement isDefaultBrokerBankDD;
	
	@FindBy(css = "#accountNo")
	@CacheLookup
	private WebElement accountNo;
	
	@FindBy(css = "#HolderName")
	@CacheLookup
	private WebElement HolderName;
	
	@FindBy(css = "#bankId")
	@CacheLookup
	private WebElement bankNameDD;
	
	@FindBy(css = "#branchName")
	@CacheLookup
	private WebElement bankBranchNameAutoSuggSearch;
	
	@FindBy(css = "#accountType")
	@CacheLookup
	private WebElement accountTypeDD;
	
	@FindBy(css = "#isPoolAccount")
	@CacheLookup
	private WebElement isPoolAccountDD;
	
	@FindBy(css = "#status")
	@CacheLookup
	private WebElement statusDD;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	public CreateBrokerBankPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void createBrokerBank() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(BankDPBroker);
		actions.moveToElement(BankDPBroker).perform();
		
		ElementWait.isElementVisible(BrokerBank);
		actions.moveToElement(BrokerBank).click().build().perform();
		
		By overlay= By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(custodianAccountDD);
		Select selectcustodianAccountDD= new Select(custodianAccountDD);
		selectcustodianAccountDD.selectByVisibleText(file.getBankDPBrokerData("custodianAccountDD"));
		
		ElementWait.isElementVisible(isDefaultBrokerBankDD);
		Select selectisDefaultBrokerBankDD= new Select(isDefaultBrokerBankDD);
		selectisDefaultBrokerBankDD.selectByVisibleText(file.getBankDPBrokerData("isDefaultBrokerBankDD"));
		
		ElementWait.isElementVisible(accountNo);
		accountNo.sendKeys(file.getBankDPBrokerData("accountNo"));
		
		ElementWait.isElementVisible(HolderName);
		HolderName.sendKeys(file.getBankDPBrokerData("HolderName"));
		
		ElementWait.isElementVisible(bankNameDD);
		Select selectbankNameDD= new Select(bankNameDD);
		selectbankNameDD.selectByVisibleText(file.getBankDPBrokerData("bankNameDD"));
		
		ElementWait.isElementVisible(bankBranchNameAutoSuggSearch);
		bankBranchNameAutoSuggSearch.sendKeys(file.getBankDPBrokerData("bankBranchNameAutoSuggSearch"));
		bankBranchNameAutoSuggSearch.sendKeys(Keys.SPACE);
		
		List<WebElement> bankBranchNameList= driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
		
		for(int i=0; i<bankBranchNameList.size();i++) {
			if(bankBranchNameList.get(i).getText().equalsIgnoreCase(file.getBankDPBrokerData("SelectBankBranchName"))) {
				bankBranchNameList.get(i).click();                   
				break;
			}
		}
		
		ElementWait.isElementVisible(accountTypeDD);
		Select selectaccountTypeDD= new Select(accountTypeDD);
		selectaccountTypeDD.selectByVisibleText(file.getBankDPBrokerData("accountTypeDD"));
		
		ElementWait.isElementVisible(isPoolAccountDD);
		Select selectisPoolAccountDD= new Select(isPoolAccountDD);
		selectisPoolAccountDD.selectByVisibleText(file.getBankDPBrokerData("isPoolAccountDD"));
		
		ElementWait.isElementVisible(statusDD);
		Select selectstatusDD= new Select(statusDD);
		selectstatusDD.selectByVisibleText(file.getBankDPBrokerData("statusDD"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("create Broker Bank : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nae) {
			nae.printStackTrace();
		}
	}
}
