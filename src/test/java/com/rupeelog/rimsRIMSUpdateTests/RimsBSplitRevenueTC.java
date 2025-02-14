package com.rupeelog.rimsRIMSUpdateTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsRIMSUpdatePages.RimsBSplitRevenuePage;

public class RimsBSplitRevenueTC extends TestBase{

	@Test(enabled = true)
	public void rimsRIMSUpdateRimsBSplitRevenueTC() {
		RimsBSplitRevenuePage rimsBSplitRevenuePage=PageFactory.initElements(driver, RimsBSplitRevenuePage.class);
		rimsBSplitRevenuePage.processRimsBSplitRevenue(); 
	}
}
