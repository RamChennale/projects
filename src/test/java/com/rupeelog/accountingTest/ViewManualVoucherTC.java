package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.ViewManualVoucherPage;
import com.rupeelog.base.TestBase;

public class ViewManualVoucherTC extends TestBase{

	@Test(enabled = true)
	public void accountingViewManualVoucherTC() {
		ViewManualVoucherPage manualVoucherPage= PageFactory.initElements(driver, ViewManualVoucherPage.class);
		manualVoucherPage.viewManualVoucher();
	}
}
