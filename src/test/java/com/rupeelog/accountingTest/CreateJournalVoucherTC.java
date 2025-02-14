package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.CreateJournalVoucherPage;
import com.rupeelog.base.TestBase;

public class CreateJournalVoucherTC extends TestBase{

	@Test(enabled = false)
	public void accountingCreateJournalVoucherTC() {
		CreateJournalVoucherPage journalVoucherPage= PageFactory.initElements(driver, CreateJournalVoucherPage.class);
		journalVoucherPage.createJournalVoucher();
	}
}
