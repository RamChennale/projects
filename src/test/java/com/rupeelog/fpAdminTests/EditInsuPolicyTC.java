package com.rupeelog.fpAdminTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.fpAdminPages.CreateInsuPolicyPage;

public class EditInsuPolicyTC extends TestBase {

	@Test(enabled = true)
	public void fpAdminEditInsuPolicyTC() {
		CreateInsuPolicyPage createInsuPolicyPage= PageFactory.initElements(driver, CreateInsuPolicyPage.class);
		createInsuPolicyPage.editInsuPolicy();
	}
}
