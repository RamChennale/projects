package com.rupeelog.adminCOBTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminCOBPages.AddFamilyPage;
import com.rupeelog.base.TestBase;

public class AddFamilyTest extends TestBase {

	@Test(enabled = false)
	public void adminCOBAddFamily() throws InterruptedException {
		AddFamilyPage family = PageFactory.initElements(driver, AddFamilyPage.class);
		family.createNewFamily();
	}

}
