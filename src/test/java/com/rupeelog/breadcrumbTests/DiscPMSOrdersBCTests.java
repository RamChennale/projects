package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.DiscPMSOrdersBCPages;

public class DiscPMSOrdersBCTests extends TestBase {

	@Test(enabled = true)
	public void discPMSOrdGenerateVarianceBc() {
		DiscPMSOrdersBCPages ordersBCPages=PageFactory.initElements(driver, DiscPMSOrdersBCPages.class);
		ordersBCPages.generateVariance1();
	}
	
	@Test(enabled = true)
	public void discPMSOrdVarianceforAccountingPortfolioBc() {
		DiscPMSOrdersBCPages ordersBCPages=PageFactory.initElements(driver, DiscPMSOrdersBCPages.class);
		ordersBCPages.varianceforAccountingPortfolio2();
	}
	@Test(enabled = true) 
	public void discPMSOrdPrepareOrdersBc() {
		DiscPMSOrdersBCPages ordersBCPages=PageFactory.initElements(driver, DiscPMSOrdersBCPages.class);
		ordersBCPages.prepareOrders3();
	}

	@Test(enabled = true) 
	public void discPMSOrdPrepareAlternativeInvestOrdersBc() {
		DiscPMSOrdersBCPages ordersBCPages=PageFactory.initElements(driver, DiscPMSOrdersBCPages.class);
		ordersBCPages.prepareAlternativeInvestOrders4();
	}
	
	@Test(enabled = true) 
	public void discPMSOrdPlaceOrdersBc() {
		DiscPMSOrdersBCPages ordersBCPages=PageFactory.initElements(driver, DiscPMSOrdersBCPages.class);
		ordersBCPages.placeOrders5();
	}
}
