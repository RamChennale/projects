package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.EquityDividendPage;

public class EquityDividendRunClientTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void manualTxnAdjEqDividClientTest() {
		EquityDividendPage equityDividendPage= PageFactory.initElements(driver, EquityDividendPage.class);
		equityDividendPage.manualTxnAdjEDClientTest();
	}
	
}
