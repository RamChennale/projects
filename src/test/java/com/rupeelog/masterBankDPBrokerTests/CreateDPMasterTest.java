package com.rupeelog.masterBankDPBrokerTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.masterBankDPBrokerPages.CreateDPMasterPage;

public class CreateDPMasterTest extends TestBase{

	@Test(enabled = true)
	public void masterBankDPBrokerCreateBrokerBankTest() {
		CreateDPMasterPage createDPMasterPage=PageFactory.initElements(driver, CreateDPMasterPage.class);
		createDPMasterPage.createDPMaster();
	}
}
