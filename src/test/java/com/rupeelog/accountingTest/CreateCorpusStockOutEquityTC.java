package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.CreateCorpusStockOutEquityPage;
import com.rupeelog.base.TestBase;

public class CreateCorpusStockOutEquityTC extends TestBase{

	@Test(enabled = true)
	public void accountingCreateCorpusStockInReceiptEQTC() {
		CreateCorpusStockOutEquityPage corpusStockOutEquityPage= PageFactory.initElements(driver, CreateCorpusStockOutEquityPage.class);
		corpusStockOutEquityPage.createCorpusStockOutEquity();
	}
}
