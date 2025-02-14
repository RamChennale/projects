package com.rupeelog.mutualFundPages;

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

public class CreateRTAtxnTypeMappingPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert	alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Mutual Fund")
	@CacheLookup
	private WebElement MutualFund;
	
	@FindBy(linkText  = "RTA Txn Type Mapping")
	@CacheLookup
	private WebElement RTATxnTypeMapping;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#rtaCode")
	@CacheLookup
	private WebElement rtaNameDD;
	
	@FindBy(css = "#rtaTxnType")
	@CacheLookup
	private WebElement rtaTxnType;
	
	@FindBy(css = "#rxTxnType")
	@CacheLookup
	private WebElement rxTxnTypeDD;
	
	@FindBy(css = "#displayDetails")
	@CacheLookup
	private WebElement displayDetails;
	
	@FindBy(css = "#isReversal")
	@CacheLookup
	private WebElement isReversalDD;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	public  CreateRTAtxnTypeMappingPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void CreateRTAtxnTypeMappingPageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(MutualFund);
		actions.moveToElement(MutualFund).perform();
		
		ElementWait.isElementVisible(RTATxnTypeMapping);
		actions.moveToElement(RTATxnTypeMapping).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(rtaNameDD);
		Select selectrtaNameDD = new Select(rtaNameDD);
		selectrtaNameDD.selectByVisibleText(file.getMasterTestData("rtaNameDD"));
		
		ElementWait.isElementVisible(rtaTxnType);
		rtaTxnType.sendKeys(file.getMasterTestData("rtaTxnType"));
		
		ElementWait.isElementVisible(rxTxnTypeDD);
		Select selectrxTxnTypeDD = new Select(rxTxnTypeDD);
		selectrxTxnTypeDD.selectByVisibleText(file.getMasterTestData("rxTxnTypeDD"));
		
		ElementWait.isElementVisible(displayDetails);
		displayDetails.sendKeys(file.getMasterData("displayDetails"));
		
		ElementWait.isElementVisible(isReversalDD);
		Select selectisReversalDD = new Select(isReversalDD);
		selectisReversalDD.selectByVisibleText(file.getMasterTestData("isReversalDD"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("RTA txn type mapping creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
