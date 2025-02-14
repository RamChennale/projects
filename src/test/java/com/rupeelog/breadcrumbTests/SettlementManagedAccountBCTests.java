package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.SettlementManagedAccountBCPages;

public class SettlementManagedAccountBCTests extends TestBase {

	@Test(enabled = true)
	public void settlementMASettleCashBc() {
		SettlementManagedAccountBCPages managedAccountBCPages=PageFactory.initElements(driver, SettlementManagedAccountBCPages.class);
		managedAccountBCPages.maSettleCash();
	}
	
}
