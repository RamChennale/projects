package com.rupeelog.orgMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.orgMasterPages.CreateCounterPartyPage;

public class CreateCounterPartyTest extends TestBase{

	@Test(enabled = true)
	public void OrgMasterCreateCounterPartyTest(){
		CreateCounterPartyPage counterPartyPage=PageFactory.initElements(driver, CreateCounterPartyPage.class);
		counterPartyPage.createCounterPartyPageTest();
	}
}
