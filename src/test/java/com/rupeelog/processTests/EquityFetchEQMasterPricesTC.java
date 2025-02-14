package com.rupeelog.processTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.processPages.EquityFetchEQMasterPricesPage;

public class EquityFetchEQMasterPricesTC extends TestBase{

	@Test
	public void processEquityFetchEQMasterPricesTC() {
		EquityFetchEQMasterPricesPage fetchEQMasterPricesPage= PageFactory.initElements(driver, EquityFetchEQMasterPricesPage.class);
		fetchEQMasterPricesPage.equityFetchEQMasterPrices();
	}
}
