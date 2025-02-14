package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessDebtBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;
	
	@FindBy(xpath = "//div[@id='smoothmenu-ajax']/ul/li[8]/ul[1]/li[7]/a[1]")
	@CacheLookup
	private WebElement Debt;
	
	@FindBy(xpath = "//a[contains(text(),'Debt Price')]")
	@CacheLookup
	private WebElement DebtPrice;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	
	
	public ProcessDebtBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void debtPrice() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Debt);
		actions.moveToElement(Debt).perform();

		WebDriverWaitFunctions.waitToLoadElement(DebtPrice);
		actions.moveToElement(DebtPrice).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String DebtPrice = breadcrumb.getText();
		Assert.assertTrue(DebtPrice.contains(file.getBreadcrumb("DebtPrice")), "DebtPrice  not exits in breadcrumb");
		System.out.println(DebtPrice);
	}	
	
}
