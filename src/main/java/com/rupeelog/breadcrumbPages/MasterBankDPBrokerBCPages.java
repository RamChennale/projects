package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class MasterBankDPBrokerBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(xpath = "//a[text()='Master']")
	@CacheLookup
	private WebElement master;

	@FindBy(xpath = "//a[contains(text(),'Bank, DP, Broker')]")
	@CacheLookup
	private WebElement BankDPBroker;

	@FindBy(xpath = "//a[contains(text(),'Bank Account Type')]")
	@CacheLookup
	private WebElement BankAccountType;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;

	@FindBy(xpath = "//a[contains(text(),'Bank Master')]")
	@CacheLookup
	private WebElement BankMaster;

	@FindBy(xpath = "//a[contains(text(),'Branch(Bank)')]")
	@CacheLookup
	private WebElement BranchBank;

	@FindBy(xpath = "//*[text()='Broker']")
	@CacheLookup
	private WebElement Broker;

	@FindBy(xpath = "//a[contains(text(),'Broker Bank')]")
	@CacheLookup
	private WebElement BrokerBank;

	@FindBy(xpath = "//a[contains(text(),'Broker Demat')]")
	@CacheLookup
	private WebElement BrokerDemat;

	@FindBy(xpath = "//a[contains(text(),'DP Master')]")
	@CacheLookup
	private WebElement DPMaster;

	public MasterBankDPBrokerBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void bankAccountType() {
		actions = new Actions(driver);
		file=new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(BankDPBroker);
		actions.moveToElement(BankDPBroker).perform();

		WebDriverWaitFunctions.waitToLoadElement(BankAccountType);
		actions.moveToElement(BankAccountType).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String bat = breadcrumb.getText();
		Assert.assertTrue(bat.contains(file.getBreadcrumb("BankAccountType")), "Bank Account Type name not exits in breadcrumb");
		System.out.println(bat);
	}

	public void bankMaster() {
		actions = new Actions(driver);
		file=new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(BankDPBroker);
		actions.moveToElement(BankDPBroker).perform();

		WebDriverWaitFunctions.waitToLoadElement(BankMaster);
		actions.moveToElement(BankMaster).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String bm = breadcrumb.getText();
		Assert.assertTrue(bm.contains(file.getBreadcrumb("BankMaster")), "Bank Master name not exits in breadcrumb");
		System.out.println(bm);
	}

	public void branchBank() {
		actions = new Actions(driver);
		file=new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(BankDPBroker);
		actions.moveToElement(BankDPBroker).perform();

		WebDriverWaitFunctions.waitToLoadElement(BranchBank);
		actions.moveToElement(BranchBank).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String bb = breadcrumb.getText();
		Assert.assertTrue(bb.contains(file.getBreadcrumb("Branch")), "Branch name not exits in breadcrumb");
		System.out.println(bb);
	}

	public void broker() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(BankDPBroker);
		actions.moveToElement(BankDPBroker).perform();

		WebDriverWaitFunctions.waitToLoadElement(Broker);
		actions.moveToElement(Broker).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String broker = breadcrumb.getText();
		Assert.assertTrue(broker.contains(file.getBreadcrumb("Broker")), "Broker name not exits in breadcrumb");
		System.out.println(broker);
	}

	public void brokerBank() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(BankDPBroker);
		actions.moveToElement(BankDPBroker).perform();

		WebDriverWaitFunctions.waitToLoadElement(BrokerBank);
		actions.moveToElement(BrokerBank).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BrokerBank = breadcrumb.getText();
		Assert.assertTrue(BrokerBank.contains(file.getBreadcrumb("BrokerBank")), "Broker Bank name not exits in breadcrumb");
		System.out.println(BrokerBank);
	}

	public void brokerDemat() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(BankDPBroker);
		actions.moveToElement(BankDPBroker).perform();

		WebDriverWaitFunctions.waitToLoadElement(BrokerDemat);
		actions.moveToElement(BrokerDemat).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String BrokerDemat = breadcrumb.getText();
		Assert.assertTrue(BrokerDemat.contains(file.getBreadcrumb("BrokerDemat")), "Broker Demat not exits in breadcrumb");
		System.out.println(BrokerDemat);
	}

	public void dpMaster() {
		actions = new Actions(driver);
		file=new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(master);
		actions.moveToElement(master).perform();

		WebDriverWaitFunctions.waitToLoadElement(BankDPBroker);
		actions.moveToElement(BankDPBroker).perform();

		WebDriverWaitFunctions.waitToLoadElement(DPMaster);
		actions.moveToElement(DPMaster).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String DPMaster = breadcrumb.getText();
		Assert.assertTrue(DPMaster.contains(file.getBreadcrumb("DPMaster")), "DP Master name not exits in breadcrumb");
		System.out.println(DPMaster);
	}
}
