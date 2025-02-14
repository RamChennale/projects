package com.rupeelog.manualTxnAdjTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.manualTxnAdjPages.RerunEquitySplitBonusPage;

public class RerunEquitySplitBonusTest extends TestBase{

	@Test(enabled = false)
	public void adminManualTxnAdjstRunSplitBonusForParticularClient() {
		RerunEquitySplitBonusPage rerunEquitySplitBonusPage=PageFactory.initElements(driver, RerunEquitySplitBonusPage.class);
		rerunEquitySplitBonusPage.runSplitBonusParticularClient();
		System.out.println("Run Split Bonus For Portfolio client success.");
	}

	@Test(enabled =false)
	public void adminManualTxnAdjstRunSplitBonusForParticularAsset() {
		RerunEquitySplitBonusPage rerunEquitySplitBonusPage=PageFactory.initElements(driver, RerunEquitySplitBonusPage.class);
		rerunEquitySplitBonusPage.runSplitBonusParticularAsset();
		System.out.println("Run Split Bonus For Asset success.");
	}

	@Test(enabled =false, priority = 3) 
	public void runSplitBonusForBothPortfolioAsset() throws InterruptedException {
		RerunEquitySplitBonusPage rerunEquitySplitBonusPage=PageFactory.initElements(driver, RerunEquitySplitBonusPage.class);
		rerunEquitySplitBonusPage.runSplitBonusBothPortfolioAsset();
		System.out.println("Run Split Bonus For Portfolio Asset success.");
	}
}

