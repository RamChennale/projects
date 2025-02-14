package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.CurrencyAutoExpiryPage;

public class CurrencyAutoExpiryClientTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void manualTxnAdjCurrencyAutoExpiryClientTest() {
		CurrencyAutoExpiryPage currencyAutoExpiryPage= PageFactory.initElements(driver, CurrencyAutoExpiryPage.class);
		currencyAutoExpiryPage.manualTxnAdjCurrencyAutoExpiryClientTest();
	}
	
	@Test(enabled = false, priority = 2)
	public void manualTxnAdjCurrencyAutoExpiryAllClientTest() {
		CurrencyAutoExpiryPage currencyAutoExpiryPage= PageFactory.initElements(driver, CurrencyAutoExpiryPage.class);
		currencyAutoExpiryPage.manualTxnAdjCurrencyAutoExpiryAllClientTest();
	}
}
