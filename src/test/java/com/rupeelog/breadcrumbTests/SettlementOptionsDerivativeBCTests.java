package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.SettlementOptionsDerivativeBCPages;

public class SettlementOptionsDerivativeBCTests extends TestBase {

	@Test(enabled = true)
	public void settlementOptionsCustodianSettleCashBc() {
		SettlementOptionsDerivativeBCPages optionsDerivativeBCPages=PageFactory.initElements(driver, SettlementOptionsDerivativeBCPages.class);
		optionsDerivativeBCPages.custodianSettleCash();
	}

}
