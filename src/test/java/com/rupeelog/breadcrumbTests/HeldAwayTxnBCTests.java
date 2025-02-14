package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.HeldAwayTxnUploadBCPages;

public class HeldAwayTxnBCTests extends TestBase {

	@Test(enabled = true)
	public void heldAwayTxnCustodianSettleCashBc() {
		HeldAwayTxnUploadBCPages txnUploadBCPages=PageFactory.initElements(driver, HeldAwayTxnUploadBCPages.class);
		txnUploadBCPages.transactionUpload();
	}

}
