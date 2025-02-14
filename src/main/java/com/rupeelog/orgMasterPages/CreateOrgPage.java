package com.rupeelog.orgMasterPages;

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

public class CreateOrgPage {

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
	
	@FindBy(linkText  = "Organization")
	@CacheLookup
	private WebElement Organization;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(id = "name")
	@CacheLookup
	private WebElement orgName;
	
	@FindBy(id = "shortName")
	@CacheLookup
	private WebElement orgShortName;
	
	@FindBy(id = "frn")
	@CacheLookup
	private WebElement orgFrnCode;
	
	@FindBy(id = "crn")
	@CacheLookup
	private WebElement orgCrnCode;
	
	@FindBy(id = "stateId")
	@CacheLookup
	private WebElement orgState;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement save;
	
	public  CreateOrgPage(WebDriver driver){
		this.driver=driver;
	}
	
public void createOrgPageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();
		
		ElementWait.isElementVisible(Organization);
		actions.moveToElement(Organization).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(orgName);
		orgName.sendKeys(file.getMasterTestData("orgName"));
		
		ElementWait.isElementVisible(orgShortName);
		orgShortName.sendKeys(file.getMasterTestData("orgShortName"));

		ElementWait.isElementVisible(orgFrnCode);
		orgFrnCode.sendKeys(file.getMasterTestData("orgFrnCode"));
		
		ElementWait.isElementVisible(orgCrnCode);
		orgCrnCode.sendKeys(file.getMasterTestData("orgCrnCode"));
		
		ElementWait.isElementVisible(orgState);
		Select selectorgState= new Select(orgState);
		selectorgState.selectByVisibleText(file.getMasterTestData("orgState"));
		
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
