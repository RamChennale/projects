package com.rupeelog.fpAdminTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.fpAdminPages.CreateInsuPolicyPage;

public class DeleteInsuPolicyTC extends TestBase {

	@Test(enabled = false)
	public void fpAdminViewInstGrowthEstimateTC() {
		CreateInsuPolicyPage createInsuPolicyPage= PageFactory.initElements(driver, CreateInsuPolicyPage.class);
		createInsuPolicyPage.deleteInsuPolicy();
	}
}
