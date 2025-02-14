package com.rupeelog.instrumentEquityTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentEquityPages.CreateMergerDemAmalgPage;

public class CreateMergerDemAmalgTC extends TestBase{

	@Test(enabled = true)
	public void instrumentEquityCreateEQBuyBackTC() {
		CreateMergerDemAmalgPage mergerDemAmalgPage = PageFactory.initElements(driver, CreateMergerDemAmalgPage.class);
		mergerDemAmalgPage.createMergerDemAmalg();
	}
}
