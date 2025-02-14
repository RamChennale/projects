package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.InstrumentInstrumentMAccBCPages;

public class InstrumentInstrumentMAccBCTests extends TestBase{
	
	@Test(enabled = true)
	public void instInstMAManagedAccountFundBc() {
		InstrumentInstrumentMAccBCPages mAccBCPages= PageFactory.initElements(driver, InstrumentInstrumentMAccBCPages.class);
		mAccBCPages.managedAccountFund();
	}
	
	@Test(enabled = true)
	public void instInstMAManagedAccountMarketvalueBc() {
		InstrumentInstrumentMAccBCPages mAccBCPages= PageFactory.initElements(driver, InstrumentInstrumentMAccBCPages.class);
		mAccBCPages.managedAccountMarketvalue();
	}
	
	@Test(enabled = true)
	public void instInstMAManagedAccountSchemeBc() {
		InstrumentInstrumentMAccBCPages mAccBCPages= PageFactory.initElements(driver, InstrumentInstrumentMAccBCPages.class);
		mAccBCPages.managedAccountScheme();
	}
}
