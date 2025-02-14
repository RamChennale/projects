package com.rupeelog.adminOrgTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminOrgPages.CreateEmpPage;
import com.rupeelog.base.TestBase;

public class CreateEmpTest extends TestBase{

	@Test(enabled = true)
	public void adminOrgCreateEmpPage() {
		CreateEmpPage empPage= PageFactory.initElements(driver, CreateEmpPage.class);
		empPage.createEmp();
	}
}
