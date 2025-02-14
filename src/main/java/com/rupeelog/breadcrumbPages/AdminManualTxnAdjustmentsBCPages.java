package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AdminManualTxnAdjustmentsBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Admin']")
	@CacheLookup
	private WebElement Admin;

	@FindBy(xpath = "//a[contains(text(),'Manual Txn Adjustments')]")
	@CacheLookup
	private WebElement ManualTxnAdjustments;

	@FindBy(xpath = "//a[contains(text(),'Commodity Future Txn Delete')]")
	@CacheLookup
	private WebElement CommodityFutureTxnDelete;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Currency Future Txn Delete')]")
	@CacheLookup
	private WebElement CurrencyFutureTxnDelete;
	
	@FindBy(linkText = "Future Txn Delete")
	@CacheLookup
	private WebElement FutureTxnDelete;

	@FindBy(xpath = "//a[contains(text(),'Generate Nav')]")
	@CacheLookup
	private WebElement GenerateNav;
	
	@FindBy(xpath = "//a[contains(text(),'Rerun Commodity Future M2M')]")
	@CacheLookup
	private WebElement RerunCommodityFutureM2M;
	
	@FindBy(xpath = "//a[contains(text(),'Rerun Currency Future M2M')]")
	@CacheLookup
	private WebElement RerunCurrencyFutureM2M;

	@FindBy(xpath = "//a[contains(text(),'Rerun Currency Option Auto Expiry')]")
	@CacheLookup
	private WebElement RerunCurrencyOptionAutoExpiry;

	@FindBy(xpath = "//a[contains(text(),'Rerun DPMS TWRR')]")
	@CacheLookup
	private WebElement RerunDPMSTWRR;

	@FindBy(xpath = "//a[contains(text(),'Rerun Equity dividend')]")
	@CacheLookup
	private WebElement RerunEquitydividend;

	@FindBy(xpath = "//a[contains(text(),'Rerun Equity DMA')]")
	@CacheLookup
	private WebElement RerunEquityDMA;

	@FindBy(xpath = "//a[contains(text(),'Rerun Equity Split Bonus')]")
	@CacheLookup
	private WebElement RerunEquitySplitBonus;

	@FindBy(xpath = "//a[contains(text(),'Rerun Future M2M')]")
	@CacheLookup
	private WebElement RerunFutureM2M;

	@FindBy(xpath = "//a[contains(text(),'Rerun Realised Gain')]")
	@CacheLookup
	private WebElement RerunRealisedGain;
	
	@FindBy(xpath = "//a[contains(text(),'Run MF fifo folio wise')]")
	@CacheLookup
	private WebElement RunMFfifofoliowise;

	@FindBy(xpath = "//a[contains(text(),'Update KYC Status')]")
	@CacheLookup
	private WebElement UpdateKYCStatus;

	@FindBy(xpath = "//a[contains(text(),'Voucher Delete')]")
	@CacheLookup
	private WebElement VoucherDelete;

	@FindBy(xpath = "//a[contains(text(),'Xirr')]")
	@CacheLookup
	private WebElement Xirr;

	@FindBy(xpath = "//a[contains(text(),'Xirr Since Inception')]")
	@CacheLookup
	private WebElement XirrSinceInception;
	
	public AdminManualTxnAdjustmentsBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void commodityFutureTxnDelete() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(CommodityFutureTxnDelete);
		actions.moveToElement(CommodityFutureTxnDelete).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CommodityFutureTxnDelete = breadcrumb.getText();
		Assert.assertTrue(CommodityFutureTxnDelete.contains(file.getBreadcrumb("CommodityFutureTxnDelete")), " CommodityFutureTxnDeletename not exits in breadcrumb");
		System.out.println(CommodityFutureTxnDelete);
	}	
	

	public void currencyFutureTxnDelete() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(CurrencyFutureTxnDelete);
		actions.moveToElement(CurrencyFutureTxnDelete).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CurrencyFutureTxnDelete = breadcrumb.getText();
		Assert.assertTrue(CurrencyFutureTxnDelete.contains(file.getBreadcrumb("CurrencyFutureTxnDelete")), "CurrencyFutureTxnDelete name not exits in breadcrumb");
		System.out.println(CurrencyFutureTxnDelete);
	}



	public void futureTxnDelete() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(FutureTxnDelete);
		actions.moveToElement(FutureTxnDelete).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FutureTxnDelete = breadcrumb.getText();
		System.out.println(FutureTxnDelete);
		Assert.assertTrue(FutureTxnDelete.contains(file.getBreadcrumb("mtaFutureTxnDelete")), "FutureTxnDelete name not exits in breadcrumb");
	}	
	

	public void generateNav() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(GenerateNav);
		actions.moveToElement(GenerateNav).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String GenerateNav = breadcrumb.getText();
		Assert.assertTrue(GenerateNav.contains(file.getBreadcrumb("GenerateNav")), "GenerateNav name not exits in breadcrumb");
		System.out.println(GenerateNav);
	}
	

	public void rerunCommodityFutureM2M() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(RerunCommodityFutureM2M);
		actions.moveToElement(RerunCommodityFutureM2M).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RerunCommodityFutureM2M = breadcrumb.getText();
		Assert.assertTrue(RerunCommodityFutureM2M.contains(file.getBreadcrumb("RerunCommodityFutureM2M")), "RerunCommodityFutureM2M name not exits in breadcrumb");
		System.out.println(RerunCommodityFutureM2M);
	}	
	

	public void rerunCurrencyFutureM2M() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(RerunCurrencyFutureM2M);
		actions.moveToElement(RerunCurrencyFutureM2M).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RerunCurrencyFutureM2M = breadcrumb.getText();
		Assert.assertTrue(RerunCurrencyFutureM2M.contains(file.getBreadcrumb("RerunCurrencyFutureM2M")), " RerunCurrencyFutureM2M name not exits in breadcrumb");
		System.out.println(RerunCurrencyFutureM2M);
	}
	

	public void rerunCurrencyOptionAutoExpiry() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(RerunCurrencyOptionAutoExpiry);
		actions.moveToElement(RerunCurrencyOptionAutoExpiry).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RerunCurrencyOptionAutoExpiry = breadcrumb.getText();
		Assert.assertTrue(RerunCurrencyOptionAutoExpiry.contains(file.getBreadcrumb("RerunCurrencyOptionAutoExpiry")), "RerunCurrencyOptionAutoExpiry name not exits in breadcrumb");
		System.out.println(RerunCurrencyOptionAutoExpiry);
	}	
	

	public void rerunDPMSTWRR() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(RerunDPMSTWRR);
		actions.moveToElement(RerunDPMSTWRR).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RerunDPMSTWRR = breadcrumb.getText();
		Assert.assertTrue(RerunDPMSTWRR.contains(file.getBreadcrumb("RerunDPMSTWRR")), "RerunDPMSTWRR name not exits in breadcrumb");
		System.out.println(RerunDPMSTWRR);
	}
	

	public void rerunEquitydividend() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(RerunEquitydividend);
		actions.moveToElement(RerunEquitydividend).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RerunEquitydividend = breadcrumb.getText();
		Assert.assertTrue(RerunEquitydividend.contains(file.getBreadcrumb("RerunEquitydividend")), " RerunEquitydividend name not exits in breadcrumb");
		System.out.println(RerunEquitydividend);
	}	
	

	public void rerunEquityDMA() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(RerunEquityDMA);
		actions.moveToElement(RerunEquityDMA).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RerunEquityDMA = breadcrumb.getText();
		Assert.assertTrue(RerunEquityDMA.contains(file.getBreadcrumb("RerunEquityDMA")), " RerunEquityDMA name not exits in breadcrumb");
		System.out.println(RerunEquityDMA);
	}
	

	public void rerunEquitySplitBonus() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(RerunEquitySplitBonus);
		actions.moveToElement(RerunEquitySplitBonus).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RerunEquitySplitBonus = breadcrumb.getText();
		Assert.assertTrue(RerunEquitySplitBonus.contains(file.getBreadcrumb("RerunEquitySplitBonus")), "RerunEquitySplitBonus name not exits in breadcrumb");
		System.out.println(RerunEquitySplitBonus);
	}	
	

	public void rerunFutureM2M() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(RerunFutureM2M);
		actions.moveToElement(RerunFutureM2M).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RerunFutureM2M = breadcrumb.getText();
		Assert.assertTrue(RerunFutureM2M.contains(file.getBreadcrumb("RerunFutureM2M")), " RerunFutureM2M name not exits in breadcrumb");
		System.out.println(RerunFutureM2M);
	}
	

	public void rerunRealisedGain() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(RerunRealisedGain);
		actions.moveToElement(RerunRealisedGain).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RerunRealisedGain = breadcrumb.getText();
		Assert.assertTrue(RerunRealisedGain.contains(file.getBreadcrumb("RerunRealisedGain")), "RerunRealisedGain name not exits in breadcrumb");
		System.out.println(RerunRealisedGain);
	}	
	

	public void runMFfifofoliowise() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(RunMFfifofoliowise);
		actions.moveToElement(RunMFfifofoliowise).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RunMFfifofoliowise = breadcrumb.getText();
		Assert.assertTrue(RunMFfifofoliowise.contains(file.getBreadcrumb("RunMFfifofoliowise")), "RunMFfifofoliowise name not exits in breadcrumb");
		System.out.println(RunMFfifofoliowise);
	}
	

	public void updateKYCStatus() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(UpdateKYCStatus);
		actions.moveToElement(UpdateKYCStatus).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String UpdateKYCStatus = breadcrumb.getText();
		Assert.assertTrue(UpdateKYCStatus.contains(file.getBreadcrumb("UpdateKYCStatus")), "UpdateKYCStatus name not exits in breadcrumb");
		System.out.println(UpdateKYCStatus);
	}	
	

	public void voucherDelete() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(VoucherDelete);
		actions.moveToElement(VoucherDelete).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String VoucherDelete = breadcrumb.getText();
		Assert.assertTrue(VoucherDelete.contains(file.getBreadcrumb("VoucherDelete")), "VoucherDelete name not exits in breadcrumb");
		System.out.println(VoucherDelete);
	}
	

	public void xirr() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(Xirr);
		actions.moveToElement(Xirr).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Xirr = breadcrumb.getText();
		Assert.assertTrue(Xirr.contains(file.getBreadcrumb("Xirr")), "Xirr name not exits in breadcrumb");
		System.out.println(Xirr);
	}	
	

	public void xirrSinceInception() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManualTxnAdjustments);
		actions.moveToElement(ManualTxnAdjustments).perform();

		WebDriverWaitFunctions.waitToLoadElement(XirrSinceInception);
		actions.moveToElement(XirrSinceInception).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String XirrSinceInception = breadcrumb.getText();
		Assert.assertTrue(XirrSinceInception.contains(file.getBreadcrumb("XirrSinceInception")), "XirrSinceInception name not exits in breadcrumb");
		System.out.println(XirrSinceInception);
	}
	

}
