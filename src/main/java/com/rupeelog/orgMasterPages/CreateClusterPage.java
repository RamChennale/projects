package com.rupeelog.orgMasterPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.rupeelog.utilty.ElementWait;
import com.rupeelog.utilty.FileReaderUtility;

public class CreateClusterPage {

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
	
	@FindBy(linkText  = "Cluster")
	@CacheLookup
	private WebElement Cluster;
	
	By overlay= By.cssSelector("#loader");

	@FindBy( css =  "#create")
	@CacheLookup
	private WebElement create;
	
	@FindBy(css = "#name")
	@CacheLookup
	private WebElement nameCluster;
	
	@FindBy(css = "#code")
	@CacheLookup
	private WebElement codeCluster;
	
	@FindBy(css = "#startDate")
	@CacheLookup
	private WebElement startDateCluster;
	
	@FindBy(css = "#endDate")
	@CacheLookup
	private WebElement endDateCluster;
	
	@FindBy(css = "#regionId")
	@CacheLookup
	private WebElement ClusterRegionDD;
	
	@FindBy(css = "#orgnId")
	@CacheLookup
	private WebElement ClusterOrgn;
	
	@FindBy(css = "#save")
	@CacheLookup
	private WebElement save;
	
	@FindBy(css = "#cancel")
	@CacheLookup
	private WebElement cancel;
	
	public  CreateClusterPage(WebDriver driver){
		this.driver=driver;
	}
	
public void createClusterPageTest() {
		
		actions= new Actions(driver);
		file=new FileReaderUtility();
		
		ElementWait.isElementVisible(Master);
		actions.moveToElement(Master).perform();
		
		ElementWait.isElementVisible(OrganizationMaster);
		actions.moveToElement(OrganizationMaster).perform();
		
		ElementWait.isElementVisible(Cluster);
		actions.moveToElement(Cluster).click().build().perform();
		
		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver, create);
		ElementWait.isElementVisible(create);
		create.click();
		
		ElementWait.isElementVisible(nameCluster);
		nameCluster.sendKeys(file.getMasterTestData("nameCluster"));
		
		ElementWait.isElementVisible(codeCluster);
		codeCluster.sendKeys(file.getMasterTestData("codeCluster"));
		
		ElementWait.isElementVisible(startDateCluster);
		startDateCluster.sendKeys(file.getMasterTestData("startDateCluster"));
	
		ElementWait.isElementVisible(endDateCluster);
		endDateCluster.sendKeys(file.getMasterTestData("endDateCluster"));
		
		ElementWait.isElementVisible(ClusterRegionDD);
		Select selectClusterRegionDD= new Select(ClusterRegionDD);
		selectClusterRegionDD.selectByVisibleText(file.getMasterTestData("ClusterRegionDD"));
		
		ElementWait.isElementVisible(ClusterOrgn);
		Select selectClusterOrgn= new Select(ClusterOrgn);
		selectClusterOrgn.selectByVisibleText(file.getMasterTestData("ClusterOrgn"));
		
		ElementWait.isElementVisible(save);
		save.click();
		
		try{
			alert=driver.switchTo().alert();
			System.out.println("Cluster creation :"+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException alertException) {
			alertException.printStackTrace();
		}
	}
}
