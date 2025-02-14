package com.rupeelog.orgMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.orgMasterPages.CreateBranchCategoryPage;

public class CreateBranchCategoryTest extends TestBase{

	@Test(enabled = true)
	public void OrgMasterCreateBranchCategoryTest() {
		CreateBranchCategoryPage branchCategoryPage=PageFactory.initElements(driver, CreateBranchCategoryPage.class);
		branchCategoryPage.createBranchCategoryPageTest();
	}
}
