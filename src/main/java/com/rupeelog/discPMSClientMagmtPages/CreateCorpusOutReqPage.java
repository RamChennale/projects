package com.rupeelog.discPMSClientMagmtPages;

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
import com.rupeelog.utilty.JavascriptExecutorUtility;

public class CreateCorpusOutReqPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Disc PMS")
	@CacheLookup
	private WebElement DiscPMS;

	@FindBy(linkText = "Client Management")
	@CacheLookup
	private WebElement ClientManagement;

	@FindBy(linkText = "Corpus Out Request View")
	@CacheLookup
	private WebElement CorpusOutRequestView;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "portfolioIdStr")
	@CacheLookup
	private WebElement coReqPortfolioAutoSugg;

	@FindBy(id = "reqDate")
	@CacheLookup
	private WebElement coReqCorpusOutDate;

	@FindBy(id = "amount")
	@CacheLookup
	private WebElement coReqCorpusOutAmount;

	@FindBy(id = "remarks")
	@CacheLookup
	private WebElement coReqRemarks;

	/*
	 * @FindBy(id = "")
	 * 
	 * @CacheLookup private WebElement coReq;
	 * 
	 * @FindBy(id = "")
	 * 
	 * @CacheLookup private WebElement coReq;
	 */

	@FindBy(id = "save")
	@CacheLookup
	private WebElement saveBtn;

	public CreateCorpusOutReqPage(WebDriver driver) {
		this.driver = driver;
	}

	public void createCorpusOutReq() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		ElementWait.isElementVisible(ClientManagement);
		actions.moveToElement(ClientManagement).perform();

		ElementWait.isElementVisible(CorpusOutRequestView);
		actions.moveToElement(CorpusOutRequestView).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver, createBtn);
		createBtn.click();
		
		ElementWait.isElementVisible(coReqPortfolioAutoSugg);
		coReqPortfolioAutoSugg.sendKeys(file.getDiscPMSTestData("coReqPortfolioAutoSugg"));
		
		ElementWait.isElementVisible(coReqCorpusOutDate);
		JavascriptExecutorUtility.datePickerJavascriptExecutor(driver, coReqCorpusOutDate, file.getDiscPMSTestData("coReqCorpusOutDate"));
		
		ElementWait.isElementVisible(coReqCorpusOutAmount);
		coReqCorpusOutAmount.sendKeys(file.getDiscPMSTestData("coReqCorpusOutAmount"));
		
		ElementWait.isElementVisible(coReqRemarks);
		coReqRemarks.sendKeys(file.getDiscPMSTestData("coReqRemarks"));
		
		ElementWait.scrollToFindElement(driver, saveBtn);
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();

		try {
			alert = driver.switchTo().alert();
			System.out.println("Creation Corpus Out Req : " + alert.getText());
			alert.accept();
		} catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
}
