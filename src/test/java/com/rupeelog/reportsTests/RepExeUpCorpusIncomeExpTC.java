package com.rupeelog.reportsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.reportsPages.RepExeUpCorpusIncomeExpPage;

public class RepExeUpCorpusIncomeExpTC extends TestBase{

	@Test(enabled = true)
	public void reportsRepExeUpCorpusIncomeExpTC() {
		RepExeUpCorpusIncomeExpPage upCorpusIncomeExpPage=PageFactory.initElements(driver, RepExeUpCorpusIncomeExpPage.class);
		upCorpusIncomeExpPage.updateCorpusIncomeExp();
	}
}
