package com.qa.businesslogic;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase_HRMS;

public class HRMSPage {

	TestBase_HRMS testBase_HRMS = new TestBase_HRMS();

	
	/**
	 * This method will add a new HR Indent. The user needs to provide a new data set each time this method is called for testing.<br/>
	 * The method will fail in case any duplicate entries are done.
	 * @param d (WebDriver Object)
	 * @param wait (WebDriverWait Object)
	 * @return Returns a boolean (True / False) based on the conditions.
	 */
	public boolean addHrIndent(WebDriver d, WebDriverWait wait) {
		boolean isTrue = false;
		try {
			wait = new WebDriverWait(d, 10);
			
			// -------- FIELD LOCATORS -----
			String recruitmentMenu_ButtonPath = testBase_HRMS.getHrmsLocators("hrms_recruitment_menuButtonPath");
			String hrIndent_menu_ButtonPath = testBase_HRMS.getHrmsLocators("hrms_hrIndent_menuButtonPath");
			String hrIndent_add_ButtonPath = testBase_HRMS.getHrmsLocators("hrms_hrIndent_addButtonPath");
			String hrIndent_dueDate_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_dueDate_fieldPath");
			String minAge_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_minAge_fieldPath");
			String maxAge_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_maxAge_fieldPath");
			String location_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_location_fieldPath");
			String ctc_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_ctc_fieldPath");
			String dept_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_department_fieldPath");
			String position_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_position_fieldPath");
			String responsibilities_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_responsibilities_fieldPath");
			String submitButton_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_submit_buttonPath");
			String OK_buttonPath = testBase_HRMS.getHrmsLocators("hrIndent_OK_buttonPath");
			String hrIndentConfirmation_textElement = testBase_HRMS.getHrmsLocators("hrIndent_indentNumberConfirmation_textElement");
			String hrIndentConfirmation_ok_buttonPath = testBase_HRMS.getHrmsLocators("hrIndent_confirmation_ok_buttonPath");
			
			String hrIndent_viewUrlContainer = testBase_HRMS.getHrmsLocators("hrIndent_viewUrl");
			
			// -------- DATA PROVIDERS ----	 
			String indentorNameCheck = testBase_HRMS.getHRMSData("hrIndent_indentorName");
			String dueDate = testBase_HRMS.getHRMSData("hrIndent_indentDueDate");
			String reqGender = testBase_HRMS.getHRMSData("hrIndent_requiredGender");
			String minAge = testBase_HRMS.getHRMSData("hrIndent_minimumAge");
			String maxAge = testBase_HRMS.getHRMSData("hrIndent_maximumAge");
			String location = testBase_HRMS.getHRMSData("hrIndent_location");
			String experience = testBase_HRMS.getHRMSData("hrIndent_experience");
			String employmentType = testBase_HRMS.getHRMSData("hrIndent_employmentType");
			String ctc = testBase_HRMS.getHRMSData("hrIndent_ctc");
			String department = testBase_HRMS.getHRMSData("hrIndent_department");
			String reqDesignation = testBase_HRMS.getHRMSData("hrIndent_requiredDesignation");
			String recruitmentType = testBase_HRMS.getHRMSData("hrIndent_recruitmentType");
			String position = testBase_HRMS.getHRMSData("hrIndent_position");
			String responsibililites = testBase_HRMS.getHRMSData("hrIndent_responsibilities");
			
			clickHRMSMenuIcon(d);
			d.findElement(By.xpath(recruitmentMenu_ButtonPath)).click();
			d.findElement(By.xpath(hrIndent_menu_ButtonPath)).click();
			d.findElement(By.xpath(hrIndent_add_ButtonPath)).click();

			if(!indentorNameCheck.isEmpty() || indentorNameCheck != null){
				selectIndentorName(d, indentorNameCheck);
			}
			d.findElement(By.xpath(hrIndent_dueDate_fieldPath)).sendKeys(dueDate);
			selectGender(d, reqGender);
			d.findElement(By.xpath(minAge_fieldPath)).sendKeys(minAge);
			d.findElement(By.xpath(maxAge_fieldPath)).sendKeys(maxAge);
			d.findElement(By.xpath(location_fieldPath)).sendKeys(location);
			selectExperienceType(d, experience);
			selectEmploymentType(d, employmentType);
			d.findElement(By.xpath(ctc_fieldPath)).sendKeys(ctc);
			d.findElement(By.xpath(dept_fieldPath)).sendKeys(department);
			Thread.sleep(3000);
			selectRequiredDesignation(d, reqDesignation);
			selectRecruitmentType(d, recruitmentType);
			d.findElement(By.xpath(position_fieldPath)).sendKeys(position);
			selectLanguages(d);
			enterReqQualifications(d);
			enterPreferredCompany(d);
			enterUniversity(d);
			selectTestsRequired(d);
			d.findElement(By.xpath(responsibilities_fieldPath)).sendKeys(responsibililites);
			d.findElement(By.xpath(submitButton_fieldPath)).click();
			
			// ALERT HANDLING FUNCTIONALITY --START-------------------------------
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath((OK_buttonPath))));
			d.findElement(By.xpath(OK_buttonPath)).click();

			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(hrIndentConfirmation_textElement)));
			d.findElement(By.xpath(hrIndentConfirmation_ok_buttonPath)).click();
			
			// ALERT HANDLING FUNCTIONALITY --END---------------------------------
			
			
			Boolean isHrIndentDisplayed = wait.until(ExpectedConditions.urlContains(hrIndent_viewUrlContainer));
			
			if(isHrIndentDisplayed){
				isTrue = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return isTrue;
	}
	



	// ----------------------- PRIVATE METHODS FOR INTERNAL USAGE ------------------------------------
	private void clickHRMSMenuIcon(WebDriver d) {
		String hrmsMenuButtonPath = testBase_HRMS.getHrmsLocators("hrms_menu_hrmsPath");
		d.findElement(By.xpath(hrmsMenuButtonPath)).click();

	}

	// -----------------
	private void selectIndentorName(WebDriver d, String indentorName) {
		Select indentorNames = new Select(d.findElement(By.name("indname")));
		indentorNames.selectByValue(indentorName);
	}
	
	// -----------------
	private void selectGender(WebDriver d, String reqGender) {
		String reqGender_selectorFieldPath = testBase_HRMS.getHrmsLocators("hrIndent_gender_fieldPath");
		Select genderSelector = new Select(d.findElement(By.xpath(reqGender_selectorFieldPath)));
		genderSelector.selectByValue(reqGender);
		
	}
	
	// -----------------
	private void selectExperienceType(WebDriver d, String expType){
		String experience_selectorFieldPath = testBase_HRMS.getHrmsLocators("hrIndent_experience_fieldPath");
		Select expTypeSelector = new Select(d.findElement(By.xpath(experience_selectorFieldPath)));
		expTypeSelector.selectByValue(expType);
	}
	
	// -----------------
	private void selectEmploymentType(WebDriver d, String empType){
		String employmentType_selectorFieldPath = testBase_HRMS.getHrmsLocators("hrIndent_employmentType_fieldPath");
		Select empTypeSelector = new Select(d.findElement(By.xpath(employmentType_selectorFieldPath)));
		empTypeSelector.selectByValue(empType);
	}
	
	// -----------------
	private void selectRequiredDesignation(WebDriver d, String reqDesignation) {
		String reqDesignation_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_requiredDesignation_fieldPath");
		Select reqDesginationSelector = new Select(d.findElement(By.xpath(reqDesignation_fieldPath)));
		reqDesginationSelector.selectByValue(reqDesignation);
	}
	
	// -----------------
	private void selectRecruitmentType(WebDriver d, String recruitmentType) {
		String recruitmentType_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_recruitmentType_fieldPath");
		Select recruitmentTypeSelector = new Select(d.findElement(By.xpath(recruitmentType_fieldPath))); 
		recruitmentTypeSelector.selectByValue(recruitmentType);
	}
	
	// -----------------
	private void selectLanguages(WebDriver d){
		String languagesRequired_ButtonPath = testBase_HRMS.getHrmsLocators("hrIndent_languagesReq_ButtonPath");
		String language_ddListElement = testBase_HRMS.getHrmsLocators("hrIndent_language_ddList");
		
		String[] languagesReq = testBase_HRMS.getHRMSData("hrIndent_languagesRequired").split(",");
		
		d.findElement(By.xpath(languagesRequired_ButtonPath)).click();
		for(int i=0; i<languagesReq.length; i++){
			d.findElement(By.xpath(language_ddListElement+"[contains(text(),'"+languagesReq[i].trim()+"')]")).click();
		}
	}
	
	// -----------------
	private void enterReqQualifications(WebDriver d){
		String[] qualificationList = testBase_HRMS.getHRMSData("hrIndent_requiredQualification").split(",");
		String reqQualification_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_reqQualification_fieldPath");
		for(int i=0; i<qualificationList.length; i++){
			d.findElement(By.xpath(reqQualification_fieldPath)).sendKeys(qualificationList[i].trim());
			d.findElement(By.xpath(reqQualification_fieldPath)).sendKeys(Keys.TAB);
		}
	}
	
	// -----------------
	private void enterPreferredCompany(WebDriver d){
		String[] companyList = testBase_HRMS.getHRMSData("hrIndent_companyPreferred").split(",");
		String preferredCompany_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_companyPreferred_fieldPath");
		for(int i=0; i<companyList.length; i++){
			d.findElement(By.xpath(preferredCompany_fieldPath)).sendKeys(companyList[i].trim());
			d.findElement(By.xpath(preferredCompany_fieldPath)).sendKeys(Keys.TAB);
		}
	}
	
	// -----------------
	private void enterUniversity(WebDriver d){
		String[] universityList = testBase_HRMS.getHRMSData("hrIndent_university").split(",");
		String university_fieldPath = testBase_HRMS.getHrmsLocators("hrIndent_university_fieldPath");
		for(int i=0; i<universityList.length; i++){
			d.findElement(By.xpath(university_fieldPath)).sendKeys(universityList[i].trim());
			d.findElement(By.xpath(university_fieldPath)).sendKeys(Keys.TAB);
		}
	}
	
	// -----------------
	private void selectTestsRequired(WebDriver d){
		String testsRequired_ButtonPath = testBase_HRMS.getHrmsLocators("hrIndent_testRequired_ButtonPath");
		String testRequired_ddListElement = testBase_HRMS.getHrmsLocators("hrIndent_testSubject_ddList");
		
		String[] testList = testBase_HRMS.getHRMSData("hrIndent_testRequired").split(",");
		
		d.findElement(By.xpath(testsRequired_ButtonPath)).click();
		for(int i=0; i<testList.length; i++){
			d.findElement(By.xpath(testRequired_ddListElement+"[contains(text(),'"+testList[i].trim()+"')]")).click();
		}
		
	}
	
	// ------------------------------------------------------------------------------------------------------


}
