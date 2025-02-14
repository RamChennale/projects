package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.EquityDMAPage;

public class EquityDMARunClientTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void manualTxnAdjEqDividClientTest() {
		EquityDMAPage equityDMAPage= PageFactory.initElements(driver, EquityDMAPage.class);
		equityDMAPage.manualTxnAdjEQDMAClientTest();
	}
	
}
