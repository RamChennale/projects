package com.rupeelog.adminCOBTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminCOBPages.AddInvestmentAccountPage;
import com.rupeelog.base.TestBase;

public class AddInvestmentAccountTest extends TestBase{

	@Test(enabled = false)
	public void adminCOBAddInvestmentAcc() throws InterruptedException {
		AddInvestmentAccountPage accountPage=PageFactory.initElements(driver, AddInvestmentAccountPage.class);
		accountPage.addInvestemntAccount();
	}
}
