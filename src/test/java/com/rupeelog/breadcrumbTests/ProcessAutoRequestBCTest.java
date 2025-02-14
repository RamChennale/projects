package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.ProcessAutoRequestBCPages;

public class ProcessAutoRequestBCTest extends TestBase {

	@Test(enabled = true)
	public void processAutoRequestBc() {
		ProcessAutoRequestBCPages autoRequestBCPages=PageFactory.initElements(driver, ProcessAutoRequestBCPages.class);
		autoRequestBCPages.autoRequest();
	}

}
