package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class MasterCOBMasterBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Master']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//a[contains(text(),'ClientOnBoard Master')]")
	@CacheLookup
	private WebElement ClientOnBoardMaster;

	@FindBy(xpath = "//a[contains(text(),'Legal Status')]")
	@CacheLookup
	private WebElement LegalStatus;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;

	@FindBy(xpath = "//a[contains(text(),'Occupation')]")
	@CacheLookup
	private WebElement Occupation;

	@FindBy(xpath = "//a[contains(text(),'Residential Status')]")
	@CacheLookup
	private WebElement ResidentialStatus;

	public MasterCOBMasterBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void legalStatus() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoardMaster);
		actions.moveToElement(ClientOnBoardMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(LegalStatus);
		actions.moveToElement(LegalStatus).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String LegalStatus = breadcrumb.getText();
		Assert.assertTrue(LegalStatus.contains(file.getBreadcrumb("LegalStatus")), "Legal Status name not exits in breadcrumb");
		System.out.println(LegalStatus);
	}

	public void occupation() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoardMaster);
		actions.moveToElement(ClientOnBoardMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(Occupation);
		actions.moveToElement(Occupation).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Occupation = breadcrumb.getText();
		Assert.assertTrue(Occupation.contains(file.getBreadcrumb("Occupation")), "Occupation not exits in breadcrumb");
		System.out.println(Occupation);
	}

	public void residentialStatus() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoardMaster);
		actions.moveToElement(ClientOnBoardMaster).perform();

		WebDriverWaitFunctions.waitToLoadElement(ResidentialStatus);
		actions.moveToElement(ResidentialStatus).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ResidentialStatus = breadcrumb.getText();
		Assert.assertTrue(ResidentialStatus.contains(file.getBreadcrumb("ResidentialStatus")), "Residential Status name not exits in breadcrumb");
		System.out.println(ResidentialStatus);
	}
}
