package com.rupeelog.adminCOBPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ScrollPageToFindElement;
import com.rupeelog.utilty.WaitToLoadElement;
import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;
import com.rupeelog.utilty.WebDriverWaitFunctions;

public class AddInvestmentAccountPage {

	WebDriver driver;

	@FindBy(xpath = "//*[text()='Admin']")
	@CacheLookup
	private WebElement adminMenu;
	@FindBy(xpath = "//*[text()='Client-On-Boarding']")
	@CacheLookup
	private WebElement ClientOnBoarding;
	@FindBy(linkText = "Investment Account")
	@CacheLookup
	private WebElement investmentAccountSubMenu;

	@FindBy(xpath = "//input[@id='create']")
	@CacheLookup
	private WebElement createInAccButton;

	// ************profile locators**************
	@FindBy(xpath = "//span[contains(text(),'Profile')]")
	@CacheLookup
	private WebElement Profile;
	
	@FindBy(xpath = "//input[@id='cl_familyName']")
	@CacheLookup
	private WebElement familyNameAutoSuggSearch;
	
	@FindBy(xpath = "//select[@id='cl_investorTypeId']")
	@CacheLookup
	private WebElement investorTypeDropDown;
	
	@FindBy(xpath = "//input[@id='cl_clGlCode']")
	@CacheLookup
	private WebElement clientGlobalCode;
	
	@FindBy(xpath = "//input[@id='selKyph1']")
	@CacheLookup
	private WebElement primaryKyphAutoSuggSearch;

	@FindBy(xpath = "//select[@id='cl_HOF_span']")
	@CacheLookup
	private WebElement headOfFmlyDropDown;

	@FindBy(xpath = "//input[@id='selKyph2']")
	@CacheLookup
	private WebElement secondaryKyphAutoSuggSearch;

	@FindBy(xpath = "//input[@id='selKyph3']")
	@CacheLookup
	private WebElement tertiaryKyphAutoSuggSearch;

	@FindBy(xpath = "//select[@id='cl_clStatus']")
	@CacheLookup
	private WebElement statusDropDown;

	@FindBy(xpath = "//select[@id='cl_accTypeId']")
	@CacheLookup
	private WebElement accountType;

	@FindBy(xpath = "//select[@id='clientEngagement']")
	@CacheLookup
	private WebElement clientEngagement;

	@FindBy(xpath = "//button[@id='next']")
	@CacheLookup
	private WebElement profileNextBtn;

	// *******************communication locators**************

	@FindBy(xpath = "//span[contains(text(),'Communication')]")
	@CacheLookup
	private WebElement Communication;
	
	@FindBy(xpath = "//select[@id='cl_clAddlStatus']")
	@CacheLookup
	private WebElement addlStatusDropDown; // AutoSuggSearch DropDown

	@FindBy(xpath = "//input[@id='cl_address1']")
	@CacheLookup
	private WebElement corrAddress1;

	@FindBy(xpath = "//select[@id='corrAddType']")
	@CacheLookup
	private WebElement corrAddressTypeDropDown;

	@FindBy(xpath = "//input[@id='cl_pin1']")
	@CacheLookup
	private WebElement corrPinCode;;

	@FindBy(xpath = "//input[@id='cl_check']")
	@CacheLookup
	private WebElement checkBoxPermnAddrSAME; // check to use same corresponds address as permanent one

	@FindBy(xpath = "//select[@id='cl_defaultAddr']")
	@CacheLookup
	private WebElement defaultAddrDropdown; // Contact Details (for one time verification call )

	@FindBy(xpath = "//input[@id='comm_name1']")
	@CacheLookup
	private WebElement contactOTName;

	@FindBy(xpath = "//input[@id='comm_phone1']")
	@CacheLookup
	private WebElement contactOTLandlinePh;

	@FindBy(xpath = "//input[@id='comm_email1']")
	@CacheLookup
	private WebElement contactOTEmail;

	@FindBy(xpath = "//input[@id='comm_mobile1']")
	@CacheLookup
	private WebElement contactOTMobile;

	@FindBy(xpath = "//input[@id='cl_same_contact']")
	@CacheLookup
	private WebElement checkBoxTraXContactSAMEOneTimeContact; /*
											 * //Check,if contact details is same as one time verification //Contact
											 * Details for Transaction Autorisation (Application only where POA has been
											 * given)
											 */

	@FindBy(xpath = "//input[@id='comm_name3']")
	@CacheLookup
	private WebElement namePOA;

	@FindBy(xpath = "//input[@id='comm_phone3']")
	@CacheLookup
	private WebElement phoneRPOA;

	@FindBy(xpath = "//input[@id='comm_phone33']")
	@CacheLookup
	private WebElement phoneOPOA;

	@FindBy(xpath = "//input[@id='comm_mobile3']")
	@CacheLookup
	private WebElement mobile1POA;

	@FindBy(xpath = "//input[@id='comm_mobile33']")
	@CacheLookup
	private WebElement mobile2POA;

	@FindBy(xpath = "//input[@id='comm_fax']")
	@CacheLookup
	private WebElement faxPOA;

	@FindBy(xpath = "//input[@id='comm_email3']")
	@CacheLookup
	private WebElement email1POA;

	@FindBy(xpath = "//input[@id='comm_email33']")
	@CacheLookup
	private WebElement email2POA;

	@FindBy(xpath = "//select[@id='comm_isSms']")
	@CacheLookup
	private WebElement smsReqDorpdown;

	@FindBy(xpath = "//select[@id='comm_isEmail']")
	@CacheLookup
	private WebElement emailReqDorpdown;

	@FindBy(xpath = "//select[@id='comm_mis']")
	@CacheLookup
	private WebElement misReportDorpdown;

	@FindBy(xpath = "//button[@id='next']")
	@CacheLookup
	private WebElement commuNextBtn;

	// Nomination
	
	@FindBy(xpath = "//span[contains(text(),'Nomination')]")
	@CacheLookup
	private WebElement Nomination;
	@FindBy(xpath = "//select[@id='cl_wishNom']")
	@CacheLookup
	private WebElement wishToNominate;
	@FindBy(xpath = "//input[@id='cl_nomName']")
	@CacheLookup
	private WebElement nName;
	@FindBy(xpath = "//input[@id='cl_nomDob']")
	@CacheLookup
	private WebElement nomineeDOB;
	@FindBy(xpath = "//select[@id='cl_nomrelation']")
	@CacheLookup
	private WebElement nRel;
	@FindBy(xpath = "//input[@id='cl_nomGuardName']")
	@CacheLookup
	private WebElement nguardian;
	@FindBy(xpath = "//textarea[@id='cl_guardaddhead1']")
	@CacheLookup
	private WebElement naddress;
	@FindBy(xpath = "//input[@id='cl_nomCityId']")
	@CacheLookup
	private WebElement ncity;
	@FindBy(xpath = "//input[@id='cl_nomCityId']")
	@CacheLookup
	private WebElement nstate;
	@FindBy(xpath = "//select[@id='cl_nomCountryId']")
	@CacheLookup
	private WebElement ncountry;
	@FindBy(xpath = "//input[@id='cl_nomPin']")
	@CacheLookup
	private WebElement npinCode;
	@FindBy(xpath = "//input[@id='cl_nomLand1']")
	@CacheLookup
	private WebElement nlandLin1;

	@FindBy(xpath = "//input[@id='cl_nomLand2']")
	@CacheLookup
	private WebElement nlandLin2;
	@FindBy(xpath = "//input[@id='cl_nomFax']")
	@CacheLookup
	private WebElement nfax;
	@FindBy(xpath = "//input[@id='cl_nomMob']")
	@CacheLookup
	private WebElement nmobile1;
	@FindBy(xpath = "//textarea[@id='cl_gurAdd1']")
	@CacheLookup
	private WebElement gAddress;
	@FindBy(xpath = "//input[@id='cl_gurCityId']")
	@CacheLookup
	private WebElement gCity;
	@FindBy(xpath = "//select[@id='cl_gurStateId']")
	@CacheLookup
	private WebElement gStateDropdown;
	@FindBy(xpath = "//select[@id='cl_gurCounId']")
	@CacheLookup
	private WebElement gCountryDropdown;
	@FindBy(xpath = "//input[@id='cl_gurPin']")
	@CacheLookup
	private WebElement gPincode;
	@FindBy(xpath = "//input[@id='cl_gurLand1']")
	@CacheLookup
	private WebElement gLandline1;
	@FindBy(xpath = "//input[@id='cl_gurLand2']")
	@CacheLookup
	private WebElement gLandline2;
	@FindBy(xpath = "//input[@id='cl_gurFax']")
	@CacheLookup
	private WebElement gFax;

	@FindBy(xpath = "//input[@id='cl_gurMob']")
	@CacheLookup
	private WebElement gMobile;
	@FindBy(xpath = "//input[@id='cancel']")
	@CacheLookup
	private WebElement nomineeCancel;
	@FindBy(xpath = "//button[@id='next']")
	@CacheLookup
	private WebElement nNextButton;

	// RM Note/Background
	@FindBy(xpath = "//span[contains(text(),'RM Note')]")
	@CacheLookup
	private WebElement RMNoteBackground;
	@FindBy(xpath = "//input[@id='cl_investExp']")
	@CacheLookup
	private WebElement investExper;
	@FindBy(xpath = "//select[@id='cl_riskToleran']")
	@CacheLookup
	private WebElement riskToleranDropdown;
	@FindBy(xpath = "//input[@id='cl_incomefrmOcc']")
	@CacheLookup
	private WebElement annualIncomefrmOcc;
	@FindBy(xpath = "//input[@id='cl_incomefrmother']")
	@CacheLookup
	private WebElement estimatedIncomeFromOtherSrc;
	@FindBy(xpath = "//input[@id='cl_rmNote']")
	@CacheLookup
	private WebElement rmNote;

	// Background
	@FindBy(xpath = "//textarea[@id='cl_clientBg']")
	@CacheLookup
	private WebElement clientBackg;
	@FindBy(xpath = "//input[@id='cl_iiflInvestAmt']")
	@CacheLookup
	private WebElement amountBeingInvested;
	@FindBy(xpath = "//input[@id='expectedAum']")
	@CacheLookup
	private WebElement expectedAUM;
	@FindBy(xpath = "//input[@id='cl_ref']")
	@CacheLookup
	private WebElement clientReferal;
	@FindBy(xpath = "//select[@id='rptFreurncy']")
	@CacheLookup
	private WebElement reportFreuncyDropdown;
	@FindBy(xpath = "//select[@id='ipsReqd']")
	@CacheLookup
	private WebElement ipsReqdDropdown;
	@FindBy(xpath = "//input[@id='cancel']")
	@CacheLookup
	private WebElement rmCancelBtn;
	@FindBy(xpath = "//button[@id='next']")
	@CacheLookup
	private WebElement rmNextBtn;

	// GST Mapping
	@FindBy(xpath = "//span[contains(text(),'GST Mapping')]")
	@CacheLookup
	private WebElement GST_Mapping;
	@FindBy(xpath = "//select[@id='rgc']")
	@CacheLookup
	private WebElement isRegGSTCustDropdown;
	@FindBy(xpath = "//input[@id='EffectiveDate']")
	@CacheLookup
	private WebElement effectDateCal;
	@FindBy(xpath = "//input[@id='gn']")
	@CacheLookup
	private WebElement gstNum;
	@FindBy(xpath = "//select[@id='SezType']")
	@CacheLookup
	private WebElement sezType;
	@FindBy(xpath = "//input[@id='cancel']")
	@CacheLookup
	private WebElement gstCancelBtn;
	@FindBy(xpath = "//input[@id='save']")
	@CacheLookup
	private WebElement saveButtonInvestAcc;

	@FindBy(xpath = "//button[@id='prev']")
	@CacheLookup
	private WebElement prevBtnBtnInAcc;
	@FindBy(xpath = "//button[@id='prev']")
	@CacheLookup
	private WebElement cancelBtnInAcc;

	public AddInvestmentAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addInvestemntAccount() throws InterruptedException {

		Actions action = new Actions(driver);
		FileReaderUtility file=new FileReaderUtility();
		
		WebDriverWaitFunctions.waitToLoadElement(adminMenu);
		action.moveToElement(adminMenu).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(ClientOnBoarding);
		action.moveToElement(ClientOnBoarding).perform();
		
		WebDriverWaitFunctions.waitToLoadElement(investmentAccountSubMenu);
		action.moveToElement(investmentAccountSubMenu).click().build().perform();

		By overlayLocator=By.xpath("//div[@id='loaderDiv']");
		ElementWait.waitForOverlayDisappearExplicitly(overlayLocator);
		
		ScrollPageToFindElement.findElementByPageScrolling(driver, createInAccButton);
		WebDriverWaitFunctions.waitToLoadElement(createInAccButton);
		createInAccButton.click();
		
		//*******Profile**********
		WebDriverWaitFunctions.waitToLoadElement(familyNameAutoSuggSearch);
		familyNameAutoSuggSearch.sendKeys(file.getAdminCOBTestData("familyNameAutoSuggSearch"));
		List<WebElement> familyList = driver.findElements(By.xpath(
				"//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all']//li[@class='ui-menu-item']"));

		for (int i = 0; i < familyList.size(); i++) {
			if (familyList.get(i).getText().equalsIgnoreCase(file.getAdminCOBTestData("selectfamily"))) {
				familyList.get(i).click();
				System.out.println(familyList.get(i).getText());
				break;
			}
		}

		Select selectInvestorType = new Select(investorTypeDropDown);
		selectInvestorType.selectByVisibleText(file.getAdminCOBTestData("selectInvestorType")); // getting selection issue due format <option
																// selected="selected" class="ui-dform-option"
																// value="0">--Select--</option>
		
		WebDriverWaitFunctions.waitToLoadElement(clientGlobalCode);
		clientGlobalCode.sendKeys(file.getAdminCOBTestData("clientGlobalCode"));
		
		primaryKyphAutoSuggSearch.sendKeys(file.getAdminCOBTestData("primaryKyphAutoSuggSearch"));
		Thread.sleep(2000);
		List<WebElement> primaryKyphList = driver.findElements(By.xpath(
				"//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all']//li[@class='ui-menu-item']"));

		for (int i = 0; i < primaryKyphList.size(); i++) {
			if (primaryKyphList.get(i).getText().equalsIgnoreCase(file.getAdminCOBTestData("selectPrimaryKyph"))) {
				primaryKyphList.get(i).click();
				System.out.println(primaryKyphList.get(i).getText());
				break;
			}
		}
		Thread.sleep(2000);
		
		WebDriverWaitFunctions.waitToLoadElement(headOfFmlyDropDown);
		Select selectheadOfFmlyDropDown = new Select(headOfFmlyDropDown);
		selectheadOfFmlyDropDown.selectByVisibleText("Yes");
		
		/*
		WebDriverWaitFunctions.waitToLoadElement(secondaryKyphAutoSuggSearch);
		secondaryKyphAutoSuggSearch.sendKeys(file.getAdminCOBTestData("secondaryKyphAutoSuggSearch"));
		Thread.sleep(2000);
		List<WebElement> secondaryKyphList = driver.findElements(By.xpath(
				"//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all']//li[@class='ui-menu-item']"));

		for (int i = 0; i < secondaryKyphList.size(); i++) {
			if (secondaryKyphList.get(i).getText().equalsIgnoreCase(file.getAdminCOBTestData("selectSecondaryKyph"))) {
				secondaryKyphList.get(i).click();
				System.out.println(secondaryKyphList.get(i).getText());
				break;
			}
		}

		ScrollPageToFindElement.findElementByPageScrolling(driver, tertiaryKyphAutoSuggSearch);
		WebDriverWaitFunctions.waitToLoadElement(tertiaryKyphAutoSuggSearch);
		tertiaryKyphAutoSuggSearch.sendKeys(file.getAdminCOBTestData("tertiaryKyphAutoSuggSearch"));
		Thread.sleep(2000);
		List<WebElement> tertiaryKyphList = driver.findElements(By.xpath(
				"//ul[@class='ui-autocomplete ui-menu ui-widget ui-widget-content ui-corner-all']//li[@class='ui-menu-item']"));

		for (int i = 0; i < tertiaryKyphList.size(); i++) {
			if (tertiaryKyphList.get(i).getText().equalsIgnoreCase(file.getAdminCOBTestData("selectTertiaryKyph"))) {
				tertiaryKyphList.get(i).click();
				System.out.println(tertiaryKyphList.get(i).getText());
				break;
			}
		}

		*/
		
		WebDriverWaitFunctions.waitToLoadElement(statusDropDown);
		Select selectStatusDropDown = new Select(statusDropDown);
		selectStatusDropDown.selectByVisibleText(file.getAdminCOBTestData("statusDropDown"));
		
		WebDriverWaitFunctions.waitToLoadElement(accountType);
		Select selectAccountType = new Select(accountType);
		selectAccountType.selectByVisibleText(file.getAdminCOBTestData("selectAccountType"));
		
		WebDriverWaitFunctions.waitToLoadElement(clientEngagement);
		Select selectClientEngagement = new Select(clientEngagement);
		selectClientEngagement.selectByVisibleText(file.getAdminCOBTestData("selectClientEngagement"));

		WebDriverWaitFunctions.waitToLoadElement(profileNextBtn);
		WaitToLoadElement.waitToLoadElement(profileNextBtn);
		profileNextBtn.click();
		
		//-------------------COMMUNICATION-------------------
		ScrollPageToFindElement.findElementByPageScrolling(driver, Communication);
		
		WebDriverWaitFunctions.waitToLoadElement(addlStatusDropDown);
		Select selectaddlStatusDropDown = new Select(addlStatusDropDown);
		selectaddlStatusDropDown.selectByVisibleText(file.getAdminCOBTestData("selectaddlStatusDropDown"));

		WaitToLoadElement.waitToLoadElement(corrAddress1);
		corrAddress1.sendKeys(file.getAdminCOBTestData("corrAddress1"));
		
		Select corrAdrType = new Select(WaitToLoadElement.waitToLoadElement(corrAddressTypeDropDown));
		corrAdrType.selectByVisibleText(file.getAdminCOBTestData("IAcorrAdrType"));

		WaitToLoadElement.waitToLoadElement(corrPinCode);
		corrPinCode.sendKeys(file.getAdminCOBTestData("corrPinCode"));
		
		ScrollPageToFindElement.findElementByPageScrolling(driver, checkBoxPermnAddrSAME);
		WaitToLoadElement.waitToLoadElement(checkBoxPermnAddrSAME);
		checkBoxPermnAddrSAME.click();
		  
		  WaitToLoadElement.waitToLoadElement(defaultAddrDropdown);
		  Select selectDefAdr= new Select(defaultAddrDropdown);
		  selectDefAdr.selectByVisibleText(file.getAdminCOBTestData("selectDefAdr"));

		  //---------------------Contact Details (for one time verification call )--------------------
		  ScrollPageToFindElement.findElementByPageScrolling(driver, contactOTMobile);
		  WaitToLoadElement.waitToLoadElement(contactOTName);
		  contactOTName.sendKeys(file.getAdminCOBTestData("contactOTName"));
		  
		  WaitToLoadElement.waitToLoadElement(contactOTLandlinePh);
		  contactOTLandlinePh.sendKeys(file.getAdminCOBTestData("contactOTLandlinePh"));
		  
		  WaitToLoadElement.waitToLoadElement(contactOTEmail);
		  contactOTEmail.sendKeys(file.getAdminCOBTestData("contactOTEmail"));
		  
		  WaitToLoadElement.waitToLoadElement(contactOTMobile);
		  contactOTMobile.sendKeys(file.getAdminCOBTestData("contactOTMobile"));
		  
		  //-----------------Contact Details (for day end transaction confirmation )-----------------------
		  WaitToLoadElement.waitToLoadElement(checkBoxTraXContactSAMEOneTimeContact);		  
		  checkBoxTraXContactSAMEOneTimeContact.click();
		  
		  //------------------------Contact Details for Transaction Autorisation (Application only where POA has been given)--------------
		  ScrollPageToFindElement.findElementByPageScrolling(driver, commuNextBtn);
		  
		  WaitToLoadElement.waitToLoadElement(namePOA);
		  namePOA.sendKeys(file.getAdminCOBTestData("namePOA"));
		  
		  WaitToLoadElement.waitToLoadElement(phoneRPOA);
		  phoneRPOA.sendKeys(file.getAdminCOBTestData("phoneRPOA"));
		  
		  WaitToLoadElement.waitToLoadElement(phoneOPOA);
		  phoneOPOA.sendKeys(file.getAdminCOBTestData("phoneOPOA"));

		  WaitToLoadElement.waitToLoadElement(mobile1POA); 
		  mobile1POA.sendKeys(file.getAdminCOBTestData("mobile1POA"));
		  
		  WaitToLoadElement.waitToLoadElement(mobile2POA); 
		  mobile2POA.sendKeys(file.getAdminCOBTestData("mobile2POA"));
		  
		  WaitToLoadElement.waitToLoadElement(faxPOA);
		  faxPOA.sendKeys(file.getAdminCOBTestData("faxPOA"));
		  
		  WaitToLoadElement.waitToLoadElement(email1POA);
		  email1POA.sendKeys(file.getAccountingTestData("email1POA"));
		  
		  WaitToLoadElement.waitToLoadElement(email2POA);
		  email2POA.sendKeys(file.getAccountingTestData("email2POA"));
		  
		  //=========================================
		  WaitToLoadElement.waitToLoadElement(smsReqDorpdown);
		  Select selectSMS= new Select(smsReqDorpdown);
		  selectSMS.selectByValue("Y");
		  
		  WaitToLoadElement.waitToLoadElement(emailReqDorpdown);
		  Select selectemail= new Select(emailReqDorpdown);
		  selectemail.selectByValue("Y");
		  
		  WaitToLoadElement.waitToLoadElement(misReportDorpdown);
		  Select selectMIS= new Select(misReportDorpdown);
		  selectMIS.selectByVisibleText("Email");
		  
		  WaitToLoadElement.waitToLoadElement(commuNextBtn); 
		  commuNextBtn.click();
		  
		  //-------------------------Nomination-------------------------
		  ScrollPageToFindElement.findElementByPageScrolling(driver, Nomination);
		  WaitToLoadElement.waitToLoadElement(wishToNominate);
		  Select selecNominee= new Select(wishToNominate);
		  selecNominee.selectByValue("Y");
		  
		  //-------------------------Nomination-------------------------
		  WaitToLoadElement.waitToLoadElement(nName);
		  nName.sendKeys(file.getAdminCOBTestData("nName"));
		  
		  WaitToLoadElement.waitToLoadElement(nomineeDOB); 
		  nomineeDOB.sendKeys(file.getAdminCOBTestData("nomineeDOB"));
		  
		  WaitToLoadElement.waitToLoadElement(nRel);
		  Select selecNRel= new Select(nRel);
		  selecNRel.selectByVisibleText(file.getAdminCOBTestData("selecNRel"));
		  
		  WaitToLoadElement.waitToLoadElement(nguardian);
		  nguardian.sendKeys(file.getAdminCOBTestData("nguardian"));
		  
		  //----------------Nominee Address----------------
		  ScrollPageToFindElement.findElementByPageScrolling(driver, nmobile1);
		  WaitToLoadElement.waitToLoadElement(naddress);
		  naddress.sendKeys(file.getAdminCOBTestData("naddress"));
		  
		  WaitToLoadElement.waitToLoadElement(ncity);
		  ncity.sendKeys(file.getAdminCOBTestData("ncity"));
		  
		  WaitToLoadElement.waitToLoadElement(npinCode);
		  npinCode.sendKeys(file.getAdminCOBTestData("npinCode"));
		  
		  WaitToLoadElement.waitToLoadElement(nlandLin1);
		  nlandLin1.sendKeys(file.getAdminCOBTestData("nlandLin1"));
		  
		  WaitToLoadElement.waitToLoadElement(nlandLin2);
		  nlandLin2.sendKeys(file.getAdminCOBTestData("nlandLin2"));
		  
		  WaitToLoadElement.waitToLoadElement(nfax);
		  nfax.sendKeys(file.getAdminCOBTestData("nfax"));
		  
		  WaitToLoadElement.waitToLoadElement(nmobile1);
		  nmobile1.sendKeys(file.getAdminCOBTestData("nmobile1"));
		  
		  //----------------guardian address----------------
		  ScrollPageToFindElement.findElementByPageScrolling(driver, nNextButton);
		  WaitToLoadElement.waitToLoadElement(gAddress);
		  gAddress.sendKeys(file.getAdminCOBTestData("gAddress"));
		  
		  WaitToLoadElement.waitToLoadElement(gCity);
		  gCity.sendKeys(file.getAdminCOBTestData("gCity"));
		  
		  WaitToLoadElement.waitToLoadElement(gCountryDropdown);
		  Select selectGCountry= new Select(gCountryDropdown);
		  selectGCountry.selectByVisibleText(file.getAdminCOBTestData("selectGCountry"));
		  
		  WaitToLoadElement.waitToLoadElement(gPincode);
		  gPincode.sendKeys(file.getAdminCOBTestData("gPincode"));
		  
		  WaitToLoadElement.waitToLoadElement(gLandline1);
		  gLandline1.sendKeys(file.getAdminCOBTestData("gLandline1"));
		  
		  //-------------------------
		  WaitToLoadElement.waitToLoadElement(gLandline2);
		  gLandline2.sendKeys(file.getAdminCOBTestData("gLandline2"));
		  
		  WaitToLoadElement.waitToLoadElement(gFax);
		  gFax.sendKeys(file.getAdminCOBTestData("gFax"));
		  
		  WaitToLoadElement.waitToLoadElement(gMobile);
		  gMobile.sendKeys(file.getAdminCOBTestData("gMobile"));
		  
		  nNextButton.click();
		  
		  //----------------RM Note Background----------------
		  ScrollPageToFindElement.findElementByPageScrolling(driver, RMNoteBackground);
		  WaitToLoadElement.waitToLoadElement(RMNoteBackground);
		  
		  WaitToLoadElement.waitToLoadElement(investExper);
		  investExper.sendKeys(file.getAdminCOBTestData("investExper"));
		  
		  WaitToLoadElement.waitToLoadElement(riskToleranDropdown);
		  Select selectRiskToleranDropdown = new Select(riskToleranDropdown);
		  selectRiskToleranDropdown.selectByVisibleText(file.getAdminCOBTestData("selectRiskToleranDropdown"));
		  
		  WaitToLoadElement.waitToLoadElement(annualIncomefrmOcc);
		  annualIncomefrmOcc.sendKeys(file.getAdminCOBTestData("annualIncomefrmOcc"));
		  
		  WaitToLoadElement.waitToLoadElement(estimatedIncomeFromOtherSrc);
		  estimatedIncomeFromOtherSrc.sendKeys(file.getAdminCOBTestData("estimatedIncomeFromOtherSrc"));
		  
		  WaitToLoadElement.waitToLoadElement(rmNote);
		  rmNote.sendKeys(file.getAdminCOBTestData("rmNote"));
		  
		  //---------------Background---------------
		  ScrollPageToFindElement.findElementByPageScrolling(driver, rmNextBtn);
		  WaitToLoadElement.waitToLoadElement(clientBackg);
		  clientBackg.sendKeys(file.getAdminCOBTestData("clientBackg"));
		  
		  WaitToLoadElement.waitToLoadElement(amountBeingInvested);
		  amountBeingInvested.sendKeys(file.getAdminCOBTestData("amountBeingInvested"));
		  
		  WaitToLoadElement.waitToLoadElement(expectedAUM);
		  expectedAUM.sendKeys(file.getAdminCOBTestData("expectedAUM"));
		  
		  WaitToLoadElement.waitToLoadElement(clientReferal);
		  clientReferal.sendKeys(file.getAdminCOBTestData("clientReferal"));
		  
		  WaitToLoadElement.waitToLoadElement(reportFreuncyDropdown);
		  Select selectRepFre=new Select(reportFreuncyDropdown);
		  selectRepFre.selectByVisibleText(file.getAdminCOBTestData("selectRepFre"));
		  
		  WaitToLoadElement.waitToLoadElement(ipsReqdDropdown); 
		  Select selectIpsReq=new Select(ipsReqdDropdown);
		  selectIpsReq.selectByVisibleText(file.getAdminCOBTestData("selectIpsReq"));
		  rmNextBtn.click();
		  
		  //----------------GST Mapping----------------
		  WaitToLoadElement.waitToLoadElement(isRegGSTCustDropdown);
		  Select selectRegGST= new Select(isRegGSTCustDropdown);
		  selectRegGST.selectByVisibleText(file.getAdminCOBTestData("selectRegGST"));
		  
		  WaitToLoadElement.waitToLoadElement(effectDateCal);
		  effectDateCal.sendKeys(file.getAdminCOBTestData("effectDateCal"));
		  
		  WaitToLoadElement.waitToLoadElement(gstNum);
		  gstNum.sendKeys(file.getAdminCOBTestData("gstNum"));
		  
		  WaitToLoadElement.waitToLoadElement(sezType);
		  Select selectSEZtype= new Select(sezType);
		  selectSEZtype.selectByVisibleText(file.getAdminCOBTestData("selectSEZtype"));
		  
		  WaitToLoadElement.waitToLoadElement(saveButtonInvestAcc);
		  saveButtonInvestAcc.click();
	}
}
