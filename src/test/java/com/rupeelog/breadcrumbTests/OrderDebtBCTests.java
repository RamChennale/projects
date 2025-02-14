package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.OrderDebtBCPages;

public class OrderDebtBCTests extends TestBase{
	
	@Test(enabled = true)
	public void orderDebtBuySellWithRiskBc() {
		OrderDebtBCPages debtBCPages= PageFactory.initElements(driver, OrderDebtBCPages.class);
		debtBCPages.buySellWithRisk();
	}
	
	@Test(enabled = true)
	public void orderDebtBuySellWithoutRiskBc() {
		OrderDebtBCPages debtBCPages= PageFactory.initElements(driver, OrderDebtBCPages.class);
		debtBCPages.buySellWithoutRisk();
	}
	
	@Test(enabled = true)
	public void orderDebtIPOBc() {
		OrderDebtBCPages debtBCPages= PageFactory.initElements(driver, OrderDebtBCPages.class);
		debtBCPages.ipo();
	}

}
