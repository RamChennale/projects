package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.InstrumentInstrumentEquityBCPages;

public class InstrumentInstrumentEquityBCTests extends TestBase {

	@Test(enabled = true)
	public void instInstEquityBuybackBc() {
		InstrumentInstrumentEquityBCPages equityBCPages = PageFactory.initElements(driver,
				InstrumentInstrumentEquityBCPages.class);
		equityBCPages.buyback();
	}

	@Test(enabled = true)
	public void instInstEquityCaBonusSplitBc() {
		InstrumentInstrumentEquityBCPages equityBCPages = PageFactory.initElements(driver,
				InstrumentInstrumentEquityBCPages.class);
		equityBCPages.caBonusSplit();
	}

	@Test(enabled = true)
	public void instInstEquityCADividendBc() {
		InstrumentInstrumentEquityBCPages equityBCPages = PageFactory.initElements(driver,
				InstrumentInstrumentEquityBCPages.class);
		equityBCPages.caDividend();
	}

	@Test(enabled = true)
	public void instInstEquityCAMergerDeMergerBc() {
		InstrumentInstrumentEquityBCPages equityBCPages = PageFactory.initElements(driver,
				InstrumentInstrumentEquityBCPages.class);
		equityBCPages.caMergerDeMerger();
	}

	@Test(enabled = true)
	public void instInstEquityClosingPricesBc() {
		InstrumentInstrumentEquityBCPages equityBCPages = PageFactory.initElements(driver,
				InstrumentInstrumentEquityBCPages.class);
		equityBCPages.closingPrices();
	}

	@Test(enabled = true)
	public void instInstEquityDelistingBc() {
		InstrumentInstrumentEquityBCPages equityBCPages = PageFactory.initElements(driver,
				InstrumentInstrumentEquityBCPages.class);
		equityBCPages.delisting();
	}

	@Test(enabled = true)
	public void instInstEquityIPOFPOBc() {
		InstrumentInstrumentEquityBCPages equityBCPages = PageFactory.initElements(driver,
				InstrumentInstrumentEquityBCPages.class);
		equityBCPages.IPOFPO();
	}

	@Test(enabled = true)
	public void instInstEquityOpenOfferBc() {
		InstrumentInstrumentEquityBCPages equityBCPages = PageFactory.initElements(driver,
				InstrumentInstrumentEquityBCPages.class);
		equityBCPages.openOffer();
	}

	@Test(enabled = true)
	public void instInstEquityRightsIssueBc() {
		InstrumentInstrumentEquityBCPages equityBCPages = PageFactory.initElements(driver,
				InstrumentInstrumentEquityBCPages.class);
		equityBCPages.rightsIssue();
	}

	@Test(enabled = true)
	public void instInstEquityScripBc() {
		InstrumentInstrumentEquityBCPages equityBCPages = PageFactory.initElements(driver,
				InstrumentInstrumentEquityBCPages.class);
		equityBCPages.scrip();
	}

}
