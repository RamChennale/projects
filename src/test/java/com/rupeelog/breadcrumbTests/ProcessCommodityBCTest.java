package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessCommodityBCPages;

public class ProcessCommodityBCTest extends TestBase {

	@Test(enabled = true)
	public void ProcessCommodityTxnNotValidatedBc() {
		ProcessCommodityBCPages commodityBCPages=PageFactory.initElements(driver, ProcessCommodityBCPages.class);
				commodityBCPages.commodityTxnNotValidated();
	}

}
