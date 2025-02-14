package com.rupeelog.mappingsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.mappingsPages.ClientBankMappingPage;

public class ClientBankMappingTest extends TestBase{

	@Test(enabled = false)
	public void adminCOBCreateClientBankMappingTest() throws InterruptedException {
		ClientBankMappingPage clientBankMappingPage= PageFactory.initElements(driver, ClientBankMappingPage.class);
		clientBankMappingPage.createClientBankMapping();
		System.out.println("Client Bank Mapping Success");
	}
}
