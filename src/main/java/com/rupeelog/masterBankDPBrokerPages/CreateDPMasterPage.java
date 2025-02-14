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

public class CreateDPMasterPage {

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
	
	@FindBy(xpath  = "//a[text()='DP Master']")
	@CacheLookup
	private WebElement DPMaster;
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#name")
	@CacheLookup
	private WebElement dpName;
	
	@FindBy(css = "#dpId")
	@CacheLookup
	private WebElement dpID;
	
	@FindBy(css = "#type")
	@CacheLookup
	private WebElement dpTypeDD;
	
	@FindBy(css = "#address")
	@CacheLookup
	private WebElement dpAddress;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	public CreateDPMasterPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void createDPMaster() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(BankDPBroker);
		actions.moveToElement(BankDPBroker).perform();
		
		ElementWait.isElementVisible(DPMaster);
		actions.moveToElement(DPMaster).click().build().perform();
		
		By overlay= By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(dpName);
		dpName.sendKeys(file.getBankDPBrokerData("dpName"));
		
		ElementWait.isElementVisible(dpID);
		dpID.sendKeys(file.getBankDPBrokerData("dpID"));
		
		
		ElementWait.isElementVisible(dpTypeDD);
		Select selectdpTypeDD= new Select(dpTypeDD);
		selectdpTypeDD.selectByVisibleText(file.getBankDPBrokerData("dpTypeDD"));
		
		ElementWait.isElementVisible(dpAddress);
		dpAddress.sendKeys(file.getBankDPBrokerData("dpAddress"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("create DP Master : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nae) {
			nae.printStackTrace();
		}
	}
}
