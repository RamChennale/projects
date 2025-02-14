package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessEODDashboardBCPages;

public class ProcessEODDashboardBCTests extends TestBase {

	@Test(enabled = true)
	public void ProcessEODEODProcessDashboardBc() {
		ProcessEODDashboardBCPages eodDashboardBCPages = PageFactory.initElements(driver,
				ProcessEODDashboardBCPages.class);
		eodDashboardBCPages.eodProcessDashboard();
	}

	@Test(enabled = true)
	public void ProcessEODProcessDashboardBc() {
		ProcessEODDashboardBCPages eodDashboardBCPages = PageFactory.initElements(driver,
				ProcessEODDashboardBCPages.class);
		eodDashboardBCPages.processDashboard();
	}

	@Test(enabled = true)
	public void ProcessEODRunEodProcessBc() {
		ProcessEODDashboardBCPages eodDashboardBCPages = PageFactory.initElements(driver,
				ProcessEODDashboardBCPages.class);
		eodDashboardBCPages.runEodProcess();
	}

}
