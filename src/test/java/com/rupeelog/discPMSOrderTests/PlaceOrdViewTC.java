package com.rupeelog.discPMSOrderTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.discPMSOrderPages.PlaceOrdViewPage;

public class PlaceOrdViewTC extends TestBase{

	@Test(enabled = true)
	public void discPMSOrderPlaceOrdViewTC() {
		PlaceOrdViewPage placeOrdViewPage=PageFactory.initElements(driver, PlaceOrdViewPage.class);
		placeOrdViewPage.placeOrdView();
	}
}
