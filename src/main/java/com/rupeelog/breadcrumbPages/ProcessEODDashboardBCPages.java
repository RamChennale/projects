package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessEODDashboardBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;

	
	@FindBy(xpath = "//a[contains(text(),'EOD and Dashboard')]")
	@CacheLookup
	private WebElement EODDashboard;
	
	@FindBy(xpath = "//a[contains(text(),'Eod Process Dashboard')]")
	@CacheLookup
	private WebElement EodProcessDashboard;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(linkText = "Process Dashboard")
	@CacheLookup
	private WebElement ProcessDashboard;
	
	@FindBy(xpath = "//a[contains(text(),'Run Eod Process')]")
	@CacheLookup
	private WebElement RunEodProcess;
	
	public ProcessEODDashboardBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void eodProcessDashboard() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(EODDashboard);
		actions.moveToElement(EODDashboard).perform();

		WebDriverWaitFunctions.waitToLoadElement(EodProcessDashboard);
		actions.moveToElement(EodProcessDashboard).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String EodProcessDashboard = breadcrumb.getText();
		Assert.assertTrue(EodProcessDashboard.contains(file.getBreadcrumb("EodProcessDashboard")), " EodProcessDashboard not exits in breadcrumb");
		System.out.println(EodProcessDashboard);
	}	
	
	public void processDashboard() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(EODDashboard);
		actions.moveToElement(EODDashboard).perform();

		WebDriverWaitFunctions.waitToLoadElement(ProcessDashboard);
		actions.moveToElement(ProcessDashboard).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ProcessDashboard = breadcrumb.getText();
		Assert.assertTrue(ProcessDashboard.contains(file.getBreadcrumb("ProcessDashboard")), "ProcessDashboard  not exits in breadcrumb");
		System.out.println(ProcessDashboard);
	}
	
	public void runEodProcess() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(EODDashboard);
		actions.moveToElement(EODDashboard).perform();

		WebDriverWaitFunctions.waitToLoadElement(RunEodProcess);
		actions.moveToElement(RunEodProcess).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RunEodProcess = breadcrumb.getText();
		Assert.assertTrue(RunEodProcess.contains(file.getBreadcrumb("RunEodProcess")), "RunEodProcess  not exits in breadcrumb");
		System.out.println(RunEodProcess);
	}
	
}
