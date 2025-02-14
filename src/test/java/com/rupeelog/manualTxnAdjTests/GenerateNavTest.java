package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.GenerateNavPage;

public class GenerateNavTest extends TestBase{

	@Test(enabled = true)
	public void manualTxnAdjmentGenerateNavTest() {
		GenerateNavPage generateNavPage= PageFactory.initElements(driver, GenerateNavPage.class);
		generateNavPage.manualTxnAdjmentGenerateNavPageTest();
	}
}
