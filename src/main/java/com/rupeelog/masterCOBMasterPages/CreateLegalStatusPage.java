package com.rupeelog.masterCOBMasterPages;

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

public class CreateLegalStatusPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert	alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "ClientOnBoard Master")
	@CacheLookup
	private WebElement ClientOnBoardMaster;
	
	@FindBy(xpath  = "//*[text()='Legal Status']")
	@CacheLookup
	private WebElement LegalStatus;
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#investorTypeId")
	@CacheLookup
	private WebElement investorTypeDD;
	
	@FindBy(css = "#name")
	@CacheLookup
	private WebElement legalStatusName;
	
	@FindBy(css = "#shortName")
	@CacheLookup
	private WebElement legalStatusShortName;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	public  CreateLegalStatusPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void createNewLegalStatus() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(ClientOnBoardMaster);
		actions.moveToElement(ClientOnBoardMaster).perform();
		
		ElementWait.isElementVisible(LegalStatus);
		actions.moveToElement(LegalStatus).click().build().perform();
		
		By overlay= By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(investorTypeDD);
		Select selectinvestorTypeDD= new Select(investorTypeDD);
		selectinvestorTypeDD.selectByVisibleText(file.getClientOnBoardMasterData("selectinvestorTypeDD"));
		
		ElementWait.isElementVisible(legalStatusName);
		legalStatusName.sendKeys(file.getClientOnBoardMasterData("legalStatusName"));
		
		ElementWait.isElementVisible(legalStatusShortName);
		legalStatusShortName.sendKeys(file.getClientOnBoardMasterData("legalStatusShortName"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Legal Status creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
