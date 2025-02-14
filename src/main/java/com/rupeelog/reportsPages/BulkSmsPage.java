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

public class BulkSmsPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;
	
	@FindBy(linkText = "Reports")
	@CacheLookup
	private WebElement Reports;
	
	@FindBy(linkText = "Bulk SMS")
	@CacheLookup
	private WebElement BulkSMS;

	@FindBy(id = "masterorgn")
	@CacheLookup
	private WebElement bsOrgNameDD;
	
	@FindBy(id = "templateNumber")
	@CacheLookup
	private WebElement bsTemplateDD;
	
	@FindBy(id = "mobileNo")
	@CacheLookup
	private WebElement bsMobileNo;
	
	@FindBy(id = "sendMsg")
	@CacheLookup
	private WebElement sendBtn;
	
	//By overlay= By.cssSelector("#loader");
	
	public BulkSmsPage(WebDriver driver) {
			this.driver=driver;
	}
	
	public void sendBulkSMS() {
		file= new FileReaderUtility();
		action= new Actions(driver);
		
		ElementWait.isElementVisible(Reports);
		action.moveToElement(Reports).perform();
		
		ElementWait.isElementVisible(BulkSMS);
		action.moveToElement(BulkSMS).click().build().perform();
		
		ElementWait.isElementVisible(bsOrgNameDD);
		Select selectbsOrgNameDD= new Select(bsOrgNameDD);
		selectbsOrgNameDD.selectByVisibleText(file.getReportsTestData("bsOrgNameDD"));
		
		ElementWait.isElementVisible(bsTemplateDD);
		Select selectbsTemplateDD= new Select(bsTemplateDD);
		selectbsTemplateDD.selectByVisibleText(file.getReportsTestData("bsTemplateDD"));
		
		ElementWait.isElementVisible(bsMobileNo);
		bsMobileNo.sendKeys(file.getReportsTestData("bsMobileNo"));
		
		ElementWait.isElementVisible(sendBtn);
		sendBtn.click();
		
		//ElementWait.waitForOverlayDisappearExplicitly(overlay);
		ElementWait.waitToPopUpAlert();
		try {
		alert= driver.switchTo().alert();
		System.out.println("Sending bulk SMS : "+alert.getText());
		alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
	
}
