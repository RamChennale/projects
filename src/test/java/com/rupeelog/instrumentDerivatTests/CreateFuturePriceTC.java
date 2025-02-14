package com.rupeelog.instrumentDerivatTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.instrumentDerivatPages.CreateFuturePricePage;

public class CreateFuturePriceTC extends TestBase{

	@Test(enabled = true)
	public void instrumentDerivatCreateFuturePriceTC() {
		CreateFuturePricePage futurePricePage = PageFactory.initElements(driver, CreateFuturePricePage.class);
		futurePricePage.createFuturePrice();
	}
}
