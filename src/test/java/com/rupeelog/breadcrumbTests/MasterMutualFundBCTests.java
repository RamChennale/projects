package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.MasterMutualFundBCPages;

public class MasterMutualFundBCTests extends TestBase{
	
	@Test(enabled = true)
	public void masterMFAssetManagementCompanyBc() {
		MasterMutualFundBCPages masterMutualFundBCPages= PageFactory.initElements(driver, MasterMutualFundBCPages.class);
		masterMutualFundBCPages.assetManagementCompany();
	}
	
	@Test(enabled = true)
	public void masterMFMFClassificationBc() {
		MasterMutualFundBCPages masterMutualFundBCPages= PageFactory.initElements(driver, MasterMutualFundBCPages.class);
		masterMutualFundBCPages.mfClassification();
	}
	
	@Test(enabled = true)
	public void masterMFMFFundManagerBc() {
		MasterMutualFundBCPages masterMutualFundBCPages= PageFactory.initElements(driver, MasterMutualFundBCPages.class);
		masterMutualFundBCPages.mfFundManager();
	}
	
	@Test(enabled = true)
	public void masterMFRegistrarRTABc() {
		MasterMutualFundBCPages masterMutualFundBCPages= PageFactory.initElements(driver, MasterMutualFundBCPages.class);
		masterMutualFundBCPages.registrarRTA();
	}
	
	@Test(enabled = true)
	public void masterMFRTATxnTypeMappingBc() {
		MasterMutualFundBCPages masterMutualFundBCPages= PageFactory.initElements(driver, MasterMutualFundBCPages.class);
		masterMutualFundBCPages.rtaTxnTypeMapping();
	}
	
}
