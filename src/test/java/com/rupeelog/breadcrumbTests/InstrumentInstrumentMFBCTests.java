package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.InstrumentInstrumentMFBCPages;

public class InstrumentInstrumentMFBCTests extends TestBase{
	
	@Test(enabled = true)
	public void instInstMFCAMergerBc() {
		InstrumentInstrumentMFBCPages mfbcPages= PageFactory.initElements(driver, InstrumentInstrumentMFBCPages.class);
		mfbcPages.caMerger();
	}
	
	@Test(enabled = true)
	public void instInstMFMutualFundNAVsBc() {
		InstrumentInstrumentMFBCPages mfbcPages= PageFactory.initElements(driver, InstrumentInstrumentMFBCPages.class);
		mfbcPages.mutualFundNAVs();
	}
	
	@Test(enabled = true)
	public void instInstMFMutualFundNFOBc() {
		InstrumentInstrumentMFBCPages mfbcPages= PageFactory.initElements(driver, InstrumentInstrumentMFBCPages.class);
		mfbcPages.mutualFundNFO();
	}

	@Test(enabled = true)
	public void instInstMFMutualFundSchemeBc() {
		InstrumentInstrumentMFBCPages mfbcPages= PageFactory.initElements(driver, InstrumentInstrumentMFBCPages.class);
		mfbcPages.mutualFundScheme();
	}

}
