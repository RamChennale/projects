package com.rupeelog.commonMasterPages;

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

public class CreateOrgOrdModePage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert	alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Common Master")
	@CacheLookup
	private WebElement CommonMaster;
	
	@FindBy(linkText  = "Organisation Ordermode")
	@CacheLookup
	private WebElement OrganisationOrdermode;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#orgnId")
	@CacheLookup
	private WebElement orgnDD;
	
	@FindBy(css = "#priority1")
	@CacheLookup
	private WebElement priority1;
	
	@FindBy(css = "#priority2")
	@CacheLookup
	private WebElement priority2;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	 public CreateOrgOrdModePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void CreateOrgOrdModeTestPage() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(CommonMaster);
		actions.moveToElement(CommonMaster).perform();
		
		ElementWait.isElementVisible(OrganisationOrdermode);
		actions.moveToElement(OrganisationOrdermode).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(orgnDD);
		Select selectorgnDD= new Select(orgnDD);
		selectorgnDD.selectByVisibleText(file.getMasterTestData("orgnDD"));;
		
		ElementWait.isElementVisible(priority1);
		priority1.sendKeys(file.getMasterTestData("priority1"));
		
		ElementWait.isElementVisible(priority2);
		priority1.sendKeys(file.getMasterTestData("priority2"));

		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Org Ord Mode creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
