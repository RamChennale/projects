package com.rupeelog.mappingsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.mappingsPages.CreateClientIPSMappingPage;

public class CreateClientIPSMappingTest extends TestBase{

	@Test(enabled = true)
	public void mappingsClientIPSMappingTest() {
		CreateClientIPSMappingPage clientisIPSMappingPage=PageFactory.initElements(driver, CreateClientIPSMappingPage.class);
		clientisIPSMappingPage.createClientIPSMappingPage();
	}
}
