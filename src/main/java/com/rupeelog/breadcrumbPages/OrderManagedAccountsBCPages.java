package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class OrderManagedAccountsBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Order")
	@CacheLookup
	private WebElement Order;

	@FindBy(xpath  = "//a[contains(text(),'Managed Accounts')]")
	@CacheLookup
	private WebElement ManagedAccounts;

	@FindBy(xpath = "//li[5]//ul[1]//li[3]//ul[1]//li[1]//a[1]")
	@CacheLookup
	private WebElement BuySellWithRisk;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Buy Sell With Risk New')]")
	@CacheLookup
	private WebElement BuySellWithRiskNew;
	
	@FindBy(xpath = "//li[5]//ul[1]//li[3]//ul[1]//li[3]//a[1]")
	@CacheLookup
	private WebElement BuySellWithoutRisk;
	
	@FindBy(xpath = "//li[5]//ul[1]//li[3]//ul[1]//li[4]//a[1]")
	@CacheLookup
	private WebElement IPO;

	public OrderManagedAccountsBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void maBuySellWithRisk() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Order);
		actions.moveToElement(Order).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccounts);
		actions.moveToElement(ManagedAccounts).perform();

		WebDriverWaitFunctions.waitToLoadElement(BuySellWithRisk);
		actions.moveToElement(BuySellWithRisk).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BuySellWithRisk = breadcrumb.getText();
		Assert.assertTrue(BuySellWithRisk.contains(file.getBreadcrumb("maBuySellWithRisk")), " BuySellWithRisk name not exits in breadcrumb");
		System.out.println(BuySellWithRisk);
	}

	public void maBuySellWithRiskNew() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Order);
		actions.moveToElement(Order).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccounts);
		actions.moveToElement(ManagedAccounts).perform();

		WebDriverWaitFunctions.waitToLoadElement(BuySellWithRiskNew);
		actions.moveToElement(BuySellWithRiskNew).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BuySellWithRiskNew = breadcrumb.getText();
		Assert.assertTrue(BuySellWithRiskNew.contains(file.getBreadcrumb("maBuySellWithRiskNew")), "BuySellWithRiskNew  name not exits in breadcrumb");
		System.out.println(BuySellWithRiskNew);
	}
	
	public void maBuySellWithoutRisk() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Order);
		actions.moveToElement(Order).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccounts);
		actions.moveToElement(ManagedAccounts).perform();

		WebDriverWaitFunctions.waitToLoadElement(BuySellWithoutRisk);
		actions.moveToElement(BuySellWithoutRisk).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BuySellWithoutRisk = breadcrumb.getText();
		Assert.assertTrue(BuySellWithoutRisk.contains(file.getBreadcrumb("maBuySellWithoutRisk")), "BuySellWithoutRisk  name not exits in breadcrumb");
		System.out.println(BuySellWithoutRisk);
	}
	
	public void maIPO() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Order);
		actions.moveToElement(Order).perform();

		WebDriverWaitFunctions.waitToLoadElement(ManagedAccounts);
		actions.moveToElement(ManagedAccounts).perform();

		WebDriverWaitFunctions.waitToLoadElement(IPO);
		actions.moveToElement(IPO).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String IPO = breadcrumb.getText();
		Assert.assertTrue(IPO.contains(file.getBreadcrumb("maIPO")), "IPO  name not exits in breadcrumb");
		System.out.println(IPO);
	}
}
