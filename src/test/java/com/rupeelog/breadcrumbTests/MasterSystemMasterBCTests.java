package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.MasterSystemMasterBCPages;

public class MasterSystemMasterBCTests extends TestBase {

	@Test(enabled = true)
	public void masterSysMARNBc() {
		MasterSystemMasterBCPages masterSystemMasterBCPages = PageFactory.initElements(driver,
				MasterSystemMasterBCPages.class);
		masterSystemMasterBCPages.arn();
	}

	@Test(enabled = true)
	public void masterSysMAutoJobLogBc() {
		MasterSystemMasterBCPages masterSystemMasterBCPages = PageFactory.initElements(driver,
				MasterSystemMasterBCPages.class);
		masterSystemMasterBCPages.autoJobLog();
	}

	@Test(enabled = true)
	public void masterSysMAutoJobSetUpBc() {
		MasterSystemMasterBCPages masterSystemMasterBCPages = PageFactory.initElements(driver,
				MasterSystemMasterBCPages.class);
		masterSystemMasterBCPages.autoJobSetUp();
	}

	@Test(enabled = true)
	public void masterSysMCityBc() {
		MasterSystemMasterBCPages masterSystemMasterBCPages = PageFactory.initElements(driver,
				MasterSystemMasterBCPages.class);
		masterSystemMasterBCPages.city();
	}

	@Test(enabled = true)
	public void masterSysMCountryBc() {
		MasterSystemMasterBCPages masterSystemMasterBCPages = PageFactory.initElements(driver,
				MasterSystemMasterBCPages.class);
		masterSystemMasterBCPages.country();
	}

	@Test(enabled = true)
	public void masterSysMGLAccountMappingBc() {
		MasterSystemMasterBCPages masterSystemMasterBCPages = PageFactory.initElements(driver,
				MasterSystemMasterBCPages.class);
		masterSystemMasterBCPages.glAccountMapping();
	}

	@Test(enabled = true)
	public void masterSysMGSTMasterBc() {
		MasterSystemMasterBCPages masterSystemMasterBCPages = PageFactory.initElements(driver,
				MasterSystemMasterBCPages.class);
		masterSystemMasterBCPages.gstMaster();
	}

	@Test(enabled = true)
	public void masterSysMstateBc() {
		MasterSystemMasterBCPages masterSystemMasterBCPages = PageFactory.initElements(driver,
				MasterSystemMasterBCPages.class);
		masterSystemMasterBCPages.state();
	}

	@Test(enabled = true)
	public void masterSysMtaxTypeRateBc() {
		MasterSystemMasterBCPages masterSystemMasterBCPages = PageFactory.initElements(driver,
				MasterSystemMasterBCPages.class);
		masterSystemMasterBCPages.taxTypeRate();
	}

}
