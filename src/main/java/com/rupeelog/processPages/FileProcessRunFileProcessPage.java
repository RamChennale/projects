package com.rupeelog.processPages;


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

public class FileProcessRunFileProcessPage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "Process")
	@CacheLookup
	private WebElement Process;

	@FindBy(linkText = "File Process And Dashboard")
	@CacheLookup
	private WebElement FileProcessAndDashboard;

	@FindBy(linkText = "Run File Process")
	@CacheLookup
	private WebElement RunFileProcess;
	
	By overlay= By.cssSelector("#loader");
	
	@FindBy(id = "module")
	@CacheLookup
	private WebElement RunFileModuleDD;
	
	@FindBy(id = "view")
	@CacheLookup
	private WebElement GoBtn;

	public FileProcessRunFileProcessPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void fileProcessRunFileProcess() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(Process);
		action.moveToElement(Process).perform();

		ElementWait.isElementVisible(FileProcessAndDashboard);
		action.moveToElement(FileProcessAndDashboard).perform();

		ElementWait.isElementVisible(RunFileProcess);
		action.moveToElement(RunFileProcess).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.isElementVisible(RunFileModuleDD);
		Select selectRunFileModuleDD= new Select(RunFileModuleDD);
		selectRunFileModuleDD.selectByVisibleText(file.getProcessTestData("RunFileModuleDD"));
		
		ElementWait.isElementVisible(GoBtn);
		ElementWait.scrollToFindElement(driver, GoBtn);
		GoBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Run File Process  : "+alert.getText());
			alert.accept();
			
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Run File Process  : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
