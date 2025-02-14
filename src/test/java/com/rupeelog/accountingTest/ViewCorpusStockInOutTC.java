package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.ViewCorpusStockInOutPage;
import com.rupeelog.base.TestBase;

public class ViewCorpusStockInOutTC extends TestBase{

	@Test(enabled = true)
	public void accountingViewCorpusStockInOutTC() {
		ViewCorpusStockInOutPage viewCorpusStockInOutPage= PageFactory.initElements(driver, ViewCorpusStockInOutPage.class);
		viewCorpusStockInOutPage.viewCorpusStockInOut();
	}
}
