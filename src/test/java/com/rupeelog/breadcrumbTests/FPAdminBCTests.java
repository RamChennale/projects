package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.FPAdminBCPages;

public class FPAdminBCTests extends TestBase {

	@Test(enabled = true)
	public void fpAdminAssetSubClassGrowthEstimateBc() {
		FPAdminBCPages fpAdminBCPages=PageFactory.initElements(driver, FPAdminBCPages.class);
		fpAdminBCPages.assetSubClassGrowthEstimate();
	}

	@Test(enabled = true)
	public void fpAdminFPSystemParamBc() {
		FPAdminBCPages fpAdminBCPages=PageFactory.initElements(driver, FPAdminBCPages.class);
		fpAdminBCPages.fpSystemParam();
	}
	
	@Test(enabled = true)
	public void fpAdminHouseRecoAssetSubclassBc() {
		FPAdminBCPages fpAdminBCPages=PageFactory.initElements(driver, FPAdminBCPages.class);
		fpAdminBCPages.houseRecoAssetSubclass();
	}
	
	@Test(enabled = true)
	public void fpAdminInstrumentGrowthEstimateBc() {
		FPAdminBCPages fpAdminBCPages=PageFactory.initElements(driver, FPAdminBCPages.class);
		fpAdminBCPages.instrumentGrowthEstimate();
	}
	
	@Test(enabled = true)
	public void fpAdminInsurancePolicyBc() {
		FPAdminBCPages fpAdminBCPages=PageFactory.initElements(driver, FPAdminBCPages.class);
		fpAdminBCPages.insurancePolicy();
	}
	
	@Test(enabled = true)
	public void fpAdminInsuranceProviderBc() {
		FPAdminBCPages fpAdminBCPages=PageFactory.initElements(driver, FPAdminBCPages.class);
		fpAdminBCPages.insuranceProvider();
	}
	
	@Test(enabled = true)
	public void fpAdminModelPortfolioFPBc() {
		FPAdminBCPages fpAdminBCPages=PageFactory.initElements(driver, FPAdminBCPages.class);
		fpAdminBCPages.modelPortfolioFP();
	}
}
