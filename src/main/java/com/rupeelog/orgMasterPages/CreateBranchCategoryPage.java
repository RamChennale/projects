package com.rupeelog.orgMasterPages;


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

public class CreateBranchCategoryPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert	alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Organization Master")
	@CacheLookup
	private WebElement OrganizationMaster;
	
	@FindBy(linkText  = "Branch Category")
	@CacheLookup
	private WebElement BranchCategory;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(id = "name")
	@CacheLookup
	private WebElement branchCategoryName;
	
	@FindBy(css = "#shortName")
	@CacheLookup
	private WebElement branchCategoryShortName;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	@FindBy(css = "#cancel")
	@CacheLookup
	private WebElement cancel;
	
	public  CreateBranchCategoryPage(WebDriver driver){
		this.driver=driver;
	}
	
public void createBranchCategoryPageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();
		
		ElementWait.isElementVisible(BranchCategory);
		actions.moveToElement(BranchCategory).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(branchCategoryName);
		branchCategoryName.sendKeys(file.getMasterTestData("branchCategoryName"));
		
		ElementWait.isElementVisible(branchCategoryShortName);
		branchCategoryShortName.sendKeys(file.getMasterTestData("branchCategoryShortName"));
		
		ElementWait.isElementVisible(cancel);
		cancel.click();
		
		try{
			alert=driver.switchTo().alert();
			System.out.println("Branch creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
