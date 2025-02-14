package com.rupeelog.orgMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.orgMasterPages.CreateOrgPage;

public class CreateOrgTest extends TestBase{

	@Test
	public void orgMasterCreateOrgTest() {
		CreateOrgPage orgPage=PageFactory.initElements(driver, CreateOrgPage.class);
		orgPage.createOrgPageTest();
	}
}
