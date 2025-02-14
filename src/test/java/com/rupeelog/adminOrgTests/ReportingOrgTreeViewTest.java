package com.rupeelog.adminOrgTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminOrgPages.ReportingOrgTreeViewPage;
import com.rupeelog.base.TestBase;

public class ReportingOrgTreeViewTest extends TestBase{

	@Test(enabled = true)
	public void adminOrgReportingOrgTreeViewTest() {
		ReportingOrgTreeViewPage treeViewPage= PageFactory.initElements(driver, ReportingOrgTreeViewPage.class);
		treeViewPage.reportingOrgTreeView();
	}
}
