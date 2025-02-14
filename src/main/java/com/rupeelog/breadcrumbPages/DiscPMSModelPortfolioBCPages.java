package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class DiscPMSModelPortfolioBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath =  "//a[contains(text(),'Disc PMS')]")
	@CacheLookup
	private WebElement DiscPMS;
	
	@FindBy(linkText = "Model Portfolio")
	@CacheLookup
	private WebElement ModelPortfolio;
	
	@FindBy(xpath = "//a[contains(text(),'Composition upload')]")
	@CacheLookup
	private WebElement CompositionUpload;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Model Portfolio Scheme')]")
	@CacheLookup
	private WebElement ModelPortfolioScheme;
	
	@FindBy(xpath = "//a[contains(text(),'Scheme Alternate List')]")
	@CacheLookup
	private WebElement SchemeAlternateList;
	
	public DiscPMSModelPortfolioBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void compositionUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ModelPortfolio);
		actions.moveToElement(ModelPortfolio).perform();

		WebDriverWaitFunctions.waitToLoadElement(CompositionUpload);
		actions.moveToElement(CompositionUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String CompositionUpload = breadcrumb.getText();
		System.out.println(CompositionUpload);
		Assert.assertTrue(CompositionUpload.contains(file.getBreadcrumb("CompositionUpload")), "CompositionUpload  not exits in breadcrumb");
	
	}	
	
	public void modelPortfolioScheme() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ModelPortfolio);
		actions.moveToElement(ModelPortfolio).perform();

		WebDriverWaitFunctions.waitToLoadElement(ModelPortfolioScheme);
		actions.moveToElement(ModelPortfolioScheme).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ModelPortfolioScheme = breadcrumb.getText();
		System.out.println(ModelPortfolioScheme);
		Assert.assertTrue(ModelPortfolioScheme.contains(file.getBreadcrumb("ModelPortfolioScheme")), "ModelPortfolioScheme  not exits in breadcrumb");
	
	}
	
	public void schemeAlternateList() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		WebDriverWaitFunctions.waitToLoadElement(ModelPortfolio);
		actions.moveToElement(ModelPortfolio).perform();

		WebDriverWaitFunctions.waitToLoadElement(SchemeAlternateList);
		actions.moveToElement(SchemeAlternateList).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String SchemeAlternateList = breadcrumb.getText();
		System.out.println(SchemeAlternateList);
		Assert.assertTrue(SchemeAlternateList.contains(file.getBreadcrumb("SchemeAlternateList")), "SchemeAlternateList  not exits in breadcrumb");
	
	}
}
