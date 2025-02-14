package com.rupeelog.fpAdminTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.fpAdminPages.CreateInsuProviderPage;

public class DeleteInsuProviderTC extends TestBase {

	@Test(enabled = true)
	public void fpAdminDeleteInsuProviderTC() {
		CreateInsuProviderPage createInsuProviderPage= PageFactory.initElements(driver, CreateInsuProviderPage.class);
		createInsuProviderPage.deleteInsuPolicy();
	}
	
}
