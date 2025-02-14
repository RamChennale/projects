package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.VoucherUploadPage;
import com.rupeelog.base.TestBase;

public class VoucherUploadTest extends TestBase{

	@Test(enabled = true)
	public void accountingVoucherUpload() throws InterruptedException {
		VoucherUploadPage voucherUploadPage= PageFactory.initElements(driver, VoucherUploadPage.class);
		voucherUploadPage.uploadVoucher();
		System.out.println("Voucher uploaded success");
	}
}
