package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.OperationsUploadsBCPages;

public class OperationsUploadsBCTests extends TestBase {

	@Test(enabled = true)
	public void opUploadsDocumentDownloadBc() {
		OperationsUploadsBCPages operationsUploadsBCPages=PageFactory.initElements(driver, OperationsUploadsBCPages.class);
		operationsUploadsBCPages.documentDownload();
	}
	
	@Test(enabled = true)
	public void opUploadsDocumentUploadBc() {
		OperationsUploadsBCPages operationsUploadsBCPages=PageFactory.initElements(driver, OperationsUploadsBCPages.class);
		operationsUploadsBCPages.documentUpload();
	}
	
}
