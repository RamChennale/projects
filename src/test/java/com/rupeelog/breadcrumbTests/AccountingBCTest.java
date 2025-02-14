package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.AccountingBCPages;

public class AccountingBCTest extends TestBase {

	@Test
	public void accountingCorpusCashInOutBc() {
		AccountingBCPages accountingBCPages=PageFactory.initElements(driver, AccountingBCPages.class);
		accountingBCPages.corpusCashInOut();
	}
	
	@Test
	public void accountingCorpusInOutUploadBc() {
		AccountingBCPages accountingBCPages=PageFactory.initElements(driver, AccountingBCPages.class);
		accountingBCPages.corpusInOutUpload();
	}
	@Test
	public void accountingCorpusStockInOutBc() {
		AccountingBCPages accountingBCPages=PageFactory.initElements(driver, AccountingBCPages.class);
		accountingBCPages.corpusStockInOut();
	}
	
	@Test
	public void accountingManagedAccTxnUploadBc() {
		AccountingBCPages accountingBCPages=PageFactory.initElements(driver, AccountingBCPages.class);
		accountingBCPages.managedAccTxnUpload();
	}
	
	@Test
	public void accountingManualVoucherBc() {
		AccountingBCPages accountingBCPages=PageFactory.initElements(driver, AccountingBCPages.class);
		accountingBCPages.manualVoucher();
	}
	
	@Test
	public void accountingVoucherUploadBc() {
		AccountingBCPages accountingBCPages=PageFactory.initElements(driver, AccountingBCPages.class);
		accountingBCPages.voucherUpload();
	}

}
