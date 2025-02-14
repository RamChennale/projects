package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class OrderMutualFundBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Order")
	@CacheLookup
	private WebElement Order;

	@FindBy(xpath  = "//div[@id='smoothcontainer']/div[@id='smoothmenu-ajax']/ul/li[5]/ul[1]/li[4]/a[1]")
	@CacheLookup
	private WebElement MutualFund;

	@FindBy(xpath = "//a[contains(text(),'1.Buy Sell')]")
	@CacheLookup
	private WebElement BuySell1;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'1A.Buy/Sell/Switch(Cart)')]")
	@CacheLookup
	private WebElement BuySellSwitchCart1A;
	
	@FindBy(xpath = "//a[contains(text(),'1B.Systematic Plan(Cart)')]")
	@CacheLookup
	private WebElement SystematicPlanCart1B;
	
	@FindBy(xpath = "//a[contains(text(),'Mandate')]")
	@CacheLookup
	private WebElement Mandate;

	public OrderMutualFundBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void buySell1() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Order);
		actions.moveToElement(Order).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(BuySell1);
		actions.moveToElement(BuySell1).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BuySell1 = breadcrumb.getText();
		Assert.assertTrue(BuySell1.contains(file.getBreadcrumb("BuySell1")), "  BuySell1 name not exits in breadcrumb");
		System.out.println(BuySell1);
	}
	public void buySellSwitchCart1A() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Order);
		actions.moveToElement(Order).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(BuySellSwitchCart1A);
		actions.moveToElement(BuySellSwitchCart1A).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BuySellSwitchCart1A = breadcrumb.getText();
		Assert.assertTrue(BuySellSwitchCart1A.contains(file.getBreadcrumb("BuySellSwitchCart1A")), " BuySellSwitchCart1A name not exits in breadcrumb");
		System.out.println(BuySellSwitchCart1A);
	}
	
	
	public void systematicPlanCart1B() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Order);
		actions.moveToElement(Order).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(SystematicPlanCart1B);
		actions.moveToElement(SystematicPlanCart1B).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String SystematicPlanCart1B = breadcrumb.getText();
		Assert.assertTrue(SystematicPlanCart1B.contains(file.getBreadcrumb("SystematicPlanCart1B")), " SystematicPlanCart1B  name not exits in breadcrumb");
		System.out.println(SystematicPlanCart1B);
	}
	
	public void mandate() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Order);
		actions.moveToElement(Order).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(Mandate);
		actions.moveToElement(Mandate).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Mandate = breadcrumb.getText();
		Assert.assertTrue(Mandate.contains(file.getBreadcrumb("Mandate")), "Mandate  name not exits in breadcrumb");
		System.out.println(Mandate);
	}
	
}
