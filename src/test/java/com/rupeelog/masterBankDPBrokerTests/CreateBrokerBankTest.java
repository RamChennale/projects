package com.rupeelog.masterBankDPBrokerTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.masterBankDPBrokerPages.CreateBrokerBankPage;

public class CreateBrokerBankTest extends TestBase{

	@Test(enabled = true)
	public void masterBankDPBrokerCreateBrokerBankTest() {
		CreateBrokerBankPage createBrokerBankPage=PageFactory.initElements(driver, CreateBrokerBankPage.class);
		createBrokerBankPage.createBrokerBank();
	}
}
