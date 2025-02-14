package com.rupeelog.instrumentMATests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentMAPages.ManagedAccountMasterschemePage;

public class ManagedAccountMasterschemeTest extends TestBase{

	
	@Test(enabled = false)
	public void instrumentIMAManagedAccountScheme() throws InterruptedException {
		ManagedAccountMasterschemePage managedAccountMasterschemePage= PageFactory.initElements(driver, ManagedAccountMasterschemePage.class);
		managedAccountMasterschemePage.adddManagedAccountScheme();
	}
}
