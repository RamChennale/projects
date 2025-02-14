package com.rupeelog.fpAdminTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.fpAdminPages.AddInstGrowthEstimatePage;

public class AddInstGrowthEstimateTC extends TestBase {

	@Test(enabled = true)
	public void fpAdminAddInstGrowthEstimateTC() {
		AddInstGrowthEstimatePage instGrowthEstimatePage= PageFactory.initElements(driver, AddInstGrowthEstimatePage.class);
		instGrowthEstimatePage.addInstGrowthEstimate();
	}
}
