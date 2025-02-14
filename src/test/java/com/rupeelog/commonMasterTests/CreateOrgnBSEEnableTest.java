package com.rupeelog.commonMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.commonMasterPages.CreateOrgnBSEEnablePage;

public class CreateOrgnBSEEnableTest extends TestBase{

	@Test(enabled = true)
	public void commonMasterCreateOrgnBSEEnableTest() {
		CreateOrgnBSEEnablePage orgnBSEEnablePage = PageFactory.initElements(driver, CreateOrgnBSEEnablePage.class);
		orgnBSEEnablePage.createOrgnBSEEnableTestPage();
	}
}
