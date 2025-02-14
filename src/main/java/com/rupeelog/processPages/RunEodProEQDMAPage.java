package com.rupeelog.processPages;


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

public class RunEodProEQDMAPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "Process")
	@CacheLookup
	private WebElement Process;

	@FindBy(linkText = "EOD and Dashboard")
	@CacheLookup
	private WebElement EODandDashboard;

	@FindBy(linkText = "Run Eod Process")
	@CacheLookup
	private WebElement RunEodProcess;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "txnDate")
	@CacheLookup
	private WebElement runEodDate;
	
	@FindBy(xpath = "//td[contains(text(),'Equity DMA')]//preceding-sibling::td//input[@type='checkbox']")
	@CacheLookup
	private WebElement runEodEQDMAcheckBox;
	
	@FindBy(id = "go")
	@CacheLookup
	private WebElement GoBtn;

	public RunEodProEQDMAPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void runEodProEQDMA() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(Process);
		action.moveToElement(Process).perform();

		ElementWait.isElementVisible(EODandDashboard);
		action.moveToElement(EODandDashboard).perform();

		ElementWait.isElementVisible(RunEodProcess);
		action.moveToElement(RunEodProcess).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.isElementVisible(runEodDate);
		runEodDate.sendKeys(file.getProcessTestData("runEodDate"));
		
		ElementWait.isElementVisible(runEodEQDMAcheckBox);
		if(runEodEQDMAcheckBox.isSelected()) {
			System.out.println("Run Eod EQ DMA checkBox already selected.");
		}else {
			runEodEQDMAcheckBox.click();
		}
		
		ElementWait.scrollToFindElement(driver, GoBtn);
		ElementWait.isElementVisible(GoBtn);
		GoBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println(" Run Eod Process EQ DMA  : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
