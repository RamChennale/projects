package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class OrderDebtBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Order")
	@CacheLookup
	private WebElement Order;

	@FindBy(xpath  = "//div[@id='smoothmenu-ajax']/ul/li[5]/ul[1]/li[1]/a[1]")
	@CacheLookup
	private WebElement Debt;

	@FindBy(xpath = "//li[5]//ul[1]//li[1]//ul[1]//li[1]//a[1]")
	@CacheLookup
	private WebElement BuySellWithRisk;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//li[5]//ul[1]//li[1]//ul[1]//li[2]//a[1]")
	@CacheLookup
	private WebElement BuySellWithoutRisk;
	
	@FindBy(xpath = "//li[5]//ul[1]//li[1]//ul[1]//li[3]//a[1]")
	@CacheLookup
	private WebElement IPO;

	public OrderDebtBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void buySellWithRisk() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Order);
		actions.moveToElement(Order).perform();

		WebDriverWaitFunctions.waitToLoadElement(Debt);
		actions.moveToElement(Debt).perform();

		WebDriverWaitFunctions.waitToLoadElement(BuySellWithRisk);
		actions.moveToElement(BuySellWithRisk).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String  BuySellWithRisk= breadcrumb.getText();
		Assert.assertTrue(BuySellWithRisk.contains(file.getBreadcrumb("BuySellWithRisk")), " BuySellWithRisk name not exits in breadcrumb");
		System.out.println(BuySellWithRisk);
	}

	public void buySellWithoutRisk() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Order);
		actions.moveToElement(Order).perform();

		WebDriverWaitFunctions.waitToLoadElement(Debt);
		actions.moveToElement(Debt).perform();

		WebDriverWaitFunctions.waitToLoadElement(BuySellWithoutRisk);
		actions.moveToElement(BuySellWithoutRisk).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BuySellWithoutRisk = breadcrumb.getText();
		Assert.assertTrue(BuySellWithoutRisk.contains(file.getBreadcrumb("BuySellWithoutRisk")), "BuySellWithoutRisk name not exits in breadcrumb");
		System.out.println(BuySellWithoutRisk);
	}
	
	public void ipo() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Order);
		actions.moveToElement(Order).perform();

		WebDriverWaitFunctions.waitToLoadElement(Debt);
		actions.moveToElement(Debt).perform();

		WebDriverWaitFunctions.waitToLoadElement(IPO);
		actions.moveToElement(IPO).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String IPO = breadcrumb.getText();
		Assert.assertTrue(IPO.contains(file.getBreadcrumb("IPO")), "IPO name not exits in breadcrumb");
		System.out.println(IPO);
	}

}
