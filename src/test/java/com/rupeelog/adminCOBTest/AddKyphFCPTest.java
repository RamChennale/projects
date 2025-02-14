package com.rupeelog.adminCOBTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminCOBPages.AddKyphFCPPage;
import com.rupeelog.base.TestBase;

public class AddKyphFCPTest extends TestBase {

	@Test(enabled = false)
	public void adminCOBAddKyphFCP() throws InterruptedException {
		AddKyphFCPPage addKyphFCPPage = PageFactory.initElements(driver, AddKyphFCPPage.class);
		addKyphFCPPage.createKyphFCP();
	}

}
