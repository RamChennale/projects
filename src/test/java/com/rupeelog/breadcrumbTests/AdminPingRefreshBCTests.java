package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.AdminPingRefreshBCPages;

public class AdminPingRefreshBCTests extends TestBase {

	@Test(enabled = true)
	public void adminPingRefreshBc() {
		AdminPingRefreshBCPages adminPingRefreshBCPages=PageFactory.initElements(driver, AdminPingRefreshBCPages.class);
		adminPingRefreshBCPages.pingRefresh();
	}

}
