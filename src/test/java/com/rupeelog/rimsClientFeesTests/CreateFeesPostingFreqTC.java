package com.rupeelog.rimsClientFeesTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsClientFeesPages.CreateFeesPostingFreqPage;

public class CreateFeesPostingFreqTC extends TestBase{

	@Test(enabled = true)
	public void rimsClinetFeesCreateFeesPostingFreqTC() {
		CreateFeesPostingFreqPage feePostingFreqPage=PageFactory.initElements(driver, CreateFeesPostingFreqPage.class);
		feePostingFreqPage.clientFeePostingDayMaster();
	}
}
