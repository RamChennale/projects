package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.EquityDividendPage;

public class EquityDividendRunClientEquityTest extends TestBase{

	
	@Test(enabled = true)
	public void manualTxnAdjEqDividEquityTest() {
		EquityDividendPage equityDividendPage= PageFactory.initElements(driver, EquityDividendPage.class);
		equityDividendPage.manualTxnAdjEQDClientEquityTest();
	}
	
}
