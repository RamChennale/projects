package com.rupeelog.mutualFundTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.mutualFundPages.CreateRTAtxnTypeMappingPage;

public class CreateRTAtxnTypeMappingTest extends TestBase{

	@Test(enabled = true)
	public void mutualFundCreateMFFundMgrTest() {
		CreateRTAtxnTypeMappingPage rtAtxnTypeMappingPage= PageFactory.initElements(driver, CreateRTAtxnTypeMappingPage.class);
		rtAtxnTypeMappingPage.CreateRTAtxnTypeMappingPageTest();
	}
}
