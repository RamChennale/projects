package com.rupeelog.masterAssetMTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.masterAssetMPages.CreateRiskPage;

public class CreateRiskTest extends TestBase{

	@Test(enabled = true)
	public void masterAssetMCreateRiskTest() {
		CreateRiskPage riskPage=PageFactory.initElements(driver, CreateRiskPage.class);
		riskPage.CreateRisk();
	}
}


