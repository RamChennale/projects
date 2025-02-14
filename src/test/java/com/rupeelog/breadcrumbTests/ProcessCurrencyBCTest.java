package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessCurrencyBCPages;

public class ProcessCurrencyBCTest extends TestBase {

	@Test(enabled = true)
	public void ProcessCurrencyTxnNotValidatedBc() {
		ProcessCurrencyBCPages currencyBCPages=PageFactory.initElements(driver, ProcessCurrencyBCPages.class);
		currencyBCPages.currencyTxnNotValidated();
	}

}
