package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class OrderPreOrderEquityBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Order")
	@CacheLookup
	private WebElement Order;

	@FindBy(xpath  = "//a[contains(text(),'Pre Order - Equity')]")
	@CacheLookup
	private WebElement PreOrderEquity;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	public OrderPreOrderEquityBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void preOrderEquity() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Order);
		actions.moveToElement(Order).perform();

		WebDriverWaitFunctions.waitToLoadElement(PreOrderEquity);
		actions.moveToElement(PreOrderEquity).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String  PreOrderEquity= breadcrumb.getText();
		System.out.println(PreOrderEquity);
	}
}
