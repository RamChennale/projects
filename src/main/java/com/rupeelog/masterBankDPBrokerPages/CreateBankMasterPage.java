package com.rupeelog.masterBankDPBrokerPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateBankMasterPage {

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
	
	@FindBy(xpath  = "//a[text()='Bank Master']")
	@CacheLookup
	private WebElement BankMaster;
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#name")
	@CacheLookup
	private WebElement bankName;
	
	@FindBy(css = "#shortName")
	@CacheLookup
	private WebElement bankShortName;
	
	@FindBy(css = "#address")
	@CacheLookup
	private WebElement address;
	
	@FindBy(css = "#bseStarMode")
	@CacheLookup
	private WebElement bseStarMode;
	
	@FindBy(css = "#bseStarCode")
	@CacheLookup
	private WebElement bseStarCode;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	public CreateBankMasterPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void createBankMaster() {
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(BankDPBroker);
		actions.moveToElement(BankDPBroker).perform();
		
		ElementWait.isElementVisible(BankMaster);
		actions.moveToElement(BankMaster).click().build().perform();
		
		By overlay= By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(bankName);
		bankName.sendKeys(file.getBankDPBrokerData("bankName"));
		
		ElementWait.isElementVisible(bankShortName);
		bankShortName.sendKeys(file.getBankDPBrokerData("bankShortName"));
		
		ElementWait.isElementVisible(address);
		address.sendKeys(file.getBankDPBrokerData("address"));
		/*
		ElementWait.isElementVisible(bseStarMode);
		bseStarMode.sendKeys(file.getBankDPBrokerData("bseStarMode"));
		
		ElementWait.isElementVisible(bseStarCode);
		bseStarCode.sendKeys(file.getBankDPBrokerData("bseStarCode"));
		*/
		ElementWait.isElementVisible(save);
		save.click();
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("create Bank Master : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nae) {
			nae.printStackTrace();
		}
	}
}
