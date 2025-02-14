package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.DPMStwrrPage;

public class DPMStwrrPortfolioTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void manualTxnAdjDPMSmodelPFolioTest() {
		DPMStwrrPage dpmsPage= PageFactory.initElements(driver, DPMStwrrPage.class);
		dpmsPage.manualTxnAdjDPMStwrrPortfolioTest();
	}
}
