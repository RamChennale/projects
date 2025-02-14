package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AdminCOBBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Admin']")
	@CacheLookup
	private WebElement Admin;

	@FindBy(xpath = "//a[contains(text(),'Client-On-Boarding')]")
	@CacheLookup
	private WebElement ClientOnBoarding;

	@FindBy(xpath = "//a[contains(text(),'BSE Aof')]")
	@CacheLookup
	private WebElement BSEAof;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'BSE-Star Fatca')]")
	@CacheLookup
	private WebElement BSEStarFatca;
	
	@FindBy(xpath = "//a[contains(text(),'BSE-Star UCC')]")
	@CacheLookup
	private WebElement BSEStarUCC;

	@FindBy(xpath = "//*[text()='Document Upload']")
	@CacheLookup
	private WebElement DocumentUpload;
	
	@FindBy(xpath = "//a[contains(text(),'Document Verification')]")
	@CacheLookup
	private WebElement DocumentVerification;
	
	@FindBy(xpath = "//*[text()='Family']")
	@CacheLookup
	private WebElement Family;

	@FindBy(xpath = "//*[text()='Family Comments']")
	@CacheLookup
	private WebElement FamilyComments;

	@FindBy(xpath = "//a[contains(text(),'Investment Account')]")
	@CacheLookup
	private WebElement InvestmentAccount;

	@FindBy(xpath = "//a[contains(text(),'KYPH')]")
	@CacheLookup
	private WebElement KYPH;

	@FindBy(xpath = "//a[contains(text(),'Portfolio')]")
	@CacheLookup
	private WebElement Portfolio;

	@FindBy(xpath = "//a[contains(text(),'View Kyph Documents')]")
	@CacheLookup
	private WebElement ViewKyphDocuments;
	
	public AdminCOBBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void bseAof() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoarding);
		actions.moveToElement(ClientOnBoarding).perform();

		WebDriverWaitFunctions.waitToLoadElement(BSEAof);
		actions.moveToElement(BSEAof).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BSEAof = breadcrumb.getText();
		Assert.assertTrue(BSEAof.contains(file.getBreadcrumb("BSEAof")), "BSEAof name not exits in breadcrumb");
		System.out.println(BSEAof);
	}
	public void bseStarFatca() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoarding);
		actions.moveToElement(ClientOnBoarding).perform();

		WebDriverWaitFunctions.waitToLoadElement(BSEStarFatca);
		actions.moveToElement(BSEStarFatca).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BSEStarFatca = breadcrumb.getText();
		Assert.assertTrue(BSEStarFatca.contains(file.getBreadcrumb("BSEStarFatca")), "BSEStarFatca name not exits in breadcrumb");
		System.out.println(BSEStarFatca);
	}
	
	
	public void bseStarUCC() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoarding);
		actions.moveToElement(ClientOnBoarding).perform();

		WebDriverWaitFunctions.waitToLoadElement(BSEStarUCC);
		actions.moveToElement(BSEStarUCC).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BSEStarUCC = breadcrumb.getText();
		Assert.assertTrue(BSEStarUCC.contains(file.getBreadcrumb("BSEStarUCC")), "BSEStarUCC name not exits in breadcrumb");
		System.out.println(BSEStarUCC);
	}
	
	public void documentUpload() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoarding);
		actions.moveToElement(ClientOnBoarding).perform();

		WebDriverWaitFunctions.waitToLoadElement(DocumentUpload);
		actions.moveToElement(DocumentUpload).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String DocumentUpload = breadcrumb.getText();
		Assert.assertTrue(DocumentUpload.contains(file.getBreadcrumb("DocumentUpload")), "DocumentUpload name not exits in breadcrumb");
		System.out.println(DocumentUpload);
	}
	
	public void documentVerification() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoarding);
		actions.moveToElement(ClientOnBoarding).perform();

		WebDriverWaitFunctions.waitToLoadElement(DocumentVerification);
		actions.moveToElement(DocumentVerification).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String DocumentVerification = breadcrumb.getText();
		Assert.assertTrue(DocumentVerification.contains(file.getBreadcrumb("DocumentVerification")), "DocumentVerification name not exits in breadcrumb");
		System.out.println(DocumentVerification);
	}
	
	public void family() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoarding);
		actions.moveToElement(ClientOnBoarding).perform();

		WebDriverWaitFunctions.waitToLoadElement(Family);
		actions.moveToElement(Family).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Family = breadcrumb.getText();
		Assert.assertTrue(Family.contains(file.getBreadcrumb("Family")), "Family name not exits in breadcrumb");
		System.out.println(Family);
	}
	
	public void familyComments() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoarding);
		actions.moveToElement(ClientOnBoarding).perform();

		WebDriverWaitFunctions.waitToLoadElement(FamilyComments);
		actions.moveToElement(FamilyComments).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FamilyComments = breadcrumb.getText();
		Assert.assertTrue(FamilyComments.contains(file.getBreadcrumb("FamilyComments")), "FamilyComments name not exits in breadcrumb");
		System.out.println(FamilyComments);
	}
	
	public void investmentAccount() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoarding);
		actions.moveToElement(ClientOnBoarding).perform();

		WebDriverWaitFunctions.waitToLoadElement(InvestmentAccount);
		actions.moveToElement(InvestmentAccount).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String InvestmentAccount = breadcrumb.getText();
		Assert.assertTrue(InvestmentAccount.contains(file.getBreadcrumb("InvestmentAccount")), "InvestmentAccount name not exits in breadcrumb");
		System.out.println(InvestmentAccount);
	}
	
	public void kYPH() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoarding);
		actions.moveToElement(ClientOnBoarding).perform();

		WebDriverWaitFunctions.waitToLoadElement(KYPH);
		actions.moveToElement(KYPH).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String KYPH = breadcrumb.getText();
		Assert.assertTrue(KYPH.contains(file.getBreadcrumb("KYPH")), "KYPH name not exits in breadcrumb");
		System.out.println(KYPH);
	}
	
	public void portfolio() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoarding);
		actions.moveToElement(ClientOnBoarding).perform();

		WebDriverWaitFunctions.waitToLoadElement(Portfolio);
		actions.moveToElement(Portfolio).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String Portfolio = breadcrumb.getText();
		Assert.assertTrue(Portfolio.contains(file.getBreadcrumb("Portfolio")), "Portfolio name not exits in breadcrumb");
		System.out.println(Portfolio);
	}
	
	public void viewKyphDocuments() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Admin);
		actions.moveToElement(Admin).perform();

		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoarding);
		actions.moveToElement(ClientOnBoarding).perform();

		WebDriverWaitFunctions.waitToLoadElement(ViewKyphDocuments);
		actions.moveToElement(ViewKyphDocuments).click().build().perform();

		/*
		 * WebDriverWaitFunctions.waitToLoadElement(breadcrumb); String
		 * ViewKyphDocuments = breadcrumb.getText();
		 * Assert.assertTrue(ViewKyphDocuments.contains(file.getBreadcrumb(
		 * "ViewKyphDocuments")), "ViewKyphDocuments name not exits in breadcrumb");
		 * System.out.println(ViewKyphDocuments);
		 */	}
	
	

}
