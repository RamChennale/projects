package com.rupeelog.rimsMFRevenueTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsMFRevenuePages.MFTrailFeesCalPage;

public class MFTrailFeesCalTC extends TestBase{

	@Test(enabled = true)
	public void rimsMFRevenueMFTrailFeesCalTC() {
		MFTrailFeesCalPage mfTrailFeesCalPage=PageFactory.initElements(driver, MFTrailFeesCalPage.class);
		mfTrailFeesCalPage.mfTrailFeesCalculation();
	}
}
