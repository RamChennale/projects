package com.rupeelog.fpAdminTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.fpAdminPages.CreateInsuPolicyPage;

public class ViewInsuPolicyTC extends TestBase {

	@Test(enabled = true)
	public void fpAdminViewInstGrowthEstimateTC() {
		CreateInsuPolicyPage createInsuPolicyPage= PageFactory.initElements(driver, CreateInsuPolicyPage.class);
		createInsuPolicyPage.viewInsuPolicy();
	}
}
