package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AccountingBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Accounting")
	@CacheLookup
	private WebElement Accounting;
	
	@FindBy(xpath = "//a[contains(text(),'Corpus Cash In-Out')]")
	@CacheLookup
	private WebElement CorpusCashInOut;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Corpus In')]")
	@CacheLookup
	private WebElement CorpusInOutUpload;

	@FindBy(xpath = "//a[contains(text(),'Corpus Stock In-Out')]")
	@CacheLookup
	private WebElement CorpusStockInOut;
	
	@FindBy(xpath = "//a[contains(text(),'Managed Acc Txn Upload')]")
	@CacheLookup
	private WebElement ManagedAccTxnUpload;
	
	@FindBy(xpath = "//a[contains(text(),'Manual Voucher')]")
	@CacheLookup
	private WebElement ManualVoucher;
	
	@FindBy(xpath = "//a[contains(text(),'Voucher Upload')]")
	@CacheLookup
	private WebElement VoucherUpload;
	
	
	public AccountingBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void corpusCashInOut() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Accounting);
		actions.moveToElement(Accounting).perform();

		WebDriverWaitFunctions.waitToLoadElement(CorpusCashInOut);
		actions.moveToElement(CorpusCashInOut).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CorpusCashInOut = breadcrumb.getText();
		Assert.assertTrue(CorpusCashInOut.contains(file.getBreadcrumb("CorpusCashInOut")), " CorpusCashInOut not exits in breadcrumb");
		System.out.println(CorpusCashInOut);
	}	
	
	public void corpusInOutUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Accounting);
		actions.moveToElement(Accounting).perform();

		WebDriverWaitFunctions.waitToLoadElement(CorpusInOutUpload);
		actions.moveToElement(CorpusInOutUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CorpusInOutUpload = breadcrumb.getText();
		Assert.assertTrue(CorpusInOutUpload.contains(file.getBreadcrumb("CorpusInOutUpload")), " CorpusInOutUpload not exits in breadcrumb");
		System.out.println(CorpusInOutUpload);
	}
	
	public void corpusStockInOut() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Accounting);
		actions.moveToElement(Accounting).perform();

		WebDriverWaitFunctions.waitToLoadElement(CorpusStockInOut);
		actions.moveToElement(CorpusStockInOut).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CorpusStockInOut = breadcrumb.getText();
		Assert.assertTrue(CorpusStockInOut.contains(file.getBreadcrumb("CorpusStockInOut")), "CorpusStockInOut  not exits in breadcrumb");
		System.out.println(CorpusStockInOut);
	}
	
	public void managedAccTxnUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Accounting);
		actions.moveToElement(Accounting).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccTxnUpload);
		actions.moveToElement(ManagedAccTxnUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ManagedAccTxnUpload = breadcrumb.getText();
		Assert.assertTrue(ManagedAccTxnUpload.contains(file.getBreadcrumb("ManagedAccTxnUpload")), " ManagedAccTxnUpload not exits in breadcrumb");
		System.out.println(ManagedAccTxnUpload);
	}
	
	public void manualVoucher() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Accounting);
		actions.moveToElement(Accounting).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualVoucher);
		actions.moveToElement(ManualVoucher).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ManualVoucher = breadcrumb.getText();
		Assert.assertTrue(ManualVoucher.contains(file.getBreadcrumb("ManualVoucher")), "ManualVoucher  not exits in breadcrumb");
		System.out.println(ManualVoucher);
	}
	
	public void voucherUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Accounting);
		actions.moveToElement(Accounting).perform();

		WebDriverWaitFunctions.waitToLoadElement(VoucherUpload);
		actions.moveToElement(VoucherUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String VoucherUpload = breadcrumb.getText();
		Assert.assertTrue(VoucherUpload.contains(file.getBreadcrumb("VoucherUpload")), " VoucherUpload not exits in breadcrumb");
		System.out.println(VoucherUpload);
	}
}
