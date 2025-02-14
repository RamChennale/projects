package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.UpdateKYCStatusPage;

public class UpdateKYCStatusTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void manualTxnAdjCurrencyAutoExpiryAllClientTest() {
		UpdateKYCStatusPage kycStatusPage= PageFactory.initElements(driver, UpdateKYCStatusPage.class);
		kycStatusPage.manualTxnAdjUpdateKYCStatus();
	}
}
