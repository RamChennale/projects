package com.rupeelog.instrumentMATests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentMAPages.CreateManagedAccFundPage;

public class CreateManagedAccFundTC extends TestBase{

	@Test(enabled = true)
	public void instrumentMACreateMAFundTC() {
		CreateManagedAccFundPage managedAccFundPage = PageFactory.initElements(driver, CreateManagedAccFundPage.class);
		managedAccFundPage.createManagedAccFund();
	}
}
