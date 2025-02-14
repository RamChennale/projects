package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.CreateCorpusStockOutManagedAccPage;
import com.rupeelog.base.TestBase;

public class CreateCorpusStockOutManagedAccTC extends TestBase{

	@Test(enabled = true)
	public void accountingCreateCorpusStockOutManagedAccTC() {
		CreateCorpusStockOutManagedAccPage corpusStockOutMApage= PageFactory.initElements(driver, CreateCorpusStockOutManagedAccPage.class);
		corpusStockOutMApage.createCorpusStockOutManagedAcc();
	}
}
