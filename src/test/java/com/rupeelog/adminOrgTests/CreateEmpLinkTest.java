package com.rupeelog.adminOrgTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminOrgPages.CreateEmpLinkPage;
import com.rupeelog.base.TestBase;

public class CreateEmpLinkTest extends TestBase{

	@Test(enabled = true)
	public void adminOrgCreateEmpReportMappingTest() {
		CreateEmpLinkPage empLinkPage= PageFactory.initElements(driver, CreateEmpLinkPage.class);
		empLinkPage.createEmpLink();
	}
}
