package com.rupeelog.rimsMFRevenueTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsMFRevenuePages.CreateAMCCommiReceiptPage;

public class CreateAMCCommiRecTC extends TestBase{

	@Test(enabled = false)
	public void rimsMFRevenueCreateAMCCommiRecTC() {
		CreateAMCCommiReceiptPage amcCommiReceiptPage=PageFactory.initElements(driver, CreateAMCCommiReceiptPage.class);
		amcCommiReceiptPage.createAMCCommiReceipt();
	}
}
