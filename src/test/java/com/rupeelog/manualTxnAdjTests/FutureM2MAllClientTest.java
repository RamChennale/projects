package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.FutureM2MPage;

public class FutureM2MAllClientTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void manualTxnAdjmentFutureM2MAllClientTest() {
		FutureM2MPage futureM2MPage= PageFactory.initElements(driver, FutureM2MPage.class);
		futureM2MPage.manualTxnAdjFutureM2MPageAllClientTest();
	}
}
