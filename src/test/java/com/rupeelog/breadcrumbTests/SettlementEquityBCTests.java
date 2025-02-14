package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.SettlementEquityBCPages;

public class SettlementEquityBCTests extends TestBase {

	@Test(enabled = true)
	public void settlementEquitySettleCashBc() {
		SettlementEquityBCPages equityBCPages=PageFactory.initElements(driver, SettlementEquityBCPages.class);
		equityBCPages.eSettleCash();
	}
	
	@Test(enabled = true)
	public void settlementEquitySettleStockBc() {
		SettlementEquityBCPages equityBCPages=PageFactory.initElements(driver, SettlementEquityBCPages.class);
		equityBCPages.eSettleStock();
	}
	
}
