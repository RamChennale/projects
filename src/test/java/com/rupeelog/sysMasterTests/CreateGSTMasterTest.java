package com.rupeelog.sysMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.sysMasterPages.CreateGSTMasterPage;

public class CreateGSTMasterTest extends TestBase{

	@Test(enabled = true)
	public void sysMasterCreateGSTMasterTest() {
		CreateGSTMasterPage gstMasterPage=PageFactory.initElements(driver, CreateGSTMasterPage.class);
		gstMasterPage.createGSTMasterPageTest();
	}
}
