package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.AdminDocRepositoryBCPages;

public class AdminDocRepositoryBCTests extends TestBase {

	@Test(enabled = true)
	public void adminDocRepositoryBc() {
		AdminDocRepositoryBCPages adminDocRepositoryBCPages = PageFactory.initElements(driver,
				AdminDocRepositoryBCPages.class);
		adminDocRepositoryBCPages.docRepository();
	}

}
