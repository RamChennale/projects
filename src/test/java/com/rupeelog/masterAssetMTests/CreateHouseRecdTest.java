package com.rupeelog.masterAssetMTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.masterAssetMPages.CreateHouseRecdPage;

public class CreateHouseRecdTest extends TestBase{

	@Test(enabled = true)
	public void masterAssetMCreateHouseRecd() {
		CreateHouseRecdPage createHouseRecdPage=PageFactory.initElements(driver, CreateHouseRecdPage.class);
		createHouseRecdPage.createHouseRecomendation();
	}
}


