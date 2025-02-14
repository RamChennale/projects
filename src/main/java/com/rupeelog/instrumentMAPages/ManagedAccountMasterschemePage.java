package com.rupeelog.instrumentMAPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ScrollPageToFindElement;
import com.rupeelog.utilty.WaitToLoadElement;

public class ManagedAccountMasterschemePage {
	
	WebDriver driver;
	Actions actions;
	
	@FindBy(xpath = "//*[text()='Instrument']")
	@CacheLookup
	private WebElement Instrument;
	
	@FindBy(xpath = "//a[contains(text(),'Instrument Managed Account')]")
	@CacheLookup
	private WebElement InstrumentManagedAccount;
	
	@FindBy(xpath = "//a[contains(text(),'Managed Account Scheme')]")
	@CacheLookup
	private WebElement ManagedAccountScheme;
	
	@FindBy(xpath = "//input[@id='create']")
	@CacheLookup
	private WebElement createButton;
	
	@FindBy(xpath = "//input[@id='SchemeName']")
	@CacheLookup
	private WebElement maSchemeName;
	
	@FindBy(xpath = "//input[@id='ShortName']")
	@CacheLookup
	private WebElement shortName;

	@FindBy(xpath = "//input[@id='SchemeCode']")
	@CacheLookup
	private WebElement schemeCode;

	@FindBy(xpath = "//select[@id='FundId']")
	@CacheLookup
	private WebElement fundDD;

	@FindBy(xpath = "//select[@id='AdvisorId']")
	@CacheLookup
	private WebElement advisorGrpDD;

	@FindBy(xpath = "//select[@id='AssetTypeId']")
	@CacheLookup
	private WebElement assetSubClsDD;

	@FindBy(xpath = "//select[@id='feeType']")
	@CacheLookup
	private WebElement feesTypeDD;

	@FindBy(xpath = "//input[@id='ContactPerson']")
	@CacheLookup
	private WebElement contactPerson;

	@FindBy(xpath = "//input[@id='Email']")
	@CacheLookup
	private WebElement email;

	@FindBy(xpath = "//input[@id='Mobile']")
	@CacheLookup
	private WebElement mobile;

	@FindBy(xpath = "//select[@id='ValuationFrequency']")
	@CacheLookup
	private WebElement frequencyDD;

	@FindBy(xpath = "//select[@id='Type']")
	@CacheLookup
	private WebElement typeDD;

	@FindBy(xpath = "//select[@id='Benchmark']")
	@CacheLookup
	private WebElement benchmarkDD;

	@FindBy(xpath = "//textarea[@id='Description']")
	@CacheLookup
	private WebElement description;

	@FindBy(xpath = "//select[@id='Status']")
	@CacheLookup
	private WebElement statusDD;

	@FindBy(xpath = "//select[@id='orgnId']")
	@CacheLookup
	private WebElement organisationDD;

	@FindBy(xpath = "//input[@id='MaturityDate']")
	@CacheLookup
	private WebElement maturityDate;

	@FindBy(xpath = "//input[@id='ExpenseCode']")
	@CacheLookup
	private WebElement ExpenseCode;

	@FindBy(xpath = "//select[@id='subType']")
	@CacheLookup
	private WebElement subTypeDD;

	//Additional Data
	@FindBy(xpath = "//select[@id='RiskTypeId']")
	@CacheLookup
	private WebElement RiskType;

	@FindBy(xpath = "//select[@id='InvHorizon']")
	@CacheLookup
	private WebElement InvHorizonDD;

	@FindBy(xpath = "//input[@id='MWCode']")
	@CacheLookup
	private WebElement MWCode;

	@FindBy(xpath = "//select[@id='HouseReco']")
	@CacheLookup
	private WebElement HouseRecoDD;

	@FindBy(xpath = "//select[@id='InvStrategy']")
	@CacheLookup
	private WebElement InvStrategyDD;

	@FindBy(xpath = "//input[@id='InvesteeName']")
	@CacheLookup
	private WebElement Investee;

	@FindBy(xpath = "//select[@id='IsSticky']")
	@CacheLookup
	private WebElement IsStickyDD;

	@FindBy(xpath = "//select[@id='MarketCap']")
	@CacheLookup
	private WebElement MarketCapDD;

	@FindBy(xpath = "//input[@id='Param1']")
	@CacheLookup
	private WebElement Param1;

	@FindBy(xpath = "//input[@id='Param2']")
	@CacheLookup
	private WebElement Param2;

	@FindBy(xpath = "//input[@id='Param3']")
	@CacheLookup
	private WebElement Param3;
//Bank Details
	@FindBy(xpath = "//input[@id='iFSCcode']")
	@CacheLookup
	private WebElement iFSCcodeAutoSuggSearch;

	@FindBy(xpath = "//input[@id='beneficiaryName']")
	@CacheLookup
	private WebElement beneficiaryName;

	@FindBy(xpath = "//input[@id='bankAccNo']")
	@CacheLookup
	private WebElement bankAccNo;

	@FindBy(xpath = "//select[@id='bankAccType']")
	@CacheLookup
	private WebElement bankAccTypeDD;

	@FindBy(xpath = "//select[@id='mode']")
	@CacheLookup
	private WebElement bankAccModeDD;

	@FindBy(xpath = "//select[@id='HoldToMaturity']")
	@CacheLookup
	private WebElement HoldToMaturityDD;

	@FindBy(xpath = "//input[@id='save']")
	@CacheLookup
	private WebElement saveButton;
	
	@FindBy(xpath = "//input[@id='cancel']")
	@CacheLookup
	private WebElement cancelButton;

	
	public ManagedAccountMasterschemePage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	public void adddManagedAccountScheme() throws InterruptedException {

		actions= new Actions(driver);
		
		WaitToLoadElement.waitToLoadElement(Instrument);
		actions.moveToElement(Instrument).perform();
		
		WaitToLoadElement.waitToLoadElement(InstrumentManagedAccount);
		actions.moveToElement(InstrumentManagedAccount).perform();
		
		WaitToLoadElement.waitToLoadElement(ManagedAccountScheme);
		actions.moveToElement(ManagedAccountScheme).click().build().perform();
		
		Thread.sleep(5000);
		ScrollPageToFindElement.findElementByPageScrolling(driver, createButton);
		WaitToLoadElement.waitToLoadElement(createButton);
		createButton.click();

		WaitToLoadElement.waitToLoadElement(maSchemeName);
		maSchemeName.sendKeys("Life Insurance");
		WaitToLoadElement.waitToLoadElement(shortName);
		shortName.sendKeys("LIC");
		WaitToLoadElement.waitToLoadElement(schemeCode);
		schemeCode.sendKeys("1011");
		WaitToLoadElement.waitToLoadElement(fundDD);
		Select fundDDSelect= new Select(fundDD);
		fundDDSelect.selectByIndex(2);
		WaitToLoadElement.waitToLoadElement(advisorGrpDD);
		Select advisorGrpDDSelect= new Select(advisorGrpDD);
		advisorGrpDDSelect.selectByIndex(2);
		WaitToLoadElement.waitToLoadElement(assetSubClsDD);
		Select assetSubClsDDSelect= new Select(assetSubClsDD);
		assetSubClsDDSelect.selectByIndex(2);
		WaitToLoadElement.waitToLoadElement(feesTypeDD);
		Select feesTpyeDDSelect= new Select(feesTypeDD);
		feesTpyeDDSelect.selectByIndex(2);
		WaitToLoadElement.waitToLoadElement(contactPerson);
		contactPerson.sendKeys("Rajesh");
		WaitToLoadElement.waitToLoadElement(email);
		email.sendKeys("rj@gmail.com");
		WaitToLoadElement.waitToLoadElement(mobile);
		mobile.sendKeys("8374783897");
		WaitToLoadElement.waitToLoadElement(frequencyDD);
		Select frequencyDDSelect= new Select(frequencyDD);
		frequencyDDSelect.selectByIndex(2);
		WaitToLoadElement.waitToLoadElement(typeDD);
		Select typeDDselect= new Select(typeDD);
		typeDDselect.selectByIndex(2);
		WaitToLoadElement.waitToLoadElement(benchmarkDD);
		Select benchmarkDDSelect= new Select(benchmarkDD);
		benchmarkDDSelect.selectByIndex(2);
		WaitToLoadElement.waitToLoadElement(description);
		description.sendKeys("Good life cover policy");
		WaitToLoadElement.waitToLoadElement(statusDD);
		Select statusDDSelect= new Select(statusDD);
		statusDDSelect.selectByVisibleText("Active");
		WaitToLoadElement.waitToLoadElement(organisationDD);
		Select organisationDDSelect= new Select(organisationDD);
		organisationDDSelect.selectByVisibleText("Sathya IFA-1");
		WaitToLoadElement.waitToLoadElement(maturityDate);
		maturityDate.sendKeys("01/01/2022");
		WaitToLoadElement.waitToLoadElement(ExpenseCode);
		ExpenseCode.sendKeys("1010");
		WaitToLoadElement.waitToLoadElement(subTypeDD);
		Select subTypeDDSlect= new Select(subTypeDD);
		subTypeDDSlect.selectByIndex(2);
		
		//***************Additional Data****************
		ScrollPageToFindElement.findElementByPageScrolling(driver, Param3);
		WaitToLoadElement.waitToLoadElement(RiskType);
		Select RiskTypeselect= new Select(RiskType);
		RiskTypeselect.selectByIndex(2);
		
		WaitToLoadElement.waitToLoadElement(InvHorizonDD);
		Select InvHorizonDDSelect= new Select(InvHorizonDD);
		InvHorizonDDSelect.selectByIndex(2);
		
		WaitToLoadElement.waitToLoadElement(MWCode);
		MWCode.sendKeys("2010");
		WaitToLoadElement.waitToLoadElement(HouseRecoDD);
		Select HouseRecoDDSelect= new Select(HouseRecoDD);
		HouseRecoDDSelect.selectByIndex(2);

		WaitToLoadElement.waitToLoadElement(InvStrategyDD);
		Select InvStrategyDDSelect= new Select(InvStrategyDD);
		InvStrategyDDSelect.selectByIndex(2);

		WaitToLoadElement.waitToLoadElement(Investee);
		Investee.sendKeys("Rupeelog");
		WaitToLoadElement.waitToLoadElement(IsStickyDD);
		Select IsStickyDDSelect= new Select(IsStickyDD);
		IsStickyDDSelect.selectByVisibleText("Yes");

		WaitToLoadElement.waitToLoadElement(MarketCapDD);
		Select MarketCapDDSelect= new Select(MarketCapDD);
		MarketCapDDSelect.selectByIndex(2);
		
		WaitToLoadElement.waitToLoadElement(Param1);
		Param1.sendKeys("Pre mature");
		WaitToLoadElement.waitToLoadElement(Param2);
		Param2.sendKeys("mature");
		WaitToLoadElement.waitToLoadElement(Param3);
		Param3.sendKeys("post mature");
		
		//***************Bank details*******************
		ScrollPageToFindElement.findElementByPageScrolling(driver, cancelButton);
		WaitToLoadElement.waitToLoadElement(iFSCcodeAutoSuggSearch);
		iFSCcodeAutoSuggSearch.sendKeys("INDB0000001");
		
	
		List<WebElement> bankList= driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all']//li[@class='ui-menu-item']"));
		WaitToLoadElement.waitToLoadAllElements(bankList);
		for(int i=0; i < bankList.size() ;i++) {
			if(bankList.get(i).getText().equalsIgnoreCase("INDB0000001")) {
				bankList.get(i).click();
			}
		}
		
		WaitToLoadElement.waitToLoadElement(beneficiaryName);
		beneficiaryName.sendKeys("Ramana");
		WaitToLoadElement.waitToLoadElement(bankAccNo);
		bankAccNo.sendKeys("989028847");
		WaitToLoadElement.waitToLoadElement(bankAccTypeDD);
		Select bankAccTypeDDselect= new Select(bankAccTypeDD);
		bankAccTypeDDselect.selectByIndex(2);
		WaitToLoadElement.waitToLoadElement(bankAccModeDD);
		Select bankAccModeDDselect= new Select(bankAccModeDD);
		bankAccModeDDselect.selectByVisibleText("NEFT");;
		
		WaitToLoadElement.waitToLoadElement(HoldToMaturityDD);
		Select HoldToMaturityDDSelect= new Select(HoldToMaturityDD);
		HoldToMaturityDDSelect.selectByVisibleText("Yes");
	
		WaitToLoadElement.waitToLoadElement(saveButton);
		//saveButton.click();
		WaitToLoadElement.waitToLoadElement(cancelButton);
		cancelButton.click();
		Thread.sleep(5000);
	}
}
