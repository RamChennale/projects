package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ReportsBCPages;

public class ReportsBCTests extends TestBase{

	@Test(enabled = true)
	public void reportsAdhocReportsBc() {
		ReportsBCPages reportsBCPages=PageFactory.initElements(driver, ReportsBCPages.class);
		reportsBCPages.adhocReports();
	}
	
	@Test(enabled = true)
	public void reportsBulkSMSBc() {
		ReportsBCPages reportsBCPages=PageFactory.initElements(driver, ReportsBCPages.class);
		reportsBCPages.bulkSMS();
	}
	
	@Test(enabled = true)
	public void reportsChartAnalyticsBc() { //
		ReportsBCPages reportsBCPages=PageFactory.initElements(driver, ReportsBCPages.class);
		reportsBCPages.chartAnalytics();
	}
	
	@Test(enabled = true)
	public void reportsDailySalesReportsBc() {
		ReportsBCPages reportsBCPages=PageFactory.initElements(driver, ReportsBCPages.class);
		reportsBCPages.dailySalesReports();
	}
	
	@Test(enabled = true)
	public void reportsDebitCreditNoteBc() {
		ReportsBCPages reportsBCPages=PageFactory.initElements(driver, ReportsBCPages.class);
		reportsBCPages.debitCreditNote();
	}
	
	@Test(enabled = true)
	public void reportsKyphEmailBc() {
		ReportsBCPages reportsBCPages=PageFactory.initElements(driver, ReportsBCPages.class);
		reportsBCPages.kyphEmail();
	}
	
	@Test(enabled = true)
	public void reportsLargeReportExecuteBc() {
		ReportsBCPages reportsBCPages=PageFactory.initElements(driver, ReportsBCPages.class);
		reportsBCPages.largeReportExecute();
	}
	
	@Test(enabled = true)
	public void reportsMultiReportDownloadEmailBc() {
		ReportsBCPages reportsBCPages=PageFactory.initElements(driver, ReportsBCPages.class);
		reportsBCPages.multiReportDownloadEmail();
	}
	
	@Test(enabled = false)//link broken
	public void reportsMultiReportGenerationBc() {
		ReportsBCPages reportsBCPages=PageFactory.initElements(driver, ReportsBCPages.class);
		reportsBCPages.multiReportGeneration();
	}
	
	@Test(enabled = true)
	public void reportsMushNotificationBc() {
		ReportsBCPages reportsBCPages=PageFactory.initElements(driver, ReportsBCPages.class);
		reportsBCPages.pushNotification();
	}
	
	@Test(enabled = true)
	public void reportsReportingServerBc() {
		ReportsBCPages reportsBCPages=PageFactory.initElements(driver, ReportsBCPages.class);
		reportsBCPages.reportingServer();
	}
	
	@Test(enabled = true)
	public void reportsRMReportsBc() {
		ReportsBCPages reportsBCPages=PageFactory.initElements(driver, ReportsBCPages.class);
		reportsBCPages.rmReports();
	}
	
	@Test(enabled = true)
	public void reportsTxnSearchBc() {
		ReportsBCPages reportsBCPages=PageFactory.initElements(driver, ReportsBCPages.class);
		reportsBCPages.txnSearch();
	}
	
}
