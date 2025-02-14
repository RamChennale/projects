package com.rupeelog.reportsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.reportsPages.CreateDailySalesReportPage;

public class CreateDailySalesReportTC extends TestBase{

	@Test(enabled = true)
	public void reportsCreateDailySalesReportTC() {
		CreateDailySalesReportPage dailySalesReportPage=PageFactory.initElements(driver, CreateDailySalesReportPage.class);
		dailySalesReportPage.dailySalesReport();
	}
}
