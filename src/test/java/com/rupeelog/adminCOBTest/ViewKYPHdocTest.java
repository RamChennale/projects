package com.rupeelog.adminCOBTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminCOBPages.ViewKYPHdocPage;
import com.rupeelog.base.TestBase;

public class ViewKYPHdocTest extends TestBase{

	@Test(enabled = true)
	public void cobViewKYPHdocTest() {
		ViewKYPHdocPage viewKYPHdocPage = PageFactory.initElements(driver, ViewKYPHdocPage.class);
		viewKYPHdocPage.cobViewKYPHdocPageTest();

	}
}
