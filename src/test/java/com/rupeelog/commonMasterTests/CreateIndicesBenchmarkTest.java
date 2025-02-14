package com.rupeelog.commonMasterTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.commonMasterPages.CreateIndicesBenchmarkPage;

public class CreateIndicesBenchmarkTest extends TestBase {

	@Test
	public void commonMasterCreateIndicesBenchTest() {
		CreateIndicesBenchmarkPage indicesBenchmarkPage = PageFactory.initElements(driver,
				CreateIndicesBenchmarkPage.class);
		indicesBenchmarkPage.CreateIndicesBenchmarkTest();
	}
}
