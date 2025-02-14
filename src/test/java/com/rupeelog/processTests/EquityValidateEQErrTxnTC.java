package com.rupeelog.processTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.processPages.EquityValidateEQErrTxnPage;

public class EquityValidateEQErrTxnTC extends TestBase{

	@Test
	public void processEquityValidateEQErrTxnTC() {
		EquityValidateEQErrTxnPage validateEQErrTxnPage= PageFactory.initElements(driver, EquityValidateEQErrTxnPage.class);
		validateEQErrTxnPage.equityValidateEQErrTxn();
	}
}
