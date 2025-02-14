package com.rupeelog.discPMSOrderTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.discPMSOrderPages.ConfirmAllocationPage;

public class ConfirmAllocationTC extends TestBase{

	@Test(enabled = true)
	public void discPMSOrderConfirmAllocationTC() {
		ConfirmAllocationPage confirmAllocationPage=PageFactory.initElements(driver, ConfirmAllocationPage.class);
		confirmAllocationPage.confirmAllocation();
	}
}
