package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.CreateContraVoucherPage;
import com.rupeelog.base.TestBase;

public class CreateContraVoucherTC extends TestBase{

	@Test(enabled = true)
	public void accountingCreateContraVoucherTC() {
		CreateContraVoucherPage contraVoucherPage= PageFactory.initElements(driver, CreateContraVoucherPage.class);
		contraVoucherPage.createContraVoucher();
	}
}
