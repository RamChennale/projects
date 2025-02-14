package com.rupeelog.rimsClientFeesTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsClientFeesPages.CreateIntegFeesPostFeesPage;

public class CreateIntegFeesPostFeesTC extends TestBase{

	@Test(enabled = true)
	public void rimsClinetFeesCreateIntegFeesPostFeesTC() {
		CreateIntegFeesPostFeesPage feesPostFeesPage=PageFactory.initElements(driver, CreateIntegFeesPostFeesPage.class);
		feesPostFeesPage.createIntegFeesPostFees();
	}
}
