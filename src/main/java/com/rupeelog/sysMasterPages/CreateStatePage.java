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

public class CreateStatePage {

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
	
	@FindBy(linkText  = "State")
	@CacheLookup
	private WebElement State;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(id = "name")
	@CacheLookup
	private WebElement stateName;
	
	@FindBy(id = "shortName")
	@CacheLookup
	private WebElement stateShortName;
	
	@FindBy(id = "countryId")
	@CacheLookup
	private WebElement stateCountryDD;
	
	@FindBy(id = "scode")
	@CacheLookup
	private WebElement stateCode;
	
	@FindBy(id = "Type")
	@CacheLookup
	private WebElement stateTypeDD;
	
	@FindBy(id = "save")
	@CacheLookup
	private WebElement save;
	
	public  CreateStatePage(WebDriver driver){
		this.driver=driver;
	}
	
public void createStatePageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(SystemMaster);
		actions.moveToElement(SystemMaster).perform();
		
		ElementWait.isElementVisible(State);
		actions.moveToElement(State).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(stateName);
		stateName.sendKeys(file.getMasterTestData("stateName"));
		
		ElementWait.isElementVisible(stateShortName);
		stateShortName.sendKeys(file.getMasterTestData("stateShortName"));
		
		ElementWait.isElementVisible(stateCountryDD);
		Select selectstateCountryDD= new Select(stateCountryDD);
		selectstateCountryDD.selectByVisibleText(file.getMasterTestData("stateCountryDD"));
		
		ElementWait.isElementVisible(stateCode);
		stateCode.sendKeys(file.getMasterTestData("stateCode"));

		ElementWait.isElementVisible(stateTypeDD);
		Select selectstateTypeDD= new Select(stateTypeDD);
		selectstateTypeDD.selectByVisibleText(file.getMasterTestData("stateTypeDD"));

		ElementWait.isElementVisible(save);
		save.click();
	
		try{
			alert=driver.switchTo().alert();
			System.out.println("State creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
