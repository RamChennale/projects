package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.RerunCommodityFutureM2MPage;

public class RerunCommodityFutureM2MTest extends TestBase{

	@Test(enabled = false)
	public void manualTxnAdjmentRerunComdtyFutureM2MClientTest() {
		RerunCommodityFutureM2MPage rerunComdtyFutureM2MPage= PageFactory.initElements(driver, RerunCommodityFutureM2MPage.class);
		rerunComdtyFutureM2MPage.manualTxnAdjmentRerunComdtyFutureM2MPageClientTest();
	}
	
	@Test(enabled = true)
	public void manualTxnAdjmentRerunComdtyFutureM2MAllClientTest() {
		RerunCommodityFutureM2MPage rerunComdtyFutureM2MPage= PageFactory.initElements(driver, RerunCommodityFutureM2MPage.class);
		rerunComdtyFutureM2MPage.manualTxnAdjmentRerunComdtyFutureM2MPageAllClientTest();
	}
}
