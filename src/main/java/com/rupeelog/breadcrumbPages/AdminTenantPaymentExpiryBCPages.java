package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AdminTenantPaymentExpiryBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Admin']")
	@CacheLookup
	private WebElement Admin;

	@FindBy(xpath = "//a[contains(text(),'Tenant Payment Expiry')]")
	@CacheLookup
	private WebElement TenantPaymentExpiry;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	public AdminTenantPaymentExpiryBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void tenantPaymentExpiry() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(TenantPaymentExpiry);
		actions.moveToElement(TenantPaymentExpiry).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String TenantPaymentExpiry = breadcrumb.getText();
		Assert.assertTrue(TenantPaymentExpiry.contains(file.getBreadcrumb("TenantPaymentExpiry")), "TenantPaymentExpiry name not exits in breadcrumb");
		System.out.println(TenantPaymentExpiry);
	}

}
