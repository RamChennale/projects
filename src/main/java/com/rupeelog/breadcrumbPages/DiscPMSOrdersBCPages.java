package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class DiscPMSOrdersBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath =  "//a[contains(text(),'Disc PMS')]")
	@CacheLookup
	private WebElement DiscPMS;
	
	@FindBy(linkText = "Orders")
	@CacheLookup
	private WebElement Orders;
	
	@FindBy(xpath = "//a[contains(text(),'1. Generate Variance')]")
	@CacheLookup
	private WebElement GenerateVariance1;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;

	@FindBy(xpath = "//a[contains(text(),'2. Variance for Accounting Portfolio')]")
	@CacheLookup
	private WebElement VarianceforAccountingPortfolio2;
	
	@FindBy(xpath = "//a[contains(text(),'3. Prepare Orders')]")
	@CacheLookup
	private WebElement PrepareOrders3;
	
	@FindBy(xpath = "//a[contains(text(),'4. Prepare Alternative Invest Orders')]")
	@CacheLookup
	private WebElement PrepareAlternativeInvestOrders4;
	
	@FindBy(xpath = "//a[contains(text(),'5. Place Orders')]")
	@CacheLookup
	private WebElement PlaceOrders5;
	
	public DiscPMSOrdersBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void generateVariance1() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(Orders);
		actions.moveToElement(Orders).perform();

		WebDriverWaitFunctions.waitToLoadElement(GenerateVariance1);
		actions.moveToElement(GenerateVariance1).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String GenerateVariance1 = breadcrumb.getText();
		System.out.println(GenerateVariance1);
		Assert.assertTrue(GenerateVariance1.contains(file.getBreadcrumb("GenerateVariance1")), "GenerateVariance1  not exits in breadcrumb");
	
	}	
	
	public void varianceforAccountingPortfolio2() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(Orders);
		actions.moveToElement(Orders).perform();

		WebDriverWaitFunctions.waitToLoadElement(VarianceforAccountingPortfolio2);
		actions.moveToElement(VarianceforAccountingPortfolio2).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String VarianceforAccountingPortfolio2 = breadcrumb.getText();
		System.out.println(VarianceforAccountingPortfolio2);
		Assert.assertTrue(VarianceforAccountingPortfolio2.contains(file.getBreadcrumb("VarianceforAccountingPortfolio2")), "VarianceforAccountingPortfolio2  not exits in breadcrumb");
	
	}	
	
	public void prepareOrders3() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(Orders);
		actions.moveToElement(Orders).perform();

		WebDriverWaitFunctions.waitToLoadElement(PrepareOrders3);
		actions.moveToElement(PrepareOrders3).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String PrepareOrders3 = breadcrumb.getText();
		System.out.println(PrepareOrders3);
		Assert.assertTrue(PrepareOrders3.contains(file.getBreadcrumb("PrepareOrders3")), " PrepareOrders3 not exits in breadcrumb");
	
	}	
	
	public void prepareAlternativeInvestOrders4() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(Orders);
		actions.moveToElement(Orders).perform();

		WebDriverWaitFunctions.waitToLoadElement(PrepareAlternativeInvestOrders4);
		actions.moveToElement(PrepareAlternativeInvestOrders4).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String PrepareAlternativeInvestOrders4 = breadcrumb.getText();
		System.out.println(PrepareAlternativeInvestOrders4);
		Assert.assertTrue(PrepareAlternativeInvestOrders4.contains(file.getBreadcrumb("PrepareAlternativeInvestOrders4")), "PrepareAlternativeInvestOrders4  not exits in breadcrumb");
	
	}	
	
	public void placeOrders5() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(Orders);
		actions.moveToElement(Orders).perform();

		WebDriverWaitFunctions.waitToLoadElement(PlaceOrders5);
		actions.moveToElement(PlaceOrders5).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String PlaceOrders5 = breadcrumb.getText();
		System.out.println(PlaceOrders5);
		Assert.assertTrue(PlaceOrders5.contains(file.getBreadcrumb("PlaceOrders5")), "PlaceOrders5  not exits in breadcrumb");
	
	}	
}
