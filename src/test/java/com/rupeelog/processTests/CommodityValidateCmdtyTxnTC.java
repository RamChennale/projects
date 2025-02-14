package com.rupeelog.processTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.processPages.CommodityValidateCmdtyTxnPage;

public class CommodityValidateCmdtyTxnTC extends TestBase{

	@Test
	public void processCommodityValidateCmdtyTxnTC() {
		CommodityValidateCmdtyTxnPage validateCmdtyTxnPage=PageFactory.initElements(driver, CommodityValidateCmdtyTxnPage.class);
		validateCmdtyTxnPage.commodityValidateCmdtyTxn();
	}
}
