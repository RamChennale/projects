package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.DiscPMSClientManagementBCPages;

public class DiscPMSClientManagementBCTests extends TestBase {

	@Test(enabled = true)
	public void discPMSClientMgntCorpusOutRequestViewBc() {
		DiscPMSClientManagementBCPages clientManagementBCPages=PageFactory.initElements(driver, DiscPMSClientManagementBCPages.class);
		clientManagementBCPages.corpusOutRequestView();
	}
	
	@Test(enabled = true)
	public void discPMSClientMgntFreezePortfolioBc() {
		DiscPMSClientManagementBCPages clientManagementBCPages=PageFactory.initElements(driver, DiscPMSClientManagementBCPages.class);
		clientManagementBCPages.freezePortfolio();
	}
	@Test(enabled = true) 
	public void discPMSClientMgntNegativeListBc() {
		DiscPMSClientManagementBCPages clientManagementBCPages=PageFactory.initElements(driver, DiscPMSClientManagementBCPages.class);
		clientManagementBCPages.negativeList();
	}
	
}
