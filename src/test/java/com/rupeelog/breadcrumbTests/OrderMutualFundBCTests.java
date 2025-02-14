package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.OrderMutualFundBCPages;

public class OrderMutualFundBCTests extends TestBase{
	
	@Test(enabled = true)
	public void orderMFBuySell1Bc() {
		OrderMutualFundBCPages mutualFundBCPages= PageFactory.initElements(driver, OrderMutualFundBCPages.class);
		mutualFundBCPages.buySell1();
	}
	
	@Test(enabled = true)
	public void orderMFBuySellSwitchCart1ABc() {
		OrderMutualFundBCPages mutualFundBCPages= PageFactory.initElements(driver, OrderMutualFundBCPages.class);
		mutualFundBCPages.buySellSwitchCart1A();
	}
	
	@Test(enabled = true)
	public void orderMFSystematicPlanCart1BBc() {
		OrderMutualFundBCPages mutualFundBCPages= PageFactory.initElements(driver, OrderMutualFundBCPages.class);
		mutualFundBCPages.systematicPlanCart1B();
	}

	@Test(enabled = true)
	public void orderMFMandateBc() {
		OrderMutualFundBCPages mutualFundBCPages= PageFactory.initElements(driver, OrderMutualFundBCPages.class);
		mutualFundBCPages.mandate();
	}
}
