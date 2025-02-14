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

public class CreateEmailCredenPage {

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
	
	@FindBy(linkText  = "Email Creden")
	@CacheLookup
	private WebElement EmailCreden;
	
	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#orgnId")
	@CacheLookup
	private WebElement orgnDD;
	
	@FindBy(css = "#emailSenderName")
	@CacheLookup
	private WebElement emailSenderName;
	
	@FindBy(css = "#emailCaption")
	@CacheLookup
	private WebElement emailCaption;
	
	@FindBy(css = "#uname")
	@CacheLookup
	private WebElement userName;
	
	@FindBy(css = "#upwd")
	@CacheLookup
	private WebElement password;
	
	@FindBy(css = "#host")
	@CacheLookup
	private WebElement host;
	
	@FindBy(css = "#port")
	@CacheLookup
	private WebElement port;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	public  CreateEmailCredenPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void createNewEmailCreden() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(CommonMaster);
		actions.moveToElement(CommonMaster).perform();
		
		ElementWait.isElementVisible(EmailCreden);
		actions.moveToElement(EmailCreden).click().build().perform();
		
		By overlay= By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(orgnDD);
		Select selectorgnDD= new Select(orgnDD);
		selectorgnDD.selectByVisibleText(file.getMasterTestData("orgnDD"));;
		
		ElementWait.isElementVisible(emailSenderName);
		emailSenderName.sendKeys(file.getMasterTestData("emailSenderName"));
		
		ElementWait.isElementVisible(emailCaption);
		emailCaption.sendKeys(file.getMasterTestData("emailCaption"));
		
		ElementWait.isElementVisible(userName);
		userName.sendKeys(file.getMasterTestData("userName"));
		
		ElementWait.isElementVisible(password);
		password.sendKeys(file.getMasterTestData("password"));
		
		ElementWait.isElementVisible(host);
		host.sendKeys(file.getMasterTestData("host"));
		
		ElementWait.isElementVisible(port);
		port.sendKeys(file.getMasterTestData("port"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Email Creden creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
