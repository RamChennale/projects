package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.CreateCorpusStockInDebtPage;
import com.rupeelog.base.TestBase;

public class CreateCorpusStockInDebtTC extends TestBase{

	@Test(enabled = true)
	public void accountingCreateCorpusStockInReceiptEQTC() {
		CreateCorpusStockInDebtPage corpusStockInReceiptdDebtPage= PageFactory.initElements(driver, CreateCorpusStockInDebtPage.class);
		corpusStockInReceiptdDebtPage.createCorpusStockInReceiptDebt();
	}
}
