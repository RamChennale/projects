package com.rupeelog.processPages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class BrokerFetchBroStockBalPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "Process")
	@CacheLookup
	private WebElement Process;

	@FindBy(linkText = "Broker")
	@CacheLookup
	private WebElement Broker;

	@FindBy(linkText = "Fetch Broker Stock Balance")
	@CacheLookup
	private WebElement FetchBrokerStockBalance;

	@FindBy(id = "forClient")
	@CacheLookup
	private WebElement pullStockBalForAllClients;
	
	@FindBy(id = "upload")
	@CacheLookup
	private WebElement fetchStockBalBtn;
	
	public BrokerFetchBroStockBalPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void brokerFetchBrokerStockBal() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(Process);
		action.moveToElement(Process).perform();

		ElementWait.isElementVisible(Broker);
		action.moveToElement(Broker).perform();

		ElementWait.isElementVisible(FetchBrokerStockBalance);
		action.moveToElement(FetchBrokerStockBalance).click().build().perform();
	
		if(pullStockBalForAllClients.isSelected())
			System.out.println("pull Stock Bal For All Clients radio btn already selected.");
		pullStockBalForAllClients.click();
		
		ElementWait.isElementVisible(fetchStockBalBtn);
		fetchStockBalBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println(" Broker Fetch Broker stock Bal : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
