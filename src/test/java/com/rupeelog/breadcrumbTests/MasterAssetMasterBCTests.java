package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.MasterAssetMasterBCPages;

public class MasterAssetMasterBCTests extends TestBase{
	
	@Test(enabled = true)
	public void masterAssetMAssetComboBc() { //
		MasterAssetMasterBCPages masterAssetMasterBSPages= PageFactory.initElements(driver, MasterAssetMasterBCPages.class);
		masterAssetMasterBSPages.assetCombo();
	}
	
	@Test(enabled = false)
	public void masterAssetMHouseRecommendationBc() {
		MasterAssetMasterBCPages masterAssetMasterBSPages= PageFactory.initElements(driver, MasterAssetMasterBCPages.class);
		masterAssetMasterBSPages.houseRecommendation();
	}
	
	@Test(enabled = false)
	public void masterAssetMInvestmentStrategyBc() {
		MasterAssetMasterBCPages masterAssetMasterBSPages= PageFactory.initElements(driver, MasterAssetMasterBCPages.class);
		masterAssetMasterBSPages.investmentStrategy();
	}
	
	@Test(enabled = false)
	public void masterAssetMInvestmentHorizonBc() {
		MasterAssetMasterBCPages masterAssetMasterBSPages= PageFactory.initElements(driver, MasterAssetMasterBCPages.class);
		masterAssetMasterBSPages.investmentHorizon();
	}
	
	@Test(enabled = false)
	public void masterAssetMMarketCapBc() {
		MasterAssetMasterBCPages masterAssetMasterBSPages= PageFactory.initElements(driver, MasterAssetMasterBCPages.class);
		masterAssetMasterBSPages.marketCap();
	}
	
	@Test(enabled = false)
	public void masterAssetMRiskBc() {
		MasterAssetMasterBCPages masterAssetMasterBSPages= PageFactory.initElements(driver, MasterAssetMasterBCPages.class);
		masterAssetMasterBSPages.risk();
	}
	
	@Test(enabled = false)
	public void masterAssetMRiskIPSMappingBc() {
		MasterAssetMasterBCPages masterAssetMasterBSPages= PageFactory.initElements(driver, MasterAssetMasterBCPages.class);
		masterAssetMasterBSPages.riskIPSMapping();
	}
}
