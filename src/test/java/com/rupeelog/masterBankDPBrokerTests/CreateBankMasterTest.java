package com.rupeelog.masterBankDPBrokerTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.masterBankDPBrokerPages.CreateBankMasterPage;

public class CreateBankMasterTest extends TestBase{

	@Test(enabled = true)
	public void masterBankDPBrokerCreateBankMaster() {
		CreateBankMasterPage createBankMasterPage=PageFactory.initElements(driver, CreateBankMasterPage.class);
		createBankMasterPage.createBankMaster();
	}
}
