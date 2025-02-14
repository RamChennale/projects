package com.rupeelog.rimsMFRevenueTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsMFRevenuePages.RTARevenueFileProcessPage;

public class RTARevenueFileProcessTC extends TestBase{

	@Test(enabled = true)
	public void rimsMFRevenueCreateAMCCommiRecTC() {
		RTARevenueFileProcessPage revenueFileProcessPage=PageFactory.initElements(driver, RTARevenueFileProcessPage.class);
		revenueFileProcessPage.rtaRevenueFileProcess();
	}
}
