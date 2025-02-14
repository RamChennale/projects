package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.SettlementDebtBCPages;

public class SettlementDebtBCTests extends TestBase {

	@Test(enabled = true)
	public void settlementDebtSettleCashBc() {
		SettlementDebtBCPages debtBCPages=PageFactory.initElements(driver, SettlementDebtBCPages.class);
		debtBCPages.debtSettleCash();
	}
	
	@Test(enabled = true)
	public void settlementDebtSettleStockBc() {
		SettlementDebtBCPages debtBCPages=PageFactory.initElements(driver, SettlementDebtBCPages.class);
		debtBCPages.dSettleStock();
	}
	
}
