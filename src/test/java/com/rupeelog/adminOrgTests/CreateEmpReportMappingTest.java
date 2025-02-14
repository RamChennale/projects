package com.rupeelog.adminOrgTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminOrgPages.CreateEmpReportMappingPage;
import com.rupeelog.base.TestBase;

public class CreateEmpReportMappingTest extends TestBase{

	@Test(enabled = true)
	public void adminOrgCreateEmpReportMappingTest() {
		CreateEmpReportMappingPage reportMappingPage= PageFactory.initElements(driver, CreateEmpReportMappingPage.class);
		reportMappingPage.createEmpReportMapping();
	}
}
