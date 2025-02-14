package com.rupeelog.orgMasterTests;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.rupeelog.orgMasterPages.CreateClusterPage;
import com.rupeelog.base.TestBase;

public class CreateClusterTest extends TestBase{

	@Test(enabled = true)
	public void OrgMasterCreateClusterTest() {
		CreateClusterPage clusterPage= PageFactory.initElements(driver, CreateClusterPage.class);
		clusterPage.createClusterPageTest();
	}
}
