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

public class CreateSMSCredenPage {

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
	
	@FindBy(linkText  = "SMS Creden")
	@CacheLookup
	private WebElement SMSCreden;
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#orgnId")
	@CacheLookup
	private WebElement orgnDDSMS;
	
	@FindBy(css = "#uname")
	@CacheLookup
	private WebElement usernameSMS;
	
	@FindBy(css = "#upwd")
	@CacheLookup
	private WebElement passwordSMS;
	
	@FindBy(css = "#senderName")
	@CacheLookup
	private WebElement senderName;
	
	@FindBy(css = "#authURL")
	@CacheLookup
	private WebElement authURL;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	public  CreateSMSCredenPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void createNewSMSCreden() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(CommonMaster);
		actions.moveToElement(CommonMaster).perform();
		
		ElementWait.isElementVisible(SMSCreden);
		actions.moveToElement(SMSCreden).click().build().perform();
		
		By overlay= By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(orgnDDSMS);
		Select selectorgnDDSMS= new Select(orgnDDSMS);
		selectorgnDDSMS.selectByVisibleText(file.getMasterTestData("orgnDDSMS"));;
		
		ElementWait.isElementVisible(usernameSMS);
		usernameSMS.sendKeys(file.getMasterTestData("usernameSMS"));
		
		ElementWait.isElementVisible(passwordSMS);
		passwordSMS.sendKeys(file.getMasterTestData("passwordSMS"));
		
		ElementWait.isElementVisible(senderName);
		senderName.sendKeys(file.getMasterTestData("senderName"));
		
		ElementWait.isElementVisible(authURL);
		authURL.sendKeys(file.getMasterTestData("authURL"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("SMS Creden creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
