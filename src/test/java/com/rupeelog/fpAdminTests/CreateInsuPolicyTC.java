package com.rupeelog.fpAdminTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.fpAdminPages.CreateInsuPolicyPage;

public class CreateInsuPolicyTC extends TestBase {

	@Test(enabled = true)
	public void fpAdminCreateInsuPolicyTC() {
		CreateInsuPolicyPage createInsuPolicyPage= PageFactory.initElements(driver, CreateInsuPolicyPage.class);
		createInsuPolicyPage.createInsuPolicy();
	}
	
}
