package com.rupeelog.mutualFundTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.mutualFundPages.CreateMFClassificationPage;

public class CreateMFClassificationTest extends TestBase{

	@Test(enabled = true)
	public void mfCreateMFClassificationTest() {
		CreateMFClassificationPage mfClassificationPage=PageFactory.initElements(driver, CreateMFClassificationPage.class);
		mfClassificationPage.CreateMFClassificationPageTest();
	}
}
