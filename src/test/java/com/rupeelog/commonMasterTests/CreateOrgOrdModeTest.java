package com.rupeelog.commonMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.commonMasterPages.CreateOrgOrdModePage;

public class CreateOrgOrdModeTest extends TestBase{

	@Test(enabled = true)
	public void commonMasterCreateOrgOrdModeTest() {
		CreateOrgOrdModePage orgOrdModePage = PageFactory.initElements(driver, CreateOrgOrdModePage.class);
		orgOrdModePage.CreateOrgOrdModeTestPage();
	}
}
