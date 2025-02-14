package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.EquityDMAPage;

public class EquityDMARunEquityTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void manualTxnAdjEqDividEquityTest() {
		EquityDMAPage equityDmaPage= PageFactory.initElements(driver, EquityDMAPage.class);
		equityDmaPage.manualTxnAdjEQDMAAssetEquityTest();
	}
	
}
