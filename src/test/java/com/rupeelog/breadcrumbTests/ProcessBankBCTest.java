package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessBankBCPages;

public class ProcessBankBCTest extends TestBase {

	@Test(enabled = true)
	public void processBankStatementReconBc() {
		ProcessBankBCPages processBankBCPages =PageFactory.initElements(driver, ProcessBankBCPages.class);
		processBankBCPages.bankStatementRecon();
	}

}
