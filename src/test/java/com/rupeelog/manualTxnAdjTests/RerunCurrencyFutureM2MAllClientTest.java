package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.RerunCurrencyFutureM2MPage;

public class RerunCurrencyFutureM2MAllClientTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void manualTxnAdjmentRerunCurrencyFutureM2MAllClientTest() {
		RerunCurrencyFutureM2MPage rerunCurrencyFutureM2MPage= PageFactory.initElements(driver, RerunCurrencyFutureM2MPage.class);
		rerunCurrencyFutureM2MPage.manualTxnAdjmentRerunCurrencyFutureM2MPageAllClientTest();
	}
}
