package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessEquityBCPages;

public class ProcessEquityBCTests extends TestBase {

	@Test(enabled = true)
	public void ProcessEqEquityErrorTxnExecBc() {
		ProcessEquityBCPages equityBCPages= PageFactory.initElements(driver, ProcessEquityBCPages.class);
		equityBCPages.equityErrorTxnExec();
	}

	@Test(enabled = true)
	public void ProcessEqFetchPricesforEquityMastersBc() {
		ProcessEquityBCPages equityBCPages= PageFactory.initElements(driver, ProcessEquityBCPages.class);
		equityBCPages.fetchPricesforEquityMasters();
	}

}
