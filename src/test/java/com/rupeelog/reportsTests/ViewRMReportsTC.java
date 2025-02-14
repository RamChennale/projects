package com.rupeelog.reportsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.reportsPages.ViewRMReportsPage;

public class ViewRMReportsTC extends TestBase{

	@Test(enabled = true)
	public void reportsRepExeUpPortfolioHoldingTC() {
		ViewRMReportsPage rmReportsPage=PageFactory.initElements(driver, ViewRMReportsPage.class);
		rmReportsPage.viewRMReport();
	}
}
