package com.rupeelog.rimsClientFeesTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsClientFeesPages.AddPostingDayMasterPage;

public class AddPostingDayMasterTC extends TestBase{

	@Test(enabled = true)
	public void rimsClinetFeesAddPostingDayMasterTC() {
		AddPostingDayMasterPage postingDayMasterPage=PageFactory.initElements(driver, AddPostingDayMasterPage.class);
		postingDayMasterPage.clientFeePostingDayMaster();
	}
}
