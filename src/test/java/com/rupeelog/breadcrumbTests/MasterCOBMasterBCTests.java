package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.MasterCOBMasterBCPages;

public class MasterCOBMasterBCTests extends TestBase{
	
	@Test(enabled = true)
	public void masterCOBMLegalStatusBc() {
		MasterCOBMasterBCPages masterCOBMasterBCPages= PageFactory.initElements(driver, MasterCOBMasterBCPages.class);
		masterCOBMasterBCPages.legalStatus();
	}
	
	@Test(enabled = true)
	public void masterCOBMOccupationBc() {
		MasterCOBMasterBCPages masterCOBMasterBCPages= PageFactory.initElements(driver, MasterCOBMasterBCPages.class);
		masterCOBMasterBCPages.occupation();
	}
	
	@Test(enabled = true)
	public void masterCOBMResidentialStatusBc() {
		MasterCOBMasterBCPages masterCOBMasterBCPages= PageFactory.initElements(driver, MasterCOBMasterBCPages.class);
		masterCOBMasterBCPages.residentialStatus();
	}
	
}
