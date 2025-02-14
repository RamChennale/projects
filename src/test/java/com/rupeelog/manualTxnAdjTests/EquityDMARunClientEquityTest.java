package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.EquityDMAPage;

public class EquityDMARunClientEquityTest extends TestBase{

	
	@Test(enabled = true)
	public void manualTxnAdjEQDMAClientEquityTest() {
		EquityDMAPage equitydmPage= PageFactory.initElements(driver, EquityDMAPage.class);
		equitydmPage.manualTxnAdjEQDMAClientAssetEquityTest();
	}
	
}
