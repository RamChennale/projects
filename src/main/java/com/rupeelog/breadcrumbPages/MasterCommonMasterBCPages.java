package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class MasterCommonMasterBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Master']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//a[contains(text(),'Common Master')]")
	@CacheLookup
	private WebElement CommonMaster;

	@FindBy(xpath = "//a[contains(text(),'Caliber Scheduler Notification')]")
	@CacheLookup
	private WebElement CaliberSchedulerNotification;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;

	@FindBy(xpath = "//a[contains(text(),'Email Creden')]")
	@CacheLookup
	private WebElement EmailCreden;

	@FindBy(xpath = "//*[text()='Indices / Benchmark Values']")
	@CacheLookup
	private WebElement IndicesBenchmarkValues;

	@FindBy(xpath = "//a[contains(text(),'Organisation Ordermode')]")
	@CacheLookup
	private WebElement OrganisationOrdermode;

	@FindBy(xpath = "//a[contains(text(),'Orgn BSE Enable')]")
	@CacheLookup
	private WebElement OrgnBSEEnable;

	@FindBy(xpath = "//a[contains(text(),'SMS Creden')]")
	@CacheLookup
	private WebElement SMSCreden;

	@FindBy(xpath = "//a[contains(text(),'Standard Remarks')]")
	@CacheLookup
	private WebElement StandardRemarks;

public MasterCommonMasterBCPages(WebDriver driver) {
	this.driver = driver;
}

	public void caliberSchedulerNotification() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(CommonMaster);
		actions.moveToElement(CommonMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(CaliberSchedulerNotification);
		actions.moveToElement(CaliberSchedulerNotification).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CaliberSchedulerNotification = breadcrumb.getText();
		Assert.assertTrue(CaliberSchedulerNotification.contains(file.getBreadcrumb("CaliberSchedulerNotification")),
				"Caliber Scheduler Notification name not exits in breadcrumb");
		System.out.println(CaliberSchedulerNotification);
	}

	public void emailCreden() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(CommonMaster);
		actions.moveToElement(CommonMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(EmailCreden);
		actions.moveToElement(EmailCreden).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String EmailCreden = breadcrumb.getText();
		Assert.assertTrue(EmailCreden.contains(file.getBreadcrumb("Email Creden")), "Email Creden name not exits in breadcrumb");
		System.out.println(EmailCreden);
	}

	public void indicesBenchmarkValues() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(CommonMaster);
		actions.moveToElement(CommonMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(IndicesBenchmarkValues);
		actions.moveToElement(IndicesBenchmarkValues).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String IndicesBenchmarkValues = breadcrumb.getText();
		Assert.assertTrue(IndicesBenchmarkValues.contains(file.getBreadcrumb("IndicesBenchmarkValues")),
				"Indices Benchmark Values name not exits in breadcrumb");
		System.out.println(IndicesBenchmarkValues);
	}

	public void organisationOrdermode() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(CommonMaster);
		actions.moveToElement(CommonMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(OrganisationOrdermode);
		actions.moveToElement(OrganisationOrdermode).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String OrganisationOrdermode = breadcrumb.getText();
		Assert.assertTrue(OrganisationOrdermode.contains(file.getBreadcrumb("OrganisationOrdermode")),
				"Organisation Order mode name not exits in breadcrumb");
		System.out.println(OrganisationOrdermode);
	}

	public void orgnBSEEnable() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(CommonMaster);
		actions.moveToElement(CommonMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(OrgnBSEEnable);
		actions.moveToElement(OrgnBSEEnable).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String OrgnBSEEnable = breadcrumb.getText();
		Assert.assertTrue(OrgnBSEEnable.contains(file.getBreadcrumb("OrgnBSEEnable")), "Orgn BSE Enable name not exits in breadcrumb");
		System.out.println(OrgnBSEEnable);
	}

	public void smsCreden() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(CommonMaster);
		actions.moveToElement(CommonMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(SMSCreden);
		actions.moveToElement(SMSCreden).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String SMSCreden = breadcrumb.getText();
		Assert.assertTrue(SMSCreden.contains(file.getBreadcrumb("SMSCreden")), "SMS Creden not exits in breadcrumb");
		System.out.println(SMSCreden);
	}

	public void standardRemarks() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(CommonMaster);
		actions.moveToElement(CommonMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(StandardRemarks);
		actions.moveToElement(StandardRemarks).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String StandardRemarks = breadcrumb.getText();
		Assert.assertTrue(StandardRemarks.contains(file.getBreadcrumb("StandardRemarks")),
				"Standard Remarks name not exits in breadcrumb");
		System.out.println(StandardRemarks);
	}
}