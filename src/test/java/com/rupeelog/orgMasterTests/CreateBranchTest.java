package com.rupeelog.orgMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.orgMasterPages.CreateBranchPage;

public class CreateBranchTest extends TestBase{

	@Test(enabled = true)
	public void OrgMasterCreateBranchTest() {
		CreateBranchPage branchPage=PageFactory.initElements(driver, CreateBranchPage.class);
		branchPage.createBranchPageTest();
	}
	
}
