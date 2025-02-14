package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.AdminDeleteReportSchedulerBCPages;

public class AdminDeleteReportSchedulerBCTests extends TestBase {

	@Test(enabled = true)
	public void adminDeleteReportSchedulerAssignResourceBc() {
		AdminDeleteReportSchedulerBCPages adminDeleteReportSchedulerBCPages = PageFactory.initElements(driver,
				AdminDeleteReportSchedulerBCPages.class);
		adminDeleteReportSchedulerBCPages.deleteReportScheduler();
	}

}
