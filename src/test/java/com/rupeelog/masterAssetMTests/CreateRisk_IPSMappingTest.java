package com.rupeelog.masterAssetMTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.masterAssetMPages.CreateRisk_IPSMappingPage;

public class CreateRisk_IPSMappingTest extends TestBase{

	@Test(enabled = true)
	public void masterAssetMCreateRisk_IPSMapping() {
		CreateRisk_IPSMappingPage risk_IPSMappingPage=PageFactory.initElements(driver, CreateRisk_IPSMappingPage.class);
		risk_IPSMappingPage.createRisk_IPSMapping();
	}
}


