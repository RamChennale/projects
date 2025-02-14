package com.rupeelog.discPMSClientMagmtTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.discPMSClientMagmtPages.CreateCorpusOutReqPage;

public class CreateCorpusOutReqTC extends TestBase {

	@Test(enabled = true)
	public void discPMSClientMagmtCreateCorpusOutReqTC() {
		CreateCorpusOutReqPage corpusOutReqPage= PageFactory.initElements(driver, CreateCorpusOutReqPage.class);
		corpusOutReqPage.createCorpusOutReq();
	}
}
