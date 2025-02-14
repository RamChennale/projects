package com.rupeelog.orderMATests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.orderMAPages.OrderMABuySellWithoutRiskPage;

public class OrderMABuySellWithoutRiskTest extends TestBase{

	@Test(enabled = false)
	public void orderMAPreOrderBuy() throws InterruptedException {
		OrderMABuySellWithoutRiskPage maPreOrderPage= PageFactory.initElements(driver, OrderMABuySellWithoutRiskPage.class);
		maPreOrderPage.addMAPreOrder();
	}
}
