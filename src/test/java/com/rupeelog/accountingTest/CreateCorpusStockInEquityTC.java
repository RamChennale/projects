package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.CreateCorpusStockInEquityPage;
import com.rupeelog.base.TestBase;

public class CreateCorpusStockInEquityTC extends TestBase{

	@Test(enabled = true)
	public void accountingCreateCorpusStockInReceiptEQTC() {
		CreateCorpusStockInEquityPage corpusStockInReceiptEQPage= PageFactory.initElements(driver, CreateCorpusStockInEquityPage.class);
		corpusStockInReceiptEQPage.createCorpusStockInReceiptEQ();
	}
}
