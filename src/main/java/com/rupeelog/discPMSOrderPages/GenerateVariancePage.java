package com.rupeelog.discPMSOrderPages;

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

public class GenerateVariancePage {

	WebDriver driver;
	Actions actions;
	FileReaderUtility file;
	Alert alert;

	@FindBy(linkText = "Disc PMS")
	@CacheLookup
	private WebElement DiscPMS;

	@FindBy(linkText = "Orders")
	@CacheLookup
	private WebElement Orders;

	@FindBy(linkText = "1. Generate Variance")
	@CacheLookup
	private WebElement GenerateVariance;

	By overlay = By.cssSelector("#loader");

	@FindBy(id = "modelPortfolios")
	@CacheLookup
	private WebElement gvChooseModelPortfDD;

	@FindBy(id = "genVarBtn")
	@CacheLookup
	private WebElement genVarBtn;
	
	
	public GenerateVariancePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void generateVariance() {

		actions = new Actions(driver);
		file = new FileReaderUtility();

		ElementWait.isElementVisible(DiscPMS);
		actions.moveToElement(DiscPMS).perform();

		ElementWait.isElementVisible(Orders);
		actions.moveToElement(Orders).perform();

		ElementWait.isElementVisible(GenerateVariance);
		actions.moveToElement(GenerateVariance).click().build().perform();

		ElementWait.waitForOverlayDisappearExplicitly(overlay);

		ElementWait.isElementVisible(gvChooseModelPortfDD);
		Select selectgvChooseModelPortfDD= new Select(gvChooseModelPortfDD);
		selectgvChooseModelPortfDD.selectByVisibleText(file.getDiscPMSTestData("gvChooseModelPortfDD"));
		
		ElementWait.isElementVisible(genVarBtn);
		genVarBtn.click();
		
		try {
			ElementWait.waitToPopUpAlert();
			alert=driver.switchTo().alert();
			System.out.println("Generate varience : "+alert.getText());
			alert.accept();
		}catch (NoAlertPresentException nape) {
			nape.printStackTrace();
		}
		
	}
}
