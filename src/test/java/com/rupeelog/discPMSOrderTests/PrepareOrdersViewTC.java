package com.rupeelog.discPMSOrderTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.discPMSOrderPages.PrepareOrdersViewPage;

public class PrepareOrdersViewTC extends TestBase{

	@Test(enabled = true)
	public void discPMSOrderPrepareOrdersViewTC() {
		PrepareOrdersViewPage prepareOrdersViewPage=PageFactory.initElements(driver, PrepareOrdersViewPage.class);
		prepareOrdersViewPage.prepareOrdersView();
	}
}
