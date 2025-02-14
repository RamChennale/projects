package com.rupeelog.processTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.processPages.BrokerFetchBroStockBalPage;

public class BrokerFetchBroStockBalTC extends TestBase{

	@Test
	public void processBrokerFetchBroLedBalTC() {
		BrokerFetchBroStockBalPage fetchBroStockBalPage=PageFactory.initElements(driver, BrokerFetchBroStockBalPage.class);
		fetchBroStockBalPage.brokerFetchBrokerStockBal();
	}
}
