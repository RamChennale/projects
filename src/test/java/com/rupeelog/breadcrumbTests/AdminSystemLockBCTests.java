package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.AdminSystemLockBCPages;

public class AdminSystemLockBCTests extends TestBase {

	@Test(enabled = true)
	public void adminSystemLockBc() {
		AdminSystemLockBCPages adminSystemLockBCPages= PageFactory.initElements(driver, AdminSystemLockBCPages.class);
		adminSystemLockBCPages.systemLock();
	}

}
