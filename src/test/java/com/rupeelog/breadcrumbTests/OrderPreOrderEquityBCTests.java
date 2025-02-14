package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.OrderPreOrderEquityBCPages;

public class OrderPreOrderEquityBCTests extends TestBase {

	@Test(enabled = true)
	public void orderPreOrderEquityBc() {
		OrderPreOrderEquityBCPages preOrderEquityBCPages = PageFactory.initElements(driver,
				OrderPreOrderEquityBCPages.class);
		preOrderEquityBCPages.preOrderEquity();
	}

}
