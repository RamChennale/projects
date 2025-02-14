package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.CreateCorpusStockInManagedAccPage;
import com.rupeelog.base.TestBase;

public class CreateCorpusStockInManagedAccTC extends TestBase{

	@Test(enabled = true)
	public void accountingCreateCorpusStockInManagedAccTC() {
		CreateCorpusStockInManagedAccPage stockInManagedAccPage= PageFactory.initElements(driver, CreateCorpusStockInManagedAccPage.class);
		stockInManagedAccPage.createCorpusStockInManagedAcc();
	}
}
