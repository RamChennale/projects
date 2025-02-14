package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.InstrumentInstrumentDerivativesBCPages;

public class InstrumentInstrumentDerivativesBCTests extends TestBase {

	@Test(enabled = true)
	public void instInstDerivativeSpanMarginBc() {
		InstrumentInstrumentDerivativesBCPages derivativesBCPages= PageFactory.initElements(driver, InstrumentInstrumentDerivativesBCPages.class);
		derivativesBCPages.spanMargin();
	}

	@Test(enabled = true)
	public void instInstDerivativeSpanMarginViewBc() {
		InstrumentInstrumentDerivativesBCPages derivativesBCPages= PageFactory.initElements(driver, InstrumentInstrumentDerivativesBCPages.class);
		derivativesBCPages.spanMarginView();
	}

	@Test(enabled = true)
	public void instInstDerivativeFuturePriceBc() {
		InstrumentInstrumentDerivativesBCPages derivativesBCPages= PageFactory.initElements(driver, InstrumentInstrumentDerivativesBCPages.class);
		derivativesBCPages.futurePrice();
	}

	@Test(enabled = true)
	public void instInstDerivativeOptionsPriceBc() {
		InstrumentInstrumentDerivativesBCPages derivativesBCPages= PageFactory.initElements(driver, InstrumentInstrumentDerivativesBCPages.class);
		derivativesBCPages.OptionsPrice();
	}

	@Test(enabled = true)
	public void instInstDerivativeOptionsScriptBc() {
		InstrumentInstrumentDerivativesBCPages derivativesBCPages= PageFactory.initElements(driver, InstrumentInstrumentDerivativesBCPages.class);
		derivativesBCPages.optionsScript();
	}

}
