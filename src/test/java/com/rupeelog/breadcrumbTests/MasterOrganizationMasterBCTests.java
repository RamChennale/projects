package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.MasterOrganizationMasterBCPages;

public class MasterOrganizationMasterBCTests extends TestBase {

	@Test(enabled = true)
	public void masterOrgMBranchBc() {
		MasterOrganizationMasterBCPages masterOrganizationMasterBCPages = PageFactory.initElements(driver,
				MasterOrganizationMasterBCPages.class);
		masterOrganizationMasterBCPages.branch();
	}

	@Test(enabled = true)
	public void masterOrgMBranchCategoryBc() {
		MasterOrganizationMasterBCPages masterOrganizationMasterBCPages = PageFactory.initElements(driver,
				MasterOrganizationMasterBCPages.class);
		masterOrganizationMasterBCPages.branchCategory();
	}

	@Test(enabled = true)
	public void masterOrgMClusterBc() {
		MasterOrganizationMasterBCPages masterOrganizationMasterBCPages = PageFactory.initElements(driver,
				MasterOrganizationMasterBCPages.class);
		masterOrganizationMasterBCPages.cluster();
	}

	@Test(enabled = true)
	public void masterOrgMCounterPartyBc() {
		MasterOrganizationMasterBCPages masterOrganizationMasterBCPages = PageFactory.initElements(driver,
				MasterOrganizationMasterBCPages.class);
		masterOrganizationMasterBCPages.counterParty();
	}

	@Test(enabled = true)
	public void masterOrgMDepartmentBc() {
		MasterOrganizationMasterBCPages masterOrganizationMasterBCPages = PageFactory.initElements(driver,
				MasterOrganizationMasterBCPages.class);
		masterOrganizationMasterBCPages.department();
	}

	@Test(enabled = true)
	public void masterOrgMDesignationBc() {
		MasterOrganizationMasterBCPages masterOrganizationMasterBCPages = PageFactory.initElements(driver,
				MasterOrganizationMasterBCPages.class);
		masterOrganizationMasterBCPages.designation();
	}

	@Test(enabled = true)
	public void masterOrgMEmployeeCertificateBc() {
		MasterOrganizationMasterBCPages masterOrganizationMasterBCPages = PageFactory.initElements(driver,
				MasterOrganizationMasterBCPages.class);
		masterOrganizationMasterBCPages.employeeCertificate();
	}

	@Test(enabled = true)
	public void masterOrgMOrganizationBc() {
		MasterOrganizationMasterBCPages masterOrganizationMasterBCPages = PageFactory.initElements(driver,
				MasterOrganizationMasterBCPages.class);
		masterOrganizationMasterBCPages.organization();
	}

	@Test(enabled = true)
	public void masterOrgMRegionBc() {
		MasterOrganizationMasterBCPages masterOrganizationMasterBCPages = PageFactory.initElements(driver,
				MasterOrganizationMasterBCPages.class);
		masterOrganizationMasterBCPages.region();
	}

	@Test(enabled = true)
	public void masterOrgMZoneBc() {
		MasterOrganizationMasterBCPages masterOrganizationMasterBCPages = PageFactory.initElements(driver,
				MasterOrganizationMasterBCPages.class);
		masterOrganizationMasterBCPages.zone();
	}

}
