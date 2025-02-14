package com.rupeelog.orgMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.orgMasterPages.CreateDesignationPage;

public class CreateDesignationTest extends TestBase{

	@Test(enabled = true)
	public void orgMasterCreateDesignationTest() {
		CreateDesignationPage designationPage=PageFactory.initElements(driver, CreateDesignationPage.class);
		designationPage.createDesignationPageTest();
	}
}
