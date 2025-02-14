package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.AdminPasswordBCPages;

public class AdminPasswordBCTests extends TestBase {

	@Test(enabled = true)
	public void adminPasswordMFExchangePasswordBc() {
		AdminPasswordBCPages adminPasswordBCPages=PageFactory.initElements(driver, AdminPasswordBCPages.class);
		adminPasswordBCPages.mfExchangePassword();
	}

	@Test(enabled = true)
	public void adminPasswordRTAEmailPasswordBc() {
		AdminPasswordBCPages adminPasswordBCPages=PageFactory.initElements(driver, AdminPasswordBCPages.class);
		adminPasswordBCPages.rtaEmailPassword();
	}


}
