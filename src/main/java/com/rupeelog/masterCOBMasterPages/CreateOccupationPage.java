package com.rupeelog.masterCOBMasterPages;

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

public class CreateOccupationPage {

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
	
	@FindBy(linkText="Occupation")
	@CacheLookup
	private WebElement occupation;
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(id = "name")
	@CacheLookup
	private WebElement occupationName;
	
	@FindBy(id = "shortName")
	@CacheLookup
	private WebElement occupationShortName;
	
	@FindBy(name = "submit")
	@CacheLookup
	private WebElement save;
	
	public CreateOccupationPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void createOccupation() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(ClientOnBoardMaster);
		actions.moveToElement(ClientOnBoardMaster).perform();
		
		ElementWait.isElementVisible(occupation);
		actions.moveToElement(occupation).click().build().perform();
		
		By overlay= By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		create.click();
		
		ElementWait.isElementVisible(occupationName);
		occupationName.sendKeys(file.getClientOnBoardMasterData("occupationName"));
		
		ElementWait.isElementVisible(occupationShortName);
		occupationShortName.sendKeys(file.getClientOnBoardMasterData("occupationShortName"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try {
		ElementWait.waitToPopUpAlert();
		alert=	driver.switchTo().alert();
		System.out.println("Occupation creation : "+alert.getText());
		alert.accept();
		}catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();	
		}
	}
}
