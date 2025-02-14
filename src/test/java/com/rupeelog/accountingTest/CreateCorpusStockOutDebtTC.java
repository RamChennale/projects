package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.CreateCorpusStockOutDebtPage;
import com.rupeelog.base.TestBase;

public class CreateCorpusStockOutDebtTC extends TestBase{

	@Test(enabled = true)
	public void accountingCreateCorpusStockInReceiptEQTC() {
		CreateCorpusStockOutDebtPage corpusStockOutDebtPage= PageFactory.initElements(driver, CreateCorpusStockOutDebtPage.class);
		corpusStockOutDebtPage.createCorpusStockOutDebt();
	}
}
