package com.rupeelog.masterAssetMTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.masterAssetMPages.CreateInvestHorPage;

public class CreateInvestHorTest extends TestBase{

	@Test(enabled = true)
	public void masterAssetMCreateInvestHor() {
		CreateInvestHorPage createInvestHorPage=PageFactory.initElements(driver, CreateInvestHorPage.class);
		createInvestHorPage.createInvestHorizon();
	}
}


