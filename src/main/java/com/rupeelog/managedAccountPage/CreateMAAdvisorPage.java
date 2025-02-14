package com.rupeelog.managedAccountPage;

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

public class CreateMAAdvisorPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert	alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Managed Account")
	@CacheLookup
	private WebElement ManagedAccount;
	
	@FindBy(linkText  = "Managed Account Advisor")
	@CacheLookup
	private WebElement ManagedAccountAdvisor;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#name")
	@CacheLookup
	private WebElement maAdviserName;
	
	@FindBy(css = "#code")
	@CacheLookup
	private WebElement maAdviserShortName;
	
	@FindBy(css = "#email")
	@CacheLookup
	private WebElement email;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	public  CreateMAAdvisorPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void createNewMAAdvPage() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(ManagedAccount);
		actions.moveToElement(ManagedAccount).perform();
		
		ElementWait.isElementVisible(ManagedAccountAdvisor);
		actions.moveToElement(ManagedAccountAdvisor).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(maAdviserName);
		maAdviserName.sendKeys(file.getMasterTestData("maAdviserName"));
		
		ElementWait.isElementVisible(maAdviserShortName);
		maAdviserShortName.sendKeys(file.getMasterTestData("maAdviserShortName"));
		
		ElementWait.isElementVisible(email);
		email.sendKeys(file.getMasterTestData("email"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("M A creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
