package com.rupeelog.fpAdminTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.fpAdminPages.CreateInsuProviderPage;

public class ViewInsuProviderTC extends TestBase {

	@Test(enabled = true)
	public void fpAdminCreateInsuProviderTC() {
		CreateInsuProviderPage createInsuProviderPage= PageFactory.initElements(driver, CreateInsuProviderPage.class);
		createInsuProviderPage.viewInsuProvider();
	}
	
}
