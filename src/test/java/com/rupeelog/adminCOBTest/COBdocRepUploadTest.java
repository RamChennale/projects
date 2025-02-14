package com.rupeelog.adminCOBTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminCOBPages.COBdocRepUploadPage;
import com.rupeelog.base.TestBase;

public class COBdocRepUploadTest extends TestBase {

	@Test(enabled = true)
	public void cobDocRepUploadTest() {
		COBdocRepUploadPage docRepUploadPage = PageFactory.initElements(driver, COBdocRepUploadPage.class);
		docRepUploadPage.cobDocRepUploadTest();
	}
}
 