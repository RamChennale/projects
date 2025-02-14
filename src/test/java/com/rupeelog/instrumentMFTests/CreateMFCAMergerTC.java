package com.rupeelog.instrumentMFTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentMFPages.CreateMFCAMergerPage;

public class CreateMFCAMergerTC extends TestBase{

	@Test(enabled = true)
	public void instrumentMFCreateCAMergerTC() {
		CreateMFCAMergerPage mfcaMergerPage = PageFactory.initElements(driver, CreateMFCAMergerPage.class);
		mfcaMergerPage.createMFCAMerger();
	}
}
