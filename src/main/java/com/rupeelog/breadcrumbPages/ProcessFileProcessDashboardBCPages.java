package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessFileProcessDashboardBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;

	
	@FindBy(xpath = "//a[contains(text(),'File Process And Dashboard')]")
	@CacheLookup
	private WebElement FileProcessAndDashboard;
	
	@FindBy(xpath = "//a[contains(text(),'File Process DashBoard')]")
	@CacheLookup
	private WebElement FileProcessDashBoard;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Processed File Download')]")
	@CacheLookup
	private WebElement ProcessedFileDownload;
	
	@FindBy(xpath = "//a[contains(text(),'Run File Process')]")
	@CacheLookup
	private WebElement RunFileProcess;
	
	public ProcessFileProcessDashboardBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void fileProcessDashBoard() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(FileProcessAndDashboard);
		actions.moveToElement(FileProcessAndDashboard).perform();

		WebDriverWaitFunctions.waitToLoadElement(FileProcessDashBoard);
		actions.moveToElement(FileProcessDashBoard).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FileProcessDashBoard = breadcrumb.getText();
		Assert.assertTrue(FileProcessDashBoard.contains(file.getBreadcrumb("FileProcessDashBoard")), " FileProcessDashBoard not exits in breadcrumb");
		System.out.println(FileProcessDashBoard);
	}	
	
	public void processedFileDownload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(FileProcessAndDashboard);
		actions.moveToElement(FileProcessAndDashboard).perform();

		WebDriverWaitFunctions.waitToLoadElement(ProcessedFileDownload);
		actions.moveToElement(ProcessedFileDownload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ProcessedFileDownload = breadcrumb.getText();
		Assert.assertTrue(ProcessedFileDownload.contains(file.getBreadcrumb("ProcessedFileDownload")), "ProcessedFileDownload  not exits in breadcrumb");
		System.out.println(ProcessedFileDownload);
	}
	
	public void runFileProcess() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(FileProcessAndDashboard);
		actions.moveToElement(FileProcessAndDashboard).perform();

		WebDriverWaitFunctions.waitToLoadElement(RunFileProcess);
		actions.moveToElement(RunFileProcess).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RunFileProcess = breadcrumb.getText();
		Assert.assertTrue(RunFileProcess.contains(file.getBreadcrumb("RunFileProcess")), " RunFileProcess not exits in breadcrumb");
		System.out.println(RunFileProcess);
	}
	
}
