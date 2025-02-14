package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessBrokerBCPages;

public class ProcessBrokerBCTests extends TestBase {

	@Test(enabled = true)
	public void processBrokerBrokerLedgerTxnNotValidatedBc() {
		ProcessBrokerBCPages brokerBCPages=PageFactory.initElements(driver, ProcessBrokerBCPages.class);
		brokerBCPages.brokerLedgerTxnNotValidated();
	}


	@Test(enabled = true)
	public void processBrokerFetchBrokerLedgerBalanceBc() {
		ProcessBrokerBCPages brokerBCPages=PageFactory.initElements(driver, ProcessBrokerBCPages.class);
		brokerBCPages.fetchBrokerLedgerBalance();
	}

	@Test(enabled = true)
	public void processBrokerFetchBrokerLedgerTxnsBc() {
		ProcessBrokerBCPages brokerBCPages=PageFactory.initElements(driver, ProcessBrokerBCPages.class);
		brokerBCPages.fetchBrokerLedgerTxns();
	}

	@Test(enabled = true)
	public void processBrokerFetchBrokerStockBalanceBc() {
		ProcessBrokerBCPages brokerBCPages=PageFactory.initElements(driver, ProcessBrokerBCPages.class);
		brokerBCPages.fetchBrokerStockBalance();
	}

}
