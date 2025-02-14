package com.rupeelog.accountingTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.accountingPages.CorpusCash_In_OutPage;
import com.rupeelog.base.TestBase;

public class CreateCorpusInCashTC extends TestBase{

	@Test(enabled = true)
	public void accountingCorpus_In_Cash() {
		CorpusCash_In_OutPage corpusCash_In_OutPage= PageFactory.initElements(driver, CorpusCash_In_OutPage.class);
		corpusCash_In_OutPage.corpus_InCash();
	}
}
