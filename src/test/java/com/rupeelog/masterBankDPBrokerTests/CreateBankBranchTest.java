package com.rupeelog.masterBankDPBrokerTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.masterBankDPBrokerPages.CreateBankBranchPage;

public class CreateBankBranchTest extends TestBase{

	@Test(enabled = true)
	public void masterBankDPBrokerCreateBankMaster() {
		CreateBankBranchPage createBankBranchPage=PageFactory.initElements(driver, CreateBankBranchPage.class);
		createBankBranchPage.createBankBranch();
	}
}
