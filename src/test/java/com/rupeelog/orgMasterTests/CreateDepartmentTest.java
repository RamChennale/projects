package com.rupeelog.orgMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.orgMasterPages.CreateDepartmentPage;

public class CreateDepartmentTest extends TestBase{

	@Test(enabled = true)
	public void orgMasterCreateDepartmentTest() {
		CreateDepartmentPage departmentPage=PageFactory.initElements(driver, CreateDepartmentPage.class);
		departmentPage.createDepartmentPageTest();
	}
}
