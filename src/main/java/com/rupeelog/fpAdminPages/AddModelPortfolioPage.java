package com.rupeelog.fpAdminPages;

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

public class AddModelPortfolioPage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "FP Admin")
	@CacheLookup
	private WebElement FPAdmin;

	@FindBy(linkText = "Model Portfolio (FP)")
	@CacheLookup
	private WebElement ModelPortfolio;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "create")
	@CacheLookup
	private WebElement createBtn;

	@FindBy(id = "name")
	@CacheLookup
	private WebElement mpname;

	@FindBy(id = "code")
	@CacheLookup
	private WebElement mpcode;

	@FindBy(id = "priority")
	@CacheLookup
	private WebElement mppriorityDD;

	@FindBy(id = "duration")
	@CacheLookup
	private WebElement mpdurationDD;

	@FindBy(id = "startDate")
	@CacheLookup
	private WebElement mpstartDate;

	@FindBy(id = "userRisk")
	@CacheLookup
	private WebElement mpuserRisk;

	@FindBy(id = "status")
	@CacheLookup
	private WebElement mpstatusDD;

	@FindBy(id = "comments")
	@CacheLookup
	private WebElement mpcomments;
	
	@FindBy(id = "saveMP")
	@CacheLookup
	private WebElement saveBtn; 
	
	@FindBy(id = "cancelMP")
	@CacheLookup
	private WebElement cancelMPBtn;
	
	@FindBy(id = "view")
	@CacheLookup
	private WebElement viewBtn;
	
	@FindBy(xpath = "//td[contains(text(),'LIC India')]")
	@CacheLookup
	private WebElement selectMP;
	
	@FindBy(id = "editMP")
	@CacheLookup
	private WebElement editBtn;
	
	public AddModelPortfolioPage(WebDriver driver) {
		this.driver = driver;
	}

	public void addModelPortfolio() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		ElementWait.isElementVisible(ModelPortfolio);
		actions.moveToElement(ModelPortfolio).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.scrollToFindElement(driver,createBtn );
		createBtn.click();

		ElementWait.isElementVisible(mpname);
		mpname.sendKeys(file.getDiscPMSTestData("mpname"));
		
		ElementWait.isElementVisible(mpcode);
		mpcode.sendKeys(file.getDiscPMSTestData("mpcode"));

		ElementWait.isElementVisible(mppriorityDD);
		Select selectmppriorityDD= new Select(mppriorityDD);
		selectmppriorityDD.selectByVisibleText(file.getDiscPMSTestData("mppriorityDD")); 

		ElementWait.isElementVisible(mpdurationDD);
		Select selectmpdurationDD= new Select(mpdurationDD);
		selectmpdurationDD.selectByVisibleText(file.getDiscPMSTestData("mpdurationDD")); 

		ElementWait.isElementVisible(mpstartDate);
		mpstartDate.sendKeys(file.getDiscPMSTestData("mpstartDate"));

		ElementWait.isElementVisible(mpuserRisk);
		Select selectmpuserRisk= new Select(mpuserRisk);
		selectmpuserRisk.selectByVisibleText(file.getDiscPMSTestData("mpuserRisk")); 

		ElementWait.isElementVisible(mpstatusDD);
		Select selectmpstatusDD= new Select(mpstatusDD);
		selectmpstatusDD.selectByVisibleText(file.getDiscPMSTestData("mpstatusDD")); 

		ElementWait.isElementVisible(mpcomments);
		mpcomments.sendKeys(file.getDiscPMSTestData("mpcomments"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Add model portfolio  : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
	
	
	public void editModelPortfolio() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(FPAdmin);
		actions.moveToElement(FPAdmin).perform();

		ElementWait.isElementVisible(ModelPortfolio);
		actions.moveToElement(ModelPortfolio).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);
		
		ElementWait.scrollToFindElement(driver,selectMP );
		selectMP.click();

		ElementWait.scrollToFindElement(driver,editBtn );
		editBtn.click();

		ElementWait.isElementVisible(mpname);
		mpname.sendKeys(file.getDiscPMSTestData("mpname"));
		
		ElementWait.isElementVisible(mpcode);
		mpcode.sendKeys(file.getDiscPMSTestData("mpcode"));

		ElementWait.isElementVisible(mppriorityDD);
		Select selectmppriorityDD= new Select(mppriorityDD);
		selectmppriorityDD.selectByVisibleText(file.getDiscPMSTestData("mppriorityDD")); 

		ElementWait.isElementVisible(mpdurationDD);
		Select selectmpdurationDD= new Select(mpdurationDD);
		selectmpdurationDD.selectByVisibleText(file.getDiscPMSTestData("mpdurationDD")); 

		ElementWait.isElementVisible(mpstartDate);
		mpstartDate.sendKeys(file.getDiscPMSTestData("mpstartDate"));

		ElementWait.isElementVisible(mpuserRisk);
		Select selectmpuserRisk= new Select(mpuserRisk);
		selectmpuserRisk.selectByVisibleText(file.getDiscPMSTestData("mpuserRisk")); 

		ElementWait.isElementVisible(mpstatusDD);
		Select selectmpstatusDD= new Select(mpstatusDD);
		selectmpstatusDD.selectByVisibleText(file.getDiscPMSTestData("mpstatusDD")); 

		ElementWait.isElementVisible(mpcomments);
		mpcomments.sendKeys(file.getDiscPMSTestData("mpcomments"));
		
		ElementWait.isElementVisible(saveBtn);
		saveBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Edit model portfolio  : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
	}
	
}
