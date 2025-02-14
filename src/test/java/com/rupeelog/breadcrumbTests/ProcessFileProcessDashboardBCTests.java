package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessFileProcessDashboardBCPages;

public class ProcessFileProcessDashboardBCTests extends TestBase {

	@Test(enabled = true)
	public void processFileProFileProcessDashBoardBc() {
		ProcessFileProcessDashboardBCPages fileProcessDashboardBCPages=PageFactory.initElements(driver, ProcessFileProcessDashboardBCPages.class);
		fileProcessDashboardBCPages.fileProcessDashBoard();
	}

	@Test(enabled = true)
	public void processFileProProcessedFileDownloadBc() {
		ProcessFileProcessDashboardBCPages fileProcessDashboardBCPages=PageFactory.initElements(driver, ProcessFileProcessDashboardBCPages.class);
		fileProcessDashboardBCPages.processedFileDownload();
	}
	
	@Test(enabled = true)
	public void processFileProRunFileProcessBc() {
		ProcessFileProcessDashboardBCPages fileProcessDashboardBCPages=PageFactory.initElements(driver, ProcessFileProcessDashboardBCPages.class);
		fileProcessDashboardBCPages.runFileProcess();
	}

}
