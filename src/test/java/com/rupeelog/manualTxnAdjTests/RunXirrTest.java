package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.RunXirrPage;

public class RunXirrTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void manualTxnAdjRunXirrTest() {
		RunXirrPage xirrPage= PageFactory.initElements(driver, RunXirrPage.class);
		xirrPage.manualTxnAdjRunXirr();
	}
}
