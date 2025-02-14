package com.rupeelog.instrumentDebtTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentDebtPages.CreateDebtInstPage;

public class CreateDebtInstTest extends TestBase{

	@Test(enabled = true)
	public void instrumentCreateDebtInstTest() {
		CreateDebtInstPage debtInstPage = PageFactory.initElements(driver, CreateDebtInstPage.class);
		debtInstPage.createDebtInstrument();

	}
}
