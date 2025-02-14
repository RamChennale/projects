package com.rupeelog.mutualFundTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.mutualFundPages.CreateMFFundMgrPage;

public class CreateMFFundMgrTest extends TestBase{

	@Test(enabled = true)
	public void mutualFundCreateMFFundMgrTest() {
		CreateMFFundMgrPage mfFundMgrPage= PageFactory.initElements(driver, CreateMFFundMgrPage.class);
		mfFundMgrPage.CreateMFClassificationPageTest();
	}
}
