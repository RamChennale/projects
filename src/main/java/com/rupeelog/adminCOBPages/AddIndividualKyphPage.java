package com.rupeelog.adminCOBPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.ScrollPageToFindElement;
import com.rupeelog.utilty.WaitToLoadElement;

public class AddIndividualKyphPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	
	@FindBy(xpath = "//*[text()='Admin']")
	@CacheLookup
	private WebElement adminMenu;
	
	@FindBy(xpath = "//*[text()='Client-On-Boarding']")
	@CacheLookup
	private WebElement clientSubMenu;
	
	@FindBy(xpath = "//*[text()='KYPH']")
	@CacheLookup
	private WebElement kyph;

	@FindBy(xpath = "//input[@id='createInd']")
	@CacheLookup
	private WebElement createIndividual;
	
	//KYC
	@FindBy(xpath = "//input[@id='kyc_number']")
	@CacheLookup
	private WebElement kycNumber;
	
	@FindBy(xpath = "//input[@id='kyc_panNo']")
	@CacheLookup
	private WebElement panNo;
	
	@FindBy(xpath = "//select[@id='kyc_status']")
	@CacheLookup
	private WebElement kycStatusDD;
	
	@FindBy(xpath = "//input[@id='kyc_statusDate']")
	@CacheLookup
	private WebElement kycStatusDate;
	
	@FindBy(xpath = "//input[@id='kyc_downDate']")
	@CacheLookup
	private WebElement kycDownloadDate;
	
	@FindBy(xpath = "//input[@id='kyc_firstName']")
	@CacheLookup
	private WebElement name;

	@FindBy(xpath = "//input[@id='kyc_middleName']")
	@CacheLookup
	private WebElement middleName;
	
	@FindBy(xpath = "//input[@id='kyc_lastName']")
	@CacheLookup
	private WebElement lastName;
	
	@FindBy(xpath = "//select[@id='kyc_exempt']")
	@CacheLookup
	private WebElement exemptionCategoryDD;
	
	@FindBy(xpath = "//input[@id='maidenFname']")
	@CacheLookup
	private WebElement maidenName;
	
	@FindBy(xpath = "//input[@id='maidenMname']")
	@CacheLookup
	private WebElement maidenMname;
	
	@FindBy(xpath = "//input[@id='maidenLname']")
	@CacheLookup
	private WebElement maidenLname;
	
	@FindBy(xpath = "//input[@id='motherFname']")
	@CacheLookup
	private WebElement motherFname;
	
	@FindBy(xpath = "//input[@id='motherMname']")
	@CacheLookup
	private WebElement motherMname;
	
	@FindBy(xpath = "//input[@id='motherLname']")
	@CacheLookup
	private WebElement motherLname;
	
	@FindBy(xpath = "//input[@id='kyc_relationName']")
	@CacheLookup
	private WebElement fatherORspouseName;
	
	@FindBy(xpath = "//select[@id='kyc_relation']")
	@CacheLookup
	private WebElement relationWithKyphDD;
	
	@FindBy(xpath = "//select[@id='kyc_gender']")
	@CacheLookup
	private WebElement genderDD;
	
	@FindBy(xpath = "//select[@id='kyc_maritalStatus']")
	@CacheLookup
	private WebElement maritalStatusDD;
	
	@FindBy(xpath = "//input[@id='kyc_dob']")
	@CacheLookup
	private WebElement dobKYC;
	
	@FindBy(xpath = "//select[@id='kyc_nationality']")
	@CacheLookup
	private WebElement nationalityDD;
	
	@FindBy(xpath = "//select[@id='kyc_legalStatusId']")
	@CacheLookup
	private WebElement legalStatusDD;
	
	@FindBy(xpath = "//select[@id='residentialStatusId']")
	@CacheLookup
	private WebElement residentialStatusDD;
	
	@FindBy(xpath = "//input[@id='kyc_aadhaar']")
	@CacheLookup
	private WebElement aadhaar;
	
	@FindBy(xpath = "//input[@id='vidNo']")
	@CacheLookup
	private WebElement vidNo;
	
	@FindBy(xpath = "//select[@id='accountType']")
	@CacheLookup
	private WebElement accountTypeDD;
	
	@FindBy(xpath = "//textarea[@id='kyc_address1']")
	@CacheLookup
	private WebElement corrAddress;
	
	@FindBy(xpath = "//select[@id='addressType1']")
	@CacheLookup
	private WebElement addressType1DD;
	
	@FindBy(xpath = "//select[@id='corrAddType']")
	@CacheLookup
	private WebElement corrAddTypeDD;
	
	@FindBy(xpath = "//input[@id='kyc_pincode1']")
	@CacheLookup
	private WebElement kycPincode;
	
	@FindBy(xpath = "//select[@id='orgnId']")
	@CacheLookup
	private WebElement organisationDD;
	
	@FindBy(xpath = "//input[@id='kyc_phone1']")
	@CacheLookup
	private WebElement telOffice;
	
	@FindBy(xpath = "//input[@id='kyc_phone2']")
	@CacheLookup
	private WebElement telRes;
	
	@FindBy(xpath = "//select[@id='ReKYC']")
	@CacheLookup
	private WebElement ReKYCDD;
	
	@FindBy(xpath = "//input[@id='kyc_mobile']")
	@CacheLookup
	private WebElement mobile;
	
	@FindBy(xpath = "//input[@id='kyc_fax']")
	@CacheLookup
	private WebElement fax;
	
	@FindBy(xpath = "//select[@id='Period']")
	@CacheLookup
	private WebElement periodDD;
	
	@FindBy(xpath = "//input[@id='kyc_email']")
	@CacheLookup
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='cl_same_contact']")
	@CacheLookup
	private WebElement checkBoxPermAdrSAMEcorrAdr;
	
	@FindBy(xpath = "//textarea[@id='kyc_address2']")
	@CacheLookup
	private WebElement permanentAddress;
	
	@FindBy(xpath = "//select[@id='addressType2']")
	@CacheLookup
	private WebElement addressType2DD;
	
	@FindBy(xpath = "//select[@id='addressCountry']")
	@CacheLookup
	private WebElement permanentAddressDD;
	
	@FindBy(xpath = "//input[@id='kyc_pincode2']")
	@CacheLookup
	private WebElement pincodePermAdr;
	
	@FindBy(xpath = "//input[@id='kyc_otherInfo']")
	@CacheLookup
	private WebElement kycAnyotherInfo;
	
	@FindBy(xpath = "//input[@id='cancel']")
	@CacheLookup
	private WebElement cancelButtonKYC;
	
	@FindBy(xpath = "//button[@id='next']")
	@CacheLookup
	private WebElement nextButtonKYC;
	
	//FATCA************
	@FindBy(xpath = "//span[contains(text(),'FATCA')]")
	@CacheLookup
	private WebElement FATCA;	
	
	
	@FindBy(xpath = "//input[@id='fatca_isMinor']")
	@CacheLookup
	private WebElement isMinorCheckBox;	
	
	@FindBy(xpath = "//input[@id='fatca_guardPanNo']")
	@CacheLookup
	private WebElement guardPanNo;
	
	@FindBy(xpath = "//input[@id='fatca_guardName']")
	@CacheLookup
	private WebElement guardName;
	
	@FindBy(xpath = "//select[@id='fatca_relationGuard']")
	@CacheLookup
	private WebElement relationWithGuardDD;
	
	@FindBy(xpath = "//select[@id='fatca_AddrType']")
	@CacheLookup
	private WebElement fatcaAddrTypeDD;	
	
	@FindBy(xpath = "//input[@id='fatca_birthPlc']")
	@CacheLookup
	private WebElement placeOfBirth;
	
	@FindBy(xpath = "//select[@id='fatca_cnty_birth']")
	@CacheLookup
	private WebElement countybirthDD;
	
	@FindBy(xpath = "//select[@id='fatca_appIncVal']")
	@CacheLookup
	private WebElement appIncValDD;
	
	@FindBy(xpath = "//select[@id='fatca_occupation']")
	@CacheLookup
	private WebElement occupationDD;
	
	@FindBy(xpath = "//select[@id='fatca_incSrc']")
	@CacheLookup
	private WebElement sourceOfIncoDD;
	
	@FindBy(xpath = "//input[@id='fatca_netWorth']")
	@CacheLookup
	private WebElement totNetWorthInCr;
	
	@FindBy(xpath = "//input[@id='fatca_netWorOnDate']")
	@CacheLookup
	private WebElement netWorthAsOn;
	
	/* Disabled as of now
	 * @FindBy(xpath = "//input[@id='otherSrc']")
	 * 
	 * @CacheLookup private WebElement otherIncomeSrc;
	 */

	@FindBy(xpath = "//select[@id='fatca_pep']")
	@CacheLookup
	private WebElement pepDD;
	
	@FindBy(xpath = "//input[@id='fatca_otherInfo']")
	@CacheLookup
	private WebElement fatcaAnyOtherInfo;
	
	@FindBy(xpath = "//select[@id='fatca_cntyTax1']")
	@CacheLookup
	private WebElement countryTaxRes1DD;
	
	@FindBy(xpath = "//input[@id='fatca_tpId1']")
	@CacheLookup
	private WebElement taxPayID1;
	
	@FindBy(xpath = "//select[@id='fatca_idtype1']")
	@CacheLookup
	private WebElement idtype1DD;
	
	@FindBy(xpath = "//select[@id='fatca_cntyTax1'] ")
	@CacheLookup
	private WebElement countryTaxRes2DD;

	@FindBy(xpath = "//input[@id='fatca_tpId2']")
	@CacheLookup
	private WebElement taxPayID2;
	
	@FindBy(xpath = "//select[@id='fatca_idtype2']")
	@CacheLookup
	private WebElement idtype2DD;
	
	@FindBy(xpath = "//select[@id='fatca_cntyTax3']")
	@CacheLookup
	private WebElement countryTaxRes3DD;
	
	@FindBy(xpath = "//input[@id='fatca_tpId3']")
	@CacheLookup
	private WebElement taxPayID3;
	
	@FindBy(xpath = "//select[@id='fatca_idtype3']")
	@CacheLookup
	private WebElement idtype3DD;
	
	@FindBy(xpath = "//select[@id='fatca_cntyTax4'] ")
	@CacheLookup
	private WebElement countryTaxRes4DD;

	@FindBy(xpath = "//input[@id='fatca_tpId4']")
	@CacheLookup
	private WebElement taxPayID4;
	
	/*
	 * @FindBy(xpath = "//select[@id='fatca_idtype4']")
	 * 
	 * @CacheLookup private WebElement idtype4DD;
	 */
	
	@FindBy(xpath = "//button[@id='next']")
	@CacheLookup
	private WebElement nextButtonFatca;
	
	//specific
	@FindBy(xpath = "//span[contains(text(),'Specific')]")
	@CacheLookup
	private WebElement specific;

	
	@FindBy(xpath = "//select[@id='specific_salutation']")
	@CacheLookup
	private WebElement salutationDD;

	@FindBy(xpath = "//select[@id='spec_riskProfileId']")
	@CacheLookup
	private WebElement riskProfileInvestPlcyDD;
	
	@FindBy(xpath = "//select[@id='pmlaRiskId']")
	@CacheLookup
	private WebElement riskProfilePMLAplcyDD;
	
	@FindBy(xpath = "//select[@id='specific_clientHA']")
	@CacheLookup
	private WebElement doseClientAssetOthrIADD;
	
	@FindBy(xpath = "//input[@id='companyName']")
	@CacheLookup
	private WebElement clientOrg;

	//KRA status
	@FindBy(xpath = "//select[@id='specific_cdsl']")
	@CacheLookup
	private WebElement cdslDD;
	
	@FindBy(xpath = "//select[@id='specific_nsdl']")
	@CacheLookup
	private WebElement nsdlDD;
	
	@FindBy(xpath = "//select[@id='specific_dotex']")
	@CacheLookup
	private WebElement dotexDD;
	
	@FindBy(xpath = "//select[@id='specific_cams']")
	@CacheLookup
	private WebElement camsDD;
	
	@FindBy(xpath = "//select[@id='specific_karvy']")
	@CacheLookup
	private WebElement karvyDD;
	
	@FindBy(xpath = "//input[@id='specific_annivDate']")
	@CacheLookup
	private WebElement annivDate;
	
	@FindBy(xpath = "//input[@id='specific_spouseDob']")
	@CacheLookup
	private WebElement dobSpouseDate;
	
	@FindBy(xpath = "//select[@id='specific_defaultAdd']")
	@CacheLookup
	private WebElement defaultAddDD;
	
	@FindBy(xpath = "//input[@id='commenceDate']")
	@CacheLookup
	private WebElement commenceDate;

	@FindBy(xpath = "//input[@id='specific_uid']")
	@CacheLookup
	private WebElement uid;
	
	
	@FindBy(xpath = "//input[@id='save']")
	@CacheLookup 
	private WebElement saveKYPHButton;
	 
	@FindBy(xpath = "//input[@id='cancel']")
	@CacheLookup
	private WebElement cancelKYPHButton;
	
	
	
	public AddIndividualKyphPage(WebDriver ldriver) {
		this.driver=ldriver;
	}

	public void addIndividualKYPH() throws IOException, InterruptedException {
		file= new FileReaderUtility();
		actions = new Actions(driver);
		WaitToLoadElement.waitToLoadElement(adminMenu);
		actions.moveToElement(adminMenu).perform();
		WaitToLoadElement.waitToLoadElement(clientSubMenu);
		actions.moveToElement(clientSubMenu).perform();
		WaitToLoadElement.waitToLoadElement(kyph);
		actions.moveToElement(kyph).click().build().perform();
		Thread.sleep(5000);
		ScrollPageToFindElement.findElementByPageScrolling(driver, createIndividual);
		createIndividual.click();
		
		//KYC Details
		WaitToLoadElement.waitToLoadElement(kycNumber);
		kycNumber.sendKeys(file.getAdminCOBTestData("kycNum"));
		WaitToLoadElement.waitToLoadElement(panNo);
		panNo.sendKeys(file.getAdminCOBTestData("panNo"));
		WaitToLoadElement.waitToLoadElement(kycStatusDD);
		Select kycStatusDDSL= new Select(kycStatusDD);
		kycStatusDDSL.selectByVisibleText(file.getAdminCOBTestData("kycStatus"));
		WaitToLoadElement.waitToLoadElement(kycStatusDate);
		kycStatusDate.sendKeys(file.getAdminCOBTestData("kycStatusDate"));
		
		WaitToLoadElement.waitToLoadElement(kycDownloadDate);
		kycDownloadDate.sendKeys(file.getAdminCOBTestData("kycDownlDate"));
		WaitToLoadElement.waitToLoadElement(name);
		name.sendKeys(file.getAdminCOBTestData("name"));
		WaitToLoadElement.waitToLoadElement(middleName);
		middleName.sendKeys(file.getAdminCOBTestData("mname"));
		WaitToLoadElement.waitToLoadElement(lastName);
		lastName.sendKeys(file.getAdminCOBTestData("lname"));
		WaitToLoadElement.waitToLoadElement(exemptionCategoryDD);
		Select exemptionCategoryDDSL= new Select(exemptionCategoryDD);
		exemptionCategoryDDSL.selectByVisibleText(file.getAdminCOBTestData("exCate"));
		WaitToLoadElement.waitToLoadElement(maidenName);
		maidenName.sendKeys(file.getAdminCOBTestData("maidN"));
		WaitToLoadElement.waitToLoadElement(maidenMname);
		maidenMname.sendKeys(file.getAdminCOBTestData("maidMN"));
		WaitToLoadElement.waitToLoadElement(maidenLname);
		maidenLname.sendKeys(file.getAdminCOBTestData("maidLN"));
		WaitToLoadElement.waitToLoadElement(motherFname);
		motherFname.sendKeys(file.getAdminCOBTestData("motherN"));
		WaitToLoadElement.waitToLoadElement(motherMname);
		motherMname.sendKeys(file.getAdminCOBTestData("motherM"));
		WaitToLoadElement.waitToLoadElement(motherLname);
		motherLname.sendKeys(file.getAdminCOBTestData("motherL"));
		WaitToLoadElement.waitToLoadElement(fatherORspouseName);
		fatherORspouseName.sendKeys(file.getAdminCOBTestData("fsName"));
		WaitToLoadElement.waitToLoadElement(relationWithKyphDD);
		Select relationWithKyphSL= new Select(relationWithKyphDD);
		relationWithKyphSL.selectByVisibleText(file.getAdminCOBTestData("relKyph"));
		WaitToLoadElement.waitToLoadElement(genderDD);
		Select genderSL= new Select(genderDD);
		genderSL.selectByVisibleText(file.getAdminCOBTestData("gender"));
		
		/*
		 * WaitToLoadElement.waitToLoadElement(maritalStatusDD); Select maritalStatusSL=
		 * new Select(maritalStatusDD);
		 * maritalStatusSL.selectByVisibleText(file.getAdminCOBTestData("maritalStatus"));
		 */
		WaitToLoadElement.waitToLoadElement(dobKYC);
		dobKYC.sendKeys(file.getAdminCOBTestData("dob"));
		ScrollPageToFindElement.findElementByPageScrolling(driver, periodDD);
		WaitToLoadElement.waitToLoadElement(nationalityDD);
		Select nationalityDDSL= new Select(nationalityDD);
		nationalityDDSL.selectByVisibleText(file.getAdminCOBTestData("nationality"));

		WaitToLoadElement.waitToLoadElement(legalStatusDD);
		Select legalStatusDDSL= new Select(legalStatusDD);
		legalStatusDDSL.selectByVisibleText(file.getAdminCOBTestData("legalStatus"));

		WaitToLoadElement.waitToLoadElement(residentialStatusDD);
		Select residentialStatusDDSL= new Select(residentialStatusDD);
		residentialStatusDDSL.selectByVisibleText(file.getAdminCOBTestData("residentSt"));

		/*
		 * WaitToLoadElement.waitToLoadElement(aadhaar);
		 * aadhaar.sendKeys(file.getAdminCOBTestData("adhar"));
		 * WaitToLoadElement.waitToLoadElement(vidNo);
		 * vidNo.sendKeys(file.getAdminCOBTestData("vidNo"));
		 * WaitToLoadElement.waitToLoadElement(accountTypeDD); Select accountTypeDDSL=
		 * new Select(accountTypeDD);
		 * accountTypeDDSL.selectByVisibleText(file.getAdminCOBTestData("accType"));
		 */		
		WaitToLoadElement.waitToLoadElement(corrAddress);
		corrAddress.sendKeys(file.getAdminCOBTestData("corrAdr"));
		WaitToLoadElement.waitToLoadElement(addressType1DD);
		Select addressType1DDSL= new Select(addressType1DD);
		addressType1DDSL.selectByVisibleText(file.getAdminCOBTestData("adrType1"));

		WaitToLoadElement.waitToLoadElement(corrAddTypeDD);
		Select corrAddTypeDDSL= new Select(corrAddTypeDD);
		corrAddTypeDDSL.selectByVisibleText(file.getAdminCOBTestData("corrAdrType"));
		
		WaitToLoadElement.waitToLoadElement(kycPincode);
		kycPincode.sendKeys(file.getAdminCOBTestData("kycPincode"));
		WaitToLoadElement.waitToLoadElement(organisationDD);
		Select organisationDDSL= new Select(organisationDD);
		organisationDDSL.selectByVisibleText(file.getAdminCOBTestData("org"));

		/*
		 * WaitToLoadElement.waitToLoadElement(telOffice);
		 * telOffice.sendKeys(file.getAdminCOBTestData("officeTel"));
		 * WaitToLoadElement.waitToLoadElement(telRes);
		 * telRes.sendKeys(file.getAdminCOBTestData("resTel"));
		 * WaitToLoadElement.waitToLoadElement(ReKYCDD); Select ReKYCDDSL= new
		 * Select(ReKYCDD); ReKYCDDSL.selectByVisibleText(file.getAdminCOBTestData("reKyc"));
		 * WaitToLoadElement.waitToLoadElement(mobile);
		 * mobile.sendKeys(file.getAdminCOBTestData("mobile"));
		 * WaitToLoadElement.waitToLoadElement(fax);
		 * fax.sendKeys(file.getAdminCOBTestData("fax"));
		 * 
		 */
		WaitToLoadElement.waitToLoadElement(periodDD);
		Select periodDDSL= new Select(periodDD);
		periodDDSL.selectByVisibleText(file.getAdminCOBTestData("period"));
		ScrollPageToFindElement.findElementByPageScrolling(driver, kycAnyotherInfo);
		WaitToLoadElement.waitToLoadElement(email);
		email.sendKeys(file.getAdminCOBTestData("email"));
		WaitToLoadElement.waitToLoadElement(permanentAddress);
		permanentAddress.sendKeys(file.getAdminCOBTestData("permAdr"));
		WaitToLoadElement.waitToLoadElement(addressType2DD);
		Select addressType2DDSL= new Select(addressType2DD);
		addressType2DDSL.selectByVisibleText(file.getAdminCOBTestData("adrType2"));
		WaitToLoadElement.waitToLoadElement(permanentAddressDD);
		Select permanentAddressDDSL= new Select(permanentAddressDD);
		permanentAddressDDSL.selectByVisibleText(file.getAdminCOBTestData("permAdrType"));

		WaitToLoadElement.waitToLoadElement(pincodePermAdr);
		pincodePermAdr.sendKeys(file.getAdminCOBTestData("permPincode"));
		WaitToLoadElement.waitToLoadElement(kycAnyotherInfo);
		kycAnyotherInfo.sendKeys(file.getAdminCOBTestData("anyInf"));
		ScrollPageToFindElement.findElementByPageScrolling(driver, nextButtonKYC);
		WaitToLoadElement.waitToLoadElement(nextButtonKYC);		
		nextButtonKYC.click();
		//FATCA
		ScrollPageToFindElement.findElementByPageScrolling(driver, FATCA);
		WaitToLoadElement.waitToLoadElement(isMinorCheckBox);
		isMinorCheckBox.click();
		WaitToLoadElement.waitToLoadElement(guardPanNo);
		guardPanNo.sendKeys(file.getAdminCOBTestData("gPanNo"));
		WaitToLoadElement.waitToLoadElement(guardName);
		guardName.sendKeys(file.getAdminCOBTestData("gname"));
		WaitToLoadElement.waitToLoadElement(relationWithGuardDD);
		Select relationWithGuardDDSL= new Select(relationWithGuardDD);
		relationWithGuardDDSL.selectByVisibleText(file.getAdminCOBTestData("grel"));
		
		WaitToLoadElement.waitToLoadElement(fatcaAddrTypeDD);
		Select fatcaAddrTypeDDSl= new Select(fatcaAddrTypeDD);
		fatcaAddrTypeDDSl.selectByVisibleText(file.getAdminCOBTestData("adrType"));
		WaitToLoadElement.waitToLoadElement(placeOfBirth);
		placeOfBirth.sendKeys(file.getAdminCOBTestData("birthPlace"));
		WaitToLoadElement.waitToLoadElement(countybirthDD);
		Select countybirthDDSL= new Select(countybirthDD);
		countybirthDDSL.selectByVisibleText(file.getAdminCOBTestData("birthCtry"));

		WaitToLoadElement.waitToLoadElement(appIncValDD);
		Select appIncValDDSL= new Select(appIncValDD);
		appIncValDDSL.selectByVisibleText(file.getAdminCOBTestData("appIncomVl"));
		
		WaitToLoadElement.waitToLoadElement(occupationDD);
		Select occupationDDSL= new Select(occupationDD);
		occupationDDSL.selectByVisibleText(file.getAdminCOBTestData("occup"));
		WaitToLoadElement.waitToLoadElement(sourceOfIncoDD);
		Select sourceOfIncoDDSL= new Select(sourceOfIncoDD);
		sourceOfIncoDDSL.selectByVisibleText(file.getAdminCOBTestData("sourceOfIncome"));
		
		WaitToLoadElement.waitToLoadElement(totNetWorthInCr);
		totNetWorthInCr.sendKeys(file.getAdminCOBTestData("totNetWorth"));
		WaitToLoadElement.waitToLoadElement(netWorthAsOn);
		netWorthAsOn.sendKeys(file.getAdminCOBTestData("netWorthAsOn"));
		WaitToLoadElement.waitToLoadElement(pepDD);
		Select pepDDSL= new Select(pepDD);
		pepDDSL.selectByVisibleText(file.getAdminCOBTestData("pep"));
		WaitToLoadElement.waitToLoadElement(fatcaAnyOtherInfo);
		fatcaAnyOtherInfo.sendKeys(file.getAdminCOBTestData("anyotherInfo"));
		
		WaitToLoadElement.waitToLoadElement(countryTaxRes1DD);
		Select countryTaxRes1DDSL= new Select(countryTaxRes1DD);
		countryTaxRes1DDSL.selectByVisibleText(file.getAdminCOBTestData("cTxRes1"));
		WaitToLoadElement.waitToLoadElement(taxPayID1);
		taxPayID1.sendKeys(file.getAdminCOBTestData("taxID1"));
		WaitToLoadElement.waitToLoadElement(idtype1DD);
		Select idtype1DDSL= new Select(idtype1DD);
		idtype1DDSL.selectByVisibleText(file.getAdminCOBTestData("idType1"));
		
		ScrollPageToFindElement.findElementByPageScrolling(driver, nextButtonFatca);
		WaitToLoadElement.waitToLoadElement(countryTaxRes2DD);
		Select countryTaxRes2DDSL= new Select(countryTaxRes2DD);
		countryTaxRes2DDSL.selectByVisibleText(file.getAdminCOBTestData("cTxRes2"));
		WaitToLoadElement.waitToLoadElement(taxPayID2);
		taxPayID2.sendKeys(file.getAdminCOBTestData("taxID2"));
		WaitToLoadElement.waitToLoadElement(idtype2DD);
		Select idtype2DDSL= new Select(idtype2DD);
		idtype2DDSL.selectByVisibleText(file.getAdminCOBTestData("idType2"));
		
		WaitToLoadElement.waitToLoadElement(countryTaxRes3DD);
		Select countryTaxRes3DDSL= new Select(countryTaxRes3DD);
		countryTaxRes3DDSL.selectByVisibleText(file.getAdminCOBTestData("cTxRes3"));
		WaitToLoadElement.waitToLoadElement(taxPayID3);
		taxPayID3.sendKeys(file.getAdminCOBTestData("taxID3"));
		WaitToLoadElement.waitToLoadElement(idtype3DD);
		Select idtype3DDSL= new Select(idtype3DD);
		idtype3DDSL.selectByVisibleText(file.getAdminCOBTestData("idType3"));
		
		/*
		WaitToLoadElement.waitToLoadElement(countryTaxRes4DD);
		Select countryTaxRes4DDSL= new Select(countryTaxRes4DD);
		countryTaxRes4DDSL.selectByVisibleText(file.getAdminCOBTestData("cTxRes4"));
		WaitToLoadElement.waitToLoadElement(taxPayID4);
		taxPayID4.sendKeys(file.getAdminCOBTestData("taxID4"));
		
		
		 * WaitToLoadElement.waitToLoadElement(idtype4DD); Select idtype4DDSL= new
		 * Select(idtype4DD);
		 * idtype1DDSL.selectByVisibleText(file.getAdminCOBTestData("idType4"));
		 */

		WaitToLoadElement.waitToLoadElement(nextButtonFatca);
		nextButtonFatca.click();
//SPECIFIC		
		ScrollPageToFindElement.findElementByPageScrolling(driver, specific);
		/*
		WaitToLoadElement.waitToLoadElement(salutationDD);
		Select salutationDDSL= new Select(salutationDD);
		salutationDDSL.selectByVisibleText(file.getAdminCOBTestData("salutation"));

		WaitToLoadElement.waitToLoadElement(riskProfileInvestPlcyDD);
		Select riskProfileInvestPlcyDDSL= new Select(riskProfileInvestPlcyDD);
		riskProfileInvestPlcyDDSL.selectByVisibleText(file.getAdminCOBTestData("riskProfInvetPlcy"));

		WaitToLoadElement.waitToLoadElement(riskProfilePMLAplcyDD);
		Select riskProfilePMLAplcyDDSL= new Select(riskProfilePMLAplcyDD);
		riskProfilePMLAplcyDDSL.selectByVisibleText(file.getAdminCOBTestData("riskProfPMLAPlcy"));

		WaitToLoadElement.waitToLoadElement(doseClientAssetOthrIADD);
		Select doseClientAssetOthrIADDSL= new Select(doseClientAssetOthrIADD);
		doseClientAssetOthrIADDSL.selectByVisibleText(file.getAdminCOBTestData("doeCltHavAsset"));

		WaitToLoadElement.waitToLoadElement(clientOrg);
		clientOrg.sendKeys(file.getAdminCOBTestData("clientOrg"));
		
		//KRA
		WaitToLoadElement.waitToLoadElement(cdslDD);
		Select cdslDDSL= new Select(cdslDD);
		cdslDDSL.selectByVisibleText(file.getAdminCOBTestData("cdsl"));

		WaitToLoadElement.waitToLoadElement(nsdlDD);
		Select nsdlDDSL= new Select(nsdlDD);
		nsdlDDSL.selectByVisibleText(file.getAdminCOBTestData("nsdl"));

		WaitToLoadElement.waitToLoadElement(dotexDD);
		Select dotexDDSL= new Select(dotexDD);
		dotexDDSL.selectByVisibleText(file.getAdminCOBTestData("dotex"));
		
		*/
		ScrollPageToFindElement.findElementByPageScrolling(driver, cancelKYPHButton);
		/*
		WaitToLoadElement.waitToLoadElement(camsDD);
		Select camsDDSL= new Select(camsDD);
		camsDDSL.selectByVisibleText(file.getAdminCOBTestData("cams"));

		WaitToLoadElement.waitToLoadElement(karvyDD);
		Select karvyDDSL= new Select(karvyDD);
		karvyDDSL.selectByVisibleText(file.getAdminCOBTestData("karvya"));

		WaitToLoadElement.waitToLoadElement(annivDate);
		annivDate.sendKeys(file.getAdminCOBTestData("annivDate"));
		WaitToLoadElement.waitToLoadElement(dobSpouseDate);
		dobSpouseDate.sendKeys(file.getAdminCOBTestData("dobSpouse"));
		WaitToLoadElement.waitToLoadElement(defaultAddDD);
		Select defaultAddDDSL= new Select(defaultAddDD);
		defaultAddDDSL.selectByVisibleText(file.getAdminCOBTestData("defAdr"));
		WaitToLoadElement.waitToLoadElement(commenceDate);
		commenceDate.sendKeys(file.getAdminCOBTestData("dateCommen"));
		WaitToLoadElement.waitToLoadElement(uid);
		uid.sendKeys(file.getAdminCOBTestData("uid"));

		 * WaitToLoadElement.waitToLoadElement(cancelKYPHButton);
		 * cancelKYPHButton.click();
		 */
		
		WaitToLoadElement.waitToLoadElement(saveKYPHButton);
		saveKYPHButton.click();
	Thread.sleep(5000);
	}
}
