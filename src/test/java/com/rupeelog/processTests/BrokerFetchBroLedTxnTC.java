package com.rupeelog.processTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.processPages.BrokerFetchBroLedTxnPage;

public class BrokerFetchBroLedTxnTC extends TestBase{

	@Test
	public void processBrokerFetchBroLedTxnTC() {
		BrokerFetchBroLedTxnPage fetchBroLedTxnPage=PageFactory.initElements(driver, BrokerFetchBroLedTxnPage.class);
		fetchBroLedTxnPage.brokerFetchBrokerLedgerTxn();
	}
}
