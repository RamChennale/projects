package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.AdminOrganizationBCPages;

public class AdminOrganizationBCTests extends TestBase{
	
	@Test(enabled = true)
	public void adminOrganizationEmployeeBc() {
		AdminOrganizationBCPages adminOrganizationBCPages=PageFactory.initElements(driver, AdminOrganizationBCPages.class);
		adminOrganizationBCPages.employee();
	}
	
	@Test(enabled = true)
	public void adminOrganizationEmployeeReportingMappingBc() {
		AdminOrganizationBCPages adminOrganizationBCPages=PageFactory.initElements(driver, AdminOrganizationBCPages.class);
		adminOrganizationBCPages.employeeReportingMapping();
	}
	
	@Test(enabled = true)
	public void adminOrganizationLinkedEmployeeBc() {
		AdminOrganizationBCPages adminOrganizationBCPages=PageFactory.initElements(driver, AdminOrganizationBCPages.class);
		adminOrganizationBCPages.linkedEmployee();
	}
	
	@Test(enabled = true)
	public void adminOrganizationReportingOrganizationTreeBc() {
		AdminOrganizationBCPages adminOrganizationBCPages=PageFactory.initElements(driver, AdminOrganizationBCPages.class);
		adminOrganizationBCPages.reportingOrganizationTree();
	}
	
}
