package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.MasterManagedAccountBCPages;

public class MasterManagedAccountBCTests extends TestBase{
	
	@Test(enabled = true)
	public void masterMAlegalStatusBc() {
		MasterManagedAccountBCPages masterManagedAccountBCPages= PageFactory.initElements(driver, MasterManagedAccountBCPages.class);
		masterManagedAccountBCPages.managedAccountAdvisor();
	}
	
}
