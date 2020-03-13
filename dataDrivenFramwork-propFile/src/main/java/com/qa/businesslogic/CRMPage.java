package com.qa.businesslogic;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class CRMPage {
	
	TestBase testBase = new TestBase();
	
	
	/**
	 * This method will help to navigate to the Sales Request module.
	 * @param d (WebDriver Object)
	 * @param wait (WebDriverWait Object)
	 * @return Returns the header of the page for validation
	 */
	public String navigateToSalesRequest(WebDriver d, WebDriverWait wait){
		wait = new WebDriverWait(d, 10);
		String salesRequestPath = testBase.getSalesRequestLocators("crm_menu_saleRequestPath");
		String pageHeaderLocation = testBase.getSalesRequestLocators("crm_sr_act_headerPath");
		
		clickCRMMenuIcon(d);
		d.findElement(By.xpath(salesRequestPath)).click();
		wait.until(ExpectedConditions.urlContains("/request/list"));
		String actual_pageHeader = d.findElement(By.xpath(pageHeaderLocation)).getText();
		return actual_pageHeader.trim();
	}
	
	
	/**
	 * This method will help to add a Sales Request in the CRM module.<br/>
	 * The input data needs to be provided in the "crm_salesRequestData.properties" file before execution.
	 * @param d (WebDriver Object)
 	 * @param wait (WebDriverWait Object)
	 * @return Returns a boolean value (True / False) based on the application response.
	 */
	public boolean addSalesRequest(WebDriver d, WebDriverWait wait){
		try {
			wait = new WebDriverWait(d, 10);
			
			// ==================== PATH FINDERS ======================================	
			String srAddButtonPath = testBase.getSalesRequestLocators("crm_sr_AddButtonPath");
			String crFormTextPath = testBase.getSalesRequestLocators("crm_sr_customerRequestFormTextPath");
			String crf_customerNameFieldPath = testBase.getSalesRequestLocators("crm_sr_crf_customerNameField");
			String crf_customerReqFieldPath = testBase.getSalesRequestLocators("crm_sr_crf_customerReqField");
			String crf_contactNamePath = testBase.getSalesRequestLocators("crm_sr_crf_contactName");
			String crf_contactDesignationPath = testBase.getSalesRequestLocators("crm_sr_crf_contactDesignation");
			String crf_contactEmailPath = testBase.getSalesRequestLocators("crm_sr_crf_contactEmail");
			String crf_customerPhNoPath = testBase.getSalesRequestLocators("crm_sr_crf_customerPhoneNumber");
//			String crf_referredBy = testBase.getSalesRequestLocators("crm_sr_crf_referredBy");
			String crf_saveButtons = testBase.getSalesRequestLocators("crm_sr_crf_saveButtons");
			String crf_OKButtonPath = testBase.getSalesRequestLocators("crm_sr_crf_OKButton");
			
			
			// =================== DATA RETRIEVERS ======================================
			String customerName = testBase.getCrmSrData("customerName");
			String customerReq = testBase.getCrmSrData("customerRequirements");
			String contactName = testBase.getCrmSrData("contactName");
			String contactDesignation = testBase.getCrmSrData("contactDesignation");
			String contactEmail = testBase.getCrmSrData("contactEmail");
			String contactPhNo = testBase.getCrmSrData("customerPhNo");
//			String referredBy = testBase.getCrmSrData("referredBy");
			
			
			// =================== ADD A SALES REQUEST ==================================
			d.findElement(By.xpath(srAddButtonPath)).click();
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(crFormTextPath), "Customer Request"));
			d.findElement(By.xpath(crf_customerNameFieldPath)).sendKeys(customerName);
			d.findElement(By.xpath(crf_customerReqFieldPath)).sendKeys(customerReq);
			d.findElement(By.xpath(crf_contactNamePath)).sendKeys(contactName);
			d.findElement(By.xpath(crf_contactDesignationPath)).sendKeys(contactDesignation);
			d.findElement(By.xpath(crf_contactEmailPath)).sendKeys(contactEmail);
			d.findElement(By.xpath(crf_customerPhNoPath)).sendKeys(contactPhNo);
			List<WebElement> buttonStack = d.findElements(By.xpath(crf_saveButtons));
			buttonStack.get(0).click();
			d.findElement(By.xpath(crf_OKButtonPath)).click();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	/**
	 * This method will help in validating the Sales Request Registration.<br/> 
	 * The input data needs to be provided in the "crm_salesRequestData.properties" file before execution.
	 * @param d (WebDriver Object)
	 * @param wait (WebDriverWait Object)
	 * @return Returns a boolean value (True / False) based on the validation result.
	 */
	public boolean validateSRRegistration(WebDriver d, WebDriverWait wait){
		boolean isTrue = false;
		try {
			int count = 0;
			ArrayList<String> actual_srData = new ArrayList<String>();
			List<WebElement> sr_dataElements;
			wait = new WebDriverWait(d, 10);
			String sr_viewDataButtonPath = testBase.getSalesRequestLocators("crm_sr_ViewDataButtonPath");
			String sr_detailPageUrl = testBase.getSalesRequestLocators("crm_sr_detailsPageUrl");
			d.findElement(By.xpath(sr_viewDataButtonPath)).click();
			wait.until(ExpectedConditions.urlContains(sr_detailPageUrl));
			
			ArrayList<String> expected_srData = new ArrayList<String>();
			expected_srData.add(testBase.getCrmSrData("customerName"));
			expected_srData.add(testBase.getCrmSrData("customerRequirements"));
			expected_srData.add(testBase.getCrmSrData("contactName"));
			expected_srData.add(testBase.getCrmSrData("contactDesignation"));
			expected_srData.add(testBase.getCrmSrData("contactEmail"));
			expected_srData.add(testBase.getCrmSrData("customerPhNo"));
			
			String sr_dataElementsPath = testBase.getSalesRequestLocators("crm_sr_dataElements");
			sr_dataElements = d.findElements(By.xpath(sr_dataElementsPath)); 
			
			for(int i=0; i<sr_dataElements.size(); i++){
				actual_srData.add(sr_dataElements.get(i).findElements(By.tagName("tr")).get(2).getText());
			}
			
			if (actual_srData.get(1) == expected_srData.get(0)) {count+=1;}
			if (actual_srData.get(2) == expected_srData.get(1)) {count+=1;}
			if (actual_srData.get(4) == expected_srData.get(2)) {count+=1;}
			if (actual_srData.get(5) == expected_srData.get(3)) {count+=1;}
			if (actual_srData.get(6) == expected_srData.get(4)) {count+=1;}
			if (actual_srData.get(7) == expected_srData.get(5)) {count+=1;}
			
			if(count==6){isTrue = true;}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isTrue;
	}
	
	
	
	// ----------------------- PRIVATE METHODS FOR INTERNAL USAGE -----------
	
	private void clickCRMMenuIcon(WebDriver d){
		d.findElement(By.xpath(testBase.getSalesRequestLocators("crm_menu_crmPath"))).click();
	}

}
