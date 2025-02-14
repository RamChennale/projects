package com.rupeelog.sysMasterPages;

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

public class CreateCityPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert	alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "System Master")
	@CacheLookup
	private WebElement SystemMaster;
	
	@FindBy(linkText  = "City")
	@CacheLookup
	private WebElement city;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(id = "name")
	@CacheLookup
	private WebElement smCityName;
	
	@FindBy(id = "shortName")
	@CacheLookup
	private WebElement smCityShortName;
	
	@FindBy(id = "regionId")
	@CacheLookup
	private WebElement smCityStateDD;
	
	@FindBy(id = "regionId2")
	@CacheLookup
	private WebElement smCityRegion;
	
	@FindBy(id = "cams")
	@CacheLookup
	private WebElement smCityCAMScode;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement save;
	
	public  CreateCityPage(WebDriver driver){
		this.driver=driver;
	}
	
public void createSysMCityPageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(SystemMaster);
		actions.moveToElement(SystemMaster).perform();
		
		ElementWait.isElementVisible(city);
		actions.moveToElement(city).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(smCityName);
		smCityName.sendKeys(file.getMasterTestData("smCityName"));
		
		ElementWait.isElementVisible(smCityShortName);
		smCityShortName.sendKeys(file.getMasterTestData("smCityShortName"));

		ElementWait.isElementVisible(smCityStateDD);
		Select selectsmCityStateDD= new Select(smCityStateDD);
		selectsmCityStateDD.selectByVisibleText(file.getMasterTestData("smCityStateDD"));
		
		ElementWait.isElementVisible(smCityRegion);
		Select selectsmCityRegion= new Select(smCityRegion);
		selectsmCityRegion.selectByVisibleText(file.getMasterTestData("smCityRegion"));
		
		ElementWait.isElementVisible(smCityCAMScode);
		smCityCAMScode.sendKeys(file.getMasterTestData("smCityCAMScode"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			alert=driver.switchTo().alert();
			System.out.println("Organization creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
