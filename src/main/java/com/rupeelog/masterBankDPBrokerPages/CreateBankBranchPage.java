package com.rupeelog.masterBankDPBrokerPages;

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

public class CreateBankBranchPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Bank, DP, Broker")
	@CacheLookup
	private WebElement BankDPBroker;
	
	@FindBy(xpath  = "//a[text()='Branch(Bank)']")
	@CacheLookup
	private WebElement BankBranch;
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#bankId")
	@CacheLookup
	private WebElement bankNameDD;
	
	@FindBy(css = "#ifscCode")
	@CacheLookup
	private WebElement ifscCode;
	
	@FindBy(css = "#micr")
	@CacheLookup
	private WebElement micr;
	
	@FindBy(css = "#name")
	@CacheLookup
	private WebElement branchName;
	
	@FindBy(css = "#shortName")
	@CacheLookup
	private WebElement branchShortName;
	
	@FindBy(css = "#cityId")
	@CacheLookup
	private WebElement cityDD;
	
	@FindBy(css = "#address")
	@CacheLookup
	private WebElement address;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	public CreateBankBranchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void createBankBranch() {
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(BankDPBroker);
		actions.moveToElement(BankDPBroker).perform();
		
		ElementWait.isElementVisible(BankBranch);
		actions.moveToElement(BankBranch).click().build().perform();
		
		By overlay= By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(bankNameDD);
		Select selectbankNameDD= new Select(bankNameDD);
		selectbankNameDD.selectByVisibleText(file.getBankDPBrokerData("bankNameDD"));
		
		ElementWait.isElementVisible(ifscCode);
		ifscCode.sendKeys(file.getBankDPBrokerData("ifscCode"));
		
		ElementWait.isElementVisible(micr);
		micr.sendKeys(file.getBankDPBrokerData("micr"));
		
		ElementWait.isElementVisible(branchName);
		branchName.sendKeys(file.getBankDPBrokerData("branchName"));
		
		ElementWait.isElementVisible(branchShortName);
		branchShortName.sendKeys(file.getBankDPBrokerData("branchShortName"));
		
		ElementWait.isElementVisible(cityDD);
		Select selectcityDD= new Select(cityDD);
		selectcityDD.selectByVisibleText(file.getBankDPBrokerData("cityDD"));
		
		ElementWait.isElementVisible(address);
		address.sendKeys(file.getBankDPBrokerData("address"));
		
		ElementWait.isElementVisible(save);
		save.click();
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("create Bank Branch : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nae) {
			nae.printStackTrace();
		}
	}
}
