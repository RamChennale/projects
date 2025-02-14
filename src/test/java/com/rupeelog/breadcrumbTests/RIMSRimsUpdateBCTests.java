package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.RIMSRimsUpdateBCPages;

public class RIMSRimsUpdateBCTests extends TestBase {

	@Test(enabled = true)
	public void RimsUpdateFamilywiseSplitMasterBc() {
		RIMSRimsUpdateBCPages rimsUpdateBCPages=PageFactory.initElements(driver, RIMSRimsUpdateBCPages.class);
		rimsUpdateBCPages.familywiseSplitMaster();
	}

	@Test(enabled = true)
	public void RimsUpdateMFRateCardDeleteBc() {
		RIMSRimsUpdateBCPages rimsUpdateBCPages=PageFactory.initElements(driver, RIMSRimsUpdateBCPages.class);
		rimsUpdateBCPages.mfRateCardDelete();
	}
	
	@Test(enabled = true)
	public void RimsUpdateMiscCalnBc() {
		RIMSRimsUpdateBCPages rimsUpdateBCPages=PageFactory.initElements(driver, RIMSRimsUpdateBCPages.class);
		rimsUpdateBCPages.miscCaln();
	}
	
	@Test(enabled = true)
	public void RimsUpdateRIMSTxnDeleteBc() {
		RIMSRimsUpdateBCPages rimsUpdateBCPages=PageFactory.initElements(driver, RIMSRimsUpdateBCPages.class);
		rimsUpdateBCPages.rimsTxnDelete();
	}
	
	@Test(enabled = true)
	public void RimsUpdateRMWiseRevSplitBBc() {
		RIMSRimsUpdateBCPages rimsUpdateBCPages=PageFactory.initElements(driver, RIMSRimsUpdateBCPages.class);
		rimsUpdateBCPages.rmWiseRevSplitB();
	}
}
