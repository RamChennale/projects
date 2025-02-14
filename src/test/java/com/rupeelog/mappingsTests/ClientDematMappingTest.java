package com.rupeelog.mappingsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.mappingsPages.ClientDematMappingPage;

public class ClientDematMappingTest extends TestBase{

	@Test(enabled = true)
	public void adminCOBCreateClientDematMappingTest() {
		ClientDematMappingPage clientDematMappingPage=PageFactory.initElements(driver, ClientDematMappingPage.class);
		clientDematMappingPage.createClientDematMapping();
		System.out.println("Client Demat Mapping Created Successfully");
	}
}
