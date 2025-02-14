package com.rupeelog.rimsClientFeesTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsClientFeesPages.CreateIntegFeesCalculatePage;

public class CreateIntegFeesCalculateTC extends TestBase{

	@Test(enabled = true)
	public void rimsClinetFeesAddPostingDayMasterTC() {
		CreateIntegFeesCalculatePage feesCalculatePage=PageFactory.initElements(driver, CreateIntegFeesCalculatePage.class);
		feesCalculatePage.createIntegFeesCalculate();
	}
}
