package com.rupeelog.masterAssetMPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateRiskPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;

	@FindBy(linkText = "Asset Master")
	@CacheLookup
	private WebElement Asset_Master;

	@FindBy(xpath = "//a[text()='Risk ']")
	@CacheLookup
	private WebElement Risk ;

	@FindBy(css = "#create")
	@CacheLookup
	private WebElement create;

	@FindBy(css = "#riskParameter")
	@CacheLookup
	private WebElement riskParameter;

	@FindBy(css = "#code")
	@CacheLookup
	private WebElement RiskCode;
	
	@FindBy(css = "#sequence")
	@CacheLookup
	private WebElement sequence;
	
	@FindBy(css = "#minScore")
	@CacheLookup
	private WebElement minScore;
	
	@FindBy(css = "#maxScore")
	@CacheLookup
	private WebElement maxScore;

	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;



	public CreateRiskPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void CreateRisk() {
		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();

		ElementWait.isElementVisible(Asset_Master);
		actions.moveToElement(Asset_Master).perform();

		ElementWait.isElementVisible(Risk);
		actions.moveToElement(Risk).click().build().perform();

		By overlay = By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, create);

		ElementWait.isElementVisible(create);
		create.click();

		ElementWait.isElementVisible(riskParameter);
		riskParameter.sendKeys(file.getMasterData("riskParameter"));

		ElementWait.isElementVisible(RiskCode);
		RiskCode.sendKeys(file.getMasterData("RiskCode"));
		
		ElementWait.isElementVisible(sequence);
		sequence.sendKeys(file.getMasterData("sequence"));

		ElementWait.isElementVisible(minScore);
		minScore.sendKeys(file.getMasterData("minScore"));
		
		ElementWait.isElementVisible(maxScore);
		maxScore.sendKeys(file.getMasterData("maxScore"));

		ElementWait.isElementVisible(save);
		save.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("create Risk : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nae) {
			nae.printStackTrace();
		}
	}
}
