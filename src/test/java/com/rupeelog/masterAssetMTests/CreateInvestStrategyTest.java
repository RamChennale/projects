package com.rupeelog.masterAssetMTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.masterAssetMPages.CreateInvestStrategyPage;

public class CreateInvestStrategyTest extends TestBase{

	@Test(enabled = true)
	public void masterAssetMCreateInvestStrategy() {
		CreateInvestStrategyPage createInvestStrategy=PageFactory.initElements(driver, CreateInvestStrategyPage.class);
		createInvestStrategy.createInvestStrategy();
	}
}


