package com.rupeelog.processTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.processPages.CurrencyValidateCurrencyTxnPage;

public class CurrencyValidateCurrencyTxnTC extends TestBase{

	@Test
	public void processCommodityValidateCmdtyTxnTC() {
		CurrencyValidateCurrencyTxnPage validateCurrencyTxnPage=PageFactory.initElements(driver, CurrencyValidateCurrencyTxnPage.class);
		validateCurrencyTxnPage.validateCurrencyTxn();
	}
}
