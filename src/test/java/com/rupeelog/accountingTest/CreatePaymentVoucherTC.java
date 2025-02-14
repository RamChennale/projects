package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.CreatePaymentVoucherPage;
import com.rupeelog.base.TestBase;

public class CreatePaymentVoucherTC extends TestBase{

	@Test(enabled = true)
	public void accountingCreatePaymentVoucherTC() {
		CreatePaymentVoucherPage paymentVoucherPage= PageFactory.initElements(driver, CreatePaymentVoucherPage.class);
		paymentVoucherPage.createPaymentVoucher();
	}
}
