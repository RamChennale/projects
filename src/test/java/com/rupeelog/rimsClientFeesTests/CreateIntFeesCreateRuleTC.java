package com.rupeelog.rimsClientFeesTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsClientFeesPages.CreateIntFeesCreateRulePage;

public class CreateIntFeesCreateRuleTC extends TestBase{

	@Test(enabled = true)
	public void rimsClinetFeesCreateIntFeesCreateRuleTC() {
		CreateIntFeesCreateRulePage feePostingFreqPage=PageFactory.initElements(driver, CreateIntFeesCreateRulePage.class);
		feePostingFreqPage.createIntFeesCreateRule();
	}
}
