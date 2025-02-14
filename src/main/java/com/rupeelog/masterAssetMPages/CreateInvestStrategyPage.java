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

public class CreateInvestStrategyPage {

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

	@FindBy(xpath = "//a[text()='Investment Strategy']")
	@CacheLookup
	private WebElement Investment_Strategy;

	@FindBy(css = "#create")
	@CacheLookup
	private WebElement create;

	@FindBy(css = "#invStratergy")
	@CacheLookup
	private WebElement invStratergy;

	@FindBy(css = "#code")
	@CacheLookup
	private WebElement Code;

	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;

	@FindBy(css = "#cancel")
	@CacheLookup
	private WebElement cancel;

	public CreateInvestStrategyPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void createInvestStrategy() {
		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();

		ElementWait.isElementVisible(Asset_Master);
		actions.moveToElement(Asset_Master).perform();

		ElementWait.isElementVisible(Investment_Strategy);
		actions.moveToElement(Investment_Strategy).click().build().perform();

		By overlay = By.cssSelector("#loader");
		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, create);

		ElementWait.isElementVisible(create);
		create.click();

		ElementWait.isElementVisible(invStratergy);
		invStratergy.sendKeys(file.getMasterData("invStratergy"));

		ElementWait.isElementVisible(Code);
		Code.sendKeys(file.getMasterData("invStratergyCode"));

		ElementWait.isElementVisible(save);
		save.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("create Invest Strategy : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nae) {
			nae.printStackTrace();
		}
	}
}
