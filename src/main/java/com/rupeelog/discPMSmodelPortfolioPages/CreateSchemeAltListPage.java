package com.rupeelog.discPMSmodelPortfolioPages;

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
import com.rupeelog.utilty.JavascriptExecutorUtility;

public class CreateSchemeAltListPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Disc PMS")
	@CacheLookup
	private WebElement DiscPMS;

	@FindBy(linkText = "Model Portfolio")
	@CacheLookup
	private WebElement ModelPortfolio;

	@FindBy(linkText = "Scheme Alternate List")
	@CacheLookup
	private WebElement SchemeAlternateList;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "portfolioName")
	@CacheLookup
	private WebElement saPortfolioNameAutoSugg;

	@FindBy(id = "assetClass")
	@CacheLookup
	private WebElement saAssetClassDD;

	@FindBy(id = "issuerId")
	@CacheLookup
	private WebElement saIssuerDD;

	@FindBy(id = "debtAssetId")
	@CacheLookup
	private WebElement saInstNameDD;

	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement saStartDate;

	@FindBy(id = "endDate")
	@CacheLookup
	private WebElement saEndDate;

	@FindBy(id = "description")
	@CacheLookup
	private WebElement sacomment;
	
	@FindBy(id = "head_btnSave")
	@CacheLookup
	private WebElement saveBtn;
	
	@FindBy(id = "Go")
	@CacheLookup
	private WebElement goBtn;
	

	public CreateSchemeAltListPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createSchemeAltList() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		ElementWait.isElementVisible(ModelPortfolio);
		actions.moveToElement(ModelPortfolio).perform();

		ElementWait.isElementVisible(SchemeAlternateList);
		actions.moveToElement(SchemeAlternateList).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, createBtn);
		createBtn.click();

		ElementWait.isElementVisible(saPortfolioNameAutoSugg);
		saPortfolioNameAutoSugg.sendKeys(file.getDiscPMSTestData("saPortfolioNameAutoSugg"));
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getText().equalsIgnoreCase(file.getDiscPMSTestData("selectsaPortfolioNameAutoSugg")))
				list.get(i).click();
			System.out.println("Model portfolio :  "+list.get(i).getText());
			break;
			}
		
		ElementWait.isElementVisible(saAssetClassDD);
		Select selectsaAssetClassDD= new Select(saAssetClassDD);
		selectsaAssetClassDD.selectByVisibleText(file.getDiscPMSTestData("saAssetClassDD"));

		ElementWait.isElementVisible(saIssuerDD);
		Select selectsaIssuerDD= new Select(saIssuerDD);
		selectsaIssuerDD.selectByVisibleText(file.getDiscPMSTestData("saIssuerDD"));
		
		ElementWait.isElementVisible(saInstNameDD);
		Select selectsaInstNameDD= new Select(saInstNameDD);
		selectsaInstNameDD.selectByVisibleText(file.getDiscPMSTestData("saInstNameDD"));

		ElementWait.isElementVisible(saStartDate);
		JavascriptExecutorUtility.datePickerJavascriptExecutor(driver, saStartDate,
				file.getDiscPMSTestData("saStartDate"));
		
		ElementWait.isElementVisible(saEndDate);
		JavascriptExecutorUtility.datePickerJavascriptExecutor(driver,saEndDate ,
				file.getDiscPMSTestData("saEndDate"));
		
		ElementWait.isElementVisible(sacomment);
		sacomment.sendKeys(file.getDiscPMSTestData("sacomment"));

		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert = driver.switchTo().alert();
			System.out.println("Alert Message: " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException noAlert) {
			noAlert.printStackTrace();
		}
	}
	
	public void viewSchemeAltList() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		ElementWait.isElementVisible(ModelPortfolio);
		actions.moveToElement(ModelPortfolio).perform();

		ElementWait.isElementVisible(SchemeAlternateList);
		actions.moveToElement(SchemeAlternateList).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(saPortfolioNameAutoSugg);
		saPortfolioNameAutoSugg.sendKeys(file.getDiscPMSTestData("saPortfolioNameAutoSugg"));
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getText().equalsIgnoreCase(file.getDiscPMSTestData("selectsaPortfolioNameAutoSugg")))
				list.get(i).click();
			System.out.println("Model portfolio :  "+list.get(i).getText());
			break;
			}
		
		ElementWait.isElementVisible(goBtn);
		goBtn.click();
		
	}
}
