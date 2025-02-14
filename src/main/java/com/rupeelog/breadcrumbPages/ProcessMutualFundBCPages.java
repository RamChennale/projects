package com.rupeelog.breadcrumbPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class ProcessMutualFundBCPages {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;

	@FindBy(linkText =  "Process")
	@CacheLookup
	private WebElement Process;
	
	@FindBy(xpath = "//body/div[@id='Maincontent']/div[@id='fluid']/div[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[8]/ul[1]/li[16]/a[1]")
	@CacheLookup
	private WebElement MutualFund;
	
	@FindBy(xpath = "//a[contains(text(),'AUM Upload RTA')]")
	@CacheLookup
	private WebElement AUMUploadRTA;

	@FindBy(xpath = "//ul[@class='breadcrumb']")
	@CacheLookup
	private WebElement breadcrumb;
	
	@FindBy(xpath = "//a[contains(text(),'Folio Mapped')]")
	@CacheLookup
	private WebElement FolioMapped;
	
	@FindBy(xpath = "//a[contains(text(),'Folio Unmapped')]")
	@CacheLookup
	private WebElement FolioUnmapped;
	
	@FindBy(xpath = "//a[contains(text(),'Master Pull BSE Star')]")
	@CacheLookup
	private WebElement MasterPullBSEStar;
	
	@FindBy(xpath = "//a[contains(text(),'Mf Folio Change')]")
	@CacheLookup
	private WebElement MfFolioChange;
	
	@FindBy(xpath = "//a[contains(text(),'MF folio Portfolio Shift')]")
	@CacheLookup
	private WebElement MFfolioPortfolioShift;
	
	@FindBy(xpath = "//a[contains(text(),'MF RTA Corpus - Not Validated')]")
	@CacheLookup
	private WebElement MFRTACorpusNotValidated;
	
	@FindBy(xpath = "//a[contains(text(),'MF Transaction - Not Validated')]")
	@CacheLookup
	private WebElement MFTransactionNotValidated;
	
	@FindBy(xpath = "//a[contains(text(),'Transaction Order Matching')]")
	@CacheLookup
	private WebElement TransactionOrderMatching;
	
	@FindBy(xpath = "//a[contains(text(),'Transaction Upload RTA')]")
	@CacheLookup
	private WebElement TransactionUploadRTA;
	
	@FindBy(xpath = "//a[contains(text(),'Upload Amfi NAV')]")
	@CacheLookup
	private WebElement UploadAmfiNAV;
	
	@FindBy(xpath = "//a[contains(text(),'Validate SIP Error Entries')]")
	@CacheLookup
	private WebElement ValidateSIPErrorEntries;
	
	@FindBy(xpath = "//a[contains(text(),'Validate Wbr9 Error')]")
	@CacheLookup
	private WebElement ValidateWbr9Error;
	
	public ProcessMutualFundBCPages(WebDriver driver) {
		this.driver = driver;
	}

	public void aumUploadRTA() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(AUMUploadRTA);
		actions.moveToElement(AUMUploadRTA).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String AUMUploadRTA = breadcrumb.getText();
		Assert.assertTrue(AUMUploadRTA.contains(file.getBreadcrumb("AUMUploadRTA")), "AUMUploadRTA  not exits in breadcrumb");
		System.out.println(AUMUploadRTA);
	}	
	

	public void folioMapped() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(FolioMapped);
		actions.moveToElement(FolioMapped).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FolioMapped = breadcrumb.getText();
		Assert.assertTrue(FolioMapped.contains(file.getBreadcrumb("FolioMapped")), " FolioMapped not exits in breadcrumb");
		System.out.println(FolioMapped);
	}	

	public void folioUnmapped() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(FolioUnmapped);
		actions.moveToElement(FolioUnmapped).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String FolioUnmapped = breadcrumb.getText();
		Assert.assertTrue(FolioUnmapped.contains(file.getBreadcrumb("FolioUnmapped")), "FolioUnmapped  not exits in breadcrumb");
		System.out.println(FolioUnmapped);
	}	

	public void masterPullBSEStar() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(MasterPullBSEStar);
		actions.moveToElement(MasterPullBSEStar).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MasterPullBSEStar = breadcrumb.getText();
		Assert.assertTrue(MasterPullBSEStar.contains(file.getBreadcrumb("MasterPullBSEStar")), "MasterPullBSEStar  not exits in breadcrumb");
		System.out.println(MasterPullBSEStar);
	}	
	

	public void mfFolioChange() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(MfFolioChange);
		actions.moveToElement(MfFolioChange).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MfFolioChange = breadcrumb.getText();
		Assert.assertTrue(MfFolioChange.contains(file.getBreadcrumb("MfFolioChange")), "MfFolioChange  not exits in breadcrumb");
		System.out.println(MfFolioChange);
	}	

	public void mffolioPortfolioShift() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFfolioPortfolioShift);
		actions.moveToElement(MFfolioPortfolioShift).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MFfolioPortfolioShift = breadcrumb.getText();
		Assert.assertTrue(MFfolioPortfolioShift.contains(file.getBreadcrumb("MFfolioPortfolioShift")), "MFfolioPortfolioShift  not exits in breadcrumb");
		System.out.println(MFfolioPortfolioShift);
	}	

	public void mfRTACorpusNotValidated() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFRTACorpusNotValidated);
		actions.moveToElement(MFRTACorpusNotValidated).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MFRTACorpusNotValidated = breadcrumb.getText();
		Assert.assertTrue(MFRTACorpusNotValidated.contains(file.getBreadcrumb("MFRTACorpusNotValidated")), "MFRTACorpusNotValidated  not exits in breadcrumb");
		System.out.println(MFRTACorpusNotValidated);
	}	

	public void mfTransactionNotValidated() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(MFTransactionNotValidated);
		actions.moveToElement(MFTransactionNotValidated).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String MFTransactionNotValidated = breadcrumb.getText();
		Assert.assertTrue(MFTransactionNotValidated.contains(file.getBreadcrumb("MFTransactionNotValidated")), " MFTransactionNotValidated not exits in breadcrumb");
		System.out.println(MFTransactionNotValidated);
	}	

	public void transactionOrderMatching() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(TransactionOrderMatching);
		actions.moveToElement(TransactionOrderMatching).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String TransactionOrderMatching = breadcrumb.getText();
		Assert.assertTrue(TransactionOrderMatching.contains(file.getBreadcrumb("TransactionOrderMatching")), " TransactionOrderMatching not exits in breadcrumb");
		System.out.println(TransactionOrderMatching);
	}	

	public void transactionUploadRTA() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(TransactionUploadRTA);
		actions.moveToElement(TransactionUploadRTA).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String TransactionUploadRTA = breadcrumb.getText();
		Assert.assertTrue(TransactionUploadRTA.contains(file.getBreadcrumb("TransactionUploadRTA")), " TransactionUploadRTA not exits in breadcrumb");
		System.out.println(TransactionUploadRTA);
	}	

	public void uploadAmfiNAV() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(UploadAmfiNAV);
		actions.moveToElement(UploadAmfiNAV).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String UploadAmfiNAV = breadcrumb.getText();
		Assert.assertTrue(UploadAmfiNAV.contains(file.getBreadcrumb("UploadAmfiNAV")), "UploadAmfiNAV  not exits in breadcrumb");
		System.out.println(UploadAmfiNAV);
	}	

	public void validateSIPErrorEntries() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(ValidateSIPErrorEntries);
		actions.moveToElement(ValidateSIPErrorEntries).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ValidateSIPErrorEntries = breadcrumb.getText();
		Assert.assertTrue(ValidateSIPErrorEntries.contains(file.getBreadcrumb("ValidateSIPErrorEntries")), " ValidateSIPErrorEntries not exits in breadcrumb");
		System.out.println(ValidateSIPErrorEntries);
	}	

	public void validateWbr9Error() {
		actions = new Actions(driver);
		file= new FileReaderUtility();

		WebDriverWaitFunctions.waitToLoadElement(Process);
		actions.moveToElement(Process).perform();

		WebDriverWaitFunctions.waitToLoadElement(MutualFund);
		actions.moveToElement(MutualFund).perform();

		WebDriverWaitFunctions.waitToLoadElement(ValidateWbr9Error);
		actions.moveToElement(ValidateWbr9Error).click().build().perform();

		WebDriverWaitFunctions.waitToLoadElement(breadcrumb);
		String ValidateWbr9Error = breadcrumb.getText();
		Assert.assertTrue(ValidateWbr9Error.contains(file.getBreadcrumb("ValidateWbr9Error")), " ValidateWbr9Error not exits in breadcrumb");
		System.out.println(ValidateWbr9Error);
	}	
}
