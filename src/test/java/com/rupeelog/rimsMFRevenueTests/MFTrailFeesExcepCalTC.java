package com.rupeelog.rimsMFRevenueTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsMFRevenuePages.MFTrailFeesExcepCalPage;

public class MFTrailFeesExcepCalTC extends TestBase{

	@Test(enabled = true)
	public void rimsMFRevenueMFTrailFeesExcepCalTC() {
		MFTrailFeesExcepCalPage mfTrailFeesExcepCalPage=PageFactory.initElements(driver, MFTrailFeesExcepCalPage.class);
		mfTrailFeesExcepCalPage.mfTrailFeesExcepCal();
	}
}
