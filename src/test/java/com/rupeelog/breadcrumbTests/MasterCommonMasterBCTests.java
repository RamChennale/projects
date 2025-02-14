package com.rupeelog.breadcrumbTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.base.TestBase;
import com.rupeelog.breadcrumbPages.MasterCommonMasterBCPages;

public class MasterCommonMasterBCTests extends TestBase {

	@Test(enabled = true)
	public void masterCommonMCaliberSchedulerNotificationBc() {
		MasterCommonMasterBCPages masterCommonMasterBCPages = PageFactory.initElements(driver,
				MasterCommonMasterBCPages.class);
		masterCommonMasterBCPages.caliberSchedulerNotification();
	}

	@Test(enabled = true)
	public void masterCommonMEmailCredenBc() { //
		MasterCommonMasterBCPages masterCommonMasterBCPages = PageFactory.initElements(driver,
				MasterCommonMasterBCPages.class);
		masterCommonMasterBCPages.emailCreden();
	}

	@Test(enabled = true)
	public void masterCommonMIndicesBenchmarkValuesBc() {
		MasterCommonMasterBCPages masterCommonMasterBCPages = PageFactory.initElements(driver,
				MasterCommonMasterBCPages.class);
		masterCommonMasterBCPages.indicesBenchmarkValues();
	}

	@Test(enabled = true)
	public void masterCommonMOrganisationOrdermodeBc() {
		MasterCommonMasterBCPages masterCommonMasterBCPages = PageFactory.initElements(driver,
				MasterCommonMasterBCPages.class);
		masterCommonMasterBCPages.organisationOrdermode();
	}

	@Test(enabled = true)
	public void masterCommonMOrgnBSEEnableBc() {
		MasterCommonMasterBCPages masterCommonMasterBCPages = PageFactory.initElements(driver,
				MasterCommonMasterBCPages.class);
		masterCommonMasterBCPages.orgnBSEEnable();
	}

	@Test(enabled = true)
	public void masterCommonMSMSCredenBc() {
		MasterCommonMasterBCPages masterCommonMasterBCPages = PageFactory.initElements(driver,
				MasterCommonMasterBCPages.class);
		masterCommonMasterBCPages.smsCreden();
	}

	@Test(enabled = true)
	public void masterCommonMStandardRemarksBc() {
		MasterCommonMasterBCPages masterCommonMasterBCPages = PageFactory.initElements(driver,
				MasterCommonMasterBCPages.class);
		masterCommonMasterBCPages.standardRemarks();
	}
}
