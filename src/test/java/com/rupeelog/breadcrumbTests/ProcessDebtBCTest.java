package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessDebtBCPages;

public class ProcessDebtBCTest extends TestBase {

	@Test(enabled = true)
	public void ProcessDebtDebtPriceBc() {
		ProcessDebtBCPages debtBCPages=PageFactory.initElements(driver, ProcessDebtBCPages.class);
		debtBCPages.debtPrice();
	}

}
