package com.rupeelog.adminCOBTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminCOBPages.CreateTenPayExpiryPage;
import com.rupeelog.base.TestBase;

public class CreateTenPayExpiryTest extends TestBase{

	@Test(enabled = true)
	public void createTenPayExpiryTest() {
		CreateTenPayExpiryPage tenaExpiryPage = PageFactory.initElements(driver, CreateTenPayExpiryPage.class);
		tenaExpiryPage.createTenPaymentExpiry();

	}
}
