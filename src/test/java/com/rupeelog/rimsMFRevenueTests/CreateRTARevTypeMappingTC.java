package com.rupeelog.rimsMFRevenueTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsMFRevenuePages.CreateRTARevTypeMappingPage;

public class CreateRTARevTypeMappingTC extends TestBase{

	@Test(enabled = true)
	public void rimsMFRevenueCreateRTARevTypeMappingTC() {
		CreateRTARevTypeMappingPage rtaRevTypeMappingPage=PageFactory.initElements(driver, CreateRTARevTypeMappingPage.class);
		rtaRevTypeMappingPage.createRTARevTypeMapping();
	}
}
