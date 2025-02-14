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

public class CreateAMCPage {

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
	
	@FindBy(linkText  = "Asset Management Company")
	@CacheLookup
	private WebElement AssetManagementCompany;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#name")
	@CacheLookup
	private WebElement amcName;
	
	@FindBy(css = "#shortName")
	@CacheLookup
	private WebElement amcShortName;
	
	
	@FindBy(css = "#address1")
	@CacheLookup
	private WebElement address1;
	
	@FindBy(css = "#stateId")
	@CacheLookup
	private WebElement stateDD;
	
	@FindBy(css = "#pinCode")
	@CacheLookup
	private WebElement pinCode;
	
	@FindBy(css = "#cams")
	@CacheLookup
	private WebElement camsCode;
	
	@FindBy(css = "#GSTRegistered")
	@CacheLookup
	private WebElement gstRegisteredDD;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	public  CreateAMCPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void createAMCPageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(MutualFund);
		actions.moveToElement(MutualFund).perform();
		
		ElementWait.isElementVisible(AssetManagementCompany);
		actions.moveToElement(AssetManagementCompany).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(amcName);
		amcName.sendKeys(file.getMasterTestData("amcName"));
		
		ElementWait.isElementVisible(amcShortName);
		amcShortName.sendKeys(file.getMasterTestData("amcShortName"));
		
		ElementWait.isElementVisible(address1);
		address1.sendKeys(file.getMasterTestData("address1"));
		
		ElementWait.isElementVisible(stateDD);
		Select selectstateDD= new Select(stateDD);
		selectstateDD.selectByVisibleText(file.getMasterTestData("stateDD"));
		
		ElementWait.isElementVisible(camsCode);
		camsCode.sendKeys(file.getMasterTestData("camsCode"));
		
		ElementWait.isElementVisible(pinCode);
		pinCode.sendKeys(file.getMasterTestData("pinCode"));
		
		ElementWait.isElementVisible(gstRegisteredDD);
		gstRegisteredDD.sendKeys(file.getMasterTestData("gstRegisteredDD"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("AMC creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
