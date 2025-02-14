package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessDerivativeBCPages;

public class ProcessDerivativeBCTest extends TestBase {

	@Test(enabled = true)
	public void ProcessDerivativeErrorTxnExecBc() {
		ProcessDerivativeBCPages derivativeBCPages=PageFactory.initElements(driver, ProcessDerivativeBCPages.class);
		derivativeBCPages.derivativeErrorTxnExec();
	}

}
