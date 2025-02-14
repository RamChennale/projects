package com.rupeelog.rimsClientFeesTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.rimsClientFeesPages.CreatePerfoFeesPage;

public class CreatePerfoFeesTC extends TestBase{

	@Test(enabled = true)
	public void rimsClinetFeesCreatePerfoFeesTC() {
		CreatePerfoFeesPage perfoFeesPage=PageFactory.initElements(driver, CreatePerfoFeesPage.class);
		perfoFeesPage.createPerformanceFees();
	}
}
