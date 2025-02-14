package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessConfirmationBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;

	
	@FindBy(xpath = "//a[contains(text(),'Confirmation')]")
	@CacheLookup
	private WebElement Confirmation;
	
	@FindBy(xpath = "//a[text()='.Recommendation']")
	@CacheLookup
	private WebElement Recommendation;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Recommendation(New)')]")
	@CacheLookup
	private WebElement RecommendationNew;
	
	@FindBy(xpath = "//a[contains(text(),'Validate Vouchers')]")
	@CacheLookup
	private WebElement ValidateVouchers;
	
	public ProcessConfirmationBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void recommendation() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Confirmation);
		actions.moveToElement(Confirmation).perform();

		WebDriverWaitFunctions.waitToLoadElement(Recommendation);
		actions.moveToElement(Recommendation).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Recommendation = breadcrumb.getText();
		Assert.assertTrue(Recommendation.contains(file.getBreadcrumb("Recommendation")), " Recommendation not exits in breadcrumb");
		System.out.println(Recommendation);
	}	
	
	public void recommendationNew() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Confirmation);
		actions.moveToElement(Confirmation).perform();

		WebDriverWaitFunctions.waitToLoadElement(RecommendationNew);
		actions.moveToElement(RecommendationNew).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RecommendationNew = breadcrumb.getText();
		Assert.assertTrue(RecommendationNew.contains(file.getBreadcrumb("RecommendationNew")), "RecommendationNew  not exits in breadcrumb");
		System.out.println(RecommendationNew);
	}	
	
	public void validateVouchers() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(Confirmation);
		actions.moveToElement(Confirmation).perform();

		WebDriverWaitFunctions.waitToLoadElement(ValidateVouchers);
		actions.moveToElement(ValidateVouchers).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ValidateVouchers = breadcrumb.getText();
		Assert.assertTrue(ValidateVouchers.contains(file.getBreadcrumb("ValidateVouchers")), "ValidateVouchers  not exits in breadcrumb");
		System.out.println(ValidateVouchers);
	}	
	
}
