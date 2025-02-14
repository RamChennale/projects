package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.RunXirrSinceIncepPage;

public class RunXirrSinceIncepTest extends TestBase{

	
	@Test(enabled = true, priority = 1)
	public void manualTxnAdjRunXirrTest() {
		RunXirrSinceIncepPage xirrSinceIncepPage= PageFactory.initElements(driver, RunXirrSinceIncepPage.class);
		xirrSinceIncepPage.manualTxnAdjRunXirrSinceIncep();
	}
}
