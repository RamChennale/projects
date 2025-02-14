package com.rupeelog.processTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.processPages.UploadProcRevalidatePage;

public class UploadProcRevalidateTC extends TestBase{

	@Test
	public void processUploadProcRevalidateTC() {
		UploadProcRevalidatePage revalidatePage= PageFactory.initElements(driver, UploadProcRevalidatePage.class);
		revalidatePage.uploadProcessRevalidate();
	}
}
