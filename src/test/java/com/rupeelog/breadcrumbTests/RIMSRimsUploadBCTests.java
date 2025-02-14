package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.RIMSRimsUploadBCPages;

public class RIMSRimsUploadBCTests extends TestBase {

	@Test(enabled = true)
	public void RimsUploadProcess() {
		RIMSRimsUploadBCPages uploadBCPages=PageFactory.initElements(driver, RIMSRimsUploadBCPages.class);
		uploadBCPages.uploadProcess();
	}

}
