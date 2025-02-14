package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.RIMSRimsMiscBCPages;

public class RIMSRimsMiscBCTests extends TestBase {

	@Test(enabled = true)
	public void RimsMiscExpenseSalaryUploadBc() {
		RIMSRimsMiscBCPages rimsMiscBCPages=PageFactory.initElements(driver, RIMSRimsMiscBCPages.class);
		rimsMiscBCPages.expenseSalaryUpload();
	}

	@Test(enabled = true)
	public void RimsMiscInternationalAUMBc() {
		RIMSRimsMiscBCPages rimsMiscBCPages=PageFactory.initElements(driver, RIMSRimsMiscBCPages.class);
		rimsMiscBCPages.internationalAUM();
	}
	
	@Test(enabled = true)
	public void RimsMiscKRABasedTargetBc() {
		RIMSRimsMiscBCPages rimsMiscBCPages=PageFactory.initElements(driver, RIMSRimsMiscBCPages.class);
		rimsMiscBCPages.KRABasedTarget();
	}
	
	@Test(enabled = true)
	public void RimsMiscServiceRMRMLinkageBc() {
		RIMSRimsMiscBCPages rimsMiscBCPages=PageFactory.initElements(driver, RIMSRimsMiscBCPages.class);
		rimsMiscBCPages.serviceRMRMLinkage();
	}
}
