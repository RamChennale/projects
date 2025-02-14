package com.rupeelog.reportsPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class PushNotificationPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;
	
	@FindBy(linkText = "Reports")
	@CacheLookup
	private WebElement Reports;
	
	@FindBy(linkText = "Push Notification")
	@CacheLookup
	private WebElement PushNotification;

	@FindBy(id = "masterorgn")
	@CacheLookup
	private WebElement pnOrgNameDD;
	
	@FindBy(id = "pushFor")
	@CacheLookup
	private WebElement pnSendTo;
	
	@FindBy(id = "kyphIds")
	@CacheLookup
	private WebElement pnkyphId;
	
	@FindBy(id = "remarks")
	@CacheLookup
	private WebElement pnremarks;
	
	@FindBy(id = "sendMsg")
	@CacheLookup
	private WebElement sendBtn;
	
	public PushNotificationPage(WebDriver driver) {
			this.driver=driver;
	}
	
	public void sendPushNotification() {
		file= new FileReaderUtility();
		action= new Actions(driver);
		
		ElementWait.isElementVisible(Reports);
		action.moveToElement(Reports).perform();
		
		ElementWait.isElementVisible(PushNotification);
		action.moveToElement(PushNotification).click().build().perform();
		
		ElementWait.isElementVisible(pnOrgNameDD);
		Select selectpnOrgNameDD= new Select(pnOrgNameDD);
		selectpnOrgNameDD.selectByVisibleText(file.getReportsTestData("OrgName"));
		
		ElementWait.isElementVisible(pnSendTo);
		Select selectpnSendTo= new Select(pnSendTo);
		selectpnSendTo.selectByVisibleText(file.getReportsTestData("pnSendTo"));
		
		ElementWait.isElementVisible(pnkyphId);
		pnkyphId.sendKeys(file.getReportsTestData("pnkyphId"));
		
		ElementWait.isElementVisible(pnremarks);
		pnremarks.sendKeys(file.getReportsTestData("pnremarks"));
		
		ElementWait.isElementVisible(sendBtn);
		sendBtn.click();
		
		ElementWait.waitToPopUpAlert();
		try {
		alert= driver.switchTo().alert();
		String actualResult=alert.getText();
		System.out.println("Sending push notification to KYPH : "+alert.getText());
		Assert.assertTrue(actualResult.contains("success"),"Failed to send push notification.");
		alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
	
}
