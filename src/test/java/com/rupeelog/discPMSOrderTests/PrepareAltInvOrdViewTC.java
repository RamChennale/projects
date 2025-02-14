package com.rupeelog.discPMSOrderTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.discPMSOrderPages.PrepareAltInvOrdViewPage;

public class PrepareAltInvOrdViewTC extends TestBase{

	@Test(enabled = true)
	public void discPMSOrderPrepareAltInvOrdViewTC() {
		PrepareAltInvOrdViewPage altInvOrdViewPage=PageFactory.initElements(driver, PrepareAltInvOrdViewPage.class);
		altInvOrdViewPage.prepareAltInvOrdViewPage();
	}
}
