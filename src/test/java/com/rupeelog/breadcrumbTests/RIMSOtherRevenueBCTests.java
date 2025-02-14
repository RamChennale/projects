package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.RIMSOtherRevenueBCPages;

public class RIMSOtherRevenueBCTests extends TestBase {

	@Test(enabled = true)
	public void RIMSOtherRevBrokerageBc() {
		RIMSOtherRevenueBCPages otherRevenueBCPages=PageFactory.initElements(driver, RIMSOtherRevenueBCPages.class);
		otherRevenueBCPages.brokerage();
	}

	@Test(enabled = true)
	public void RIMSOtherRevBrokerageValidateBc() {
		RIMSOtherRevenueBCPages otherRevenueBCPages=PageFactory.initElements(driver, RIMSOtherRevenueBCPages.class);
		otherRevenueBCPages.brokerageValidate();
	}
	
	@Test(enabled = true)
	public void RIMSOtherRevRevenueMiscUploadBc() {
		RIMSOtherRevenueBCPages otherRevenueBCPages=PageFactory.initElements(driver, RIMSOtherRevenueBCPages.class);
		otherRevenueBCPages.revenueMiscUpload();
	}
}
