package com.rupeelog.processPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class IndicesBenchCreateIndiceValMEPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Process")
	@CacheLookup
	private WebElement Process;

	@FindBy(xpath = "//body/div[@id='Maincontent']/div[@id='fluid']/div[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[14]/a[1]")
	@CacheLookup
	private WebElement IndicesBenchmark;

	@FindBy(linkText = "Indices / Benchmark Values")
	@CacheLookup
	private WebElement IndicesBenchmarkValues;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "manualEntry")
	@CacheLookup
	private WebElement manualEntryRdBtn;

	@FindBy(id = "indicesCode_1")
	@CacheLookup
	private WebElement ibIndicesCodeDD;

	@FindBy(id = "indicesName_1")
	@CacheLookup
	private WebElement ibIndicesName;

	@FindBy(id = "price_1")
	@CacheLookup
	private WebElement ibPrice;

	@FindBy(id = "updatedDate_1")
	@CacheLookup
	private WebElement ibDate;

	@FindBy(id = "saveMain")
	@CacheLookup
	private WebElement saveBtn;
	
	@FindBy(id = "msg")
	@CacheLookup
	private WebElement result;

	public IndicesBenchCreateIndiceValMEPage(WebDriver driver) {
		this.driver = driver;
	}

	public void indicesBenchCreateIndiceValManualEntry() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(Process);
		actions.moveToElement(Process).perform();

		ElementWait.isElementVisible(IndicesBenchmark);
		actions.moveToElement(IndicesBenchmark).perform();

		ElementWait.isElementVisible(IndicesBenchmarkValues);
		actions.moveToElement(IndicesBenchmarkValues).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, createBtn);
		ElementWait.isElementVisible(createBtn);
		createBtn.click();

		ElementWait.isElementVisible(manualEntryRdBtn);
		if (manualEntryRdBtn.isSelected()) {
			System.out.println("Manual Entry radio button already selected");
		} else {
			manualEntryRdBtn.click();
		}

		ElementWait.isElementVisible(ibIndicesCodeDD);
		Select selectibIndicesCodeDD = new Select(ibIndicesCodeDD);
		selectibIndicesCodeDD.selectByVisibleText(file.getProcessTestData("ibIndicesCodeDD"));

		ElementWait.isElementVisible(ibIndicesName);
		ibIndicesName.clear();
		ibIndicesName.sendKeys(file.getProcessTestData("ibIndicesName"));

		ElementWait.isElementVisible(ibPrice);
		ibPrice.sendKeys(file.getProcessTestData("ibPrice"));

		ElementWait.isElementVisible(ibDate);
		ibDate.sendKeys(file.getProcessTestData("ibDate"));
		
		ElementWait.scrollToFindElement(driver, saveBtn);
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		ElementWait.isElementVisible(result);
		System.out.println(result.getText());
		Assert.assertTrue(result.getText().contains("Successfully"));
		}
}
