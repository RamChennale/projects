package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.OrderFundPayoutOrderBCPages;

public class OrderFundPayoutOrderBCTests extends TestBase{
	
	@Test(enabled = true)
	public void OrderFundPayFundPayoutOrderBc() {
		OrderFundPayoutOrderBCPages fundPayoutOrderBCPages= PageFactory.initElements(driver, OrderFundPayoutOrderBCPages.class);
		fundPayoutOrderBCPages.fundPayoutOrder();
	}
	
}
