package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.InstrumentInstrumentDebtBCPages;

public class InstrumentInstrumentDebtBCTests extends TestBase{
	
	@Test(enabled = true)
	public void instInstDebtInsDebtInstrumentBc() {
		InstrumentInstrumentDebtBCPages instrumentDebtBCPages=PageFactory.initElements(driver, InstrumentInstrumentDebtBCPages.class);
		instrumentDebtBCPages.insDebtInstrument();
	}
	
	@Test(enabled = true)
	public void instInstDebtMarketValuesBc() {
		InstrumentInstrumentDebtBCPages instrumentDebtBCPages=PageFactory.initElements(driver, InstrumentInstrumentDebtBCPages.class);
		instrumentDebtBCPages.marketValues();
	}
	
}
