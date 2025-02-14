package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class FinplanInputBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath =  "//a[contains(text(),'Finplan Input')]")
	@CacheLookup
	private WebElement FinplanInput;
	
	@FindBy(linkText =  "Expense")
	@CacheLookup
	private WebElement Expense;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(linkText = "Goal")
	@CacheLookup
	private WebElement Goal;

	@FindBy(linkText = "Income")
	@CacheLookup
	private WebElement Income;

	@FindBy(xpath = "//a[contains(text(),'Risk Questionnaire Kyph')]")
	@CacheLookup
	private WebElement RiskQuestionnaireKyph;
	
	public FinplanInputBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void expense() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(FinplanInput);
		actions.moveToElement(FinplanInput).perform();

		WebDriverWaitFunctions.waitToLoadElement(Expense);
		actions.moveToElement(Expense).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Expense = breadcrumb.getText();
		Assert.assertTrue(Expense.contains(file.getBreadcrumb("Expense")), "Expense  not exits in breadcrumb");
		System.out.println(Expense);
	}	
	
	public void goal() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(FinplanInput);
		actions.moveToElement(FinplanInput).perform();

		WebDriverWaitFunctions.waitToLoadElement(Goal);
		actions.moveToElement(Goal).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Goal = breadcrumb.getText();
		Assert.assertTrue(Goal.contains(file.getBreadcrumb("Goal")), "Goal  not exits in breadcrumb");
		System.out.println(Goal);
	}	
	
	public void income() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(FinplanInput);
		actions.moveToElement(FinplanInput).perform();

		WebDriverWaitFunctions.waitToLoadElement(Income);
		actions.moveToElement(Income).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Income = breadcrumb.getText();
		Assert.assertTrue(Income.contains(file.getBreadcrumb("Income")), " Income not exits in breadcrumb");
		System.out.println(Income);
	}	
	
	public void riskQuestionnaireKyph() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(FinplanInput);
		actions.moveToElement(FinplanInput).perform();

		WebDriverWaitFunctions.waitToLoadElement(RiskQuestionnaireKyph);
		actions.moveToElement(RiskQuestionnaireKyph).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String RiskQuestionnaireKyph = breadcrumb.getText();
		Assert.assertTrue(RiskQuestionnaireKyph.contains(file.getBreadcrumb("RiskQuestionnaireKyph")), "RiskQuestionnaireKyph  not exits in breadcrumb");
		System.out.println(RiskQuestionnaireKyph);
	}	
}
