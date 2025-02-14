package com.rupeelog.processTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.processPages.FileProcessRunFileProcessPage;

public class FileProcessRunFileProcessTC extends TestBase{

	@Test
	public void processFileProcessRunFileProcessTC() {
		FileProcessRunFileProcessPage runFileProcessPage= PageFactory.initElements(driver, FileProcessRunFileProcessPage.class);
		runFileProcessPage.fileProcessRunFileProcess();
	}
}
