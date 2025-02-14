package com.rupeelog.mutualFundPages;

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

public class CreateMFFundMgrPage {

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
	
	@FindBy(linkText  = "MF Fund Manager")
	@CacheLookup
	private WebElement MFFundManager;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#name")
	@CacheLookup
	private WebElement mfFundManagerName;
	
	@FindBy(css = "#description")
	@CacheLookup
	private WebElement biography;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	public  CreateMFFundMgrPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void CreateMFClassificationPageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(MutualFund);
		actions.moveToElement(MutualFund).perform();
		
		ElementWait.isElementVisible(MFFundManager);
		actions.moveToElement(MFFundManager).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(mfFundManagerName);
		mfFundManagerName.sendKeys(file.getMasterTestData("mfFundManagerName"));
		
		ElementWait.isElementVisible(biography);
		biography.sendKeys(file.getMasterTestData("biography"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("MF Fund Manager creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
