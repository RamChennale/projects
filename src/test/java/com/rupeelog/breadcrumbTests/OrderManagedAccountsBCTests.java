package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.OrderManagedAccountsBCPages;

public class OrderManagedAccountsBCTests extends TestBase{
	
	@Test(enabled = true)
	public void orderMABuySellWithRiskBc() {
		OrderManagedAccountsBCPages managedAccountsBCPages=PageFactory.initElements(driver, OrderManagedAccountsBCPages.class);
		managedAccountsBCPages.maBuySellWithRisk();
	}
	
	@Test(enabled = false)//link broken 
	public void orderMABuySellWithRiskNewBc() {
		OrderManagedAccountsBCPages managedAccountsBCPages=PageFactory.initElements(driver, OrderManagedAccountsBCPages.class);
		managedAccountsBCPages.maBuySellWithRiskNew();
	}
	
	@Test(enabled = true)
	public void orderMABuySellWithoutRiskBc() {
		OrderManagedAccountsBCPages managedAccountsBCPages=PageFactory.initElements(driver, OrderManagedAccountsBCPages.class);
		managedAccountsBCPages.maBuySellWithoutRisk();
	}

	@Test(enabled = true)
	public void orderMAIPOBc() {
		OrderManagedAccountsBCPages managedAccountsBCPages=PageFactory.initElements(driver, OrderManagedAccountsBCPages.class);
		managedAccountsBCPages.maIPO();
	}
}
