package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.MasterBankDPBrokerBCPages;

public class MasterBankDPBrokerBCTests extends TestBase{
	
	@Test(enabled = true)
	public void masterBankDPBrBankAccountTypeBc() {
		MasterBankDPBrokerBCPages masterBankDPBrokerBCPages= PageFactory.initElements(driver, MasterBankDPBrokerBCPages.class);
		masterBankDPBrokerBCPages.bankAccountType();
	}
	
	@Test(enabled = true)
	public void masterBankDPBrBankMasterBc() {
		MasterBankDPBrokerBCPages masterBankDPBrokerBCPages= PageFactory.initElements(driver, MasterBankDPBrokerBCPages.class);
		masterBankDPBrokerBCPages.bankMaster();
	}
	
	@Test(enabled = true)
	public void masterBankDPBrBranchBankBc() {
		MasterBankDPBrokerBCPages masterBankDPBrokerBCPages= PageFactory.initElements(driver, MasterBankDPBrokerBCPages.class);
		masterBankDPBrokerBCPages.branchBank();
	}
	
	@Test(enabled = true)
	public void masterBankDPBrBrokerBc() {
		MasterBankDPBrokerBCPages masterBankDPBrokerBCPages= PageFactory.initElements(driver, MasterBankDPBrokerBCPages.class);
		masterBankDPBrokerBCPages.broker();
	}
	
	@Test(enabled = true)
	public void masterBankDPBrBrokerBankBc() {
		MasterBankDPBrokerBCPages masterBankDPBrokerBCPages= PageFactory.initElements(driver, MasterBankDPBrokerBCPages.class);
		masterBankDPBrokerBCPages.brokerBank();
	}
	
	@Test(enabled = true)
	public void masterBankDPBrBrokerDematBc() {
		MasterBankDPBrokerBCPages masterBankDPBrokerBCPages= PageFactory.initElements(driver, MasterBankDPBrokerBCPages.class);
		masterBankDPBrokerBCPages.brokerDemat();
	}
	
	@Test(enabled = true)
	public void masterBankDPBrDPMasterBc() {
		MasterBankDPBrokerBCPages masterBankDPBrokerBCPages= PageFactory.initElements(driver, MasterBankDPBrokerBCPages.class);
		masterBankDPBrokerBCPages.dpMaster();
	}
}
