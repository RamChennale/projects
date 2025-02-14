package com.rupeelog.adminCOBTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminCOBPages.COBdocUploadPage;
import com.rupeelog.base.TestBase;

public class COBCreateFamilyCommentTest extends TestBase {

	@Test(enabled = true)
	public void cobDocUploadTest() {
		COBdocUploadPage docUploadPage = PageFactory.initElements(driver, COBdocUploadPage.class);
		docUploadPage.cobDocUploadPageTest();

	}
}
 