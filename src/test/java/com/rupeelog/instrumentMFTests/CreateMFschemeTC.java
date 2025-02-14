package com.rupeelog.instrumentMFTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentMFPages.CreateMFschemePage;

public class CreateMFschemeTC extends TestBase{

	@Test(enabled = true)
	public void instrumentMFCreateMFschemeTC() {
		CreateMFschemePage mFschemePage = PageFactory.initElements(driver, CreateMFschemePage.class);
		mFschemePage.createMutualFundScheme();
	}
}
