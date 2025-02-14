package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessDeleteErrorTxnsBCPages;

public class ProcessDeleteErrorTxnsBCTest extends TestBase {

	@Test(enabled = true)
	public void ProcessDeleteErrorTxns() {
		ProcessDeleteErrorTxnsBCPages deleteErrorTxnsBCPages=PageFactory.initElements(driver, ProcessDeleteErrorTxnsBCPages.class);
		deleteErrorTxnsBCPages.deleteErrorTxns();
	}

}
