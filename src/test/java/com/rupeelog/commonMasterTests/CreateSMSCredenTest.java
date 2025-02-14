package com.rupeelog.commonMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.commonMasterPages.CreateSMSCredenPage;

public class CreateSMSCredenTest extends TestBase {

	@Test(enabled = true)
	public void commonMasterCreateSMSCredenTest() {
		CreateSMSCredenPage smsCredenPage = PageFactory.initElements(driver, CreateSMSCredenPage.class);
		smsCredenPage.createNewSMSCreden();
	}
}
