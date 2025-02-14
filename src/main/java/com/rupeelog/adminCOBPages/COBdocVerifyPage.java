package com.rupeelog.adminCOBPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class COBdocVerifyPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;
	
	@FindBy(linkText = "Admin")
	@CacheLookup
	private WebElement Admin;
	
	@FindBy(linkText = "Client-On-Boarding")
	@CacheLookup
	private WebElement ClientOnBoarding;
	
	@FindBy(linkText = "Document Verification")
	@CacheLookup 
	private WebElement DocumentVerification;
	
	@FindBy(xpath = "//input[@type='search']")
	@CacheLookup
	private WebElement searchKYPH;
	
	@FindBy(xpath = "//td[contains(text(),'UCIC153550')]")
	@CacheLookup
	private WebElement selectKYPH;
	
	@FindBy(id = "ViewImage")
	@CacheLookup
	private WebElement ViewImageBtn;
	
	By overlay= By.cssSelector("#loader");
	
	
 	public COBdocVerifyPage(WebDriver driver){
		this.driver=driver;
	}
 	
 	public void cobDocVerifyPageTest() {
		
 		actions= new Actions(driver);
 		file= new FileReaderUtility();
 		
 		ElementWait.isElementVisible(Admin);
 		actions.moveToElement(Admin).perform();
 	
 		ElementWait.isElementVisible(ClientOnBoarding);
 		actions.moveToElement(ClientOnBoarding).perform();
 		
 		ElementWait.isElementVisible(DocumentVerification);
 		actions.moveToElement(DocumentVerification).click().build().perform();
 		
 		ElementWait.isElementVisible(searchKYPH);
 		searchKYPH.sendKeys(file.getAdminTestData("searchKYPH"));
 		
 		ElementWait.isElementVisible(selectKYPH);
 		selectKYPH.click();
 		
 		ElementWait.isElementVisible(ViewImageBtn);
 		ViewImageBtn.click();
 		
 		ElementWait.waitForOverlayDisappearExplicitly(overlay);
 		
 	}
}
