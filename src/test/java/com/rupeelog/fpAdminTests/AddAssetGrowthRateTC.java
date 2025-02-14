package com.rupeelog.fpAdminTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.fpAdminPages.AddAssetGrowthRatePage;

public class AddAssetGrowthRateTC extends TestBase {

	@Test(enabled = true)
	public void fpAdminAddAssetGrowthRateTC() {
		AddAssetGrowthRatePage assetGrowthRatePage= PageFactory.initElements(driver, AddAssetGrowthRatePage.class);
		assetGrowthRatePage.addAssetGrowthRate();
	}
}
