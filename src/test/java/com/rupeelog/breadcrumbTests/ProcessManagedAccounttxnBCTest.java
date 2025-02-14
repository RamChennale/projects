package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessManagedAccounttxnBCPages;

public class ProcessManagedAccounttxnBCTest extends TestBase {

	@Test(enabled = true)
	public void processMATxnMAFolioChangeBc() {
		ProcessManagedAccounttxnBCPages managedAccounttxnBCPages=PageFactory.initElements(driver, ProcessManagedAccounttxnBCPages.class);
		managedAccounttxnBCPages.maFolioChange();
	}
	
	@Test(enabled = true)
	public void processMATxnManagedAccountMarketValueBc() {
		ProcessManagedAccounttxnBCPages managedAccounttxnBCPages=PageFactory.initElements(driver, ProcessManagedAccounttxnBCPages.class);
		managedAccounttxnBCPages.managedAccountMarketValue();
	}
	@Test(enabled = false) //Unauthorized Access!
	public void processMATxnOrderMatchingBc() {
		ProcessManagedAccounttxnBCPages managedAccounttxnBCPages=PageFactory.initElements(driver, ProcessManagedAccounttxnBCPages.class);
		managedAccounttxnBCPages.orderMatching();
	}
	
	@Test(enabled = true)
	public void processMATxnCommittedInvestmentUploadBc() {
		ProcessManagedAccounttxnBCPages managedAccounttxnBCPages=PageFactory.initElements(driver, ProcessManagedAccounttxnBCPages.class);
		managedAccounttxnBCPages.committedInvestmentUpload();
	}

}
