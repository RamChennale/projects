package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.AdminAccessControlBCPages;

public class AdminAccessControlBCTests extends TestBase{
	
	@Test
	public void adminAccessControlAssignResourceBc() {
		AdminAccessControlBCPages adminAccessControlBCPages= PageFactory.initElements(driver, AdminAccessControlBCPages.class);
		adminAccessControlBCPages.assignResource();
	}
	
	@Test
	public void adminAccessControlChangeEmployeePwdBc() {
		AdminAccessControlBCPages adminAccessControlBCPages= PageFactory.initElements(driver, AdminAccessControlBCPages.class);
		adminAccessControlBCPages.changeEmployeePassword();
	}
	
	@Test
	public void adminAccessControlChangePwdBc() {
		AdminAccessControlBCPages adminAccessControlBCPages= PageFactory.initElements(driver, AdminAccessControlBCPages.class);
		adminAccessControlBCPages.changePassword();
	}
	
	@Test
	public void adminAccessControlChangPwdKyphBc() {
		AdminAccessControlBCPages adminAccessControlBCPages= PageFactory.initElements(driver, AdminAccessControlBCPages.class);
		adminAccessControlBCPages.changPasswordKyph();
	}
	
	@Test
	public void adminAccessControlRoleBc() {
		AdminAccessControlBCPages adminAccessControlBCPages= PageFactory.initElements(driver, AdminAccessControlBCPages.class);
		adminAccessControlBCPages.role();
	}
	
	@Test
	public void adminAccessControlUserRoleAccessBc() {
		AdminAccessControlBCPages adminAccessControlBCPages= PageFactory.initElements(driver, AdminAccessControlBCPages.class);
		adminAccessControlBCPages.userRoleAccess();
	}
	
}
