package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.AdminTenantPaymentExpiryBCPages;

public class AdminTenantPaymentExpiryBCTests extends TestBase {

	@Test(enabled = true)
	public void adminTenantPaymentExpiryBc() {
		AdminTenantPaymentExpiryBCPages adminTenantPaymentExpiryBCPages=PageFactory.initElements(driver, AdminTenantPaymentExpiryBCPages.class);
		adminTenantPaymentExpiryBCPages.tenantPaymentExpiry();
	}
}
