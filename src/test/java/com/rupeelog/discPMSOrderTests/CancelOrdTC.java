package com.rupeelog.discPMSOrderTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.discPMSOrderPages.CancelOrdPage;

public class CancelOrdTC extends TestBase{

	@Test(enabled = true)
	public void discPMSOrderCancelOrdTC() {
		CancelOrdPage cancelOrdPage=PageFactory.initElements(driver, CancelOrdPage.class);
		cancelOrdPage.cancelOrder();
	}
}
