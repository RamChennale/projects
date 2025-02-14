package com.rupeelog.adminCOBTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminCOBPages.COBdocVerifyPage;
import com.rupeelog.base.TestBase;

public class COBdocVerifyTest extends TestBase {

	@Test(enabled = true)
	public void cobDocUploadTest() {
		COBdocVerifyPage docVerifyPage = PageFactory.initElements(driver, COBdocVerifyPage.class);
		docVerifyPage.cobDocVerifyPageTest();

	}
}
 