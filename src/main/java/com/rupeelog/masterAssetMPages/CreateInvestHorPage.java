package com.rupeelog.masterAssetMPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateInvestHorPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;

	@FindBy(linkText = "Asset Master")
	@CacheLookup
	private WebElement Asset_Master;

	@FindBy(xpath = "//a[text()='Investment Horizon']")
	@CacheLookup
	private WebElement Investment_Horizon;

	@FindBy(css = "#create")
	@CacheLookup
	private WebElement create;

	@FindBy(css = "#investmentHorizon")
	@CacheLookup
	private WebElement investmentHorizon;

	@FindBy(css = "#code")
	@CacheLookup
	private WebElement Code;

	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;

	@FindBy(css = "#cancel")
	@CacheLookup
	private WebElement cancel;

	public CreateInvestHorPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void createInvestHorizon() {
		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();

		ElementWait.isElementVisible(Asset_Master);
		actions.moveToElement(Asset_Master).perform();

		ElementWait.isElementVisible(Investment_Horizon);
		actions.moveToElement(Investment_Horizon).click().build().perform();

		By overlay = By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, create);

		ElementWait.isElementVisible(create);
		create.click();

		ElementWait.isElementVisible(investmentHorizon);
		investmentHorizon.sendKeys(file.getMasterData("investmentHorizon"));

		ElementWait.isElementVisible(Code);
		Code.sendKeys(file.getMasterData("investmentHorizonCode"));

		ElementWait.isElementVisible(save);
		save.click();

	}
}
