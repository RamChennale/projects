package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessUploadProcessBCPages;

public class ProcessUploadProcessBCTest extends TestBase {

	@Test(enabled = true)
	public void processUploadGeneralUploadBc() {
		ProcessUploadProcessBCPages uploadProcessBCPages=PageFactory.initElements(driver, ProcessUploadProcessBCPages.class);
		uploadProcessBCPages.generalUpload();
	}
	
	@Test(enabled = false)//link is broken
	public void processUploadPullfromViewBc() {
		ProcessUploadProcessBCPages uploadProcessBCPages=PageFactory.initElements(driver, ProcessUploadProcessBCPages.class);
		uploadProcessBCPages.pullfromView();
	}
	@Test(enabled = true)
	public void processUploadRevalidateBc() {
		ProcessUploadProcessBCPages uploadProcessBCPages=PageFactory.initElements(driver, ProcessUploadProcessBCPages.class);
		uploadProcessBCPages.revalidate();
	}
	
	@Test(enabled = true)
	public void processUploadSpecificUploadBc() {
		ProcessUploadProcessBCPages uploadProcessBCPages=PageFactory.initElements(driver, ProcessUploadProcessBCPages.class);
		uploadProcessBCPages.specificUpload();
	}

}
