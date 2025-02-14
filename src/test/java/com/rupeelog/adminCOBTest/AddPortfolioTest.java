package com.rupeelog.adminCOBTest;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.adminCOBPages.AddPortfolioPage;
import com.rupeelog.base.TestBase;

public class AddPortfolioTest extends TestBase{
	
	@Test(enabled = false)
	public void adminCOBAddPortfolio() throws IOException, InterruptedException {
		AddPortfolioPage addPortfolioPage= PageFactory.initElements(driver, AddPortfolioPage.class);
		addPortfolioPage.createPortfolio();
	}

}
