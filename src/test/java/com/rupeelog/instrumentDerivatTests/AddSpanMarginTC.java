package com.rupeelog.instrumentDerivatTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentDerivatPages.AddSpanMarginPage;

public class AddSpanMarginTC extends TestBase{

	@Test(enabled = true)
	public void instrumentCreateDebtInstTest() {
		AddSpanMarginPage spanMarginPage = PageFactory.initElements(driver, AddSpanMarginPage.class);
		spanMarginPage.addSpanMargin();
	}
}
