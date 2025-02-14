package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.SettlementMutualFundBCPages;

public class SettlementMutualFundBCTests extends TestBase {

	@Test(enabled = true)
	public void settlementMutualFundSettleCashBc() {
		SettlementMutualFundBCPages mutualFundBCPages = PageFactory.initElements(driver,
				SettlementMutualFundBCPages.class);
		mutualFundBCPages.mfSettleCash();
	}

	@Test(enabled = true)
	public void settlementMutualFundSettleStockBc() {
		SettlementMutualFundBCPages mutualFundBCPages = PageFactory.initElements(driver,
				SettlementMutualFundBCPages.class);
		mutualFundBCPages.mfSettleStock();
	}

}
