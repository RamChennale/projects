package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class OrderFundPayoutOrderBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Order")
	@CacheLookup
	private WebElement Order;

	@FindBy(xpath  = "//a[contains(text(),'Fund Payout Order')]")
	@CacheLookup
	private WebElement FundPayoutOrder;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	public OrderFundPayoutOrderBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void fundPayoutOrder() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Order);
		actions.moveToElement(Order).perform();

		WebDriverWaitFunctions.waitToLoadElement(FundPayoutOrder);
		actions.moveToElement(FundPayoutOrder).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String  FundPayoutOrder= breadcrumb.getText();
		System.out.println(FundPayoutOrder);
		//Assert.assertTrue(FundPayoutOrder.contains(file.getBreadcrumb("FundPayoutOrder")), " FundPayoutOrder name not exits in breadcrumb");
	}
}
