package com.rupeelog.orgMasterPages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateBranchPage {


	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert	alert;

	@FindBy(linkText = "Master")
	@CacheLookup
	private WebElement Master;
	
	@FindBy(linkText = "Organization Master")
	@CacheLookup
	private WebElement OrganizationMaster;
	
	@FindBy(linkText  = "Branch")
	@CacheLookup
	private WebElement Branch;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#branchCategory")
	@CacheLookup
	private WebElement branchCategory;
	
	@FindBy(css = "#name")
	@CacheLookup
	private WebElement branchName;
	
	@FindBy(css = "#shortName")
	@CacheLookup
	private WebElement branchShortName;
	
	@FindBy(css = "#cityId")
	@CacheLookup
	private WebElement cityAutoSuggSearch;
	
	@FindBy(css = "#headBranch")
	@CacheLookup
	private WebElement headBranch;
	
	@FindBy(css = "#address1")
	@CacheLookup
	private WebElement address1Branch;
	
	@FindBy(css = "#regionId")
	@CacheLookup
	private WebElement regionBranch;
	
	@FindBy(css = "#clusterId")
	@CacheLookup
	private WebElement clusterBranch;
	
	@FindBy(css = "#orgnId")
	@CacheLookup
	private WebElement orgBranch;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	public  CreateBranchPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void createBranchPageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();
		
		ElementWait.isElementVisible(Branch);
		actions.moveToElement(Branch).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(branchCategory);
		Select selectbranchCategory = new Select(branchCategory);
		selectbranchCategory.selectByVisibleText(file.getMasterTestData("branchCategory"));
		
		ElementWait.isElementVisible(branchName);
		branchName.sendKeys(file.getMasterTestData("branchName"));
		
		ElementWait.isElementVisible(branchShortName);
		branchShortName.sendKeys(file.getMasterTestData("branchShortName"));
		
		ElementWait.isElementVisible(cityAutoSuggSearch);
		cityAutoSuggSearch.sendKeys(Keys.chord(file.getMasterTestData("cityAutoSuggSearch")+Keys.SPACE+Keys.BACK_SPACE));

		List<WebElement> cityList = driver.findElements(By.xpath(
				"//ul[@id='ui-id-1']//li"));
/*
		WebDriverWait wait = new WebDriverWait(driver,30);
		List<WebElement> cityList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
				"//ul[@id='ui-id-1']//li")));
*/
		for (int i = 0; i < cityList.size(); i++) {
			if (cityList.get(i).getText().equalsIgnoreCase(file.getMasterTestData("selectCity"))) {
				cityList.get(i).click();
				System.out.println(cityList.get(i).getText());
				break;
			}
		}
		
		ElementWait.isElementVisible(headBranch);
		headBranch.sendKeys(file.getMasterData("headBranch"));
		
		ElementWait.isElementVisible(address1Branch);
		address1Branch.sendKeys(file.getMasterData("address1Branch"));
		
		ElementWait.isElementVisible(regionBranch);
		Select selectregionBranch = new Select(regionBranch);
		selectregionBranch.selectByVisibleText(file.getMasterTestData("regionBranch"));
		
		ElementWait.isElementVisible(clusterBranch);
		Select selectclusterBranch = new Select(clusterBranch);
		selectclusterBranch.selectByVisibleText(file.getMasterTestData("clusterBranch"));
		
		ElementWait.isElementVisible(orgBranch);
		Select selectorgBranch = new Select(orgBranch);
		selectorgBranch.selectByVisibleText(file.getMasterTestData("orgBranch"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Branch creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
	
}
