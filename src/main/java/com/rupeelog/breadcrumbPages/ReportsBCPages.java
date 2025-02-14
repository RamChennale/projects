package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ReportsBCPages {
	
	WebDriver driver;
	Actions actions;
	FileReaderUtility file;


	@FindBy(linkText =  "Reports")
	@CacheLookup
	private WebElement Reports; 
	
	@FindBy(xpath = "//a[contains(text(),'Adhoc Reports')]")
	@CacheLookup
	private WebElement AdhocReports; 
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb; 

	@FindBy(xpath = "//a[contains(text(),'Bulk SMS')]")
	@CacheLookup
	private WebElement BulkSMS; 
	
	@FindBy(xpath = "//a[contains(text(),'Chart Analytics')]")
	@CacheLookup
	private WebElement ChartAnalytics; 

	@FindBy(xpath = "//a[contains(text(),'Daily Sales Reports(DSR)')]")
	@CacheLookup
	private WebElement DailySalesReports; 
	
	@FindBy(linkText = "Debit/Credit Note")
	@CacheLookup
	private WebElement DebitCreditNote; 

	@FindBy(xpath = "//a[contains(text(),'Kyph Email')]")
	@CacheLookup
	private WebElement KyphEmail; 
	
	@FindBy(xpath = "//a[contains(text(),'Large Report Execute')]")
	@CacheLookup
	private WebElement LargeReportExecute; 

	@FindBy(xpath = "//a[contains(text(),'Multi Report Download & Email')]")
	@CacheLookup
	private WebElement MultiReportDownloadEmail; 
	
	@FindBy(xpath = "//a[contains(text(),'Multi-Report Generation')]")
	@CacheLookup
	private WebElement MultiReportGeneration; 

	@FindBy(xpath = "//a[contains(text(),'Push Notification')]")
	@CacheLookup
	private WebElement PushNotification; 
	
	@FindBy(xpath = "//a[contains(text(),'Reporting Server')]")
	@CacheLookup
	private WebElement ReportingServer; 

	@FindBy(xpath = "//a[contains(text(),'RM Reports')]")
	@CacheLookup
	private WebElement RMReports; 

	@FindBy(xpath = "//a[contains(text(),'Txn Search')]")
	@CacheLookup
	private WebElement TxnSearch; 	
	
	public ReportsBCPages(WebDriver driver){
		this.driver=driver;
	}
	
	public void adhocReports() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(Reports);
		actions.moveToElement(Reports).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(AdhocReports);
		actions.moveToElement(AdhocReports).click().build().perform();
		
		String AdhocReports = breadcrumb.getText();
		System.out.println(AdhocReports);
		Assert.assertTrue(AdhocReports.contains(file.getBreadcrumb("AdhocReports")),"AdhocReports name not exits in breadcrumb");
	}
	

	public void bulkSMS() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(Reports);
		actions.moveToElement(Reports).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(BulkSMS);
		actions.moveToElement(BulkSMS).click().build().perform();
		
		String BulkSMS = breadcrumb.getText();
		System.out.println(BulkSMS);
		Assert.assertTrue(BulkSMS.contains(file.getBreadcrumb("BulkSMS")),"BulkSMS name not exits in breadcrumb");
	}

	public void chartAnalytics() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(Reports);
		actions.moveToElement(Reports).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(ChartAnalytics);
		actions.moveToElement(ChartAnalytics).click().build().perform();
		
		String ChartAnalytics = breadcrumb.getText();
		System.out.println(ChartAnalytics);
		Assert.assertTrue(ChartAnalytics.contains(file.getBreadcrumb("ChartAnalytics")),"ChartAnalytics name not exits in breadcrumb");
	}

	public void dailySalesReports() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(Reports);
		actions.moveToElement(Reports).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(DailySalesReports);
		actions.moveToElement(DailySalesReports).click().build().perform();
		
		String DailySalesReports = breadcrumb.getText();
		System.out.println(DailySalesReports);
		Assert.assertTrue(DailySalesReports.contains(file.getBreadcrumb("DailySalesReports")),"DailySalesReports name not exits in breadcrumb");
	}

	public void debitCreditNote() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(Reports);
		actions.moveToElement(Reports).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(DebitCreditNote);
		actions.moveToElement(DebitCreditNote).click().build().perform();
		
		String DebitCreditNote = breadcrumb.getText();
		System.out.println(DebitCreditNote);
		Assert.assertTrue(DebitCreditNote.contains(file.getBreadcrumb("DebitCreditNote")),"DebitCreditNote name not exits in breadcrumb");
	}

	public void kyphEmail() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(Reports);
		actions.moveToElement(Reports).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(KyphEmail);
		actions.moveToElement(KyphEmail).click().build().perform();
		
		String KyphEmail = breadcrumb.getText();
		System.out.println(KyphEmail);
		Assert.assertTrue(KyphEmail.contains(file.getBreadcrumb("KyphEmail")),"KyphEmail name not exits in breadcrumb");
	}

	public void largeReportExecute() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(Reports);
		actions.moveToElement(Reports).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(LargeReportExecute);
		actions.moveToElement(LargeReportExecute).click().build().perform();
		
		String LargeReportExecute = breadcrumb.getText();
		System.out.println(LargeReportExecute);
		Assert.assertTrue(LargeReportExecute.contains(file.getBreadcrumb("LargeReportExecute")),"LargeReportExecute name not exits in breadcrumb");
	}

	public void multiReportDownloadEmail() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(Reports);
		actions.moveToElement(Reports).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(MultiReportDownloadEmail);
		actions.moveToElement(MultiReportDownloadEmail).click().build().perform();
		
		String MultiReportDownloadEmail = breadcrumb.getText();
		System.out.println(MultiReportDownloadEmail);
		Assert.assertTrue(MultiReportDownloadEmail.contains(file.getBreadcrumb("MultiReportDownloadEmail")),"MultiReportDownloadEmail name not exits in breadcrumb");
	}

	public void multiReportGeneration() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(Reports);
		actions.moveToElement(Reports).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(MultiReportGeneration);
		actions.moveToElement(MultiReportGeneration).click().build().perform();
		
		String MultiReportGeneration = breadcrumb.getText();
		System.out.println(MultiReportGeneration);
		Assert.assertTrue(MultiReportGeneration.contains(file.getBreadcrumb("MultiReportGeneration")),"MultiReportGeneration name not exits in breadcrumb");
	}

	public void pushNotification() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(Reports);
		actions.moveToElement(Reports).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(PushNotification);
		actions.moveToElement(PushNotification).click().build().perform();
		
		String PushNotification = breadcrumb.getText();
		System.out.println(PushNotification);
		Assert.assertTrue(PushNotification.contains(file.getBreadcrumb("PushNotification")),"PushNotification name not exits in breadcrumb");
	}

	public void reportingServer() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(Reports);
		actions.moveToElement(Reports).perform();
		
		String windowIDFirst=driver.getWindowHandle();
		
		WebDriverWaitFunctions.waitToLoadElement(ReportingServer);
		actions.moveToElement(ReportingServer).click().build().perform();
		
		for(String windowHandle:driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
			String ReportingServertitle=driver.getTitle();
			 //Assert.assertTrue(ReportingServertitle.contains(file.getBreadcrumb("ReportingServer")),"ReportingServer not opened successfully");
			System.out.println("Reporting server title : "+ReportingServertitle);
		}
		  
		  driver.switchTo().window(windowIDFirst);
		}

	public void rmReports() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(Reports);
		actions.moveToElement(Reports).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(RMReports);
		actions.moveToElement(RMReports).click().build().perform();
		
		String RMReports = breadcrumb.getText();
		System.out.println(RMReports);
		Assert.assertTrue(RMReports.contains(file.getBreadcrumb("RMReports")),"RMReports name not exits in breadcrumb");
	}

	public void txnSearch() {
		actions= new Actions(driver);
		file= new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(Reports);
		actions.moveToElement(Reports).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(TxnSearch);
		actions.moveToElement(TxnSearch).click().build().perform();
		
		String TxnSearch = breadcrumb.getText();
		System.out.println(TxnSearch);
		Assert.assertTrue(TxnSearch.contains(file.getBreadcrumb("TxnSearch")),"TxnSearch name not exits in breadcrumb");
	}
}
