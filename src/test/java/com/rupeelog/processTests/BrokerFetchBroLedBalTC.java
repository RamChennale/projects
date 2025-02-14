package com.rupeelog.processTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.processPages.BrokerFetchBroLedBalPage;

public class BrokerFetchBroLedBalTC extends TestBase{

	@Test
	public void processBrokerFetchBroLedBalTC() {
		BrokerFetchBroLedBalPage fetchBroLedBalPage=PageFactory.initElements(driver, BrokerFetchBroLedBalPage.class);
		fetchBroLedBalPage.brokerFetchBrokerLedgerBal();
	}
}
