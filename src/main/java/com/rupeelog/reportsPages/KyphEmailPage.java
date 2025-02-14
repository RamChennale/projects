package com.rupeelog.reportsPages;

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

public class KyphEmailPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;
	
	@FindBy(linkText = "Reports")
	@CacheLookup
	private WebElement Reports;
	
	@FindBy(linkText = "Kyph Email")
	@CacheLookup
	private WebElement KyphEmail;

	@FindBy(id = "masterorgn")
	@CacheLookup
	private WebElement keOrgNameDD;
	
	@FindBy(id = "templateNumber")
	@CacheLookup
	private WebElement keTemplateDD;
	
	@FindBy(id = "kyphUcic")
	@CacheLookup
	private WebElement keKyphUcic;
	
	@FindBy(id = "sendMsg")
	@CacheLookup
	private WebElement sendBtn;
	
	public KyphEmailPage(WebDriver driver) {
			this.driver=driver;
	}
	
	public void sendKyphEmail() {
		file= new FileReaderUtility();
		action= new Actions(driver);
		
		ElementWait.isElementVisible(Reports);
		action.moveToElement(Reports).perform();
		
		ElementWait.isElementVisible(KyphEmail);
		action.moveToElement(KyphEmail).click().build().perform();
		
		ElementWait.isElementVisible(keOrgNameDD);
		Select selectkeOrgNameDD= new Select(keOrgNameDD);
		selectkeOrgNameDD.selectByVisibleText(file.getReportsTestData("keOrgNameDD"));
		
		ElementWait.isElementVisible(keTemplateDD);
		Select selectkeTemplateDD= new Select(keTemplateDD);
		selectkeTemplateDD.selectByVisibleText(file.getReportsTestData("keTemplateDD"));
		
		ElementWait.isElementVisible(keKyphUcic);
		keKyphUcic.sendKeys(file.getReportsTestData("keKyphUcic"));
		
		ElementWait.isElementVisible(sendBtn);
		sendBtn.click();
		
		ElementWait.waitToPopUpAlert();
		try {
		alert= driver.switchTo().alert();
		System.out.println("Sending enail to KYPH : "+alert.getText());
		alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
	
}
