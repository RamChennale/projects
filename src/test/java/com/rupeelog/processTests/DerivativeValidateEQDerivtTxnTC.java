package com.rupeelog.processTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.processPages.DerivativeValidateEQDerivtTxnPage;

public class DerivativeValidateEQDerivtTxnTC extends TestBase{

	@Test
	public void processCommodityValidateCmdtyTxnTC() {
		DerivativeValidateEQDerivtTxnPage validateEQDerivtTxnPage=PageFactory.initElements(driver, DerivativeValidateEQDerivtTxnPage.class);
		validateEQDerivtTxnPage.DerivativeValidateEQDerivtTxn();
	}
}
