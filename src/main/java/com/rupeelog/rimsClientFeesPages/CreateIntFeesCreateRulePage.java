package com.rupeelog.rimsClientFeesPages;


import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateIntFeesCreateRulePage {

	WebDriver driver;
	Alert alert;
	FileReaderUtility file;
	Actions action;

	@FindBy(linkText = "RIMS")
	@CacheLookup
	private WebElement RIMS;

	@FindBy(linkText = "Client Fees")
	@CacheLookup
	private WebElement ClientFees;

	@FindBy(linkText = "7a. Integ.Fees-Create Rule")
	@CacheLookup
	private WebElement IntegFeesCreateRule;
	
	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;
	
	@FindBy(id = "portfolioCode")
	@CacheLookup
	private WebElement creatRulePortfolioCodeAutoSugg;

	@FindBy(id = "effectiveDate")
	@CacheLookup
	private WebElement creatRuleEffectiveDate;

	@FindBy(id = "fee_method")
	@CacheLookup
	private WebElement creatRuleFee_methodDD;

	@FindBy(id = "deductTER")
	@CacheLookup
	private WebElement creatRuleIntegratedDD;

	@FindBy(id = "frequency")
	@CacheLookup
	private WebElement creatRulefrequencyDD;

	@FindBy(id = "equityFees")
	@CacheLookup
	private WebElement creatRuleEquityFees;

	@FindBy(id = "debtFees")
	@CacheLookup
	private WebElement creatRuleDebtFees;

	@FindBy(id = "alternative")
	@CacheLookup
	private WebElement creatRuleAlternative;

	@FindBy(id = "realState")
	@CacheLookup
	private WebElement creatRuleRealState;

	@FindBy(id = "cashEquivalent")
	@CacheLookup
	private WebElement creatRuleCashEquivalent;

	@FindBy(id = "flatFeesAmount")
	@CacheLookup
	private WebElement creatRuleFeesAmountPA;

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreateIntFeesCreateRulePage(WebDriver driver) {
		this.driver = driver;
	}

	public void createIntFeesCreateRule() {
		file = new FileReaderUtility();
		action = new Actions(driver);

		ElementWait.isElementVisible(RIMS);
		action.moveToElement(RIMS).perform();

		ElementWait.isElementVisible(ClientFees);
		action.moveToElement(ClientFees).perform();

		ElementWait.isElementVisible(IntegFeesCreateRule);
		action.moveToElement(IntegFeesCreateRule).click().build().perform();
		
		ElementWait.isElementVisible(createBtn);
		createBtn.click();

		ElementWait.isElementVisible(creatRulePortfolioCodeAutoSugg);
		creatRulePortfolioCodeAutoSugg.sendKeys(file.getRIMSTestDat("creatRulePortfolioCodeAutoSugg"));
		
		List<WebElement> portfList=ElementWait.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@id='ui-id-1']//li")));
		
		for(int i=0; i<portfList.size(); i++) {
			if(portfList.get(i).getText().equalsIgnoreCase(file.getRIMSTestDat("selectcreatRulePortfolioCodeAutoSugg")))
				portfList.get(i).click();
			System.out.println(portfList.get(i).getText());
			break;
		}
		
		ElementWait.isElementVisible(creatRuleEffectiveDate);
		creatRuleEffectiveDate.sendKeys(file.getRIMSTestDat("creatRuleEffectiveDate"));
		
		ElementWait.isElementVisible(creatRuleFee_methodDD);
		Select selectcreatRuleFee_methodDD= new Select(creatRuleFee_methodDD);
		selectcreatRuleFee_methodDD.selectByVisibleText(file.getRIMSTestDat("creatRuleFee_methodDD"));
		
		ElementWait.isElementVisible(creatRuleIntegratedDD);
		Select selectcreatRuleIntegratedDD= new Select(creatRuleIntegratedDD);
		selectcreatRuleIntegratedDD.selectByVisibleText(file.getRIMSTestDat("creatRuleIntegratedDD"));
		
		ElementWait.isElementVisible(creatRulefrequencyDD);
		Select selectcreatRulefrequencyDD= new Select(creatRulefrequencyDD);
		selectcreatRulefrequencyDD.selectByVisibleText(file.getRIMSTestDat("creatRulefrequencyDD"));
		
		ElementWait.isElementVisible(creatRuleEquityFees);
		creatRuleEquityFees.sendKeys(file.getRIMSTestDat("creatRuleEquityFees"));
		
		ElementWait.isElementVisible(creatRuleDebtFees);
		creatRuleDebtFees.sendKeys(file.getRIMSTestDat("creatRuleDebtFees"));
		
		ElementWait.isElementVisible(creatRuleAlternative);
		creatRuleAlternative.sendKeys(file.getRIMSTestDat("creatRuleAlternative"));
		
		ElementWait.isElementVisible(creatRuleRealState);
		creatRuleRealState.sendKeys(file.getRIMSTestDat("creatRuleRealState"));
		
		ElementWait.isElementVisible(creatRuleCashEquivalent);
		creatRuleCashEquivalent.sendKeys(file.getRIMSTestDat("creatRuleCashEquivalent"));
		
		ElementWait.isElementVisible(creatRuleFeesAmountPA);
		creatRuleFeesAmountPA.sendKeys(file.getRIMSTestDat("creatRuleFeesAmountPA"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Client Fee create rules : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
