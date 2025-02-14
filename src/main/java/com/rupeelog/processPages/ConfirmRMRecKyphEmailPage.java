package com.rupeelog.processPages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class ConfirmRMRecKyphEmailPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "Process")
	@CacheLookup
	private WebElement Process;

	@FindBy(linkText = "Confirmation")
	@CacheLookup
	private WebElement Confirmation;

	@FindBy(linkText = "Recommendation(New)")
	@CacheLookup
	private WebElement RecommendationNew;
	
	@FindBy(id = "masterorgn")
	@CacheLookup
	private WebElement rmRecOrgName;
	
	@FindBy(id = "templateNumber")
	@CacheLookup
	private WebElement rmRecTemplateDD;
	
	@FindBy(id = "txtBody")
	@CacheLookup
	private WebElement rmRecText;

	@FindBy(id = "subject")
	@CacheLookup
	private WebElement rmRecSubject;
	
	@FindBy(id = "whenToSend")
	@CacheLookup
	private WebElement rmRecWhenToSendDate;
	
	@FindBy(id = "hours")
	@CacheLookup
	private WebElement rmRecWTShoursDD;
	
	@FindBy(id = "minutes")
	@CacheLookup
	private WebElement rmRecWTSminutesDD;
	
	@FindBy(id = "docNo")
	@CacheLookup
	private WebElement rmRecDocNo;
	
	@FindBy(id = "toWhom")
	@CacheLookup
	private WebElement rmRecSendToKYPHcodes;
	
	@FindBy(id = "sendMsg")
	@CacheLookup
	private WebElement sendBtn;
	
	public ConfirmRMRecKyphEmailPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void sendKyphEmail() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(Process);
		action.moveToElement(Process).perform();

		ElementWait.isElementVisible(Confirmation);
		action.moveToElement(Confirmation).perform();

		ElementWait.isElementVisible(RecommendationNew);
		action.moveToElement(RecommendationNew).click().build().perform();
		
		ElementWait.isElementVisible(rmRecOrgName);
		Select selectrmRecOrgName= new Select(rmRecOrgName);
		selectrmRecOrgName.selectByVisibleText(file.getProcessTestData(("rmRecOrgName")));
		
		ElementWait.isElementVisible(rmRecTemplateDD);
		Select selectrmRecTemplateDD= new Select(rmRecTemplateDD);
		selectrmRecTemplateDD.selectByVisibleText(file.getProcessTestData(("rmRecTemplateDD")));
		
		ElementWait.isElementVisible(rmRecText);
		rmRecText.clear();
		rmRecText.sendKeys(file.getProcessTestData("rmRecText"));
		
		ElementWait.isElementVisible(rmRecSubject);
		rmRecSubject.sendKeys(file.getProcessTestData("rmRecSubject"));
		
		ElementWait.isElementVisible(rmRecWhenToSendDate);
		rmRecWhenToSendDate.sendKeys(file.getProcessTestData("rmRecWhenToSendDate"));
		
		ElementWait.isElementVisible(rmRecWTShoursDD);
		Select selectrmRecWTShoursDD= new Select(rmRecWTShoursDD);
		selectrmRecWTShoursDD.selectByVisibleText(file.getProcessTestData(("rmRecWTShoursDD")));
		
		ElementWait.isElementVisible(rmRecWTSminutesDD);
		Select selectrmRecWTSminutesDD= new Select(rmRecWTSminutesDD);
		selectrmRecWTSminutesDD.selectByVisibleText(file.getProcessTestData(("rmRecWTSminutesDD")));
		
		ElementWait.isElementVisible(rmRecDocNo);
		rmRecDocNo.sendKeys(file.getProcessTestData("rmRecDocNo"));
		
		ElementWait.isElementVisible(rmRecSendToKYPHcodes);
		rmRecSendToKYPHcodes.sendKeys(file.getProcessTestData("rmRecSendToKYPHcodes"));
		
		ElementWait.isElementVisible(sendBtn);
		sendBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("RM Recommendation Send email to KYPH  : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
