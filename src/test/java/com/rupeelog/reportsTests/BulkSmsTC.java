package com.rupeelog.reportsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.reportsPages.BulkSmsPage;

public class BulkSmsTC extends TestBase{

	@Test(enabled = true)
	public void reportsBulkSmsTC() {
		BulkSmsPage smsPage=PageFactory.initElements(driver, BulkSmsPage.class);
		smsPage.sendBulkSMS();
	}
}
