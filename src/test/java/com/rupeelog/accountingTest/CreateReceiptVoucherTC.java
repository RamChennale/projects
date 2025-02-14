package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.CreateReceiptVoucherPage;
import com.rupeelog.base.TestBase;

public class CreateReceiptVoucherTC extends TestBase{

	@Test(enabled = true)
	public void accountingCreateReceiptVoucherTC() {
		CreateReceiptVoucherPage receiptVoucherPage= PageFactory.initElements(driver, CreateReceiptVoucherPage.class);
		receiptVoucherPage.createReceiptVoucher();
	}
}
