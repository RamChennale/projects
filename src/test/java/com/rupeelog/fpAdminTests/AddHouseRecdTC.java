package com.rupeelog.fpAdminTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.fpAdminPages.AddHouseRecdPage;

public class AddHouseRecdTC extends TestBase {

	@Test(enabled = true)
	public void fpAdminAddHouseRecdTC() {
		AddHouseRecdPage addHouseRecdPage= PageFactory.initElements(driver, AddHouseRecdPage.class);
		addHouseRecdPage.addHouseRecomendation();
	}
}
