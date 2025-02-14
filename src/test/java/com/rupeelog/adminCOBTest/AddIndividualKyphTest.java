package com.rupeelog.adminCOBTest;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminCOBPages.AddIndividualKyphPage;
import com.rupeelog.base.TestBase;

public class AddIndividualKyphTest extends TestBase{

	@Test(enabled = false)
	public void adminCOBAddIndividualKYPH() throws IOException, InterruptedException {
		AddIndividualKyphPage addIndvKYPHPage= PageFactory.initElements(driver, AddIndividualKyphPage.class);
		addIndvKYPHPage.addIndividualKYPH();
	}
}
